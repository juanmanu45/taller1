/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contrloladores;

import Archivos.Sistemas;
import Modelo.Esquema;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Juan Manuel
 */
public class Control1 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */

            String id = request.getParameter("idsis");
            String nombre = request.getParameter("nombre");
            String num = request.getParameter("numerot");
             
            int numerot = Integer.parseInt(num);
            int ids = Integer.parseInt(id);

            
                Esquema es=new Esquema();
                es.setId(ids);
                
                for (int i = 0; i < 20; i++) {
                    es.setNombre(nombre.toCharArray());
                }
                                
                es.setNumTablas(numerot);                
                Sistemas sis = new Sistemas();
                
                sis.insertarEsquema(es.getId(), es.getNombre(), es.getNumTablas());

                RequestDispatcher rd = getServletContext().getRequestDispatcher("/RegistroLibro.jsp");
                String respuesta = "se ha insertado correctamente";
                request.setAttribute("respuesta", respuesta);
                rd.forward(request, response);

         
                
            

            

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
