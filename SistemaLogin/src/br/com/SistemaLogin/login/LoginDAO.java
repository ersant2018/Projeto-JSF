package br.com.SistemaLogin.login;

import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.PreparedStatement;

import java.sql.Connection;



public class LoginDAO {
	
private Connection con;
	
	public LoginDAO(Connection con){
		this.con = con;
	}
	
	public void adicionar(Login l) throws SQLException{
		
  String sql = "insert into login(usuario,senha)values(?,?)";   
  
  try {
	PreparedStatement stmt = con.prepareStatement(sql);
	
	  stmt.setString(1, l.getUsuario());
	  stmt.setString(2, l.getSenha());
	  
	  stmt.execute();
	  stmt.close();
	
     } catch (SQLException e) {
	e.printStackTrace();
   }finally{
	con.close();    }		
	}
	
}



