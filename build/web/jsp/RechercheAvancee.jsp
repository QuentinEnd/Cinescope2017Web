<%-- 
    Document   : RechercheAvancee
    Created on : 17 oct. 2017, 14:52:06
    Author     : quent
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%-- JSTL : Variables, structures de contrôles --%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="/Cinescope2017Web/css/bootstrap.min.css" />
        <link rel="stylesheet" type="text/css" href="/Cinescope2017Web/css/bootstrap-theme.min.css" />
        <link rel="stylesheet" type="text/css" href="/Cinescope2017Web/css/main.css" />
        <title>Recherche Avancée</title>
    </head>

    <body>
        <!--HEADER-->
        <div class="row text-center">
            <header>
                <%@include file="Header.jsp" %>
            </header>
        </div>
        <!--FIN HEADER-->

        <!--NAV-->
        <div class="row coeurPage">
            <div class="col-lg-2">
                <nav>
                    <%@ include file="Nav.jsp" %>
                </nav>
            </div>
            <!--FIN NAV-->

            <div class="col-lg-8 col-lg-offset-1">                
                <article id="rechercheAvancee">
                    <form action="" method="GET" class="col-lg-6 col-lg-offset-1">
                        <legend>Recherche Avancée</legend>
                        <div class="form-group">
                            <select id="selectGenre" class="form-control">
                                <c:forEach var="genre" items="${listeRechercheAvancee}">                                    
                                    <option>${genre.listeRechercheAvancee}</option>                                    
                                </c:forEach>
                            </select>
                        </div>
                        <div class="form-group">
                            <select id="selectArrondissement" class="form-control">
                                <c:forEach var="arrondissement" items="${listeRechercheAvancee}">                                    
                                    <option>${arrondissement.listeRechercheAvancee}</option>                                    
                                </c:forEach>
                            </select>
                        </div>
                        <div class="form-group">
                            <input type="text" name="artiste" id="artiste" class="form-control" placeholder="Entrez le nom d'un acteur ou d'un réalisateur">
                        </div>
                        <div class="form-group">
                            <input type="text" name="film" id="film" class="form-control" placeholder="Entrez le titre d'un film">
                        </div>
                        <div class="form-group">
                            <input type="text" name="cinema" id="cinema" class="form-control" placeholder="Entrez le nom d'un cinéma">
                        </div>
                        <div class="form-group">
                            <button type="submit" id="btValider" class="btn btn-primary active pull-right">Lancer la recherche</button>
                            <button type="button" id="btAnnuler" class="btn btn-danger active">Annuler la recherche</button>
                        </div>
                        ${message}
                    </form>
                </article>
            </div>
        </div>

        <div class="row">
            <div class="col-lg-12">
                <footer>
                    <%@ include file="Footer.jsp" %>
                </footer>
            </div>
        </div>

        <script src="/Cinescope2017Web/js/bootstrap.min.js"></script>
    </body>
</html>
