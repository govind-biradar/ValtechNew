<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
    <title>Facebook-like Login Page</title>
    <link rel="stylesheet" type="text/css" href="css/smoothness/jquery-ui-1.8.21.custom.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Rubik:wght@500&display=swap" rel="stylesheet">
	<script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
	<script type="text/javascript" src="js/jquery-ui-1.8.21.custom.min.js"></script>
	<script type="text/javascript">
		$(function(){
            $(".container").draggable();
            $("#p2").draggable();
		
			
		});
	</script>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f2f5;
            margin: 0;
            padding: 0;
            display: flex;
            height: 100vh;
        }

        .container {
            background-color: #fff;
            border-radius: 8px;
            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
            padding: 20px;
            width: 320px;
            text-align: center;
            height: 300px;
            position:relative;
            left: -52px;
            top:160px;
        }

        .input-field {
            width: 100%;
            padding: 10px;
            margin: 8px 0;
            border: 1px solid #ddd;
            border-radius: 4px;
            box-sizing: border-box;
        }

        .input-field:focus {
            outline: none;
            border: 1px solid #4267B2;
        }

        .login-button {
            background-color: #1877f2;
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            width: 100%;
        }

        .login-button:hover {
            background-color: #0e5a8a;
        }

        .create-account {
            color: #1877f2;
            text-decoration: none;
        }
        #p1{
            position: relative;
            top: 140px;
            left: 150px;
            font-family: Rubik;
            font-size: 60px;
            color: #0767e6;
        }
        #p2{
            position: relative;
            top:254px;
            left:-123px;
            font-size: 30px;
        }
        .i1{
            height: 45px;
            width: 315px;
        }
        .i2{
            height: 45px;
            width: 315px;

        }
        .create{
            height: 45px;
            width:200px;
            font-size: larger;
            color: #ecf5f3;
            background-color: rgba(13, 199, 7, 0.808);
            border-radius: 10px;
            border-style: none;
        }
        
    </style>
</head>

<body>
    <p id="p1">facebook</p>
    </br>
    </br>
    <p id="p2"> Facebook helps you connect and share</br>with the people in your life</p>
    <div class="container" >
        
      
        <form action="FaceBookServlet" method="post">
            <input class="i1" type="text" name="name" class="input-field" placeholder="Email address or Phone number">
        </br>
    </br>
            <input class="i2"  type="password" name="pass" class="input-field" placeholder="Password">
</br>
</br>
            <button type="submit" class="login-button">Login</button>
        </form>
    </br>
        <a href="#" class="create-account">Forgotten Password</a>
        <hr>
    </br>
    <button type="submit" class="create" value="FaceBookServlet">create new account</button>
    </div>
</body>

</html>
    