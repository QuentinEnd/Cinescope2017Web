/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controls;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
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
public class RechercheAvancee extends HttpServlet {

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

        String lsMessage;

        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            Connection lcn = DriverManager.getConnection("jdbc:mysql://172.26.10.166:3306/Cinescope2017", "p", "b");

            List<Map<String, String>> listeRechercheAvancee = new ArrayList();
            Map<String, String> mapRechercheAvancee;

            try {
                String lsSQL = "SELECT TITRE_film, HORAIRES_projection, VERSION_projection, NOM_cinema, Nom_ville, Nom_arrondissement, LIBELLE_genre, NOM_artiste FROM film\n"
                        + "INNER JOIN projeter ON film.ID_film = projeter.ID_film\n"
                        + "INNER JOIN salle ON projeter.ID_salle = salle.ID_salle\n"
                        + "INNER JOIN cinema ON salle.ID_cinema = cinema.ID_cinema\n"
                        + "INNER JOIN ville ON cinema.ID_ville = ville.ID_ville\n"
                        + "INNER JOIN arrondissement ON cinema.ID_arrondissement = arrondissement.ID_arrondissement\n"
                        + "INNER JOIN genre ON film.ID_genre = genre.ID_genre\n"
                        + "INNER JOIN realiser ON film.ID_film = realiser.ID_film\n"
                        + "INNER JOIN artiste ON realiser.ID_artiste = artiste.ID_artiste\n"
                        + "INNER JOIN jouer ON film.ID_film = jouer.ID_film\n"
                        + "ORDER BY TITRE_film;";
                PreparedStatement lpst = lcn.prepareStatement(lsSQL);
                ResultSet lrs = lpst.executeQuery();
                while (lrs.next()) {
                    mapRechercheAvancee = new HashMap();
                    mapRechercheAvancee.put("genre", lrs.getString(6));
                    mapRechercheAvancee.put("arrondissement", lrs.getString(5));
                    listeRechercheAvancee.add(mapRechercheAvancee);
                }

                lrs.close();
                lpst.close();
                lcn.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }

            request.setAttribute("listeRechercheAvancee", listeRechercheAvancee);
            lsMessage = "OK";
        } catch (ClassNotFoundException e) {
            lsMessage = e.getMessage();
        } catch (SQLException e) {
            lsMessage = e.getMessage();
        }
        request.setAttribute("message", lsMessage);
        getServletContext().getRequestDispatcher("/jsp/RechercheAvancee.jsp").forward(request, response);
    }

}
