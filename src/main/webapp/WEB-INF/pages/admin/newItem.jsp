<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>My registration page</title>
    <link rel="stylesheet" type="text/css" href="/css/itemAdding.css">

    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
            integrity="sha256-pasqAKBDmFT4eHoN2ndd6lN370kFiGUFyTiUHWhU7k8="
            crossorigin="anonymous"></script>


    <script src="/js/login.js"></script>
</head>
<body>
<div class="addingItemArea">
    <h2>Register</h2>
    <form:form method="POST" action="newItem" modelAttribute="itemForm">
        <form:input path="name" id="itemName" type="text" class="normalInput"
                    placeholder="name"/>
        <p class="error"><form:errors path="name"/></p>
        <form:input path="description" id="description" type="text" class="normalInput"
                    placeholder="description"/>
        <p class="error"><form:errors path="description"/></p>
        <form:input path="startingPrice" id="startingPrice" type="number" class="normalInput" placeholder="startingPrice"/>
        <p class="error"><form:errors path="startingPrice"/></p>
        <form:input path="startDate" id="startDate" type="date" class="normalInput"
                    placeholder="startDate"/>
        <p class="error"><form:errors path="startDate"/></p>
        <form:input path="endDate" id="endDate" type="date" class="normalInput"
                    placeholder="endDate"/>
        <p class="error"><form:errors path="endDate"/></p>
        <button>ADD ITEM</button>

        <h2 class ="successMessage">${successMessage}</h2>
        <ul class="addingFooter">
            <li><a href="Go To Home Page">Log in</a></li>
        </ul>

    </form:form>
</div>
</body>
</html>
