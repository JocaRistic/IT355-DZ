<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
<head>
    <title>Iznajmljivanja List</title>
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
            <th>Marka auta</th>
            <th>Model auta</th>
            <th>Godiste auta</th>
            <th>Vrsta goriva</th>
            <th>Cena iznajmljivanja</th>
            <th>Ime osobe</th>
            <th>Prezime osobe</th>
            <th>Email osobe</th>
        </tr>

        <c:forEach items="${iznajmljivanja}" var="izn">
            <tr>
                <td>${izn.auto.marka}</td>
                <td>${izn.auto.model}</td>
                <td>${izn.auto.godiste}</td>
                <td>${izn.auto.vrstaGoriva}</td>
                <td>${izn.auto.cena}</td>
                <td>${izn.korisnik.ime}</td>
                <td>${izn.korisnik.prezime}</td>
                <td>${izn.korisnik.email}</td>
            </tr>
        </c:forEach>
    </table>
    <a href="${pageContext.request.contextPath}/">Nazad</a>
</body>
</html>