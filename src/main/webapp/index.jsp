<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Hello bro, it's me JSP!</h1>


<!--  <form method="post" action="hello">
		<table>
			<tr>
				<td>First Name:</td>
				<td><input name="firstName" /></td>
			</tr>
			<tr>
				<td>Last Name :</td>
				<td><input name="lastName" /></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input name="email" /></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input name="password" type="password" /></td>
			</tr>
			<tr>
				<td>Gender:</td>
				<td>
					<input type="radio" id="contactChoice1"
				     name="gender" value="male">
				    <label for="genderChoice1">Male</label>
				
				    <input type="radio" id="contactChoice2"
				     name="gender" value="female">
				    <label for="genderChoice2">Female</label>
				</td>
			</tr>
			
			<tr>
				<td />
				<td><input type="submit" value="Add" /></td>
		</table>
	</form> 
-->

<form method="post" action="hello">
	<div>
	
		<input type="radio" id="menuOption1"
	     name="menuOptions" value="createProduct">
	    <label for="menuOption1">1. Create a Product</label>
		<br>
		<input type="radio" id="menuOption2"
	     name="menuOptions" value="createOrder">
	    <label for="menuOption2">2. Create an Order</label>
		<br>
		<input type="radio" id="menuOption3"
	     name="menuOptions" value="showProducts">
	    <label for="menuOption3">3. Show all Products</label>
		<br>
		<input type="radio" id="menuOption4"
	     name="menuOptions" value="showOrderedProducts">
	    <label for="menuOption4">4. Show all ordered Products</label>
	    <br>
		<input type="radio" id="menuOption5"
	     name="menuOptions" value="showOrders">
	    <label for="menuOption5">5. Show all Orders</label>
	    <br>
		<input type="radio" id="menuOption6"
	     name="menuOptions" value="showOrderByID">
	    <label for="menuOption6">6. Show order by ID</label>
	    <br>
		<input type="radio" id="menuOption7"
	     name="menuOptions" value="deleteProduct">
	    <label for="menuOption7">7. Delete Product</label>
	</div>
	<br>

  <p><b>Product name:</b><br>
   <input name="productName" type="text" size="40">
  </p>

	<br>
	<div>
	  <input type="checkbox" id="forward" name="forward">
	  <label for="forward">Forward to another Servlet</label>
	</div>
  	
	<br>
	<div>    <!-- buttons holder -->
	    <!-- <button onclick="location.href='/ServletTutorial/hello'">Next</button> -->
	    
	    <input type="submit" value="Next" />
	</div>

</form>

<form method="post" action="exampleInfo">
	<br>
	<div>    <!-- buttons holder -->
		<input type="submit" value="Servlet info" />
	</div>
</form>
</body>
</html>