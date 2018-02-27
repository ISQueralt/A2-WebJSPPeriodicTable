<%-- 
    Document   : newjsp
    Created on : 27-feb-2018, 14:02:25
    Author     : queralt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    </body>
        <%-- start web service invocation --%><hr/>
    <%
    try {
	net.webservicex.Periodictable service = new net.webservicex.Periodictable();
	net.webservicex.PeriodictableSoap port = service.getPeriodictableSoap();
	 // TODO initialize WS operation arguments here
	java.lang.String elementName = "";
	// TODO process result here
	java.lang.String result = port.getElementSymbol(elementName);
	out.println("Result = "+result);
        out.println(port.getElementSymbol("Gold"));
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

</html>