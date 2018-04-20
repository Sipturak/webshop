<html>
<head>
    <meta charset="UTF-8">
    <title>Document</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>  
       
       <%@include file="nav.jsp" %>
        
        <div class="wrapper">
            
            <div class="header">
                <h1>LIMITED COLLECTION</h1>
                <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electroni</p>
                <a href="">View collection</a>
            </div>
            
        </div>
        
        <div class="head">
            <h1>FEATURED PRODUCTS</h1>
        </div>
        <form action="PageServlet" method="get">
        <div class="container">
	
            <div class="row">
                <div class="col">
                       <div class="image">
                        <button type="submit" name="f12" value="0" style="border:0; background: white;">
                       		<img alt="" src="${products[0].img_url}">
                       </button>
                       
                       </a>
                      
                    </div>
                    <div class="desc">
                       <a href="">
                           <h4>${products[0].name}</h4>
                       </a>
                        <p>${products[0].description}</p>
                        <span>${products[0].price}</span>
                    </div>
                </div>
                <div class="col">
                     <div class="image">
                    <a href="">
						<button type="submit" name="f12" value="1" style="border:0; background: white;">
                       		<img alt="" src="${products[1].img_url}">
                       </button>                        
                    </a>
                    </div>
                    <div class="desc">
                      <a href="">
                           <h4>${products[1].name}</h4>
                       </a>
                        <p>${products[1].description}</p>
                        <span>$${products[1].price}</span>
                    </div>
                </div>
                <div class="col">
                     <div class="image">
                    <a href="">
                         <button type="submit" name="f12" value="2" style="border:0; background: white;">
                       		<img alt="" src="${products[2].img_url}">
                       </button>
                        
                    </a>
                    </div>
                    <div class="desc">
                       <a href="">
                           <h4>${products[2].name}</h4>
                       </a>
                        <p>${products[2].description}</p>
                        <span>$${products[2].price}</span>
                    </div>
                </div>
            </div>
    </div>
             <div class="container">
            <div class="row">
                <div class="col">
                       <div class="image">
                       <a href="page.html">
                         <button type="submit" name="f12" value="3" style="border:0; background: white;">
                       		<img alt="" src="${products[3].img_url}">
                       </button>
                       </a>
                    </div>
                    <div class="desc">
                        <a href="">
                           <h4>${products[3].name}</h4>
                       </a>
                        <p>${products[3].description}</p>
                        <span>$${products[3].price}</span>
                    </div>
                </div>
                <div class="col">
                     <div class="image">
                    <a href="">
                         <button type="submit" name="f12" value="4" style="border:0; background: white;">
                       		<img alt="" src="${products[4].img_url}">
                       </button>
                    </a>
                    </div>
                    <div class="desc">
                      <a href="">
                           <h4>${products[4].name}</h4>
                       </a>
                        <p>${products[4].description}</p>
                        <span>$${products[4].price}</span>
                    </div>
                </div>
                <div class="col">
                     <div class="image">
                    <a href="">
                          <button type="submit" name="f12" value="5" style="border:0; background: white;">
                       		<img alt="" src="${products[5].img_url}">
                       </button>
                    </a>
                    </div>
                    <div class="desc">
                       <a href="">
                           <h4>${products[5].name}</h4>
                       </a>
                        <p>${products[5].description}</p>
                        <span>$${products[5].price}</span>
                    </div>
                </div>
            </div>
        </div>
        </form>
        <hr>
        
        <footer>
              <p class="temp">Cite template bulit for personal use by Milos</p>
              <p ><a href="">Back to top</a></p>
        </footer>
       
        
</body>
</html>