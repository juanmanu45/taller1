<%-- 
    Document   : RegistroTablas
    Created on : 15/08/2017, 12:59:15 AM
    Author     : Juan Manuel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
      <html>
        <head>
          <meta content="text/html; charset=UTF-8" http-equiv="content-type">
          <link rel="stylesheet" type="text/css" href="formato1.css">
          <title></title>
        </head>
        <body>
          <p></p>
          <h1>NUEVA TABLA:</h1>
          <p></p>
          <form method="GET" action="registro" name="registrar">&nbsp;<br>
            <table style="width: 1191px; height: 176px;" border="1">
              <tbody>
                <tr>
                  <td>NOMBRE TABLA</td>
                  <td><input name="nombre" type="text"><br>
                  </td>
                </tr>
                <tr>
                  <td>NUMERO DE COLUMNAS</td>
                  <td><input name="numercol" type="text"><br>
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
            <input name="enviar" type="submit"><br><a href="RegistroColumnas.jsp">INGRESAR COLUMNA </a><br>
        </form>
        <p><br>
        </p>
</body></html>