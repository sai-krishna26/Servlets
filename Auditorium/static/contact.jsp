<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet"
          href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css">
    <title>Contact</title>
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
                <a class="nav-link active" href="contact.jsp">Contact</a>
            </li>

            <li class="nav-item">
                <a class="nav-link" href="register.jsp">Register</a>
            </li>

            <li class="nav-item">
                <a class="nav-link" href="proverb.jsp">Proverb</a>
            </li>

        </ul>

    </div>

</nav>

<h3>Contact Us</h3>
<br>

<% if (request.getAttribute("message") != null) { %>
    <div class="alert alert-success">
        <%= request.getAttribute("message") %>
    </div>
<% } %>

<form action="contact" method="post">

    <div class="mb-3">
        <label for="name" class="form-label">Full Name</label>
        <input type="text" class="form-control" id="name" name="name">
    </div>

    <div class="mb-3">
        <label for="email" class="form-label">Email</label>
        <input type="email" class="form-control" id="email" name="email">
    </div>

    <div class="mb-3">
        <label for="phone" class="form-label">Phone Number</label>
        <input type="number" class="form-control" id="phone" name="phone">
    </div>

    <div class="mb-3">
        <label for="subject" class="form-label">Subject</label>
        <input type="text" class="form-control" id="subject" name="subject">
    </div>

    <div class="mb-3">
        <label for="message" class="form-label">Message</label>
        <textarea class="form-control" id="message" name="message"></textarea>
    </div>

    <button type="submit" class="btn btn-primary">Send Message</button>

</form>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>