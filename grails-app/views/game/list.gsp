<%--
  Created by IntelliJ IDEA.
  User: sadee
  Date: 12/21/2020
  Time: 10:34 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
</head>

<body>
Here's the list of games we have so far,
<ul>
    <g:each in="${gameList}" var="game">
            <li>${game}</li>
    </g:each>
</ul>

</body>
</html>