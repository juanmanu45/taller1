<%-- 
    Document   : buscarTabla
    Created on : 23/08/2017, 03:16:11 AM
    Author     : Juan Manuel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <form  action="buscarTa" method="POST">&nbsp;<br>
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
    </body>
</html>
