package jdbc.conta;

import java.net.URL;
import java.sql.*;
import java.util.*;
import java.io.*;
import jdbc.util.*;

public class RepositorioContasBDR implements RepositorioContas {

    private static RepositorioContasBDR instance;

    private RepositorioContasBDR() {
    }

    public synchronized static RepositorioContasBDR getInstance() {
        if (instance == null) {
            instance = new RepositorioContasBDR();
        }
        return instance;
    }

    public void inserir(Conta conta) throws RepositorioException {
        try {
            Statement statement = ConnectionManager.reservaStatement();
            if (conta != null) {
                try {
                    statement.executeUpdate("INSERT INTO CONTAS VALUES ('" +
                                           conta.getNumero() + "', " +
                                           conta.getSaldo() + ")");
                }
                catch (SQLException e) {
                    throw new RepositorioException(e);
    		    }
            }
        } finally {
		    ConnectionManager.liberaStatement();
        }

    }

	public void remover(String numero) throws ContaNaoEncontradaException, RepositorioException {
        try{
            Statement statement = ConnectionManager.reservaStatement();
		    int resultado = statement.executeUpdate("DELETE FROM CONTAS WHERE numero='" + numero + "'");
		} catch(SQLException e){
            throw new RepositorioException(e);
		} finally {
		    ConnectionManager.liberaStatement();
		}
	}

	public Conta procurar(String numero) throws ContaNaoEncontradaException, RepositorioException {
   	    Conta conta = null;
        try {
            Statement statement = ConnectionManager.reservaStatement();
            ResultSet resultset = statement.executeQuery("SELECT * FROM CONTAS WHERE numero = '" + numero + "'");
            if (resultset.next()) {
                conta = new Conta(resultset.getString("numero"), resultset.getDouble("saldo"));
            } else {
                throw new ContaNaoEncontradaException(numero);
            }
			resultset.close();
        } catch (SQLException e) {
			throw new RepositorioException(e);
		} finally {
		    ConnectionManager.liberaStatement();
		}
		return conta;
	}

	public void atualizar(Conta conta) throws ContaNaoEncontradaException, RepositorioException {
	    try {
    	    Statement statement = ConnectionManager.reservaStatement();
            if (conta != null) {
                try {
                    int resultado = statement.executeUpdate("UPDATE CONTAS SET saldo = " + conta.getSaldo() +
               		                                        " WHERE numero = '" + conta.getNumero() + "'");
                    if (resultado == 0) {
                        throw new ContaNaoEncontradaException(conta.getNumero());
                    }
                }
                catch (SQLException e) {
    			    throw new RepositorioException(e);
    		    }
            }
        } finally {
		    ConnectionManager.liberaStatement();
		}
	}

	public boolean existe(String numero) throws RepositorioException {
        boolean resposta = false;
        try {
            Statement statement = ConnectionManager.reservaStatement();
            ResultSet resultset = statement.executeQuery("SELECT * FROM CONTAS WHERE numero = '" + numero + "'");
            resposta = resultset.next();
			resultset.close();
        } catch (SQLException e) {
			throw new RepositorioException(e);
		} finally {
		    ConnectionManager.liberaStatement();
		}
        return resposta;
    }

    public RepositorioContas getContas() throws RepositorioException {
        RepositorioContas resposta = new RepositorioContasArray();
        try {
            Statement statement = ConnectionManager.reservaStatement();
            ResultSet resultset = statement.executeQuery("SELECT * FROM CONTAS");
            while (resultset.next()) {
                Conta conta = new Conta(resultset.getString("numero"),
                                        resultset.getDouble("saldo"));
                resposta.inserir(conta);
            }
			resultset.close();
        } catch (SQLException e) {
			throw new RepositorioException(e);
		} finally {
		    ConnectionManager.liberaStatement();
		}
        return resposta;
    }

    public IteratorContas getIterator() throws RepositorioException {
        return this.getContas().getIterator();
    }

}