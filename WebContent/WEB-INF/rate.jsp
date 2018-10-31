<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<form method ="post" action="rate">
		Get me your rate :
       <br/>
     <UL>
       
      <LI>Quality of norrit : <input type="number"  name="qn" >  </LI>
      <br/>
      <LI>Quality of sale :<input type="number" name="qsa"> </LI>
      <br/>
      <LI>Quality of service  <input type="number" name="qse"> </LI>
      
     </UL>
     
     <input type="submit" value="Validate" />
   </form>
   
    <p>Name =<c:out value="${ r }" default="none" /></p>   
    <p>Medium =<c:out value="${ m }" default="none" /></p>
</body>
</html>