/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.89
 * Generated at: 2024-06-19 09:54:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import model.Book;

public final class searchBook_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(2);
    _jspx_imports_classes.add("model.Book");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\n");
      out.write("\n");
      out.write("<title>Dashboard - NiceAdmin Bootstrap Template</title>\n");
      out.write("<meta content=\"\" name=\"description\">\n");
      out.write("<meta content=\"\" name=\"keywords\">\n");
      out.write("\n");
      out.write("<!-- Favicons -->\n");
      out.write("<link href=\"/img/favicon.png\" rel=\"icon\">\n");
      out.write("<link href=\"/img/apple-touch-icon.png\" rel=\"apple-touch-icon\">\n");
      out.write("\n");
      out.write("<!-- Google Fonts -->\n");
      out.write("<link href=\"https://fonts.gstatic.com\" rel=\"preconnect\">\n");
      out.write("<link\n");
      out.write("	href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Nunito:300,300i,400,400i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i\"\n");
      out.write("	rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!-- Vendor CSS Files -->\n");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"css/bootstrap-icons/bootstrap-icons.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"css/boxicons.min.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"css/quill.snow.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"css/quill.bubble.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"css/remixicon.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!-- Template Main CSS File -->\n");
      out.write("<link href=\"css/stylex.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!-- =======================================================\n");
      out.write("  * Template Name: NiceAdmin\n");
      out.write("  * Template URL: https://bootstrapmade.com/nice-admin-bootstrap-admin-html-template/\n");
      out.write("  * Updated: Apr 20 2024 with Bootstrap v5.3.3\n");
      out.write("  * Author: BootstrapMade.com\n");
      out.write("  * License: https://bootstrapmade.com/license/\n");
      out.write("  ======================================================== -->\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("	<!-- ======= Header ======= -->\n");
      out.write("	<header id=\"header\" class=\"header fixed-top d-flex align-items-center\">\n");
      out.write("\n");
      out.write("		<div class=\"d-flex align-items-center justify-content-between\">\n");
      out.write("			<a href=\"books\" class=\"logo d-flex align-items-center\"> <img\n");
      out.write("				src=\"assets/img/logo.png\" alt=\"\"> <span\n");
      out.write("				class=\"d-none d-lg-block\">NiceAdmin</span>\n");
      out.write("			</a> <i class=\"bi bi-list toggle-sidebar-btn\"></i>\n");
      out.write("		</div>\n");
      out.write("		<!-- End Logo -->\n");
      out.write("\n");
      out.write("		<div class=\"search-bar\">\n");
      out.write("			<form class=\"search-form d-flex align-items-center\" method=\"GET\"\n");
      out.write("				action=\"action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/search-book\">\n");
      out.write("				<input type=\"text\" name=\"searchTitle\" placeholder=\"Tìm kiếm\"\n");
      out.write("					title=\"Enter search keyword\">\n");
      out.write("				<button type=\"submit\" title=\"Search\">\n");
      out.write("					<i class=\"bi bi-search\"></i>\n");
      out.write("				</button>\n");
      out.write("			</form>\n");
      out.write("		</div>\n");
      out.write("		<!-- End Search Bar -->\n");
      out.write("\n");
      out.write("		<nav class=\"header-nav ms-auto\">\n");
      out.write("			<ul class=\"d-flex align-items-center\">\n");
      out.write("\n");
      out.write("				<li class=\"nav-item d-block d-lg-none\"><a\n");
      out.write("					class=\"nav-link nav-icon search-bar-toggle \" href=\"#\"> <i\n");
      out.write("						class=\"bi bi-search\"></i>\n");
      out.write("				</a></li>\n");
      out.write("				<!-- End Search Icon-->\n");
      out.write("\n");
      out.write("				<li class=\"nav-item dropdown\"><a class=\"nav-link nav-icon\"\n");
      out.write("					href=\"#\" data-bs-toggle=\"dropdown\"> <i class=\"bi bi-bell\"></i>\n");
      out.write("						<span class=\"badge bg-primary badge-number\">4</span>\n");
      out.write("				</a> <!-- End Notification Icon -->\n");
      out.write("\n");
      out.write("					<ul\n");
      out.write("						class=\"dropdown-menu dropdown-menu-end dropdown-menu-arrow notifications\">\n");
      out.write("						<li class=\"dropdown-header\">You have 4 new notifications <a\n");
      out.write("							href=\"#\"><span class=\"badge rounded-pill bg-primary p-2 ms-2\">View\n");
      out.write("									all</span></a>\n");
      out.write("						</li>\n");
      out.write("						<li>\n");
      out.write("							<hr class=\"dropdown-divider\">\n");
      out.write("						</li>\n");
      out.write("\n");
      out.write("						<li class=\"notification-item\"><i\n");
      out.write("							class=\"bi bi-exclamation-circle text-warning\"></i>\n");
      out.write("							<div>\n");
      out.write("								<h4>Lorem Ipsum</h4>\n");
      out.write("								<p>Quae dolorem earum veritatis oditseno</p>\n");
      out.write("								<p>30 min. ago</p>\n");
      out.write("							</div></li>\n");
      out.write("\n");
      out.write("						<li>\n");
      out.write("							<hr class=\"dropdown-divider\">\n");
      out.write("						</li>\n");
      out.write("\n");
      out.write("						<li class=\"notification-item\"><i\n");
      out.write("							class=\"bi bi-x-circle text-danger\"></i>\n");
      out.write("							<div>\n");
      out.write("								<h4>Atque rerum nesciunt</h4>\n");
      out.write("								<p>Quae dolorem earum veritatis oditseno</p>\n");
      out.write("								<p>1 hr. ago</p>\n");
      out.write("							</div></li>\n");
      out.write("\n");
      out.write("						<li>\n");
      out.write("							<hr class=\"dropdown-divider\">\n");
      out.write("						</li>\n");
      out.write("\n");
      out.write("						<li class=\"notification-item\"><i\n");
      out.write("							class=\"bi bi-check-circle text-success\"></i>\n");
      out.write("							<div>\n");
      out.write("								<h4>Sit rerum fuga</h4>\n");
      out.write("								<p>Quae dolorem earum veritatis oditseno</p>\n");
      out.write("								<p>2 hrs. ago</p>\n");
      out.write("							</div></li>\n");
      out.write("\n");
      out.write("						<li>\n");
      out.write("							<hr class=\"dropdown-divider\">\n");
      out.write("						</li>\n");
      out.write("\n");
      out.write("						<li class=\"notification-item\"><i\n");
      out.write("							class=\"bi bi-info-circle text-primary\"></i>\n");
      out.write("							<div>\n");
      out.write("								<h4>Dicta reprehenderit</h4>\n");
      out.write("								<p>Quae dolorem earum veritatis oditseno</p>\n");
      out.write("								<p>4 hrs. ago</p>\n");
      out.write("							</div></li>\n");
      out.write("\n");
      out.write("						<li>\n");
      out.write("							<hr class=\"dropdown-divider\">\n");
      out.write("						</li>\n");
      out.write("						<li class=\"dropdown-footer\"><a href=\"#\">Show all\n");
      out.write("								notifications</a></li>\n");
      out.write("\n");
      out.write("					</ul> <!-- End Notification Dropdown Items --></li>\n");
      out.write("				<!-- End Notification Nav -->\n");
      out.write("\n");
      out.write("				<li class=\"nav-item dropdown\"><a class=\"nav-link nav-icon\"\n");
      out.write("					href=\"#\" data-bs-toggle=\"dropdown\"> <i\n");
      out.write("						class=\"bi bi-chat-left-text\"></i> <span\n");
      out.write("						class=\"badge bg-success badge-number\">3</span>\n");
      out.write("				</a> <!-- End Messages Icon -->\n");
      out.write("\n");
      out.write("					<ul\n");
      out.write("						class=\"dropdown-menu dropdown-menu-end dropdown-menu-arrow messages\">\n");
      out.write("						<li class=\"dropdown-header\">You have 3 new messages <a\n");
      out.write("							href=\"#\"><span class=\"badge rounded-pill bg-primary p-2 ms-2\">View\n");
      out.write("									all</span></a>\n");
      out.write("						</li>\n");
      out.write("						<li>\n");
      out.write("							<hr class=\"dropdown-divider\">\n");
      out.write("						</li>\n");
      out.write("\n");
      out.write("						<li class=\"message-item\"><a href=\"#\"> <img\n");
      out.write("								src=\"assets/img/messages-1.jpg\" alt=\"\" class=\"rounded-circle\">\n");
      out.write("								<div>\n");
      out.write("									<h4>Maria Hudson</h4>\n");
      out.write("									<p>Velit asperiores et ducimus soluta repudiandae labore\n");
      out.write("										officia est ut...</p>\n");
      out.write("									<p>4 hrs. ago</p>\n");
      out.write("								</div>\n");
      out.write("						</a></li>\n");
      out.write("						<li>\n");
      out.write("							<hr class=\"dropdown-divider\">\n");
      out.write("						</li>\n");
      out.write("\n");
      out.write("						<li class=\"message-item\"><a href=\"#\"> <img\n");
      out.write("								src=\"assets/img/messages-2.jpg\" alt=\"\" class=\"rounded-circle\">\n");
      out.write("								<div>\n");
      out.write("									<h4>Anna Nelson</h4>\n");
      out.write("									<p>Velit asperiores et ducimus soluta repudiandae labore\n");
      out.write("										officia est ut...</p>\n");
      out.write("									<p>6 hrs. ago</p>\n");
      out.write("								</div>\n");
      out.write("						</a></li>\n");
      out.write("						<li>\n");
      out.write("							<hr class=\"dropdown-divider\">\n");
      out.write("						</li>\n");
      out.write("\n");
      out.write("						<li class=\"message-item\"><a href=\"#\"> <img\n");
      out.write("								src=\"assets/img/messages-3.jpg\" alt=\"\" class=\"rounded-circle\">\n");
      out.write("								<div>\n");
      out.write("									<h4>David Muldon</h4>\n");
      out.write("									<p>Velit asperiores et ducimus soluta repudiandae labore\n");
      out.write("										officia est ut...</p>\n");
      out.write("									<p>8 hrs. ago</p>\n");
      out.write("								</div>\n");
      out.write("						</a></li>\n");
      out.write("						<li>\n");
      out.write("							<hr class=\"dropdown-divider\">\n");
      out.write("						</li>\n");
      out.write("\n");
      out.write("						<li class=\"dropdown-footer\"><a href=\"#\">Show all messages</a>\n");
      out.write("						</li>\n");
      out.write("\n");
      out.write("					</ul> <!-- End Messages Dropdown Items --></li>\n");
      out.write("				<!-- End Messages Nav -->\n");
      out.write("\n");
      out.write("				<li class=\"nav-item dropdown pe-3\"><a\n");
      out.write("					class=\"nav-link nav-profile d-flex align-items-center pe-0\"\n");
      out.write("					href=\"#\" data-bs-toggle=\"dropdown\"> <img\n");
      out.write("						src=\"assets/img/profile-img.jpg\" alt=\"Profile\"\n");
      out.write("						class=\"rounded-circle\"> <span\n");
      out.write("						class=\"d-none d-md-block dropdown-toggle ps-2\">K. Anderson</span>\n");
      out.write("				</a> <!-- End Profile Iamge Icon -->\n");
      out.write("\n");
      out.write("					<ul\n");
      out.write("						class=\"dropdown-menu dropdown-menu-end dropdown-menu-arrow profile\">\n");
      out.write("						<li class=\"dropdown-header\">\n");
      out.write("							<h6>Kevin Anderson</h6> <span>Web Designer</span>\n");
      out.write("						</li>\n");
      out.write("						<li>\n");
      out.write("							<hr class=\"dropdown-divider\">\n");
      out.write("						</li>\n");
      out.write("\n");
      out.write("						<li><a class=\"dropdown-item d-flex align-items-center\"\n");
      out.write("							href=\"users-profile.html\"> <i class=\"bi bi-person\"></i> <span>My\n");
      out.write("									Profile</span>\n");
      out.write("						</a></li>\n");
      out.write("						<li>\n");
      out.write("							<hr class=\"dropdown-divider\">\n");
      out.write("						</li>\n");
      out.write("\n");
      out.write("						<li><a class=\"dropdown-item d-flex align-items-center\"\n");
      out.write("							href=\"users-profile.html\"> <i class=\"bi bi-gear\"></i> <span>Account\n");
      out.write("									Settings</span>\n");
      out.write("						</a></li>\n");
      out.write("						<li>\n");
      out.write("							<hr class=\"dropdown-divider\">\n");
      out.write("						</li>\n");
      out.write("\n");
      out.write("						<li><a class=\"dropdown-item d-flex align-items-center\"\n");
      out.write("							href=\"pages-faq.html\"> <i class=\"bi bi-question-circle\"></i>\n");
      out.write("								<span>Need Help?</span>\n");
      out.write("						</a></li>\n");
      out.write("						<li>\n");
      out.write("							<hr class=\"dropdown-divider\">\n");
      out.write("						</li>\n");
      out.write("\n");
      out.write("						<li><a class=\"dropdown-item d-flex align-items-center\"\n");
      out.write("							href=\"#\"> <i class=\"bi bi-box-arrow-right\"></i> <span>Sign\n");
      out.write("									Out</span>\n");
      out.write("						</a></li>\n");
      out.write("\n");
      out.write("					</ul> <!-- End Profile Dropdown Items --></li>\n");
      out.write("				<!-- End Profile Nav -->\n");
      out.write("\n");
      out.write("			</ul>\n");
      out.write("		</nav>\n");
      out.write("		<!-- End Icons Navigation -->\n");
      out.write("\n");
      out.write("	</header>\n");
      out.write("	<!-- End Header -->\n");
      out.write("\n");
      out.write("	<!-- ======= Sidebar ======= -->\n");
      out.write("  <aside id=\"sidebar\" class=\"sidebar\">\n");
      out.write("\n");
      out.write("    <ul class=\"sidebar-nav\" id=\"sidebar-nav\">\n");
      out.write("\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link collapsed\" href=\"books\">\n");
      out.write("          <i class=\"bi bi-grid\"></i>\n");
      out.write("          <span>Dashboard</span>\n");
      out.write("        </a>\n");
      out.write("      </li><!-- End Dashboard Nav -->\n");
      out.write("\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link collapsed\" data-bs-target=\"#components-nav\" data-bs-toggle=\"collapse\" href=\"#\">\n");
      out.write("          <i class=\"bi bi-menu-button-wide\"></i><span>Components</span><i class=\"bi bi-chevron-down ms-auto\"></i>\n");
      out.write("        </a>\n");
      out.write("        <ul id=\"components-nav\" class=\"nav-content collapse \" data-bs-parent=\"#sidebar-nav\">\n");
      out.write("          <li>\n");
      out.write("            <a href=\"components-alerts.html\">\n");
      out.write("              <i class=\"bi bi-circle\"></i><span>Alerts</span>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li>\n");
      out.write("            <a href=\"components-accordion.html\">\n");
      out.write("              <i class=\"bi bi-circle\"></i><span>Accordion</span>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li>\n");
      out.write("            <a href=\"components-badges.html\">\n");
      out.write("              <i class=\"bi bi-circle\"></i><span>Badges</span>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li>\n");
      out.write("            <a href=\"components-breadcrumbs.html\">\n");
      out.write("              <i class=\"bi bi-circle\"></i><span>Breadcrumbs</span>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li>\n");
      out.write("            <a href=\"components-buttons.html\">\n");
      out.write("              <i class=\"bi bi-circle\"></i><span>Buttons</span>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li>\n");
      out.write("            <a href=\"components-cards.html\">\n");
      out.write("              <i class=\"bi bi-circle\"></i><span>Cards</span>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li>\n");
      out.write("            <a href=\"components-carousel.html\">\n");
      out.write("              <i class=\"bi bi-circle\"></i><span>Carousel</span>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li>\n");
      out.write("            <a href=\"components-list-group.html\">\n");
      out.write("              <i class=\"bi bi-circle\"></i><span>List group</span>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li>\n");
      out.write("            <a href=\"components-modal.html\">\n");
      out.write("              <i class=\"bi bi-circle\"></i><span>Modal</span>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li>\n");
      out.write("            <a href=\"components-tabs.html\">\n");
      out.write("              <i class=\"bi bi-circle\"></i><span>Tabs</span>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li>\n");
      out.write("            <a href=\"components-pagination.html\">\n");
      out.write("              <i class=\"bi bi-circle\"></i><span>Pagination</span>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li>\n");
      out.write("            <a href=\"components-progress.html\">\n");
      out.write("              <i class=\"bi bi-circle\"></i><span>Progress</span>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li>\n");
      out.write("            <a href=\"components-spinners.html\">\n");
      out.write("              <i class=\"bi bi-circle\"></i><span>Spinners</span>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li>\n");
      out.write("            <a href=\"components-tooltips.html\">\n");
      out.write("              <i class=\"bi bi-circle\"></i><span>Tooltips</span>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("      </li><!-- End Components Nav -->\n");
      out.write("\n");
      out.write("       <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link \" data-bs-target=\"#forms-nav\" data-bs-toggle=\"collapse\" href=\"#\">\n");
      out.write("          <i class=\"bi bi-journal-text\"></i><span>Quản lý sách</span><i class=\"bi bi-chevron-down ms-auto\"></i>\n");
      out.write("        </a>\n");
      out.write("        <ul id=\"forms-nav\" class=\"nav-content collapse show\" data-bs-parent=\"#sidebar-nav\">\n");
      out.write("          <li>\n");
      out.write("            <a href=\"/library_manager/books\" class=\"active\">\n");
      out.write("              <i class=\"bi bi-circle\"></i><span>Danh sách sách</span>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("      </li><!-- End Forms Nav -->\n");
      out.write("\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link collapsed\" data-bs-target=\"#tables-nav\" data-bs-toggle=\"collapse\" href=\"#\">\n");
      out.write("          <i class=\"bi bi-layout-text-window-reverse\"></i><span>Quản lý thành viên</span><i class=\"bi bi-chevron-down ms-auto\"></i>\n");
      out.write("        </a>\n");
      out.write("        <ul id=\"tables-nav\" class=\"nav-content collapse \" data-bs-parent=\"#sidebar-nav\">\n");
      out.write("          <li>\n");
      out.write("            <a href=\"/library_manager/membersl\">\n");
      out.write("              <i class=\"bi bi-circle\"></i><span>Danh sách thành viên</span>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("      </li><!-- End Tables Nav -->\n");
      out.write("\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link collapsed\" data-bs-target=\"#charts-nav\" data-bs-toggle=\"collapse\" href=\"#\">\n");
      out.write("          <i class=\"bi bi-bar-chart\"></i><span>Charts</span><i class=\"bi bi-chevron-down ms-auto\"></i>\n");
      out.write("        </a>\n");
      out.write("        <ul id=\"charts-nav\" class=\"nav-content collapse \" data-bs-parent=\"#sidebar-nav\">\n");
      out.write("          <li>\n");
      out.write("            <a href=\"charts-chartjs.html\">\n");
      out.write("              <i class=\"bi bi-circle\"></i><span>Chart.js</span>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li>\n");
      out.write("            <a href=\"charts-apexcharts.html\">\n");
      out.write("              <i class=\"bi bi-circle\"></i><span>ApexCharts</span>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li>\n");
      out.write("            <a href=\"charts-echarts.html\">\n");
      out.write("              <i class=\"bi bi-circle\"></i><span>ECharts</span>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("      </li><!-- End Charts Nav -->\n");
      out.write("\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link collapsed\" data-bs-target=\"#icons-nav\" data-bs-toggle=\"collapse\" href=\"#\">\n");
      out.write("          <i class=\"bi bi-gem\"></i><span>Icons</span><i class=\"bi bi-chevron-down ms-auto\"></i>\n");
      out.write("        </a>\n");
      out.write("        <ul id=\"icons-nav\" class=\"nav-content collapse \" data-bs-parent=\"#sidebar-nav\">\n");
      out.write("          <li>\n");
      out.write("            <a href=\"icons-bootstrap.html\">\n");
      out.write("              <i class=\"bi bi-circle\"></i><span>Bootstrap Icons</span>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li>\n");
      out.write("            <a href=\"icons-remix.html\">\n");
      out.write("              <i class=\"bi bi-circle\"></i><span>Remix Icons</span>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li>\n");
      out.write("            <a href=\"icons-boxicons.html\">\n");
      out.write("              <i class=\"bi bi-circle\"></i><span>Boxicons</span>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("      </li><!-- End Icons Nav -->\n");
      out.write("\n");
      out.write("      <li class=\"nav-heading\">Pages</li>\n");
      out.write("\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link collapsed\" href=\"users-profile.html\">\n");
      out.write("          <i class=\"bi bi-person\"></i>\n");
      out.write("          <span>Profile</span>\n");
      out.write("        </a>\n");
      out.write("      </li><!-- End Profile Page Nav -->\n");
      out.write("\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link collapsed\" href=\"pages-faq.html\">\n");
      out.write("          <i class=\"bi bi-question-circle\"></i>\n");
      out.write("          <span>F.A.Q</span>\n");
      out.write("        </a>\n");
      out.write("      </li><!-- End F.A.Q Page Nav -->\n");
      out.write("\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link collapsed\" href=\"pages-contact.html\">\n");
      out.write("          <i class=\"bi bi-envelope\"></i>\n");
      out.write("          <span>Contact</span>\n");
      out.write("        </a>\n");
      out.write("      </li><!-- End Contact Page Nav -->\n");
      out.write("\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link collapsed\" href=\"pages-register.html\">\n");
      out.write("          <i class=\"bi bi-card-list\"></i>\n");
      out.write("          <span>Register</span>\n");
      out.write("        </a>\n");
      out.write("      </li><!-- End Register Page Nav -->\n");
      out.write("\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link collapsed\" href=\"pages-login.html\">\n");
      out.write("          <i class=\"bi bi-box-arrow-in-right\"></i>\n");
      out.write("          <span>Login</span>\n");
      out.write("        </a>\n");
      out.write("      </li><!-- End Login Page Nav -->\n");
      out.write("\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link collapsed\" href=\"pages-error-404.html\">\n");
      out.write("          <i class=\"bi bi-dash-circle\"></i>\n");
      out.write("          <span>Error 404</span>\n");
      out.write("        </a>\n");
      out.write("      </li><!-- End Error 404 Page Nav -->\n");
      out.write("\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link collapsed\" href=\"pages-blank.html\">\n");
      out.write("          <i class=\"bi bi-file-earmark\"></i>\n");
      out.write("          <span>Blank</span>\n");
      out.write("        </a>\n");
      out.write("      </li><!-- End Blank Page Nav -->\n");
      out.write("\n");
      out.write("    </ul>\n");
      out.write("\n");
      out.write("  </aside><!-- End Sidebar-->\n");
      out.write("\n");
      out.write("	<main id=\"main\" class=\"main\">\n");
      out.write("\n");
      out.write("		<div class=\"pagetitle\">\n");
      out.write("			<div class=\"row\">\n");
      out.write("				<div class=\"col-10\">\n");
      out.write("					<h1>Dashboard</h1>\n");
      out.write("					<nav>\n");
      out.write("						<ol class=\"breadcrumb\">\n");
      out.write("							<li class=\"breadcrumb-item\"><a href=\"books\">Home</a></li>\n");
      out.write("							<li class=\"breadcrumb-item active\">Dashboard</li>\n");
      out.write("						</ol>\n");
      out.write("					</nav>\n");
      out.write("				</div>\n");
      out.write("				<div class=\"col-2\">\n");
      out.write("					<a href=\"addBook.jsp\" type=\"\">\n");
      out.write("						<button class=\"btn btn-success\">Thêm sách</button>\n");
      out.write("					</a>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("		</div>\n");
      out.write("		<!-- End Page Title -->\n");
      out.write("\n");
      out.write("		<section class=\"section dashboard\">\n");
      out.write("			<div class=\"row\">\n");
      out.write("				");

            		String message = request.getParameter("message");
            		if ("deleteSuccess".equals(message)) {
        		
      out.write("\n");
      out.write("        		<script type=\"text/javascript\">\n");
      out.write("            		alert('Xóa sách thành công!');\n");
      out.write("        		</script>\n");
      out.write("        		");

            		}
        		
      out.write("\n");
      out.write("        		");

            		if ("updateSuccess".equals(message)) {
        		
      out.write("\n");
      out.write("        		<script type=\"text/javascript\">\n");
      out.write("            		alert('Sửa sách thành công!');\n");
      out.write("        		</script>\n");
      out.write("        		");

            		}
        		
      out.write("\n");
      out.write("				<table class=\"table table-striped\">\n");
      out.write("					<thead>\n");
      out.write("						<tr>\n");
      out.write("							<th scope=\"col\">#</th>\n");
      out.write("							<th scope=\"col\">Tên sách</th>\n");
      out.write("							<th scope=\"col\">ISBN</th>\n");
      out.write("							<th scope=\"col\">Năm xuất bản</th>\n");
      out.write("							<th scope=\"col\">Số lượng</th>\n");
      out.write("							<th scope=\"col\">Tác vụ</th>\n");
      out.write("						</tr>\n");
      out.write("					</thead>\n");
      out.write("					<tbody>\n");
      out.write("						");

                    		ArrayList<Book> books = (ArrayList<Book>) request.getAttribute("books");
                    		for (Book book : books) {
                		
      out.write("\n");
      out.write("						<tr>\n");
      out.write("							<th scope=\"row\">");
      out.print( book.getBook_id() );
      out.write("</th>\n");
      out.write("							<td>");
      out.print( book.getBook_title() );
      out.write("</td>\n");
      out.write("							<td>");
      out.print( book.getBook_isbn() );
      out.write("</td>\n");
      out.write("							<td>");
      out.print( book.getBook_published_year() );
      out.write("</td>\n");
      out.write("							<td>");
      out.print( book.getBook_number_of_copies() );
      out.write("</td>\n");
      out.write("							<td>\n");
      out.write("                        		<form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/update-book\" method=\"get\" style=\"display:inline; margin-right: 10px;\">\n");
      out.write("                            		<input type=\"hidden\" name=\"bookId\" value=\"");
      out.print( book.getBook_id() );
      out.write("\">\n");
      out.write("                            		<button type=\"submit\" class=\"btn btn-primary text-white\">\n");
      out.write("                                		<i class=\"bi bi-pencil-square\"></i>\n");
      out.write("                            		</button>\n");
      out.write("                        		</form>\n");
      out.write("								<form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/delete-book\" method=\"post\" style=\"display:inline;\">\n");
      out.write("                            		<input type=\"hidden\" name=\"bookId\" value=\"");
      out.print( book.getBook_id() );
      out.write("\">\n");
      out.write("                            		<button type=\"submit\" class=\"btn btn-danger text-white\">\n");
      out.write("                                		<i class=\"bi bi-trash3\"></i>\n");
      out.write("                            		</button>\n");
      out.write("                        		</form>\n");
      out.write("							</td>\n");
      out.write("						</tr>\n");
      out.write("						");

                    }
                
      out.write("\n");
      out.write("					</tbody>\n");
      out.write("				</table>\n");
      out.write("			</div>\n");
      out.write("		</section>\n");
      out.write("\n");
      out.write("	</main>\n");
      out.write("	<!-- End #main -->\n");
      out.write("\n");
      out.write("	<!-- ======= Footer ======= -->\n");
      out.write("	<footer id=\"footer\" class=\"footer\">\n");
      out.write("		<div class=\"copyright\">\n");
      out.write("			&copy; Copyright <strong><span>NiceAdmin</span></strong>. All Rights\n");
      out.write("			Reserved\n");
      out.write("		</div>\n");
      out.write("		<div class=\"credits\">\n");
      out.write("			<!-- All the links in the footer should remain intact. -->\n");
      out.write("			<!-- You can delete the links only if you purchased the pro version. -->\n");
      out.write("			<!-- Licensing information: https://bootstrapmade.com/license/ -->\n");
      out.write("			<!-- Purchase the pro version with working PHP/AJAX contact form: https://bootstrapmade.com/nice-admin-bootstrap-admin-html-template/ -->\n");
      out.write("			Designed by <a href=\"https://bootstrapmade.com/\">BootstrapMade</a>\n");
      out.write("		</div>\n");
      out.write("	</footer>\n");
      out.write("	<!-- End Footer -->\n");
      out.write("\n");
      out.write("	<a href=\"#\"\n");
      out.write("		class=\"back-to-top d-flex align-items-center justify-content-center\"><i\n");
      out.write("		class=\"bi bi-arrow-up-short\"></i></a>\n");
      out.write("\n");
      out.write("	<!-- Vendor JS Files -->\n");
      out.write("	<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/apexcharts.min.js\"></script>\n");
      out.write("	<script\n");
      out.write("		src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("\n");
      out.write("	<script src=\"/js/echarts.min.js\"></script>\n");
      out.write("\n");
      out.write("	<script src=\"/js/tinymce.min.js\"></script>\n");
      out.write("	<script src=\"/js/validate.js\"></script>\n");
      out.write("	<!-- Template Main JS File -->\n");
      out.write("	<script src=\"/js/main.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
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
