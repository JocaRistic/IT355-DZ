<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<html>
<head>
    <title>Reservation Form</title>
    <style>
        .error {
            color: #ff0000;
            font-weight: bold;
        }
    </style>
</head>


<form:form method="post" modelAttribute="rezervacija">
    <form:errors path="*" cssClass="error"/>
    <tr>
        <td>Vase ime</td>
        <td><form:input path="korisnik.ime"/></td>
        <td><form:errors path="korisnik.ime" cssClass="error"/></td>
    </tr>
    <tr>
        <td>Vase prezime</td>
        <td><form:input path="korisnik.prezime"/></td>
        <td><form:errors path="korisnik.prezime" cssClass="error"/></td>
    </tr>
    <tr>
        <td>Vas email</td>
        <td><form:input path="korisnik.email"/></td>
        <td><form:errors path="korisnik.email" cssClass="error"/></td>
    </tr>
    <tr>
        <td colspan="3"><input type="submit"/></td>
    </tr>

</form:form>

</html>
