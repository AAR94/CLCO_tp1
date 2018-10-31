<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
     <p>Hello !</p>
     
     <ul>   
     <c:forEach items="${ list }" varStatus="status" var="titre">
    	 <li> <h3><c:out value="${ titre.getName() }" /> : <a href="/CLCO_tp1/rate?type=${status.count}">Your rate :</a> <c:out value="${titre.getMedium()}" default="None"/> </h3></li>
          <p>  Description N°<c:out value="${ status.count }" /></p>      
	</c:forEach>
     </ul>
     
     <p><c:out value="${ mm }" /></p>

</body>
</html>
