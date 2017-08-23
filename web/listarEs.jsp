<%-- 
    Document   : listarEs
    Created on : 23/08/2017, 01:04:46 AM
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
