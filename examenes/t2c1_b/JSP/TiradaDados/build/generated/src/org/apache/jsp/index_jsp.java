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
      response.setContentType("text/html");
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
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>TIRADA DADOS</title>\n");
      out.write("        <meta name=\"author\" content=\"constantin\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/css.css\">\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <div>\n");
      out.write("      <h1>TIRADA DADOS</h1>\n");
      out.write("        ");

            int dadoUno = 0;
            int dadoDos = 0;
            int dadoTres = 0;
            
            do {
                dadoUno = (int)(Math.random() * 6) + 1;
                dadoDos = (int)(Math.random() * 6) + 1;
                dadoTres = (int)(Math.random() * 6) + 1;
                
                out.print("<img width=\"150\" height=\"150\" src=\"./img/dado" + dadoUno + ".png'>");
                out.print("<img width=\"150\" height=\"150\" src=\"./img/dado" + dadoDos + ".png'>");
                out.print("<img src='img/dado" + dadoTres + ".png  width=\"150\" height=\"150\"'>");
                out.print("<br>");
            } while((dadoUno != dadoDos)&&(dadoUno != dadoTres)&&(dadoDos != dadoTres));
        
      out.write("\n");
      out.write("    </div>\n");
      out.write("  </body>\n");
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
