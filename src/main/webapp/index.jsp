<%-- 
    Document   : index
    Created on : 12-Jun-2022, 5:41:44 PM
    Author     : Nishant Singh
--%>

<%@page import="com.mycompany.earcommerce.helper.FactoryProvider"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
        out.print(FactoryProvider.geFactory());
        
        %>
    </body>
</html>
