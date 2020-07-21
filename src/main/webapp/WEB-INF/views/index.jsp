<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Accident LiST</title>
    <head>
        <meta charset="utf-8">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
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
        <script>
            function del2(id) {
                alert("Are you really want delete record with id: " + id);
                $.ajax({
                    type: "POST",
                    url: window.location + "delete/" + id
                });
            }
            $(document).on("click", ".showHideButton", function () {
                if ($(this).parent().parent().hasClass("service-header") && $(this).parent().parent().is(":visible")) {
                    $(this).parent().parent().hide();
                } else {
                    $(this).parent().parent().show();
                }
            });
        </script>

        <title>Accident</title>
    </head>
<body>
<h2 align="center">Accident Base of Raccoon city</h2>
<br>
<nav class="navbar navbar-dark bg-dark">
    <a class="navbar-brand">Автонарушители</a>
    <a class="navbar-brand" href="<c:url value='/create'/>">Добавить инцидент</a>
</nav>
<br>
<div class="container" align="center">
   <h3>Login as : ${user.username}</h3>
</div>
<br>
<div class="container">
    <table class="table table-bordered" id="table">
        <thead>
        <tr>
            <th>id</th>
            <th>Name</th>
            <th>Text</th>
            <th>Address</th>
            <th>Edit Accident</th>
            <th>Delete Accident</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="accident" items="${ACCIDENTS}" varStatus="status">
            <tr class="service-header">
                <form action="<c:url value='/edit'/>" method="GET">
                    <td><input type="hidden" name="id" id="id" value="${accident.id}">${accident.id}</td>
                    <td><input type="hidden" name="name" value="${accident.name}">${accident.name}</td>
                    <td><input type="hidden" name="text" value="${accident.text}">${accident.text}</td>
                    <td><input type="hidden" name="address" value="${accident.address}">${accident.address}</td>
                    <td><input type="submit" class="button" name="edit" value="Edit"></td>
                    <td>
                        <button type='button' style="background-color: lightyellow"
                                class='showHideButton btn btn-default' onclick="del2(${accident.id})">Delete
                        </button>
                    </td>
                </form>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>