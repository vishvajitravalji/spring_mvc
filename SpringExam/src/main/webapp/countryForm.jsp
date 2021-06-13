<%-- 
    Document   : countryForm
    Created on : 2-Mar-2020, 9:54:08 AM
    Author     : Vish
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix='form' uri='http://www.springframework.org/tags/form'%>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form:form action="countires" commandName="country" >
            
            
            <label for="countryIdInput">Country Id: </label>
            <form:input path="countryId" id="countryIdInput"></form:input>
            <form:errors path="countryId"/>    <br />
            
            <label for="countryName">Country Name: </label>
            <form:input path="countryName" id="countryNameInput"></form:input>
           <form:errors  path="countryName"/>     <br />  
           
            <label for="regionIdInput">Region Id: </label>
            <form:input path="regionId" id="regionIdInput"></form:input>
            <form:errors path="regionId"/>   <br />
         
            <input type="submit" value="Submit" />
            
        </form:form>
    </body>
</html>
