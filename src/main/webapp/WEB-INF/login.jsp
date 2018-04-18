<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="css/login.css">
<link href="https://fonts.googleapis.com/css?family=Open+Sans+Condensed:300" rel="stylesheet">
</head>
<body>
	<%@include file="nav.jsp" %>
	
        <div class ="main">
        
        <img src="https://getbootstrap.com/assets/brand/bootstrap-solid.svg"  alt="">
        
        <h1>Please sign in</h1>
        <form action="LoginServlet" method="post">
            
           <input class="form-input" type="email" placeholder="Enter email" name="email">
           <input class="form-input" type="password" placeholder="Enter password" name="password">
          
            
            <input class="form-btn" type="submit" value="Login">
        </form>
    </div>
</body>
</html>