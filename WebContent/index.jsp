<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Get contacts</title>
<!-- Bootstrap core CSS -->
    <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
    
    <!-- custom CSS -->
    <link href="${pageContext.request.contextPath}/css/cover.css" rel="stylesheet">
   
   
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<div class="site-wrapper">
<div class="inner cover">
          <h1 class="cover-heading title-blue">Get contacts from page</h1>
          
          </div>
      <div class="site-wrapper-inner">

        <div class="cover-container">

         

          
            <h3>Insert URL:</h3>
	<form action="GetContactsServlet" method="post">
		<input type="url" name="url" required="required" role="form"/> <span class="error">${requestScope["error"]}</span><br /> 
		
		<input type="submit" class="btn btn-primary btn-blue" value="Process URL" />
	</form>
	</div>
	${requestScope["gate"]}
	<c:if test='${ requestScope["gate"]!=null}'>
	<a class="btn btn-primary btn-blue" href="${pageContext.request.contextPath}/data/emails.csv" download="emails.csv">Download emails
</a>
	<a class="btn btn-primary btn-blue" href="${pageContext.request.contextPath}/data/phones.csv" download="phones.csv">Download phones
</a>
</c:if>
		<div class="foot">
            <div class="inner">
              <p>Author: Lukas Kostensky</p>
            </div>
          </div>
	<!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/docs.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="${pageContext.request.contextPath}/js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>


	
