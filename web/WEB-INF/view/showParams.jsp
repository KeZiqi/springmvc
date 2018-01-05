<%--
  Created by IntelliJ IDEA.
  User: Phillip
  Date: 2017/12/23
  Time: 13:24
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ShowParams</title>
</head>
<body>
params:<br>
str=
${params.get("str")}<br>
number=
${params.get("number")}
</body>
</html>
