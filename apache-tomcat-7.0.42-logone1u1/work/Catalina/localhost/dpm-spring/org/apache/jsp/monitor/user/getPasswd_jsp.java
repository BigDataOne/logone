/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.42
 * Generated at: 2013-08-26 14:57:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.monitor.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.youku.dpm.utils.BasePathUtil;

public final class getPasswd_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/common/inc/head.jsp", Long.valueOf(1370016646000L));
  }

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
      out.write("\r\n");

	request.setCharacterEncoding("UTF-8");
	response.setHeader("Cache-Control", "max-age=0");
	String path = request.getContextPath();
	String basePath = BasePathUtil.getBasePath(request);

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write('\r');
      out.write('\n');
      out.write(' ');
String basePath_head = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
 	String version = basePath_head+"version";
    
      out.write("\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<LINK href=\"");
      out.print(basePath_head);
      out.write("common/css/admin.css\" type=\"text/css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("\t<LINK href=\"");
      out.print(basePath_head);
      out.write("common/css/fenye.css\" type=\"text/css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<LINK href=\"");
      out.print(basePath_head);
      out.write("common/css/css.css\" type=\"text/css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("\t\t<LINK href=\"");
      out.print(basePath_head);
      out.write("common/css/dialog.css\" type=\"text/css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("<link rel=\"icon\" href=\"");
      out.print(basePath_head);
      out.write("common/images/favicon.ico\" type=\"image/x-icon\" />\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"");
      out.print(basePath_head);
      out.write("common/images/favicon.ico\" type=\"image/x-icon\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath_head);
      out.write("common/js/jquery.min.js\" ></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath_head);
      out.write("common/js/jquery.form.js\" ></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath_head);
      out.write("common/js/jquery.validate.min.js\" ></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath_head);
      out.write("common/js/messages_cn.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath_head);
      out.write("common/js/application.js\" ></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath_head);
      out.write("common/js/lang/zh-cn.js\" ></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath_head);
      out.write("common/js/WdatePicker.js\" ></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath_head);
      out.write("common/js/artDialog.js\" ></script>\r\n");
      out.write(" <script type=\"text/javascript\" src=\"");
      out.print(basePath_head);
      out.write("common/js/iframeTools.js\" ></script>\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath_head);
      out.write("common/js/fancybox/jquery.mousewheel-3.0.2.pack.js\" ></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath_head);
      out.write("common/js/fancybox/jquery.fancybox-1.3.1.js\" ></script>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(basePath_head);
      out.write("common/js/fancybox/jquery.fancybox-1.3.1.css\" media=\"screen\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath_head);
      out.write("common/js/json2.js\" ></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link rel=\"STYLESHEET\" type=\"text/css\" href=\"");
      out.print(basePath);
      out.write("common/css/main.css\" />\r\n");
      out.write("<title>用户密码重置 </title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<form  id=\"myform\"   action=\"");
      out.print(basePath);
      out.write("userManager/rtpasswd\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("<table class=\"table\" cellspacing=\"1\" cellpadding=\"2\" width=\"50%\" align=\"center\" border=\"0\">\r\n");
      out.write("<tbody>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<th class=\"form_head\" align=\"center\" colspan=\"2\">用户密码重置</th>\r\n");
      out.write("\t</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td class=\"td_x_bg\">用户名:</td>  <td class=\"td_bg\"><input id=\"userId\"  type=\"text\" name=\"userId\"  value=\"\" /></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td class=\"td_x_bg\">注册邮箱:</td>  <td class=\"td_bg\"><input id=\"email\"  type=\"text\" name=\"email\"  value=\"\" /></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td colspan=\"2\" align=\"center\">\r\n");
      out.write("   <input type=\"button\" value=\"提交申请\"  onclick=\"apply()\" style=\"width: 60px; height: 30px;border:1px solid #29598D;\">\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</tbody>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("<Script>\r\n");
      out.write("  function apply(){\r\n");
      out.write("     //解决IE 浏览器 不能支持 trim()方法\r\n");
      out.write("     if(typeof String.prototype.trim !== 'function') {\r\n");
      out.write("\t\tString.prototype.trim = function() {\r\n");
      out.write("\t\treturn this.replace(/^\\s+|\\s+$/g, ''); \r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("  \r\n");
      out.write("      if(document.getElementById(\"userId\").value.trim()==\"\"){\r\n");
      out.write("    \r\n");
      out.write("       alert(\"请输入用户名!\");\r\n");
      out.write("       return false ;\r\n");
      out.write("    }\r\n");
      out.write("     if(document.getElementById(\"email\").value.trim()==\"\"){\r\n");
      out.write("    \r\n");
      out.write("       alert(\"请输入邮箱!\");\r\n");
      out.write("       return false ;\r\n");
      out.write("    }\r\n");
      out.write("      //解决IE6不能提交问题\r\n");
      out.write("      document.getElementById('myform').submit();\r\n");
      out.write("  \r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" (function(){\r\n");
      out.write("    var returnPasswdCode='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${returnPasswdCode}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("';\r\n");
      out.write("    if(returnPasswdCode== 0 ){\r\n");
      out.write("      return false;\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    if(returnPasswdCode== -1){\r\n");
      out.write("      alert(\"用户名与电子邮箱信息不匹配!\");\r\n");
      out.write("    }else if(returnPasswdCode== 1){\r\n");
      out.write("      alert(\"密码重置成功,正发往到您的电子邮箱，请查收！\");\r\n");
      out.write("      window.location='");
      out.print(basePath);
      out.write("login.jsp';\r\n");
      out.write("    }else{\r\n");
      out.write("      alert(\"密码重置操作成功\");\r\n");
      out.write("      window.location='");
      out.print(basePath);
      out.write("login.jsp';\r\n");
      out.write("    }\r\n");
      out.write("})();\r\n");
      out.write("\r\n");
      out.write("</Script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
