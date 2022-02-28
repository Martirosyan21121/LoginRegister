<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 26/փտվ/2022
  Time: 21:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register Page</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css">
</head>

<body class="text-center">
<h1 style="text-align: center">Register Page</h1>
<div class="form-signin">
    <form class="from-group" action="register" method="post">
        <h1 class="h3 mb-3 fw-normal">Please sign in</h1>

        <div class="form-floating">
            <input type="text" name="name" class="form-control" id="floatingInput" placeholder="name">
            <label for="floatingInput">Name</label>
        </div>

        <div class="form-floating">
            <input type="text" name="lastName" class="form-control" id="floatingInput1" placeholder="last name">
            <label for="floatingInput1">Name</label>
        </div>


        <div class="form-floating">
            <input type="email" name="email" class="form-control" id="floatingInput2" placeholder="email">
            <label for="floatingInput2">Email</label>
        </div>

        <div class="form-floating">
            <input type="number" name="age" class="form-control" id="floatingInput3" placeholder="age">
            <label for="floatingInput3">Age</label>
        </div>


        <div class="form-floating">
            <input type="password" name="password" class="form-control" id="floatingPassword" placeholder="Password">
            <label for="floatingPassword">Password</label>
        </div>


        <button class="w-100 btn btn-lg btn-primary" type="submit">Register</button>
        <p class="mt-5 mb-3 text-muted">© 2017–2021</p>
    </form>
</div>
</main>

<a href="login">Login Page</a><br>

</body>
</html>
