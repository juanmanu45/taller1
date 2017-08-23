<%-- 
    Document   : buscarEs
    Created on : 23/08/2017, 03:16:39 AM
    Author     : Juan Manuel
--%>

<%@page import="Modelo.Esquema"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <form  action="buscarEs" method="POST">&nbsp;<br>
            <table style="width: 1191px; height: 176px;" border="1">
                <tbody>
                    <tr>
                        <td>ID </td>
                        <td><input name="id" type="text"><br>
                        </td>
                    </tr>
                   
                </tbody>
            </table>
            <input name="enviar" type="submit">
        </form>
           <%
            Esquema respuesta = new Esquema();

            respuesta = (Esquema) request.getAttribute("respuesta");
            if (respuesta!=null) {
                    
               
        %>
        <h1>
            <%
                String id = String.valueOf(respuesta.getId());
            %>
            <%=id%>
            <%
                String nombre = String.valueOf(respuesta.getNombre());

            %>
            <%=nombre%>
            <%
                String num = String.valueOf(respuesta.getNumTablas());
            %>
            <%=num%>
            <% }%>
        </h1>
        
    </body>
</html>
