<%-- 
    Document   : RegistroColumnas
    Created on : 15/08/2017, 12:59:31 AM
    Author     : Juan Manuel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta content="text/html; charset=UTF-8" http-equiv="content-type">
        <link rel="stylesheet" type="text/css" href="formato1.css">
        <title></title>
    </head>
    <body>
        <p>NUEVA COLUMNA:</p>
        <form  action="registro"method="GET" >&nbsp;<br>
            <table style="width: 1191px; height: 176px;" border="1">
                <tbody>
                    <tr>
                        <td>NOMBRE COLUMNA</td>
                        <td><input name="nombre" type="text"><br>
                        </td>
                    </tr>
                    <tr>
                        <td>ID COLUMNA</td>
                        <td><input name="idcol" type="text"><br>
                        </td>
                    </tr>
                    <tr>
                        <td>ID TABLA</td>
                        <td><input name="idtabla" type="text"></td>
                    </tr>
                    <tr>
                        <td>ID SISTEMA</td>
                        <td><input name="idsis" type="text"></td>
                    </tr>
                </tbody>
            </table>
            <input name="enviar" type="submit">
        </form>
        <p><br>
        </p>
    </body></html>