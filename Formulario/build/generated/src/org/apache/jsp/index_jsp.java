package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Gamarra - Store</title>\n");
      out.write("        <meta charset=\"UTF-8\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("        <meta name=\"keywords\" content=\" Moda, Ropa, Belleza\" />\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link href=\"css/fontawesome-all.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"//fonts.googleapis.com/css?family=Raleway:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i\"\n");
      out.write("              rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\" w3l-login-form\">\n");
      out.write("            <h2>Iniciar Sesion</h2>\n");
      out.write("            <form action=\"#\" method=\"POST\">\n");
      out.write("\n");
      out.write("                <div class=\" w3l-form-group\">\n");
      out.write("                    <label>Usuario:</label>\n");
      out.write("                    <div class=\"group\">\n");
      out.write("                        <i class=\"fas fa-user\"></i>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Username\" required=\"required\" />\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\" w3l-form-group\">\n");
      out.write("                    <label>Contraseña:</label>\n");
      out.write("                    <div class=\"group\">\n");
      out.write("                        <i class=\"fas fa-unlock\"></i>\n");
      out.write("                        <input type=\"password\" class=\"form-control\" placeholder=\"Password\" required=\"required\" />\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"forgot\">\n");
      out.write("                    <a href=\"#\">¿Olvidaste tu contraseña?</a>\n");
      out.write("                    <p><input type=\"checkbox\">Recordarme</p>\n");
      out.write("                </div>\n");
      out.write("                <button type=\"submit\">INICIAR SESION</button>\n");
      out.write("            </form>\n");
      out.write("            <p class=\" w3l-register-p\">No tengo cuenta<a href=\"#\" class=\"register\"> Registrame</a></p>\n");
      out.write("        </div>\n");
      out.write("\n");
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
}
