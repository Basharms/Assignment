/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.108
 * Generated at: 2021-03-30 23:31:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/header.jsp", Long.valueOf(1617136251746L));
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<script src=\"https://code.jquery.com/ui/1.11.4/jquery-ui.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/jquery-1.10.2.min.js\"></script>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.10.2.min.js\"></script>\r\n");
      out.write("<style>\r\n");
      out.write("\tbody {\r\n");
      out.write("\t  background: #ffffff;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t.content {\r\n");
      out.write("\t  max-width: 500px;\r\n");
      out.write("\t  margin: auto;\r\n");
      out.write("\t  background: white;\r\n");
      out.write("\t  padding: 10px;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("</style>\r\n");
      out.write("<title>Login Page</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<hr>\r\n");
      out.write("\t\tWelcome ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loggedInUser.userName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("... <br>\r\n");
      out.write("\t\tCurrent Time is : ");
      out.print(new java.util.Date());
      out.write("\r\n");
      out.write("\t\t&nbsp;\r\n");
      out.write("\t\t&nbsp;\r\n");
      out.write("\t\t&nbsp;\r\n");
      out.write("\t\t&nbsp;\r\n");
      out.write("\t\t&nbsp;\r\n");
      out.write("\t\t&nbsp;\r\n");
      out.write("\t\t&nbsp;\r\n");
      out.write("\t\t&nbsp;\r\n");
      out.write("\t\t<a href=\"/Assignment/logout\"> Logout</a> \r\n");
      out.write("\t<hr>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("\t<title>Welcome</title>\r\n");
      out.write("<style>\r\n");
      out.write("\tbody {\r\n");
      out.write("\t  background: #ffffff;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t.content {\r\n");
      out.write("\t  max-width: 600px;\r\n");
      out.write("\t  margin: auto;\r\n");
      out.write("\t  background: white;\r\n");
      out.write("\t  padding: 10px;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("</style>\r\n");
      out.write("<script>\r\n");
      out.write("\t$(document).ready(function(){\r\n");
      out.write("\t\t$(\"#msgDIV\").hide();\r\n");
      out.write("\t\tvar showmsg = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${showMsg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\";\r\n");
      out.write("\t\tif(showmsg == 'true') {\r\n");
      out.write("\t\t\t$(\"#msgDIV\").show();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\t  $(\"#dateFrom\").datepicker({\r\n");
      out.write("\t\t    dateFormat: 'dd/mm/yy',\r\n");
      out.write("\t\t  });\r\n");
      out.write("\r\n");
      out.write("\t\t  $('btn').click(function() {\r\n");
      out.write("\t\t    $('#error').text('');\r\n");
      out.write("\t\t    try {\r\n");
      out.write("\t\t    var dateParse = $.datepicker.parseDate(\"dd/mm/yy\", $(\"#datepicker\").val());\r\n");
      out.write("\t\t    if (dateParse) {\r\n");
      out.write("\t\t      $('#error').text(dateParse);\r\n");
      out.write("\t\t    }\r\n");
      out.write("\t\t    } catch (e) {$('#error').text(e);}\r\n");
      out.write("\t\t  });\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\r\n");
      out.write("\tfunction validateForm() {\r\n");
      out.write("\t\tvar accountIdVal = document.forms[\"searchStatementForm\"][\"accountId\"].value;\r\n");
      out.write("\t\t  if (accountIdVal == \"\" || accountIdVal == null) {\r\n");
      out.write("\t\t    alert(\"Account ID must be filled out\");\r\n");
      out.write("\t\t    return false;\r\n");
      out.write("\t\t  }\r\n");
      out.write("\r\n");
      out.write("\t\tvar dateFromVal = document.forms[\"searchStatementForm\"][\"dateFrom\"].value;\r\n");
      out.write("\t\tvar dateToVal = document.forms[\"searchStatementForm\"][\"dateTo\"].value;\r\n");
      out.write("\t\tif(dateFromVal != null && dateFromVal.length > 0) {\r\n");
      out.write("\t\t\tif (dateToVal == \"\" || dateToVal == null) {\r\n");
      out.write("\t\t    \talert(\"Date to must be filled out\");\r\n");
      out.write("\t\t    \treturn false;\r\n");
      out.write("\t\t  \t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(dateToVal != null && dateToVal.length > 0) {\r\n");
      out.write("\t\t\tif (dateFromVal == \"\" || dateFromVal == null) {\r\n");
      out.write("\t\t    \talert(\"Date from must be filled out\");\r\n");
      out.write("\t\t    \treturn false;\r\n");
      out.write("\t\t  \t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tvar amountFromVal = document.forms[\"searchStatementForm\"][\"amountFrom\"].value;\r\n");
      out.write("\t\tvar amountToVal = document.forms[\"searchStatementForm\"][\"amountTo\"].value;\r\n");
      out.write("\t\tif(amountFromVal != null && amountFromVal.length > 0) {\r\n");
      out.write("\t\t\tif (amountToVal == \"\" || amountToVal == null) {\r\n");
      out.write("\t\t    \talert(\"Amount to must be filled out\");\r\n");
      out.write("\t\t    \treturn false;\r\n");
      out.write("\t\t  \t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(amountToVal != null && amountFromVal.length > 0) {\r\n");
      out.write("\t\t\tif (amountFromVal == \"\" || amountFromVal == null) {\r\n");
      out.write("\t\t    \talert(\"Amount from must be filled out\");\r\n");
      out.write("\t\t    \treturn false;\r\n");
      out.write("\t\t  \t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<form id=\"searchStatementForm\" onsubmit=\"return validateForm();\" action=\"searchStatement\" method=\"post\">\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>Account ID: </td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" id=\"accountId\" name=\"accountId\"></td> <td class=\"content\"><font color=\"colorvalue\">*</font></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>Date from:</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" id=\"dateFrom\" name=\"dateFrom\"></td>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<td>Date to:</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" id=\"dateTo\" name=\"dateTo\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>Amount from:</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" id=\"amountFrom\" name=\"amountFrom\"></td>\r\n");
      out.write("\t\t\t\t\t<td>Amount to:</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" id=\"amountTo\" name=\"amountTo\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" value=\"Search Statement\" id=\"btn\" name=\"btn\">\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</tbody>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t<p id=\"error\">\r\n");
      out.write("\t\r\n");
      out.write("\t</p>\r\n");
      out.write("\t<div id=\"msgDIV\" class=\"content\">\r\n");
      out.write("\t\t<p><font color=\"colorvalue\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${errorMsg }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</font></p>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}