/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.42
 * Generated at: 2013-09-02 03:59:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.monitor;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.youku.dpm.utils.BasePathUtil;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");

	request.setCharacterEncoding("UTF-8");
	response.setHeader("Cache-Control", "max-age=0");
	String basePath = BasePathUtil.getBasePath(request); 

      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\">\r\n");
      out.write("<HTML>\r\n");
      out.write("<HEAD>\r\n");
      out.write("<META http-equiv=Content-Type content=\"text/html; charset=utf-8\">\r\n");
      out.write("<LINK href=\"");
      out.print(basePath );
      out.write("common/css/admin.css\" type=\"text/css\" rel=\"stylesheet\">\r\n");
      out.write("</HEAD>\r\n");
      out.write("<BODY>\r\n");
      out.write("<TABLE cellSpacing=0 cellPadding=0 width=\"100%\"\r\n");
      out.write("\tbackground=\"");
      out.print(basePath );
      out.write("common/images/header_bg.jpg\" border=0>\r\n");
      out.write("\t<TR height=56>\r\n");
      out.write("\t\t<TD width=260><img src=\"");
      out.print(basePath );
      out.write("common/images/youkulogo.png\" style=\"margin-left: 15px;margin-top: 3px;\" /></TD>\r\n");
      out.write("\t\t<TD style=\"FONT-WEIGHT: bold; COLOR: #fff; PADDING-TOP: 20px\"\r\n");
      out.write("\t\t\talign=\"center\">当前用户：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionId.userName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("&nbsp;&nbsp; <A style=\"COLOR: #fff\"\r\n");
      out.write("\t\t\tonclick=\"if (confirm('确定要退出吗？')) return true; else return false;\"\r\n");
      out.write("\t\t\thref=\"");
      out.print(basePath);
      out.write("userManager/logout\" target=_top>退出系统</A></TD>\r\n");
      out.write("\t\t<TD align=right width=268></TD>\r\n");
      out.write("\t</TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<TABLE cellSpacing=0 cellPadding=0 width=\"100%\" border=0>\r\n");
      out.write("\t<TR bgColor=#1c5db6 height=4>\r\n");
      out.write("\t\t<TD></TD>\r\n");
      out.write("\t</TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("</BODY>\r\n");
      out.write("</HTML>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
