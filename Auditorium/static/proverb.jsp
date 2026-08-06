<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet"
          href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css">
    <title>Proverb</title>
</head>

<body>

<div class="text-bg-warning p-3">
    ShilpaKala Studios
</div>

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">

    <a class="navbar-brand ms-3" href="index.html">SS</a>

    <button class="navbar-toggler" type="button"
            data-bs-toggle="collapse"
            data-bs-target="#navbarNav">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarNav">

        <ul class="navbar-nav">

            <li class="nav-item">
                <a class="nav-link" href="contact.jsp">Contact</a>
            </li>

            <li class="nav-item">
                <a class="nav-link" href="register.jsp">Register</a>
            </li>

            <li class="nav-item">
                <a class="nav-link active" href="proverb.jsp">Proverb</a>
            </li>

        </ul>

    </div>

</nav>

<h3>Submit Your Favourite Proverb</h3>
<br>

<% if (request.getAttribute("message") != null) { %>
    <div class="alert alert-success">
        <%= request.getAttribute("message") %>
    </div>
<% } %>

<form action="proverb" method="post">

    <div class="mb-3">
        <label for="name" class="form-label">Your Name</label>
        <input type="text" class="form-control" id="name" name="name">
    </div>

    <div class="mb-3">
        <label for="proverb" class="form-label">Favourite Proverb</label>
        <input type="text" class="form-control" id="proverb" name="proverb">
    </div>

    <div class="mb-3">
        <label for="category" class="form-label">Category</label>
        <select class="form-select" id="category" name="category">
            <option value="">Select Category</option>
            <option>Motivational</option>
            <option>Success</option>
            <option>Life</option>
            <option>Education</option>
            <option>Friendship</option>
        </select>
    </div>

    <div class="mb-3">
        <label for="language" class="form-label">Language</label>
        <input type="text" class="form-control" id="language" name="language">
    </div>

    <div class="mb-3">
        <label for="author" class="form-label">Author</label>
        <input type="text" class="form-control" id="author" name="author">
    </div>

    <button type="submit" class="btn btn-primary">Submit</button>

</form>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>