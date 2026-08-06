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
    Shilakala Studios
</div>

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">

    <a class="navbar-brand ms-3" href="index.html">MPA</a>

    <button class="navbar-toggler" type="button"
            data-bs-toggle="collapse"
            data-bs-target="#navbarNav">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarNav">

        <ul class="navbar-nav">

            <li class="nav-item">
                <a class="nav-link" href="index.html">Home</a>
            </li>

            <li class="nav-item">
                <a class="nav-link" href="contact.html">Contact</a>
            </li>

            <li class="nav-item">
                <a class="nav-link active" href="register.html">Register</a>
            </li>

            <li class="nav-item">
                <a class="nav-link" href="proverb.html">Proverb</a>
            </li>

        </ul>

    </div>

</nav>

<div class="container mt-4">

    <h3>Register Page</h3>

    <form>
        <div class="mb-3">
            <label>Name</label>
            <input type="text" class="form-control">
        </div>

        <div class="mb-3">
            <label>Email</label>
            <input type="email" class="form-control">
        </div>

        <div class="mb-3">
            <label>Password</label>
            <input type="password" class="form-control">
        </div>

        <button class="btn btn-primary">
            Register
        </button>

    </form>

</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>