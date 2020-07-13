<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Accident LiST</title>
    <head>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
              integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous"/>
        <title>Accident</title>
    <style>
        body {
            background-color: azure;
        }

        #table {
            background-color: darkseagreen;
        }

        th {
            background-color: chocolate;
        }

        h2 {
            color: rebeccapurple;
        }
    </style>
</head>
<body>
<h2 align="center">Base accident for Raccoon city</h2>
<br>
<nav class="navbar navbar-dark bg-dark">
    <a class="navbar-brand">Автонарушители</a>
</nav>
<br>
<div class="container">
    <div class="table table-bordered">

        <table class="table table-bordered" id="table">
            <thead>
            <tr>
                <th>id</th>
                <th>Name</th>
                <th>Text</th>
                <th>Address</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="accident" items="${ACCIDENTS}" varStatus="status">
                <tr>
                    <td>${accident.id}</td>
                    <td>${accident.name}</td>
                    <td>${accident.text}</td>
                    <td>${accident.address}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>