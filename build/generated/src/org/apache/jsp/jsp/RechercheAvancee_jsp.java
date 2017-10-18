package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;
import java.text.SimpleDateFormat;

public final class RechercheAvancee_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/jsp/Header.jsp");
    _jspx_dependants.add("/jsp/Nav.jsp");
    _jspx_dependants.add("/jsp/Footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"/Cinescope2017Web/css/bootstrap.min.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"/Cinescope2017Web/css/bootstrap-theme.min.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"/Cinescope2017Web/css/main.css\" />\n");
      out.write("        <title>Recherche Avancée</title>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <!--HEADER-->\n");
      out.write("        <div class=\"row text-center\">\n");
      out.write("            <header>\n");
      out.write("                ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"col-lg-12\">\n");
      out.write("    <img src=\"/Cinescope2017Web/images/banniere.png\" alt=\"Banniere_films\" title=\"Banniere_films\" width=\"100%\" class=\"img-responsive\"/>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"col-lg-12 headerSearch\">\n");
      out.write("    <form class=\"form-inline\" method=\"GET\" action=\"\">\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <label>Rechercher (un film, un acteur...) : </label>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <input type=\"text\" name=\"search\" class=\"form-control\" placeholder=\"Tapez votre recherche ici\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <button type=\"submit\" id=\"btSubmit\" class=\"btn btn-primary btn-sm active\">Rechercher</button>\n");
      out.write("        </div>\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("</div>");
      out.write("\n");
      out.write("            </header>\n");
      out.write("        </div>\n");
      out.write("        <!--FIN HEADER-->\n");
      out.write("\n");
      out.write("        <!--NAV-->\n");
      out.write("        <div class=\"row coeurPage\">\n");
      out.write("            <div class=\"col-lg-2\">\n");
      out.write("                <nav>\n");
      out.write("                    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"list-group text-center\">\n");
      out.write("    <a href=\"/Cinescope2017Web/ControleurPrincipal\" class=\"list-group-item list-group-item-info\">Accueil</a>  \n");
      out.write("    <a href=\"/Cinescope2017Web/TousLesFilms\" class=\"list-group-item list-group-item-info\">Tous les films</a>  \n");
      out.write("    <a href=\"/Cinescope2017Web/NouveauxFilms\" class=\"list-group-item list-group-item-info\">Nouveaux films</a>  \n");
      out.write("    <a href=\"/Cinescope2017Web/AutresFilms\" class=\"list-group-item list-group-item-info\">Autres films</a>  \n");
      out.write("    <a href=\"/Cinescope2017Web/Reprises\" class=\"list-group-item list-group-item-info\">Reprises</a>  \n");
      out.write("    <a href=\"/Cinescope2017Web/BoxOffice\" class=\"list-group-item list-group-item-info\">Box-Office</a>  \n");
      out.write("    <a href=\"/Cinescope2017Web/HitParade\" class=\"list-group-item list-group-item-info\">Hit Parade</a>  \n");
      out.write("    <a href=\"/Cinescope2017Web/AvisDesCritiques\" class=\"list-group-item list-group-item-info\">Avis des critiques</a>  \n");
      out.write("    <a href=\"/Cinescope2017Web/SallesDeParis\" class=\"list-group-item list-group-item-info\">Salles de Paris</a>  \n");
      out.write("    <a href=\"/Cinescope2017Web/SallesDeLaPériphérie\" class=\"list-group-item list-group-item-info\">Salles de la Périphérie</a>  \n");
      out.write("    <a href=\"/Cinescope2017Web/RechercheAvancee\" class=\"list-group-item list-group-item-info\">Recherche avancée</a>  \n");
      out.write("    <a href=\"/Cinescope2017Web/LesArticles\" class=\"list-group-item list-group-item-info\">Les articles</a>  \n");
      out.write("    <a href=\"/Cinescope2017Web/AvantPremières\" class=\"list-group-item list-group-item-info\">Avant-Premières</a>  \n");
      out.write("    <a href=\"/Cinescope2017Web/Festivals\" class=\"list-group-item list-group-item-info\">Festivals</a>\n");
      out.write("</div>");
      out.write("\n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("            <!--FIN NAV-->\n");
      out.write("\n");
      out.write("            <div class=\"col-lg-8 col-lg-offset-1\">                \n");
      out.write("                <article id=\"rechercheAvancee\">\n");
      out.write("                    <form action=\"\" method=\"GET\" class=\"col-lg-6 col-lg-offset-1\">\n");
      out.write("                        <legend>Recherche Avancée</legend>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <select id=\"selectGenre\" class=\"form-control\">\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <select id=\"selectArrondissement\" class=\"form-control\">\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <input type=\"text\" name=\"artiste\" id=\"artiste\" class=\"form-control\" placeholder=\"Entrez le nom d'un acteur ou d'un réalisateur\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <input type=\"text\" name=\"film\" id=\"film\" class=\"form-control\" placeholder=\"Entrez le titre d'un film\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <input type=\"text\" name=\"cinema\" id=\"cinema\" class=\"form-control\" placeholder=\"Entrez le nom d'un cinéma\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <button type=\"submit\" id=\"btValider\" class=\"btn btn-primary active pull-right\">Lancer la recherche</button>\n");
      out.write("                            <button type=\"button\" id=\"btAnnuler\" class=\"btn btn-danger active\">Annuler la recherche</button>\n");
      out.write("                        </div>\n");
      out.write("                        ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                    </form>\n");
      out.write("                </article>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-12\">\n");
      out.write("                <footer>\n");
      out.write("                    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    SimpleDateFormat sdfJour = new SimpleDateFormat("EEEE dd MMMM yyyy");
    SimpleDateFormat sdfHeure = new SimpleDateFormat("HH:mm");
    String lsJour = sdfJour.format(new Date());
    String lsHeure = sdfHeure.format(new Date());
    out.print("Nous sommes le " + lsJour + " et il est " + lsHeure);

      out.write("\n");
      out.write("                </footer>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script src=\"/Cinescope2017Web/js/bootstrap.min.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("genre");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listeRechercheAvancee}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("                                    \n");
          out.write("                                    <option>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${genre.listeRechercheAvancee}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>                                    \n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setVar("arrondissement");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listeRechercheAvancee}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("                                    \n");
          out.write("                                    <option>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${arrondissement.listeRechercheAvancee}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>                                    \n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }
}
