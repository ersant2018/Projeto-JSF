package br.com.SistemaLogin.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.SistemaLogin.exception.InvalidUserException;


@WebServlet("/login")
public class LoginControllers extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}
    
    
    protected void processRequest(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		ValidaDadosRecebidos(req);
        RequestDispatcher rd = req.getRequestDispatcher("logado.jsp");
        rd.forward(req, res);
    }
    
    
    private void ValidaDadosRecebidos(HttpServletRequest req) throws ServletException{
		
		String nomeUsuario = req.getParameter("txtUsuario");
		String nomeSenha = req.getParameter("txtSenha");
   
    
        if(!nomeUsuario.trim().equals("admin") || !nomeSenha.trim().equals("1"))
        	 throw new InvalidUserException("Login ou senha invalido");

       HttpSession session = req.getSession();
       session.setAttribute("usuarioautenticado", nomeUsuario);
    
    
    }

}
