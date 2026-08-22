<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css"
            rel="stylesheet"
    />
    <link
            href="https://getbootstrap.com/docs/5.3/assets/css/docs.css"
            rel="stylesheet"
    />
    <title>Login</title>
    <script
            defer
            src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js"
    ></script>
</head>


<body>
<ul class="nav nav-tabs" id="myTab" role="tablist">
    <li class="nav-item" role="presentation">
        <a class="nav-link" href="index.html">
            SMARTCHAT
        </a>
    </li>
    <li class="nav-item" role="presentation">
        <a class="nav-link" href="Register.jsp">
            Registration
        </a>
    </li>
    <li class="nav-item" role="presentation">
        <a class="nav-link-active" href="LogIn.jsp">
            Login
        </a>
    </li>
    <li class="nav-item" role="presentation">
        <a class="nav-link" href="Home.jsp">
            Home
        </a>
    </li>
    <li class="nav-item" role="presentation">
        <a class="nav-link" href="Profile.jsp">
            Profile
        </a>
    </li>
</ul>



<%
    String username = (String) session.getAttribute("username");
    if (username != null) {
%>
    <h3>Great, <%=username%>! keep going on by logging in</h3>
    <br>
<%
    } else {
%>
    <h3>Login</h3>
    <br>
<%
    }
%>



<form action="logIn" method="post">

    <h3><span style="color: green">${successMessage}</span></h3>
    <h3><span style="color: red">${errorMessage}</span></h3>

    <div class="input-group mb-3">
      <span class="input-group-text" id="basic-addon1">@</span>
      <input type="text" class="form-control"  name="username" placeholder="Username" >
    </div>

    <div class="form-floating">
      <input type="password" class="form-control" id="floatingPassword" name="password" placeholder="Password">
      <label for="floatingPassword">Password</label>
    </div>
    <br>

    <button class="btn-53">Login</button>

</form>

${message}
<br>
${important}
<br>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js"></script>
</body>
</html>

