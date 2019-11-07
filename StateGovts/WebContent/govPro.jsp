<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
h1{
color:Brown;
}
</style>
</head>
<body>
<form action="Database.java">
<div align=center>
<h1><strong>Chief Minister</strong></h1>
cid:
<input type="text" placeholder="enter cid:" id="cid"><br><br>
cname:
<input type="text" placeholder="cname:" id="cname"><br><br>
qualification:
<input type="text" placeholder="qualification:" id="qualification"><br><br>
state:
<select>
  <option value="Uttar Pradesh">Uttar Pradesh</option>
  <option value="Maharashtra">Maharashtra</option>
  <option value="New Delhi">New Delhi</option>
  <option value="Tamil Nadu">Tamil Nadu</option>
  <option value="Gujarat">Gujarat</option>
  <option value="West Bengal">West Bengal</option>
  <option value="Karnataka">Karnataka</option>
  <option value="Madhya Pradesh ">Madhya Pradesh</option>
   <option value="Kerala">Kerala</option>
  <option value="Andhra Pradesh">Andhra Pradesh</option>
</select><br><br>
endDate:
<input type="text" placeholder="date" id="enddate"><br><br>
party:
<input type="text" placeholder="party" id="party"><br><br>
<input type="submit" value="submit">
</form>
</div>
</body>
</html>