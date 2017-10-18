<%--
    Document : Accueil.jsp
    Author : Quentin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="/Cinescope2017Web/css/bootstrap.min.css" />
        <link rel="stylesheet" type="text/css" href="/Cinescope2017Web/css/bootstrap-theme.min.css" />
        <link rel="stylesheet" type="text/css" href="/Cinescope2017Web/css/main.css" />
        <title>Cinescope Web</title>
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
                <article id="articleAccueil">

                    <p style="color: #fff; text-align: center;">Bienvenue sur le nouveau site du Cinescope. Vous retrouverez ic toutes les infos concernant la sortie des 
                        films à venir, les projections proches de chez vous ainsi que l'avis des critiques.</p><br>
                    <img src="/Cinescope2017Web/images/cinema.jpg" alt="Interieur_Cinema_Londres" title="Cinema" width="100%" class="img-responsive"/>

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