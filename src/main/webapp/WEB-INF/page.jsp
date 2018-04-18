<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <title>Document</title>
    <link rel="stylesheet" href="css/page.css">
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <%@include file="nav.jsp" %>
 
   <div class="container1">
        <div class="product_image">
            <img src="${product_item.img_url}" alt="product" height="600px">
        </div>
        <div class="description">
            <div class="about_product">
                
                <h2 class="product_name">${product_item.name}</h2>
                <p class="product_description">${product_item.description}</p>
                <span>${product_item.price}</span>
                
            </div>
            <hr>
            <div class="size_and_buy">
                <p>Size</p>
                <form action="BuyServlet" method="post">
                    <button  type="submit" >Buy</button>
                    <input type="hidden" name="price_item" value="${product_item.price}">
                </form>
            </div>
        </div>
    </div>
        <footer>
              <p class="temp">Cite template bulit for personal use by Milos</p>
              <p ><a href="">Back to top</a></p>
        </footer>
    
</body>
</html>