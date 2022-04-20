package jdbc.conta;

import java.net.URL;
import java.sql.*;
import java.util.*;
import java.io.*;

/**
 * Esta é uma classe auxiliar
 */
public class BDCache {

    private static final int  tamCache = 1000;

    private Conta[]     contas;
    private int         wr;
    private Connection  con;
    private Statement   stmt;
    private ResultSet   rset;


	/**
	 * Aqui eh uma otimizacao para acessar dois bancos de dados
	 * cujos parametros estao em um arquivo banco.properties
	 */
    private String path = "d:\\ufpe\\monitorias\\especializacao\\banco.properties";

	/**
	 * Construtor que monta sua propria conexao com o BD
	 * nao recebe a conexao pronta da fachada. Mais adequado para
	 * sistemas em que cada cadastro tem sua conexao com o BD.
     * Na prática, deve-se seguir a arquitetura e método disponíveis
     * em http://www.di.ufpe.br/~emv/MIOOP/
	 */
    public BDCache() {
	    wr = 0;
        contas = new Conta[tamCache];
        try {
            FileInputStream in = new FileInputStream(path);
            Properties props = new Properties();
            props.load(in);
            String driver = props.getProperty("driver");
            String driverUrl = props.getProperty("driverUrl");
            String user = props.getProperty("user");
            String passwd = props.getProperty("passwd");
            Class.forName(driver);
            con = DriverManager.getConnection(driverUrl, user, passwd);
            stmt = con.createStatement();
        } catch(SQLException sqle) {
		    System.out.println("SQLException => BDCache(): " + sqle.getMessage());
	    } catch(ClassNotFoundException cnfe) {
		    System.out.println("Driver nao encontrado => BDCache(): " + cnfe.getMessage());
	    } catch(IOException ioe){
		    System.out.println("Erro de IO => BDCache(): " + ioe.getMessage());
		}
    }

	/**
	 * Construtor que jah recebe uma conexao previamente
	 * montada e aberta nas camadas superiores do sistema
	 */
    public BDCache(Connection c) {
  		this.con = c;
	  	wr = 0;
        contas = new Conta[tamCache];
    }


	/******************************************************************
	 * Metodos acessados por uma implementacao do repositorio de contas
	 */

    public void insertConta(Conta conta) {
        if (conta != null){
		    Conta aux = this.selectConta(conta.getNumero());
            if (aux == null){
                this.inserirBD(conta);
                this.inserirArray(conta);
		    }
		}
    }

    public Conta selectConta(String numero) {
        int i;
        Conta conta = this.procurarArray(numero);
        if (conta == null){
            conta = this.procurarBD(numero);
            if (conta != null) {
                this.inserirArray(conta);
            }
        }
        return conta;
    }

    public void updateConta(Conta conta){
        if (conta != null){
            Conta aux = this.selectConta(conta.getNumero());
            if (aux != null){
                this.atualizarArray(conta);
                this.atualizarBD(conta);
            }
        }
	}

	public void removerConta(String numero){
		this.removerArray(numero);
		this.removerBD(numero);
	}

    public Conta[] getContas()  {
        return this.getContasBD();
    }

	private int procurarIndice(String numero){
		int i = 0;
		int indice = -1;

	    while ((i < tamCache) &&  (indice == -1) && contas[i] != null) {
		    if ((contas[i].getNumero()).equals(numero))
            indice = i;
            i = i + 1;
        }
		return indice;
	}

	/**
	 * Metodos da memoria(array)
	 */
	private void inserirArray(Conta conta){
        contas[wr] = conta;
        wr = (wr + 1) % tamCache;
	}

	private Conta procurarArray(String numero){
        Conta conta = null;
        int i= this.procurarIndice(numero);
        if (i != -1){
            conta = contas[i];
        }
        return conta;
	}

	private void atualizarArray(Conta conta){
		int i  = procurarIndice(conta.getNumero());
		if (i != -1){
			contas[i] = conta;
		}
	}

	private void removerArray(String numero){
		int i = this.procurarIndice(numero);
		if (i != -1){
            for (int j = i; j < tamCache - 1; j++){
			    contas[j] = contas[j + 1];
			}
			if (wr == 0 && contas[tamCache-1] != null) {
			    wr = tamCache - 1;
			} else {
			    wr = wr - 1;
			}
		}
	}


	/**
	 * Metodos do BD
	 */
    private void atualizarBD(Conta conta) {
        if (conta != null) {
            try {
                stmt.executeUpdate("UPDATE CONTAS SET saldo = " + conta.getSaldo() +
         		                   " WHERE numero = '" + conta.getNumero() + "'");
            }
            catch (SQLException e) {
			  System.out.println("Erro => atualizarBD() : " + e.getMessage());
		    }
        }
    }

    private void inserirBD(Conta conta) {
        if (conta != null) {
            try {
                stmt.executeUpdate("INSERT INTO CONTAS VALUES ('" +
                                  conta.getNumero() + "', " + conta.getSaldo() + ")");
            }
            catch (SQLException e) {
			  System.out.println("Erro => inserirBD(): " + e.getMessage());
		    }
        }
    }

    private Conta procurarBD(String numero) {
    	Conta c = null;
        try {
            rset = stmt.executeQuery("SELECT * FROM CONTAS WHERE numero = '" + numero + "'");
            if (rset.next()) {
                c = new Conta(rset.getString("numero"), rset.getDouble("saldo"));
            }
			rset.close();
        } catch (SQLException e) {
			System.out.println("Erro => procurarBD(): " + e.getMessage());
		}
		return c;
    }

	private void removerBD(String numero){
        try{
		    stmt.executeUpdate("DELETE FROM CONTAS WHERE numero='" + numero + "'");
		} catch(SQLException e){
			System.out.println("Erro => removerBD(): " + e.getMessage());
		}
	}

    private Conta[] getContasBD()  {
        Conta[] contas = new Conta[1000];
        try {
            rset = stmt.executeQuery("SELECT * FROM CONTAS");
            int i = 0;
            while (rset.next()) {
                Conta conta = new Conta(rset.getString("numero"),
                                        rset.getDouble("saldo"));
                contas[i] = conta;
                i = i + 1;
            }
			rset.close();
        } catch (SQLException e) {
            System.out.println("Erro => getContasBD(): " + e.getMessage());
		}
        return contas;
    }

}