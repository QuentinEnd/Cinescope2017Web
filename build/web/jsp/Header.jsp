<%--
    Document : Header.jsp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<div class="col-lg-12">
    <img src="/Cinescope2017Web/images/banniere.png" alt="Banniere_films" title="Banniere_films" width="100%" class="img-responsive"/>
</div>

<div class="col-lg-12 headerSearch">
    <form class="form-inline" method="GET" action="">
        <div class="form-group">
            <label>Rechercher (un film, un acteur...) : </label>
        </div>
        <div class="form-group">
            <input type="text" name="search" class="form-control" placeholder="Tapez votre recherche ici">
        </div>
        <div class="form-group">
            <button type="submit" id="btSubmit" class="btn btn-primary btn-sm active">Rechercher</button>
        </div>
    </form>

</div>