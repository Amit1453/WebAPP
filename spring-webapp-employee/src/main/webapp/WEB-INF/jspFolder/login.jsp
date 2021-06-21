<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1 Welcome to login page ></h1>

<div class="container">

  ${msg}
 <form action="authenticate" method="post">
 <div class="form-group">
       <label >Enter the emailId:</label>
      <input type="text" class="form-control"  placeholder="Enter username" name="email">
    </div>
    
    <div class="form-group">
      <label >Enter the password:</label>
      <input type="text" class="form-control"  placeholder="Enter password" name="password">
    </div>
    
    <button type="submit" class="btn btn-primary">Login</button>
  </form>
</div>

 <a href="registration" >
      <button type="button" class="btn btn-info">Go to registration page</button>
   </a> 

${sucessmsg}

</body>
</html>