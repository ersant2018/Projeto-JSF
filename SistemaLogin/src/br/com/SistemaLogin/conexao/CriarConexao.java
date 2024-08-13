package br.com.SistemaLogin.conexao;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;


public class CriarConexao {
	
	public static Connection getConexao() throws SQLException{
		
		try {
			Class.forName("com.postgres.jdbc.Driver");
			System.out.print("Conectado");
			
			return DriverManager.getConnection("jdbc:postgresql://localhost:5432/SistemaLogin", "postgres" , "admin");
		
		}catch( SQLException e) {
			throw new SQLException(e);
		}catch(ClassNotFoundException e1) {
			throw new SQLException(e1);
		}
	}

}
