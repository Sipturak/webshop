<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="css/register.css">
</head>
<body>
		
		<%@include file="nav.jsp" %>
		
        <div class="form-group">
           <div class="wrapper_image">
              <img src="https://getbootstrap.com/assets/brand/bootstrap-solid.svg" alt="" height="100px;">
           </div>
         
            <h1>Register page</h1>
            <p>Below is an example form built entirely with Bootstrap's form controls. Each required form group has a validation state that can be triggered by attempting to submit the form without completing it.</p>
            <form action="RegisterServlet" method="post">
                
               <div class="row1">
                   
                  <div class="col-2">
                      <label for="">First name</label>
                      <input type="text">
                  </div>
                    <div class="col-2">
                        <label for="">Second name</label>
                        <input class="left" type="text">
                    </div>
               </div>
                
                  <div class="col-min-3">
                    <label for="">Email</label>
                    <input class="form-input" type="email" placeholder="you@example.com" name="email">
                </div>
                  <div class="col-min-3">
                    <label for="">Password</label>
                    <input class="form-input" type="password" placeholder="Password" name="password">
                </div>
                  <div class="col-min-3">
                    <label for="">Address</label>
                    <input class="form-input" type="text" placeholder="1234 Main St." name="address">
                </div>
                <div class="col-min-3">
                    <label for="">Numbere of credit card</label>
                    <input class="form-input" type="text" placeholder="1233-444-555" name="number_of_card">
                </div>
                
                <input class="form-btn" type="submit" value="Register">
                
                
                
            </form>
            
        </div>
		
</body>
</html>