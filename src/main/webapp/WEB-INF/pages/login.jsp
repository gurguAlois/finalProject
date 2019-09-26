<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
    <title>Spring Security Tutorial</title>
    <link href="/css/login.css" rel="stylesheet">
    <link rel="stylesheet"
          href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>


<form:form method="get" action="registration">
    <button class="btn btn-md btn-warning btn-block" type="Submit">Go To Registration Page</button>
</form:form>

<div class="container">
    <img src="/images/login.jpg" class="img-responsive center-block" width="300" height="300"
         alt="Logo"/>
    <form action="login" method="POST" class="form-signin">
        <h3 class="form-signin-heading" text="Welcome"></h3>
        <br/>

        <input type="text" id="email"placeholder="Email" name="email"
               class="form-control" value="gurgualois@yahoo.com"/> <br/>
        <input type="password" placeholder="Password" name="password"
               id="password" class="form-control" value="12345"/> <br/>

        <div align="center">
            <c:if test="${param.error}">
                <p style="font-size: 20; color: #FF1C19;">Email or Password invalid, please
                    verify</p>
            </c:if>
        </div>
        <button class="btn btn-lg btn-primary btn-block" name="Submit"
                 type="Submit"
                text="Login">Login</button>
    </form>
</div>

