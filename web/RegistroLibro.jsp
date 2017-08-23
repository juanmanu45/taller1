<%@page import="Modelo.Esquema"%>
<%@page import="Contrloladores.ListarEsquemas"%>
<%@page import="Archivos.Sistemas"%>
<!DOCTYPE html>
<html>
    <head>
        <meta content="text/html; charset=UTF-8" http-equiv="content-type">
        <link rel="stylesheet" type="text/css" href="formato1.css">
        <title></title>
    </head>
    <body>
        <p>NUEVO SISTEMA:</p>
        
        
        <form  action="Control1" method="POST">&nbsp;<br>
            <table style="width: 1191px; height: 176px;" border="1">
                <tbody>
                    <tr>
                        <td>NOMBRE </td>
                        <td><input name="nombre" type="text"><br>
                        </td>
                    </tr>
                    <tr>
                        <td>NUMERO DE TABLAS</td>
                        <td><input name="numerot" type="text"><br>
                        </td>
                    </tr>
                    <tr>
                        <td>ID SISTEMA</td>
                        <td><input name="idsis" type="text"></td>
                    </tr>
                </tbody>
            </table>
            <input name="enviar" type="submit">
        </form>
        <h3><a href="RegistroTablas.jsp"</a>insertar tablas</h3>

        <p><br>
        </p>
    </body>
</html>
