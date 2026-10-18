package entities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	public static Connection conectar () throws SQLException{
		 String url = "jdbc:mysql://localhost:3306/stockflow";
		 String usuario = System.getenv("DB_USER");
		 String senha = System.getenv("DB_PASSWORD");
		 
		 if (usuario == null || senha == null) {
	            throw new SQLException(
	                "Configure as variáveis de ambiente DB_USER e DB_PASSWORD."
	            );
	        }

		 return DriverManager.getConnection(url, usuario, senha);
	}
}
