package jdbc.cliente;

import java.net.URL;
import java.sql.*;
import java.util.*;
import java.io.*;
import jdbc.conta.*;
import jdbc.util.*;

public class RepositorioClientesBDR implements RepositorioClientes {

    // Atributo que auxilia a manipulação de objetos do tipo Conta
    private RepositorioContasBDR contas;

    public RepositorioClientesBDR() {
        this.contas = RepositorioContasBDR.getInstance();
    }

    public void inserir(Cliente cliente) throws RepositorioException {
        try {
            Statement statement = ConnectionManager.reservaStatement();
            if (cliente != null) {
                try {
                    statement.executeUpdate("INSERT INTO CLIENTES VALUES ('" +
                                           cliente.getNome() + "', '" +
                                           cliente.getCpf() + "')");

                    this.insereRelacionamento(statement,cliente);
                }
                catch (SQLException e) {
                    throw new RepositorioException(e);
    		    }
            }
        } finally {
		    ConnectionManager.liberaStatement();
        }

    }

	public void remover(String cpf) throws ClienteNaoEncontradoException, RepositorioException {
        try{
            Statement statement = ConnectionManager.reservaStatement();
		    int resultado = statement.executeUpdate("DELETE FROM CLIENTES WHERE cpf='" + cpf + "'");
            if (resultado == 0) {
                throw new ClienteNaoEncontradoException(cpf);

            } else {
                this.removeRelacionamento(statement,cpf);
            }
		} catch(SQLException e){
            throw new RepositorioException(e);
		} finally {
		    ConnectionManager.liberaStatement();
		}
	}

	public Cliente procurar(String cpf) throws ClienteNaoEncontradoException, RepositorioException {
   	    Cliente cliente = null;
        try {
            Statement statement = ConnectionManager.reservaStatement();
            ResultSet resultset = statement.executeQuery("SELECT * FROM CLIENTES WHERE cpf = '" + cpf + "'");
            if (resultset.next()) {
                cliente = new Cliente(resultset.getString("nome"), resultset.getString("cpf"));
                resultset.close();
                this.recuperaRelacionamento(statement,cliente);
            } else {
                throw new ClienteNaoEncontradoException(cpf);
            }
        } catch (SQLException e) {
			throw new RepositorioException(e);
		} finally {
		    ConnectionManager.liberaStatement();
		}
		return cliente;
	}

	public void atualizar(Cliente cliente) throws ClienteNaoEncontradoException, RepositorioException {
	    try {
    	    Statement statement = ConnectionManager.reservaStatement();
            if (cliente != null) {
                try {
                    int resultado = statement.executeUpdate("UPDATE CLIENTES SET nome = '" + cliente.getNome() +
             		                                        "' WHERE cpf = '" + cliente.getCpf() + "'");
                     if (resultado == 0) {
                        throw new ClienteNaoEncontradoException(cliente.getCpf());
                    } else {
                        this.atualizaRelacionamento(statement,cliente);
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

	public boolean existe(String cpf) throws RepositorioException {
   	    boolean resposta = false;
        try {
            Statement statement = ConnectionManager.reservaStatement();
            ResultSet resultset = statement.executeQuery("SELECT * FROM CLIENTES WHERE cpf = '" + cpf + "'");
            resposta = resultset.next();
			resultset.close();
        } catch (SQLException e) {
			throw new RepositorioException(e);
		} finally {
		    ConnectionManager.liberaStatement();
		}
		return resposta;
    }

    private void insereRelacionamento(Statement statement, Cliente cliente) throws SQLException, RepositorioException {
        RepositorioContas contas = cliente.getContas();
        IteratorContas iterator = contas.getIterator();
        while (iterator.hasNext()) {
            Conta conta = iterator.next();
            statement.executeUpdate("INSERT INTO CONTAS_CLIENTES (numero, cpf) VALUES ('" +
                                   conta.getNumero() + "', '" +
                                   cliente.getCpf() + "')");
        }
    }

    private void atualizaRelacionamento(Statement statement, Cliente cliente) throws SQLException, RepositorioException {
        this.removeRelacionamento(statement,cliente.getCpf());
        this.insereRelacionamento(statement,cliente);
    }

    private void recuperaRelacionamento(Statement statement, Cliente cliente) throws SQLException, RepositorioException {
        ResultSet resultset = statement.executeQuery("SELECT numero FROM CONTAS_CLIENTES WHERE cpf = '" + cliente.getCpf() + "'");
        while (resultset.next()) {
            String numero = resultset.getString("numero");
            try {
                Conta conta = contas.procurar(numero);
                cliente.cadastrar(conta);
            } catch(ContaNaoEncontradaException ex) {
            } catch(ContaJaCadastradaException ex) {}
        }
		resultset.close();
    }

    private void removeRelacionamento(Statement statement, String cpf) throws SQLException, RepositorioException {
        statement.executeUpdate("DELETE FROM CONTAS_CLIENTES WHERE cpf='" + cpf + "'");
    }

}