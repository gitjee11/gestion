<%@page import="java.util.Date" session="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html lang="fr">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <link href="${pageContext.request.contextPath}/styles/style.css" rel="stylesheet" id="bootstrap-css">
	<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
	<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
    <title>Examples Servlet</title>
    <style>
    
    </style>
</head>

<body>
<div class="sidenav">
 	<div style="text-align: center;padding:5px 0;margin:0;">
       <a href="${pageContext.request.contextPath}/index?lang=en">Login (English)</a>
       &nbsp;&nbsp;
       <a href="${pageContext.request.contextPath}/index?lang=fr">Login (French)</a>
       
    </div>
         <div class="login-main-text">
         
            <h2><spring:message    code="label.hello" /></h2>
            <p>${message }</p>
            <br>
            <%= new Date() %>
         </div>
      </div>
      <div class="main">
         <div class="col-md-6 col-sm-12">
            <div class="login-form">
               <form action="userInfo" method="post">
                  <div class="form-group">
                     <label><spring:message    code="label.userName" /></label>
                     <input type="text" class="form-control" placeholder="User Name" name="login">
                  </div>
                  <div class="form-group">
                     <label><spring:message    code="label.password" /></label>
                     <input type="password" class="form-control" placeholder="Password" name="password">
                  </div>
                  <spring:message code="label.submit" var="labelSubmit"></spring:message>
                  <button type="submit" class="btn btn-black">${labelSubmit}</button>
                  <button type="submit" class="btn btn-secondary">Register</button>
               </form>
            </div>
         </div>
      </div>
</body>

</html>