<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro de Usuario</title>
</head>
<body>



<h2>Cadastrar Login</h2>
 
  <form name="formLogin" action="CadastroLogin" method="post">
 
    <table>
     
     
      <tr> 
        <td>Nome.:</td><td><input type="text" name="txtUsuario"></td>
        <td>Senha.:</td><td><input type="password" name="txtSenha"></td>
     
          <td colspan="2"><input type="submit" value="Cadastrar"/></td>      
     </tr>
    
    
    </table>
    
     </form>

</body>
</html>