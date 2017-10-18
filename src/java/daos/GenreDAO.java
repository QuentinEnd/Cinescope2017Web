package daos;

import entities.Genre;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author quent
 */
public class GenreDAO {

    private Connection cnx;

    /**
     *
     * @param cnx
     */
    public GenreDAO(Connection cnx) {
        this.cnx = cnx;
    }

    public List<Genre> selectOne() {
        // Déclaration des attributs
        List<Genre> liste = new ArrayList();

        try {
            // Préparation de la procédure stockée
            PreparedStatement lpst = cnx.prepareStatement("CALL genreSelectLibelle()");
            System.out.println(lpst);
            
            // Exécution de l'ordre SQL
            ResultSet lrs = lpst.executeQuery();

            // Boucle pour la récupération des informations d'un genre
            // Si le genre est bon
            while (lrs.next()) {
                Genre genre = new Genre();
                genre.setLibelleGenre(lrs.getString("LIBELLE_genre"));
                liste.add(genre);
            }

            // Fermeture des curseurs
            lrs.close();
            lpst.close();

        } catch (SQLException e) { // Si une exception est levée
            Genre genre = new Genre();
            genre.setIdGenre(-1);
            genre.setLibelleGenre(e.getMessage());
        }

        return liste;
    }

}// Fin class GenreDAO
