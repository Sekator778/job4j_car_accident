<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Accident LiST</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <style>
        body {
            background-color: azure;
        }
        #table {
            background-color: chocolate;
        }
    </style>
</head>
<body>
<div class="container">
    <div class="table table-bordered">
        <table class="table table-bordered" id="table">
            <thead>
            <tr>
                <th>id</th>
                <th>Description</th>
                <th>Date of created</th>
                <th>Done</th>
            </tr>
            </thead>
            <tbody id="table2">
            </tbody>
        </table>
    </div>
</div>

</body>
</html>