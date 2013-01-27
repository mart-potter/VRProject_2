<%@page contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="model.*"%>
<%@page import="DAO.*"%>
 
<jsp:useBean id="riigiAdminYksus" type="DAO.RiigiAdminYksusDAO" scope="request" />
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
 
<html>
    <head>
        <title>Riigi Admin yksused</title>
    </head>
 
    <body>
        <form method="POST" action="riigiadminyksus.html">
            Name: <input type="text" name="name" />
            <input type="submit" value="Add" />
        </form>
 		<hr><ol> 
        <% for (RiigiAdminYksus yksus : riigiAdminYksus.getAllRiigiAdminYksused()) { %>
            <li> <%= yksus.getNimetus() %> </li>
        <% } %>
        </ol><hr>
        
 
        <iframe src="http://www.objectdb.com/pw.html?spring-eclipse"
            frameborder="0" scrolling="no" width="100%" height="30"> </iframe>
     </body>
 </html>