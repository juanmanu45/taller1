<%-- 
    Document   : listarCol
    Created on : 23/08/2017, 01:04:16 AM
    Author     : Juan Manuel
--%>

<%@page import="Modelo.Columna"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <%
            Columna respuesta = new Columna();

            respuesta = (Columna) request.getAttribute("respuesta");
            if (respuesta!=null) {
                    
               
        %>
        <h1>
            <%
                String id = String.valueOf(respuesta.getIdCol());
            %>
            <%=id%>
            <%
                String nombre = String.valueOf(respuesta.getNombre());

            %>
            <%=nombre%>
            <%
                String num = String.valueOf(respuesta.getIdTabla());
            %>
            <%=num%>
            <% }%>
    </body>
</html>
