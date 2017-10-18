/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controls;

import daos.GenreDAO;
import entities.Genre;
import java.io.IOException;
import java.sql.*;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author quent
 */
@WebServlet(name = "RechercheAvancee", urlPatterns = {"/RechercheAvancee"})
public class GenreCTRL extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        String lsMessage;

        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            Connection cnx = DriverManager.getConnection("jdbc:mysql://172.26.10.166:3306/Cinescope2017", "p", "b");
            
            GenreDAO dao = new GenreDAO(cnx);
            List<Genre> listeGenre = dao.selectOne();
            request.setAttribute("listeGenre", listeGenre);
            lsMessage = "OK";
        } catch (ClassNotFoundException e) {
            lsMessage = e.getMessage();
        } catch (SQLException e) {
            lsMessage = e.getMessage();
        }
        request.setAttribute("message", lsMessage);
        getServletContext().getRequestDispatcher("/jsp/RechercheAvancee.jsp").forward(request, response);

    } /// doGet

}
