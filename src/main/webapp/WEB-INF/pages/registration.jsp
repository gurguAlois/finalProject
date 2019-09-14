<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>My registration page</title>
    <link rel="stylesheet" type="text/css" href="css/loginAndRegister.css">

    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
            integrity="sha256-pasqAKBDmFT4eHoN2ndd6lN370kFiGUFyTiUHWhU7k8="
            crossorigin="anonymous"></script>


    <script src="js/login.js"></script>
</head>
<body>
<div class="registerArea">
    <h2>Register</h2>
    <form:form method="POST" action="registration" modelAttribute="userForm">
        <form:input path="firstName" id="firstName" type="text" class="normalInput"
                    placeholder="First name"/>
        <form:input path="lastName" id="lastName" type="text" class="normalInput"
                    placeholder="Last name"/>
        <form:input path="email" id="email" type="email" class="normalInput" placeholder="Email"/>
        <form:input path="password" id="password" type="password" class="normalInput"
                    placeholder="Password"/>
        <%--        <p class="error">Password too short!</p>--%>
        <form:input path="confirmPassword" id="confirmPassword" type="password" class="normalInput"
                    placeholder="Confirm password"/>
        <%--        <p class="error">Passwords do not match!</p>--%>
        <button>Register</button>

        <ul class="registerFooter">
            <li><a href="login">Log in</a></li>
            <li><a href="#">Forgot Password</a></li>
        </ul>

    </form:form>
</div>
</body>
</html>
