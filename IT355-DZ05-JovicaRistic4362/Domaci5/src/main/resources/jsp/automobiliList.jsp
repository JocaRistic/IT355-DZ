<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
<head>
    <title>Automobili List</title>
    <style>
        .error {
            color: #ff0000;
            font-weight: bold;
        }
    </style>
</head>

<body>
    <table border="1">
        <tr>
            <th>Marka</th>
            <th>Model</th>
            <th>Godiste</th>
            <th>Vrsta goriva</th>
            <th>Cena</th>
        </tr>

        <c:forEach items="${automobili}" var="auto">
            <tr>
                <td>${auto.marka}</td>
                <td>${auto.model}</td>
                <td>${auto.godiste}</td>
                <td>${auto.vrstaGoriva}</td>
                <td>${auto.cena}</td>
                <td><a href="iznajmi?automobilId=${auto.id}">Iznajmi</a></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>