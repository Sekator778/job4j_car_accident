<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Accident LiST</title>
    <head>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
              integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
              crossorigin="anonymous"/>
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
        <title>Accident</title>
    </head>
<body>
<h2 align="center">Base accident for Raccoon city</h2>
<br>
<nav class="navbar navbar-dark bg-dark">
    <a class="navbar-brand">Автонарушители</a>
    <a class="navbar-brand" href="<c:url value='/create'/>">Добавить инцидент</a>
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
                <th></th>
                <th></th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="accident" items="${ACCIDENTS}" varStatus="status">
                <tr>
                    <form action="<c:url value='/edit'/>" method="GET">
                        <td><input type="hidden" name="id" value="${accident.id}">${accident.id}</td>
                        <td><input type="hidden" name="name" value="${accident.name}">${accident.name}</td>
                        <td><input type="hidden" name="text" value="${accident.text}">${accident.text}</td>
                        <td><input type="hidden" name="address" value="${accident.address}">${accident.address}</td>
                        <td>
                            <input type="submit" class="button" name="edit" value="Edit">
                            <input type="submit" class="button" name="delete"  onclick="<c:url value='/delete'/>" method="POST" value="Delete">
                        </td>
                    </form>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>