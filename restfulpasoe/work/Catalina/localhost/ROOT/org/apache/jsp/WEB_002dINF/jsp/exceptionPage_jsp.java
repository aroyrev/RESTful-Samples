/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.14
 * Generated at: 2017-11-12 18:01:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.util.*;
import java.system.*;
import java.io.*;
import java.util.*;
import java.system.*;
import java.io.*;
import java.util.*;
import java.system.*;
import java.io.*;
import java.util.*;
import java.system.*;
import java.io.*;
import java.util.*;
import java.system.*;

public final class exceptionPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

 String pageType = "exception"; 
  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(7);
    _jspx_dependants.put("/WEB-INF/jsp/errorJSONBody.jsp", Long.valueOf(1486474506000L));
    _jspx_dependants.put("/WEB-INF/jsp/loadErrorData.jsp", Long.valueOf(1460984108000L));
    _jspx_dependants.put("/static/commonPageHeader.html", Long.valueOf(1479220100000L));
    _jspx_dependants.put("/WEB-INF/jsp/exceptionPageHeader.jsp", Long.valueOf(1442809734000L));
    _jspx_dependants.put("/WEB-INF/jsp/errorPageBody.jsp", Long.valueOf(1460984086000L));
    _jspx_dependants.put("/WEB-INF/jsp/exceptionPageFooter.jsp", Long.valueOf(1442788378000L));
    _jspx_dependants.put("/static/commonPageFooter.html", Long.valueOf(1466513382000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("java.io");
    _jspx_imports_packages.add("java.system");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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

    final javax.servlet.jsp.PageContext pageContext;
    java.lang.Throwable exception = org.apache.jasper.runtime.JspRuntimeLibrary.getThrowable(request);
    if (exception != null) {
      response.setStatus(javax.servlet.http.HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
    }
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"/WEB-INF/jsp/exceptionPage.jsp", false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;


    String acceptHeader = request.getHeader("accept");
    if ( acceptHeader != null && acceptHeader.matches("^(.*,|)application/(|[\\w\\.]+\\+)json($|,.*)") ) {
        request.setAttribute("psc.as.attr.errorFormat", "json");
        response.setContentType("application/json;charset=UTF-8");


    // Generate the dynamic body content
    try {
        // Detail level: 0 Use product type defaults
        //               The following values 1 - 4 override the
        //               default product type values
        //               1 Terse    (least information)
        //               2 verbose  (more information)
        //               3 debug    (add more jsp page debug info)
        String      errorMessage = "";
        int         detailLevel = 0;
        String      product = "dev";
        String      requrl = "unknown";
        String      webAppName = "/ROOT";
        int         errorCode = 0;
        String      errcodeStr = "0";
        String      transport = "unknown";
        Throwable   appException = null;
        String      exceptionName = "";
        String      exceptionMessage = "";
        String      exceptionStack = "";
        String      errorDetail = "";
        String      statusDetail = "";
        String      errorFormat = (String)request.getAttribute("psc.as.attr.errorFormat");

        // Load the development/production setting for the initial
        // detailLevel.
        product = System.getProperty("psc.as.security.model");
        if (product == null ) {
            product = "default";
        } else {
            if ( product.matches("^dev.*") ) {
                product = "dev";
                detailLevel = 3;
            } else if ( product.matches("^prod.*") ) {
                product = "prod";
                detailLevel = 1;
            } else {
                product = "default";
                detailLevel = 2;
            }
        }

        // Load any specific detailLevel from the web application env
        try { 
            String sdetailLevel = application.getInitParameter("detailLevel"); 
            if ( sdetailLevel != null ) {
                int cfgDetailLevel = Integer.parseInt(sdetailLevel);
                if ( cfgDetailLevel > 0 ) {
                    detailLevel = cfgDetailLevel;
                }
            }
        } catch(Throwable th) {
        }

        // Cleanup the web application name, for the root app a blank
        // is returned, but we want to pass in ROOT in that case.
        String cp = request.getContextPath();
        if ( cp != null &&
             cp.length() > 0) {
            webAppName = cp;
        }
        
        // Bundle together the error information for writing to the page
        if(pageContext != null) {
            ErrorData       errctx = null;

            // Get the implicit error data object for this request
            try {
                errctx = pageContext.getErrorData();
            } catch(NullPointerException ne) {

                // Sometimes this call causes a NullPointerException (PageContext.java:514)
                // Catch and ignore it.. it effectively means we can't use the ErrorData
            }
            
            // Prepare error report
            if(errctx != null) {
                // Unload the basic error object fields
                requrl = errctx.getRequestURI();
                errorCode = errctx.getStatusCode();
                transport = errctx.getServletName();
                appException = errctx.getThrowable();

                errorDetail = (String)request.getAttribute("javax.servlet.error.message");

                // Cleanup some null values with defaults
                if ( requrl == null ) requrl = "/";
                if (transport == null ) transport = "default";

                // The building of the error information is divided into 
                // HTTP status codes and Exceptions
                if ( appException != null ) {
                    StringBuilder   sb = new StringBuilder();
                    // Handle application excpetions here
                    if(appException.getMessage() != null && 
                       appException.getMessage().indexOf("Exception in JSP") != -1) {
                        sb = new StringBuilder("An error occurred in a JSP file ...\n\n<pre>" + 
                                    appException.getMessage() + "</pre>");
                    } else {
                        String ecls = "";
                        if ( detailLevel > 1 ) {
                            ecls = appException.getClass().getName() + " ; ";
                        } 
                        sb = new StringBuilder( ecls + appException.getMessage());
                    }
                    errorDetail = sb.toString().trim();

                    if ( detailLevel > 2 ) {
                        sb.setLength(0);
                        StackTraceElement stea[] = appException.getStackTrace();
                        if ( errorFormat == null || !errorFormat.equals("json") ) {
                            // Format for HTML
                            for (StackTraceElement ste : stea ) {
                                sb.append("<br>at ");
                                sb.append(ste.toString());
                            }
                        } else {
                            // Format for JSON
                            String          fsep = "";
                            sb.append("[ \n");
                            for (StackTraceElement ste : stea ) {
                                sb.append(fsep);
                                sb.append("\"");
                                sb.append(ste.toString());
                                sb.append("\"\n");
                                fsep = ",";
                            }
                            sb.append("\n]\n");
                        }
                        exceptionStack = sb.toString().trim();
                    }
                    // Save off individual exception fields rather than needing to
                    // access the exception built-in object
                    exceptionName = appException.getClass().getName();
                    exceptionMessage = appException.getMessage();
                } 
               
                // Now load error description based on the status code and
                // write it to the page
                if ( errorCode == 0 ) {
                    // Sometimes the error object does not include the
                    // status code ( returns zero ), so try the 
                    // built-in servlet attributes
                    errcodeStr = (String)request.getAttribute("javax.servlet.error.status_code");
                    if ( errcodeStr != null ) {
                        errorCode = Integer.parseInt(errcodeStr);
                    } else {
                        String pageErrorCode = request.getParameter("statusCode"); 
                        if ( pageErrorCode != null ) {
                            errorCode = Integer.parseInt(pageErrorCode);
                        }
                    }
                }

                // Load the static HTTP status code description
                // Properties file lookup key...
                errcodeStr = "code" + Integer.toString(errorCode);

                try {
                    String descFile = "descFile";
                    // Determine which static text file to load from
                    if (detailLevel < 2  ) {
                        descFile = "/WEB-INF/jsp/httpCodeDesc-terse.properties";
                    } else {
                        descFile = "/WEB-INF/jsp/httpCodeDesc-verbose.properties";
                    } 
                    // Open properties file and load the static
                    // error code text
                    InputStream stream = 
                            application.getResourceAsStream(descFile);
                    Properties props = new Properties();
                    props.load(stream);
                    statusDetail = props.getProperty(errcodeStr);
                    // if the error code text is not found, then get 
                    // the default error code zero (0)
                    if ( statusDetail == null ) {
                        String tmpDetail = props.getProperty("code0");
                        if ( tmpDetail == null ) {
                            tmpDetail = "undefined status code ";
                        } 
                        statusDetail = tmpDetail + errorCode;
                    }
                } catch ( Throwable thr ) {
                    statusDetail = "undefined status code description";
                    application.log("HTTP status code descriptions not available: " +
                        thr.toString());
                }

                // Adjust the error message line according to the amount of detail needed
                if (detailLevel < 2 ) {
                    request.setAttribute( "psc.as.attr.errorMessage", statusDetail.trim() );
                } else {
                    request.setAttribute( "psc.as.attr.errorMessage", errorCode + " - " + 
                            statusDetail.trim() + " - " + request.getMethod() + " " + requrl);
                } 
                
                // Set all the other attributes that are accessible via JSP tags
                request.setAttribute("psc.as.attr.detailLevel", detailLevel);
                request.setAttribute("psc.as.attr.product", product);
                request.setAttribute("psc.as.attr.requrl", requrl);
                request.setAttribute("psc.as.attr.errorCode", errorCode);
                request.setAttribute("psc.as.attr.errorDetail", errorDetail);
                request.setAttribute("psc.as.attr.errcodeStr", errcodeStr);
                request.setAttribute("psc.as.attr.transport" , transport);
                request.setAttribute("psc.as.attr.webApp" , webAppName);
                request.setAttribute("psc.as.attr.exceptionName", exceptionName);
                request.setAttribute("psc.as.attr.exceptionMessage", exceptionMessage );
                request.setAttribute("psc.as.attr.exceptionStack", exceptionStack );

            } else {
                application.log( "Internal page generation error - no error context available");
            }
        } else {
            application.log( "Internal page generation error - no request context available");
        }
    } catch(Throwable e2) {

        // Error in error handler
        application.log("An internal error has occurred in the error page.\n\n");
        application.log("Please copy the following details and provide it to technical send support.\n");
        application.log(e2.toString());
    }

      out.write("{ \n");
      out.write("\"error_code\": ");
      out.print(request.getAttribute("psc.as.attr.errorCode"));
      out.write("\n");
      out.write(", \"status_txt\": \"");
      out.print(request.getAttribute("psc.as.attr.errorMessage"));
      out.write("\"\n");
      out.write(", \"error_details\": {\n");
      out.write("  \"remote_user\": \"");
      out.print(request.getRemoteUser());
      out.write("\"\n");
      out.write(", \"user_principal\": \"");
      out.print(request.getUserPrincipal());
      out.write("\"\n");
      out.write(", \"url_scheme\": \"");
      out.print(request.getScheme());
      out.write("\"\n");
      out.write(", \"remote_addr\": \"");
      out.print(request.getRemoteAddr());
      out.write("\"\n");
      out.write(", \"server_name\": \"");
      out.print(request.getServerName());
      out.write("\"\n");
      out.write(", \"product_type\": \"");
      out.print(request.getAttribute("psc.as.attr.product"));
      out.write("\"\n");
      out.write(", \"http_status\": ");
      out.print((Integer)request.getAttribute("javax.servlet.error.status_code"));
      out.write(" \n");
      out.write(", \"error_detail\": \"");
      out.print(request.getAttribute("psc.as.attr.errorDetail"));
      out.write("\"\n");
      out.write("}\n");
      out.write(", \"debug_details\": {\n");
      out.write("  \"http_method\": \"");
      out.print(request.getMethod());
      out.write("\"\n");
      out.write(", \"web_application\": \"");
      out.print(request.getAttribute("psc.as.attr.webApp"));
      out.write("\"\n");
      out.write(", \"transport\": \"");
      out.print(request.getAttribute("psc.as.attr.transport"));
      out.write("\"\n");
      out.write(", \"request_url\": \"");
      out.print(request.getAttribute("psc.as.attr.requrl"));
      out.write("\"\n");
      out.write(", \"path_info\": \"");
      out.print(request.getPathInfo());
      out.write("\"\n");
      out.write(", \"servlet\": \"");
      out.print((String)request.getAttribute("javax.servlet.error.servlet_name"));
      out.write("\"\n");
      out.write(", \"uri\": \"");
      out.print((String)request.getAttribute("javax.servlet.error.request_uri"));
      out.write("\"\n");
      out.write(", \"exception_class\": \"");
      out.print(request.getAttribute("psc.as.attr.exceptionName"));
      out.write("\"\n");
      out.write(", \"exception_message\": \"");
      out.print(request.getAttribute("psc.as.attr.exceptionMessage"));
      out.write("\"\n");
      out.write(", \"exception_stack_trace\": \"");
      out.print(request.getAttribute("psc.as.attr.exceptionStack"));
      out.write("\"\n");
      out.write("}\n");
      out.write("}\n");

    } else {
        request.setAttribute("psc.as.attr.errorFormat", "html");

      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Progress Application Server Exception</title>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath());
      out.write("/static/commonStyle.css\" media=\"screen\" />\n");
      out.write("<meta http-equiv=\"Cache-Control\" content=\"no-store\" />\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div id=\"header\">\n");
      out.write("\t\t<div id=\"ProgressBanner\">\n");
      out.write("            <img id=\"ProgressLogo\" src=\"");
      out.print(request.getContextPath());
      out.write("/static/images/progress.png\"\n");
      out.write("\t\t\t\talt=\"Progress OpenEdge\">\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div id=\"PASbanner\">\n");
      out.write("\t\t\t<h2>\n");
      out.write("                <img class=\"icon-36\" src=\"");
      out.print(request.getContextPath());
      out.write("/static/images/pas-logo.svg\" alt=\"Icon\">\n");
      out.write("\t\t\t\t<span>Progress Application Server</span>\n");
      out.write("\t\t\t</h2>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("<br><b>An application exception occurred while executing your request!</b> \n");
      out.write("<hr>\n");

    // Generate the dynamic body content
    try {
        // Detail level: 0 Use product type defaults
        //               The following values 1 - 4 override the
        //               default product type values
        //               1 Terse    (least information)
        //               2 verbose  (more information)
        //               3 debug    (add more jsp page debug info)
        String      errorMessage = "";
        int         detailLevel = 0;
        String      product = "dev";
        String      requrl = "unknown";
        String      webAppName = "/ROOT";
        int         errorCode = 0;
        String      errcodeStr = "0";
        String      transport = "unknown";
        Throwable   appException = null;
        String      exceptionName = "";
        String      exceptionMessage = "";
        String      exceptionStack = "";
        String      errorDetail = "";
        String      statusDetail = "";
        String      errorFormat = (String)request.getAttribute("psc.as.attr.errorFormat");

        // Load the development/production setting for the initial
        // detailLevel.
        product = System.getProperty("psc.as.security.model");
        if (product == null ) {
            product = "default";
        } else {
            if ( product.matches("^dev.*") ) {
                product = "dev";
                detailLevel = 3;
            } else if ( product.matches("^prod.*") ) {
                product = "prod";
                detailLevel = 1;
            } else {
                product = "default";
                detailLevel = 2;
            }
        }

        // Load any specific detailLevel from the web application env
        try { 
            String sdetailLevel = application.getInitParameter("detailLevel"); 
            if ( sdetailLevel != null ) {
                int cfgDetailLevel = Integer.parseInt(sdetailLevel);
                if ( cfgDetailLevel > 0 ) {
                    detailLevel = cfgDetailLevel;
                }
            }
        } catch(Throwable th) {
        }

        // Cleanup the web application name, for the root app a blank
        // is returned, but we want to pass in ROOT in that case.
        String cp = request.getContextPath();
        if ( cp != null &&
             cp.length() > 0) {
            webAppName = cp;
        }
        
        // Bundle together the error information for writing to the page
        if(pageContext != null) {
            ErrorData       errctx = null;

            // Get the implicit error data object for this request
            try {
                errctx = pageContext.getErrorData();
            } catch(NullPointerException ne) {

                // Sometimes this call causes a NullPointerException (PageContext.java:514)
                // Catch and ignore it.. it effectively means we can't use the ErrorData
            }
            
            // Prepare error report
            if(errctx != null) {
                // Unload the basic error object fields
                requrl = errctx.getRequestURI();
                errorCode = errctx.getStatusCode();
                transport = errctx.getServletName();
                appException = errctx.getThrowable();

                errorDetail = (String)request.getAttribute("javax.servlet.error.message");

                // Cleanup some null values with defaults
                if ( requrl == null ) requrl = "/";
                if (transport == null ) transport = "default";

                // The building of the error information is divided into 
                // HTTP status codes and Exceptions
                if ( appException != null ) {
                    StringBuilder   sb = new StringBuilder();
                    // Handle application excpetions here
                    if(appException.getMessage() != null && 
                       appException.getMessage().indexOf("Exception in JSP") != -1) {
                        sb = new StringBuilder("An error occurred in a JSP file ...\n\n<pre>" + 
                                    appException.getMessage() + "</pre>");
                    } else {
                        String ecls = "";
                        if ( detailLevel > 1 ) {
                            ecls = appException.getClass().getName() + " ; ";
                        } 
                        sb = new StringBuilder( ecls + appException.getMessage());
                    }
                    errorDetail = sb.toString().trim();

                    if ( detailLevel > 2 ) {
                        sb.setLength(0);
                        StackTraceElement stea[] = appException.getStackTrace();
                        if ( errorFormat == null || !errorFormat.equals("json") ) {
                            // Format for HTML
                            for (StackTraceElement ste : stea ) {
                                sb.append("<br>at ");
                                sb.append(ste.toString());
                            }
                        } else {
                            // Format for JSON
                            String          fsep = "";
                            sb.append("[ \n");
                            for (StackTraceElement ste : stea ) {
                                sb.append(fsep);
                                sb.append("\"");
                                sb.append(ste.toString());
                                sb.append("\"\n");
                                fsep = ",";
                            }
                            sb.append("\n]\n");
                        }
                        exceptionStack = sb.toString().trim();
                    }
                    // Save off individual exception fields rather than needing to
                    // access the exception built-in object
                    exceptionName = appException.getClass().getName();
                    exceptionMessage = appException.getMessage();
                } 
               
                // Now load error description based on the status code and
                // write it to the page
                if ( errorCode == 0 ) {
                    // Sometimes the error object does not include the
                    // status code ( returns zero ), so try the 
                    // built-in servlet attributes
                    errcodeStr = (String)request.getAttribute("javax.servlet.error.status_code");
                    if ( errcodeStr != null ) {
                        errorCode = Integer.parseInt(errcodeStr);
                    } else {
                        String pageErrorCode = request.getParameter("statusCode"); 
                        if ( pageErrorCode != null ) {
                            errorCode = Integer.parseInt(pageErrorCode);
                        }
                    }
                }

                // Load the static HTTP status code description
                // Properties file lookup key...
                errcodeStr = "code" + Integer.toString(errorCode);

                try {
                    String descFile = "descFile";
                    // Determine which static text file to load from
                    if (detailLevel < 2  ) {
                        descFile = "/WEB-INF/jsp/httpCodeDesc-terse.properties";
                    } else {
                        descFile = "/WEB-INF/jsp/httpCodeDesc-verbose.properties";
                    } 
                    // Open properties file and load the static
                    // error code text
                    InputStream stream = 
                            application.getResourceAsStream(descFile);
                    Properties props = new Properties();
                    props.load(stream);
                    statusDetail = props.getProperty(errcodeStr);
                    // if the error code text is not found, then get 
                    // the default error code zero (0)
                    if ( statusDetail == null ) {
                        String tmpDetail = props.getProperty("code0");
                        if ( tmpDetail == null ) {
                            tmpDetail = "undefined status code ";
                        } 
                        statusDetail = tmpDetail + errorCode;
                    }
                } catch ( Throwable thr ) {
                    statusDetail = "undefined status code description";
                    application.log("HTTP status code descriptions not available: " +
                        thr.toString());
                }

                // Adjust the error message line according to the amount of detail needed
                if (detailLevel < 2 ) {
                    request.setAttribute( "psc.as.attr.errorMessage", statusDetail.trim() );
                } else {
                    request.setAttribute( "psc.as.attr.errorMessage", errorCode + " - " + 
                            statusDetail.trim() + " - " + request.getMethod() + " " + requrl);
                } 
                
                // Set all the other attributes that are accessible via JSP tags
                request.setAttribute("psc.as.attr.detailLevel", detailLevel);
                request.setAttribute("psc.as.attr.product", product);
                request.setAttribute("psc.as.attr.requrl", requrl);
                request.setAttribute("psc.as.attr.errorCode", errorCode);
                request.setAttribute("psc.as.attr.errorDetail", errorDetail);
                request.setAttribute("psc.as.attr.errcodeStr", errcodeStr);
                request.setAttribute("psc.as.attr.transport" , transport);
                request.setAttribute("psc.as.attr.webApp" , webAppName);
                request.setAttribute("psc.as.attr.exceptionName", exceptionName);
                request.setAttribute("psc.as.attr.exceptionMessage", exceptionMessage );
                request.setAttribute("psc.as.attr.exceptionStack", exceptionStack );

            } else {
                application.log( "Internal page generation error - no error context available");
            }
        } else {
            application.log( "Internal page generation error - no request context available");
        }
    } catch(Throwable e2) {

        // Error in error handler
        application.log("An internal error has occurred in the error page.\n\n");
        application.log("Please copy the following details and provide it to technical send support.\n");
        application.log(e2.toString());
    }

      out.write('<');
      out.write('p');
      out.write('>');
      out.print(request.getAttribute("psc.as.attr.errorMessage"));
 if ( (Integer)request.getAttribute("psc.as.attr.detailLevel") > 1) { 
      out.write("<p>\n");
      out.write("<table>\n");
      out.write("<tr><td><b>Error details</b> </td> </tr>\n");
      out.write("<tr><td><b>Remote user:</b></td> <td> ");
      out.print(request.getRemoteUser());
      out.write("</td> </tr>\n");
      out.write("<tr><td><b>User principal:</b></td> <td> ");
      out.print(request.getUserPrincipal());
      out.write("</td> </tr>\n");
      out.write("<tr><td><b>Scheme:</b></td> <td> ");
      out.print(request.getScheme());
      out.write("</td> </tr>\n");
      out.write("<tr><td><b>Remote address:</b></td> <td> ");
      out.print(request.getRemoteAddr());
      out.write("</td> </tr>\n");
      out.write("<tr><td><b>Server name:</b></td> <td> ");
      out.print(request.getServerName());
      out.write("</td> </tr>\n");
      out.write("<tr><td><b>PASOE product type:</b></td> <td> ");
      out.print(request.getAttribute("psc.as.attr.product"));
      out.write("</td> </tr>\n");
      out.write("<tr><td><b>HTTP status:</b></td> <td> ");
      out.print((Integer)request.getAttribute("javax.servlet.error.status_code"));
      out.write("</td> </tr>\n");
      out.write("<tr><td><b>Error detail:</b></td> <td> ");
      out.print(request.getAttribute("psc.as.attr.errorDetail"));
      out.write("</td> </tr>\n");
      out.write("</table>\n");
 }; 
 if ( (Integer)request.getAttribute("psc.as.attr.detailLevel") > 2) { 
      out.write("<table>\n");
      out.write("<tr> <td><br/></td> </tr>\n");
      out.write("<tr><td><b>Debug details</b> </td> </tr>\n");
      out.write("<tr><td><b>HTTP method:</b></td> <td> ");
      out.print(request.getMethod());
      out.write("</td> </tr>\n");
      out.write("<tr><td><b>Web application:</b></td> <td> ");
      out.print(request.getAttribute("psc.as.attr.webApp"));
      out.write("</td> </tr>\n");
      out.write("<tr><td><b>Transport:</b></td> <td> ");
      out.print(request.getAttribute("psc.as.attr.transport"));
      out.write("</td> </tr>\n");
      out.write("<tr><td><b>Request URL:</b></td> <td> ");
      out.print(request.getAttribute("psc.as.attr.requrl"));
      out.write("</td> </tr>\n");
      out.write("<tr><td><b>Path info:</b></td> <td> ");
      out.print(request.getPathInfo());
      out.write("</td> </tr>\n");
      out.write("<tr><td><b>Servlet name:</b></td> <td> ");
      out.print((String)request.getAttribute("javax.servlet.error.servlet_name"));
      out.write("</td> </tr>\n");
      out.write("<tr><td><b>URI:</b></td> <td> ");
      out.print((String)request.getAttribute("javax.servlet.error.request_uri"));
      out.write("</td> </tr>\n");
      out.write("<tr><td><b>Exception class:</b></td> <td> ");
      out.print(request.getAttribute("psc.as.attr.exceptionName"));
      out.write("</td> </tr>\n");
      out.write("<tr><td><b>Exception message:</b></td> <td> ");
      out.print(request.getAttribute("psc.as.attr.exceptionMessage"));
      out.write("</td> </tr>\n");
      out.write("<tr><td style=\"vertical-align:top\"><b>Exception stack trace:</b></td> <td> ");
      out.print(request.getAttribute("psc.as.attr.exceptionStack"));
      out.write("</td> </tr>\n");
      out.write("</table>\n");
 }; 
      out.write("<br><hr>\n");
      out.write("<br>\n");
      out.write("<div class=\"clear\"></div>\n");
      out.write("<div id=\"Footer\">\n");
      out.write("\t<span>Copyright &copy; 1993-2016 Progress Software Corporation. All rights reserved.</span>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");

    }

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