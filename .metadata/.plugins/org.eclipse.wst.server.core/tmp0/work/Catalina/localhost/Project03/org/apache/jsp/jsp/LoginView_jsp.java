/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.42
 * Generated at: 2021-06-03 09:08:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import in.co.rays.project3.controller.LoginCtl;
import in.co.rays.project3.util.DataUtility;
import in.co.rays.project3.util.ServletUtility;
import in.co.rays.project3.dto.RoleDTO;
import in.co.rays.project3.dto.UserDTO;
import in.co.rays.project3.controller.ORSView;
import in.co.rays.project3.controller.LoginCtl;
import in.co.rays.project3.controller.ORSView;

public final class LoginView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/jsp/Footer.jsp", Long.valueOf(1619248967650L));
    _jspx_dependants.put("/jsp/Header.jsp", Long.valueOf(1622705699529L));
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Login</title>\r\n");
      out.write("\r\n");
      out.write("<!-- font-awesome library -->\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("@import\r\n");
      out.write("\turl(https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css)\r\n");
      out.write("\t;\r\n");
      out.write("\r\n");
      out.write("@import\r\n");
      out.write("\turl(https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.4.3/css/mdb.min.css)\r\n");
      out.write("\t;\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write(" body {\r\n");
      out.write("\t background-image:url(\"/Project03/img/architech.jpg\");\r\n");
      out.write("\tbackground-size: cover;\r\n");
      out.write("\tbackground-repeat: no-repeat;\r\n");
      out.write("\tbackground-attachment: fixed;\r\n");
      out.write("\tbackground-position: center;\r\n");
      out.write("}\r\n");
      out.write(" \r\n");
      out.write(".darken-grey-text {\r\n");
      out.write("\tcolor: #2E2E2E;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".danger-text {\r\n");
      out.write("\tcolor: #ff3547;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".default-text {\r\n");
      out.write("\tcolor: #fff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".info-text {\r\n");
      out.write("\tcolor: #33b5e5;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".card{\r\n");
      out.write("   background-color:#4caf50a1!important;\r\n");
      out.write("   border-style: solid;\r\n");
      out.write("  border-width: 50px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".paddingclass {\r\n");
      out.write("\tpadding-top: 10px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".setForm {\r\n");
      out.write("\tpadding-top: 5%;\r\n");
      out.write("\tpadding-left: 25%;\r\n");
      out.write("\twidth: 130%\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".button {\r\n");
      out.write("\tborder-radius: 10px;\r\n");
      out.write("\tpadding: 10px;\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("\tfont-size: 20px;\r\n");
      out.write("\tbackground-color: #00cc88\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".textfield {\r\n");
      out.write("\tborder: 1px solid #8080803b;\r\n");
      out.write("\theight: 38px;\r\n");
      out.write("\tpadding-left: 6px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
 	String URI = (String)request.getAttribute("uri");
      out.write('\r');
      out.write('\n');
      out.write('	');
      in.co.rays.project3.dto.UserDTO dto = null;
      dto = (in.co.rays.project3.dto.UserDTO) _jspx_page_context.getAttribute("dto", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (dto == null){
        dto = new in.co.rays.project3.dto.UserDTO();
        _jspx_page_context.setAttribute("dto", dto, javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      }
      out.write("\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write(" \r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.7.0/css/all.css\" integrity=\"sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ\" crossorigin=\"anonymous\">\r\n");
      out.write(" \r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\">\r\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\"></script>\r\n");
      out.write(" \r\n");
      out.write("   <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\r\n");
      out.write("   <style type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("<script src=\"");
      out.print(ORSView.APP_CONTEXT);
      out.write("/js/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("src=\"");
      out.print(ORSView.APP_CONTEXT);
      out.write("/js/CheckBox11.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("href=\"//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css\">\r\n");
      out.write("<script src=\"https://code.jquery.com//jquery-1.12.4.js\"></script>\r\n");
      out.write("<script src=\"https://code.jquery.com/ui/1.12.1/jquery-ui.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- <script>\r\n");
      out.write("$(function() {\r\n");
      out.write("$(\"#date\").datepicker({\r\n");
      out.write("\r\n");
      out.write("changeMonth : true,\r\n");
      out.write("changeYear : true,\r\n");
      out.write("maxDate : 0,\r\n");
      out.write("//minDate: 0+1,\r\n");
      out.write("//beforeShowDay: noSunday,\r\n");
      out.write("//beforeShowDay1: noSunday1,\r\n");
      out.write("\r\n");
      out.write("yearRange : \"-67:\",\r\n");
      out.write("//defaultDate:\"01/01/1999\"\r\n");
      out.write("});\r\n");
      out.write("});\r\n");
      out.write("</script> -->\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("  \r\n");
      out.write("  function disableSunday(d){\r\n");
      out.write("\t  var day = d.getDay();\r\n");
      out.write("\t  if(day==0)\r\n");
      out.write("\t  {\r\n");
      out.write("\t   return [false];\r\n");
      out.write("\t  }else\r\n");
      out.write("\t  {\r\n");
      out.write("\t\t  return [true];\r\n");
      out.write("\t  }\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  $( function() {\r\n");
      out.write("\t  $( \"#datepiker\" ).datepicker({\r\n");
      out.write("\t\t  changeMonth :true,\r\n");
      out.write("\t\t  changeYear :true,\r\n");
      out.write("\t\t  yearRange :'1980:2020',\r\n");
      out.write("\t\t  dateFormat:'dd-MM-yy',\r\n");
      out.write("\r\n");
      out.write("// Disable for Sunday\r\n");
      out.write("\t\t  beforeShowDay : disableSunday,\t\t  \r\n");
      out.write("// Disable for back date\r\n");
      out.write("\t\t  minDate : 0   \r\n");
      out.write("\t  });\r\n");
      out.write("  } );\r\n");
      out.write("  </script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

UserDTO userDto = (UserDTO) session.getAttribute("user");

boolean userLoggedIn = userDto != null;

String welcomeMsg = "Hi, ";
String byee = "byee";
if (userLoggedIn) {
String role = (String) session.getAttribute("role");
welcomeMsg += userDto.getFirstName() + " (" + role + ")";

} else {
byee += welcomeMsg += "Guest";
}

      out.write("\r\n");
      out.write("<style>\r\n");
      out.write(" .navbar-dark .navbar-nav .nav-link {\r\n");
      out.write("    color: #f8f9fa; \r\n");
      out.write("  \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".dropdown-menu{\r\n");
      out.write("background-color: #ffeb3bab!importent;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".dropdown-item \r\n");
      out.write("{\r\n");
      out.write("background-color:#ffeb3bab!importent;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* .nav{\r\n");
      out.write(" background-color:#ffc1077d!important;\r\n");
      out.write("} */\r\n");
      out.write(" </style>\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-expand-xl  navbar-dark\" style=\"background-color:rgb(87, 162, 144)\t;\">\r\n");
      out.write("  <a class=\"navbar-brand\" href=\"");
      out.print(ORSView.WELCOME_CTL);
      out.write("\">\r\n");
      out.write("  <h1 align=\"left\"> <img src=\"");
      out.print(ORSView.APP_CONTEXT);
      out.write("/img/image.png\" width=\"120\" height=\"50\"></h1></a>\r\n");
      out.write("  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#collapsibleNavbar\">\r\n");
      out.write("    <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("  </button>\r\n");
      out.write("   <div class=\"collapse navbar-collapse\" id=\"collapsibleNavbar\">\r\n");
      out.write("    <ul class=\"navbar-nav ml-auto mr-5\">\r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("            ");

            if (userLoggedIn) {
        
      out.write("\r\n");
      out.write("          ");

if (userDto.getRoleid() == RoleDTO.STUDENT) {

      out.write("\r\n");
      out.write("</td>\r\n");
      out.write("<!-- \t\t\t<td rowspan=\"2\"> -->\r\n");
      out.write("<!-- \t\t\t\t<h1 align=\"right\"> -->\r\n");
      out.write("\r\n");
      out.write("<!-- \t\t\t\t\t\theight=\"50\"> -->\r\n");
      out.write("<!-- \t\t\t\t</h1> -->\r\n");
      out.write("<!-- \t\t\t</td> -->\r\n");
      out.write("<!-- \t\t</tr> -->\r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Dropdown -->\r\n");
      out.write("    <li class=\"nav-item dropdown\">\r\n");
      out.write("      <a class=\"nav-link dropdown-toggle\"  href=\"#\" id=\"navbardrop\" data-toggle=\"dropdown\">\r\n");
      out.write("        Marksheet\r\n");
      out.write("      </a>\r\n");
      out.write("      <div class=\"dropdown-menu\">\r\n");
      out.write("        <a class=\"dropdown-item\" href=\"");
      out.print(ORSView.GET_MARKSHEET_CTL);
      out.write("\">Get Marksheet</a>\r\n");
      out.write("        <a class=\"dropdown-item\" href=\"");
      out.print(ORSView.MARKSHEET_LIST_CTL);
      out.write("\">Marksheet List</a>\r\n");
      out.write("     \r\n");
      out.write("      </div>\r\n");
      out.write("    </li>\r\n");
      out.write("\r\n");
      out.write("<!-- Dropdown -->\r\n");
      out.write("    <li class=\"nav-item dropdown\">\r\n");
      out.write("      <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbardrop\" data-toggle=\"dropdown\">\r\n");
      out.write("        User\r\n");
      out.write("      </a>\r\n");
      out.write("      <div class=\"dropdown-menu\">\r\n");
      out.write("        <a class=\"dropdown-item\" href=\"");
      out.print(ORSView.MY_PROFILE_CTL);
      out.write("\">My Profile</a>\r\n");
      out.write("        <a class=\"dropdown-item\" href=\"");
      out.print(ORSView.CHANGE_PASSWORD_CTL);
      out.write("\">Change Password</a>\r\n");
      out.write("     \r\n");
      out.write("      </div>\r\n");
      out.write("    </li>\r\n");

}else if(userDto.getRoleid()==RoleDTO.ADMIN){

      out.write("\r\n");
      out.write("   \r\n");
      out.write("       \r\n");
      out.write("          <!-- Dropdown -->\r\n");
      out.write("    <li class=\"nav-item dropdown\">\r\n");
      out.write("      <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbardrop\" data-toggle=\"dropdown\">\r\n");
      out.write("       <i class='fas fa-users'></i>&nbsp; User\r\n");
      out.write("      </a>\r\n");
      out.write("      <div class=\"dropdown-menu\" style=\"background-color:silver \">\r\n");
      out.write("        <a class=\"dropdown-item\" style=\"background-color:silver; \" href=\"");
      out.print(ORSView.USER_CTL);
      out.write("\"><i class='fas fa-plus-square'></i>&nbsp;<strong>Add User</strong></a>\r\n");
      out.write("        <a class=\"dropdown-item\" style=\"background-color:silver; \" href=\"");
      out.print(ORSView.USER_LIST_CTL);
      out.write("\"><i class='fa fa-list-alt'></i>&nbsp;<strong>User List</strong></a>\r\n");
      out.write("     \r\n");
      out.write("      </div>\r\n");
      out.write("    </li>\r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("      <!-- Dropdown -->\r\n");
      out.write("    <li class=\"nav-item dropdown\">\r\n");
      out.write("      <a class=\"nav-link dropdown-toggle\"  href=\"#\" id=\"navbardrop\" data-toggle=\"dropdown\">\r\n");
      out.write("       <i class='fas fa-file-alt' ></i>&nbsp;Marksheet\r\n");
      out.write("      </a>\r\n");
      out.write("      <div class=\"dropdown-menu\" style=\"background-color: silver\">\r\n");
      out.write("        <a class=\"dropdown-item\" style=\"background-color:silver\" href=\"");
      out.print(ORSView.MARKSHEET_CTL);
      out.write("\"><i class='fas fa-plus-square' ></i>&nbsp;<strong>Add Marksheet</strong></a>\r\n");
      out.write("        <a class=\"dropdown-item\" style=\"background-color:silver\" href=\"");
      out.print(ORSView.MARKSHEET_LIST_CTL);
      out.write("\"><i class='fa fa-list-alt' ></i>&nbsp;<strong>Marksheet List</strong></a>\r\n");
      out.write("       <a class=\"dropdown-item\" style=\"background-color: silver\" href=\"");
      out.print(ORSView.MARKSHEET_MERIT_LIST_CTL);
      out.write("\"><i class='fa fa-list-alt' ></i>&nbsp;<strong>Marksheet Merit List</strong></a>\r\n");
      out.write("        <a class=\"dropdown-item\" style=\"background-color:silver\" href=\"");
      out.print(ORSView.GET_MARKSHEET_CTL);
      out.write("\"><i class='fas fa-plus-square' ></i>&nbsp;<strong>Get Marksheet</strong></a>\r\n");
      out.write("     \r\n");
      out.write("      </div>\r\n");
      out.write("    </li>\r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("      <!-- Dropdown -->\r\n");
      out.write("    <li class=\"nav-item dropdown\">\r\n");
      out.write("      <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbardrop\" data-toggle=\"dropdown\" class=\"fonta\">\r\n");
      out.write("        <i class='fas fa-user-circle'></i>&nbsp;Role\r\n");
      out.write("      </a>\r\n");
      out.write("      <div class=\"dropdown-menu\" style=\"background-color: silver\">\r\n");
      out.write("        <a class=\"dropdown-item\" style=\"background-color: silver\" href=\"");
      out.print(ORSView.ROLE_CTL);
      out.write("\"><i class='fas fa-plus-square'></i>&nbsp;<strong>Add Role</strong></a>\r\n");
      out.write("        <a class=\"dropdown-item\" style=\"background-color: silver\" href=\"");
      out.print(ORSView.ROLE_LIST_CTL);
      out.write("\"><i class='fa fa-list-alt'></i>&nbsp;<strong>Role List</strong></a>\r\n");
      out.write("     \r\n");
      out.write("      </div>\r\n");
      out.write("    </li>\r\n");
      out.write("   \r\n");
      out.write("     <!-- Dropdown -->\r\n");
      out.write("    <li class=\"nav-item dropdown\">\r\n");
      out.write("      <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbardrop\" data-toggle=\"dropdown\">\r\n");
      out.write("        <i class='fas fa-university'></i>&nbsp;College\r\n");
      out.write("      </a>\r\n");
      out.write("      <div class=\"dropdown-menu\" style=\"background-color: silver\">\r\n");
      out.write("        <a class=\"dropdown-item\" style=\"background-color: silver\" href=\"");
      out.print(ORSView.COLLEGE_CTL);
      out.write("\"> <i class='fas fa-plus-square'></i>&nbsp;<strong>Add College</strong></a>\r\n");
      out.write("        <a class=\"dropdown-item\" style=\"background-color: silver\" href=\"");
      out.print(ORSView.COLLEGE_LIST_CTL);
      out.write("\"> <i class='fa fa-list-alt'></i>&nbsp;<strong>College List</strong></a>\r\n");
      out.write("     \r\n");
      out.write("      </div>\r\n");
      out.write("    </li>\r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("      <!-- Dropdown -->\r\n");
      out.write("    <li class=\"nav-item dropdown\">\r\n");
      out.write("      <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbardrop\" data-toggle=\"dropdown\">\r\n");
      out.write("         <i class='fa fa-newspaper'></i>&nbsp;Course\r\n");
      out.write("      </a>\r\n");
      out.write("      <div class=\"dropdown-menu\" style=\"background-color: silver\">\r\n");
      out.write("        <a class=\"dropdown-item\" style=\"background-color: silver\" href=\"");
      out.print(ORSView.COURSE_CTL);
      out.write("\"><i class='fas fa-plus-square'></i>&nbsp;<strong>Add Course</strong></a>\r\n");
      out.write("        <a class=\"dropdown-item\" style=\"background-color: silver\" href=\"");
      out.print(ORSView.COURSE_LIST_CTL);
      out.write("\"><i class='fa fa-list-alt'></i>&nbsp;<strong>Course List</strong></a>\r\n");
      out.write("     \r\n");
      out.write("      </div>\r\n");
      out.write("    </li>\r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("       <!-- Dropdown -->\r\n");
      out.write("    <li class=\"nav-item dropdown\">\r\n");
      out.write("      <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbardrop\" data-toggle=\"dropdown\">\r\n");
      out.write("         <i class='fas fa-user-graduate'></i>&nbsp;Student\r\n");
      out.write("      </a>\r\n");
      out.write("      <div class=\"dropdown-menu\" style=\"background-color: silver\">\r\n");
      out.write("        <a class=\"dropdown-item\" style=\"background-color: silver\" href=\"");
      out.print(ORSView.STUDENT_CTL);
      out.write("\"><i class='fas fa-plus-square'></i>&nbsp;<strong>Add Student</strong></a>\r\n");
      out.write("        <a class=\"dropdown-item\" style=\"background-color: silver\" href=\"");
      out.print(ORSView.STUDENT_LIST_CTL);
      out.write("\"> <i class='fa fa-list-alt'></i>&nbsp;<strong>Student List</strong></a>\r\n");
      out.write("     \r\n");
      out.write("      </div>\r\n");
      out.write("    </li>\r\n");
      out.write("   \r\n");
      out.write("       <!-- Dropdown -->\r\n");
      out.write("    <li class=\"nav-item dropdown\">\r\n");
      out.write("      <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbardrop\" data-toggle=\"dropdown\">\r\n");
      out.write("        <i class='fas fa-chalkboard-teacher\t'></i>&nbsp; Faculty\r\n");
      out.write("      </a>\r\n");
      out.write("      <div class=\"dropdown-menu\" style=\"background-color: silver\">\r\n");
      out.write("        <a class=\"dropdown-item\" style=\"background-color: silver\" href=\"");
      out.print(ORSView.FACULTY_CTL);
      out.write("\"><i class='fas fa-plus-square'></i>&nbsp;<strong> Add Faculty</strong></a>\r\n");
      out.write("        <a class=\"dropdown-item\" style=\"background-color: silver\" href=\"");
      out.print(ORSView.FACULTY_LIST_CTL);
      out.write("\"><i class='fa fa-list-alt'></i>&nbsp;<strong> Faculty List</strong></a>\r\n");
      out.write("     \r\n");
      out.write("      </div>\r\n");
      out.write("    </li>\r\n");
      out.write("    \r\n");
      out.write("       <!-- Dropdown -->\r\n");
      out.write("    <li class=\"nav-item dropdown\">\r\n");
      out.write("      <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbardrop\" data-toggle=\"dropdown\">\r\n");
      out.write("       <i class='fas fa-book'></i>&nbsp;Subject\r\n");
      out.write("      </a>\r\n");
      out.write("      <div class=\"dropdown-menu\" style=\"background-color: silver\">\r\n");
      out.write("        <a class=\"dropdown-item\" style=\"background-color: silver\" href=\"");
      out.print(ORSView.SUBJECT_CTL);
      out.write("\"><i class='fas fa-plus-square'></i>&nbsp;<strong>Add Subject</strong></a>\r\n");
      out.write("        <a class=\"dropdown-item\" style=\"background-color: silver\" href=\"");
      out.print(ORSView.SUBJECT_LIST_CTL);
      out.write("\"><i class='fa fa-list-alt'></i>&nbsp;<strong>Subject List</strong></a>\r\n");
      out.write("     \r\n");
      out.write("      </div>\r\n");
      out.write("    </li>\r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("     <!-- Dropdown -->\r\n");
      out.write("    <li class=\"nav-item dropdown\">\r\n");
      out.write("      <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbardrop\" data-toggle=\"dropdown\">\r\n");
      out.write("        <i class='fas fa-clock'></i>&nbsp; TimeTable\r\n");
      out.write("      </a>\r\n");
      out.write("      <div class=\"dropdown-menu\" style=\"background-color: silver\">\r\n");
      out.write("        <a class=\"dropdown-item\" style=\"background-color: silver\" href=\"");
      out.print(ORSView.TIMETABLE_CTL);
      out.write("\"><i class='fas fa-plus-square'></i>&nbsp;<strong>Add TimeTable</strong></a>\r\n");
      out.write("        <a class=\"dropdown-item\" style=\"background-color: silver\" href=\"");
      out.print(ORSView.TIMETABLE_LIST_CTL);
      out.write("\"><i class='fa fa-list-alt'></i>&nbsp;<strong>TimeTable List</strong></a>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("     \r\n");
      out.write("      </div>\r\n");
      out.write("    </li>\r\n");
      out.write("   \r\n");
      out.write("    ");

            }
            }
        
      out.write("\r\n");
      out.write("        \r\n");
      out.write("       <!--  &emsp; &emsp; &emsp; &emsp;  -->\r\n");
      out.write("       \r\n");
      out.write("         <!-- Dropdown -->\r\n");
      out.write("    <li class=\"nav-item dropdown\">\r\n");
      out.write("      <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbardrop\" data-toggle=\"dropdown\">\r\n");
      out.write("     <i class='fas fa-user'></i>&nbsp;<b>");
      out.print(welcomeMsg );
      out.write("</b></a>\r\n");
      out.write("      <div class=\"dropdown-menu\" style=\"background-color: #ffeb3bab\">    <!--yellow uper or below shades  -->\r\n");
      out.write("     \r\n");
      out.write("      ");

if(userLoggedIn){
      
      out.write("\r\n");
      out.write("     \r\n");
      out.write("      <a class=\"dropdown-item\" style=\"background-color: silver\" href=\"");
      out.print(ORSView.MY_PROFILE_CTL);
      out.write("\"><i class='fas fa-graduation-cap'></i>&nbsp;<strong>My Profile</strong> </a>\r\n");
      out.write("       <a class=\"dropdown-item\" style=\"background-color: silver\" href=\"");
      out.print(ORSView.CHANGE_PASSWORD_CTL);
      out.write("\"><i class='fas fa-edit'></i>&nbsp;<strong>Change Password </strong></a>\r\n");
      out.write("       <a class=\"dropdown-item\" style=\"background-color: silver\" href=\"");
      out.print(ORSView.JAVA_DOC_VIEW );
      out.write("\" target=\"blank\"><i class='fas fa-clone'></i>&nbsp;<strong>Java Doc</strong></a>\r\n");
      out.write("        <a class=\"dropdown-item\" style=\"background-color: silver\" href=\"");
      out.print(ORSView.LOGIN_CTL);
      out.write("?operation=");
      out.print(LoginCtl.OP_LOG_OUT);
      out.write("\"><i class='fas fa-sign-out-alt'></i>&nbsp;<strong>Logout</strong></a>\r\n");
      out.write("       \r\n");
      out.write("       \r\n");
      out.write("      </div>\r\n");
      out.write("    </li>  \r\n");
      out.write("                   \r\n");
      out.write("                   \r\n");
      out.write("             ");

                } 
else {
            
      out.write("\r\n");
      out.write("            <a class=\"dropdown-item\" style=\"background-color: silver\" href=\"");
      out.print(ORSView.LOGIN_CTL);
      out.write("\"><i class='fas fa-sign-in-alt'></i>&nbsp;<strong>Login</strong></a>\r\n");
      out.write("             <a class=\"dropdown-item\" style=\"background-color: silver\" href=\"");
      out.print(ORSView.USER_REGISTRATION_CTL);
      out.write("\"><i class='fas fa-user-plus'></i>&nbsp;<strong>User Registration</strong></a>\r\n");
      out.write("           ");
      out.write("\r\n");
      out.write("             ");

     }
 
      out.write("</ul>\r\n");
      out.write("</div>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<form action=\"");
      out.print(ORSView.LOGIN_CTL);
      out.write("\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<main> <!--MDB Forms-->\r\n");
      out.write("\t\t<div class=\"container mt-4 \">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- Grid row -->car\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4\"></div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- Grid column -->\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t<div class=\"card\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"card-body\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<h3 class=\"text-center default-text py-3\"><span class='fa fa-sign-in-alt'></span><b><u>Login</u></b></h3>\r\n");
      out.write("\t\t\t\t\t\t\t<!--Body-->\r\n");
      out.write("\t\t\t\t\t\t\t<hr color=\"white\">\r\n");
      out.write("\t\t\t\t\t\t\t");
if(!ServletUtility.getSuccessMessage(request).equals("")){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\t\t\"alert alert-success alert-dismissible fade show\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"alert\">&times;</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t<strong>Success!</strong>");
      out.print(ServletUtility.getSuccessMessage(request) );
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
if(!ServletUtility.getErrorMessage(request).equals("")){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"alert alert-success alert-dismissible fade show\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"alert\">&times;</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t<strong>Error!</strong><font color=\"red\">");
      out.print(ServletUtility.getErrorMessage(request) );
      out.write("</font>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t \t <h6 style=\"color: #fff\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<b>Username:</b><font color=\"red\">*</font>\r\n");
      out.write("\t\t\t\t\t\t\t</h6>\r\n");
      out.write("   \r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("     \t\t\t\t\t <div class=\"input-group\" >\r\n");
      out.write("                            <div class=\"input-group-prepend \">\r\n");
      out.write("                               <span class=\"input-group-text \" style=\"background-color:white-space; height: 38px; width: 45px;\"><i  class=\"fa fa-envelope\"></i></span>\r\n");
      out.write("                                 </div>\r\n");
      out.write("                        <input type=\"text\" placeholder=\"Enter Email\" class=\"form-control border\" style=\"height: 15px ; background-color:white\" name=\"login\" value=\"");
      out.print(DataUtility.getStringData(dto.getLogin()));
      out.write("\">\r\n");
      out.write("                                </div>\r\n");
      out.write("\t\t\t\t\t\t\t<font color=\"red\" class=\"ml-5\">");
      out.print(ServletUtility.getErrorMessage("login",request) );
      out.write(" </font>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<h6 class=\"paddingclass\" style=\"color: #fff\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<b>Password:</b><font color=\"red\">*</font>\r\n");
      out.write("\t\t\t\t\t\t\t</h6>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                             <div class=\"input-group\">\r\n");
      out.write("                            <div class=\"input-group-prepend\">\r\n");
      out.write("                               <span class=\"input-group-text\" style=\"background-color:white-space; height: 38px; width: 45px;\"><i  class=\"fa fa-lock\"></i></span>\r\n");
      out.write("                                 </div>\r\n");
      out.write("                        <input type=\"password\" placeholder=\"Enter Password\" class=\"form-control border\" style=\"height: 15px ; background-color:white\" name=\"password\" value=\"");
      out.print(DataUtility.getStringData(dto.getPassword()));
      out.write("\">\r\n");
      out.write("                                </div>\r\n");
      out.write("\t\t\t\t\t\t\t<font color=\"red\" class=\"ml-5\">");
      out.print(ServletUtility.getErrorMessage("password",request) );
      out.write(" </font>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write(" \r\n");
      out.write(" ");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t <button type=\"submit\" class=\"btn btn-success\" name=\"operation\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"font-size: 13px\"\tvalue=\"");
      out.print(LoginCtl.OP_SIGN_IN);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"fa fa-check-square\"></span> Signin\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t <button type=\"submit\" class=\"btn btn-info\" name=\"operation\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"font-size: 13px\"\tvalue=\"");
      out.print(LoginCtl.OP_SIGN_UP);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"fa fa-user\"></span> Signup\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"text-center\" style=\"color: #20B2AA\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t <font size=\"4px\"> <a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\thref=\"");
      out.print(ORSView.FORGET_PASSWORD_CTL);
      out.write("\"><u> Forget password ?</u></a></font></br>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("             <input type=\"hidden\" name=\"uri\" value=\"");
      out.print(URI);
      out.write("\">\r\n");
      out.write("          \r\n");
      out.write("\t\t\t\t<div class=\"col-md-3\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</form>\r\n");
      out.write("\t<br>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<style>\r\n");
      out.write(".footer {\r\n");
      out.write("   position: fixed;\r\n");
      out.write("   left: 0;\r\n");
      out.write("   bottom: 0;\r\n");
      out.write("   width: 100%;\r\n");
      out.write("   background-color:rgb(87, 162, 144);\r\n");
      out.write("   color: black;\r\n");
      out.write("   text-align: center;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"footer\">\r\n");
      out.write("<hr>\r\n");
      out.write(" <H3>&copy;CopyRight RAYS Technology</H3>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html> \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
