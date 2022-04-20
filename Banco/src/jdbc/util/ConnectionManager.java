package jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Esta é uma classe auxiliar
 */
public class ConnectionManager {

    private static Connection connection;
    private static Statement statement;

    public static Statement reservaStatement() {
        if (connection == null) {
            try {
                Class.forName("org.hsqldb.jdbcDriver");
                connection = DriverManager.getConnection("jdbc:hsqldb:file:bd/BancoDados", "sa", "");
            } catch(SQLException sqle) {
    		    System.out.println("SQLException => ConnectionManager: " + sqle.getMessage());
    	    } catch(ClassNotFoundException cnfe) {
    		    System.out.println("Driver nao encontrado => ConnectionManager: " + cnfe.getMessage());
    		}
    	}
    	try {
    	    //statement = connection.createStatement();
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    	} catch(SQLException sqle) {
    		    System.out.println("SQLException => ConnectionManager: " + sqle.getMessage());
    	}
    	return statement;
    }

    /**
     * Atenção, este método fecha o Statement!
     */
    public synchronized static void liberaStatement() {
        try {
            if (statement != null) statement.close();
	    } catch(SQLException sqle) {
		    System.out.println("Erro de BD => ConnectionManager" + sqle.getMessage());
	    }
	}

    public static void liberaRecursos() {
        try {
            if (statement != null) statement.close();
        } catch (SQLException sqle) {
            System.out.println("SQLException => ConnectionManager: " + sqle.getMessage());
        }
        try {
            reservaStatement();
            statement.executeUpdate("SHUTDOWN COMPACT");
            liberaStatement();
        } catch (SQLException sqle) {
            System.out.println("SQLException => ConnectionManager: " + sqle.getMessage());
        }
        try {
            if (connection != null) connection.close();
        } catch (SQLException sqle) {
            System.out.println("Erro de BD => ConnectionManager: " + sqle.getMessage());
        }
        
    }

}