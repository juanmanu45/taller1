<%-- 
    Document   : listarTa
    Created on : 23/08/2017, 01:04:02 AM
    Author     : Juan Manuel
--%>

<%@page import="javafx.scene.control.Tab"%>
<%@page import="Modelo.Tabla"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
          <%
            Tabla respuesta = new Tabla();

            respuesta = (Tabla) request.getAttribute("respuesta");
            if (respuesta!=null) {
                    
               
        %>
        <h1>
            <%
                String id = String.valueOf(respuesta.getIdEs());
            %>
            <%=id%>
            <%
                String nombre = String.valueOf(respuesta.getNombre());

            %>
            <%=nombre%>
            <%
                String num = String.valueOf(respuesta.getIdt());
            %>
            <%=num%>
            <% }%>
        </h1>
    </body>
</html>
