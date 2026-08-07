<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet"
          href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css">
    <title>Register</title>
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
                <a class="nav-link active" href="register.jsp">Register</a>
            </li>

            <li class="nav-item">
                <a class="nav-link" href="proverb.jsp">Proverb</a>
            </li>

        </ul>

    </div>

</nav>

<h3>Register Here</h3>
<br>
<form action="register" method="post">

    <div class="mb-3">
        <label for="name" class="form-label">Full Name</label>
        <input type="text" class="form-control" id="name" name="name">
    </div>

    <div class="mb-3">
        <label for="email" class="form-label">Email</label>
        <input type="email" class="form-control" id="email" name="email">
    </div>

    <div class="mb-3">
        <label for="password" class="form-label">Password</label>
        <input type="password" class="form-control" id="password" name="password">
    </div>

    <div class="mb-3">
        <label for="gender" class="form-label">Gender</label>
        <select class="form-select" id="gender" name="gender">
            <option value="">Select Gender</option>
            <option>Male</option>
            <option>Female</option>
            <option>Other</option>
        </select>
    </div>

    <div class="mb-3">
        <label for="mobile" class="form-label">Mobile Number</label>
        <input type="number" class="form-control" id="mobile" name="mobile">
    </div>

    <button type="submit" class="btn btn-primary">Register</button>

</form>
${message}
<br>
${important}

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>