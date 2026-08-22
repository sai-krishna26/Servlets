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
    <title>Home</title>
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
        <a class="nav-link" href="LogIn.jsp">
            Login
        </a>
    </li>
    <li class="nav-item" role="presentation">
        <a class="nav-link-active" href="Home.jsp">
            Home
        </a>
    </li>
    <li class="nav-item" role="presentation">
        <a class="nav-link" href="Profile.jsp">
            Profile
        </a>
    </li>
</ul>
<% String username=(String)session.getAttribute("username"); %>
<h3>Welcome to the <strong>SmartChat</strong> <%= username %>!, Let's Chat</h3>
<hr>
<marquee direction="left" scrollamount="12" behavior="scroll"><h6><strong>ADVICE</strong>: Feel free to share your thoughts!, we are not hackers to sell your data</h6></marquee>
<hr>
<br>
<form action="home" method="post" enctype="multipart/form-data">
<div class="row">
    <div class="col">
        <h6>Name</h6>
        <input type="text" class="form-control" placeholder="if you got a chance to change your name, which name you want!" aria-label="First name" name="name"><br>
    </div>
    <br>
    <div class="col">
        <h6>Date of Birth</h6>
        <input type="date" class="form-control" placeholder="we don't tell to anyone, be honest!" aria-label="Date of Birth" name="dateOfBirth"><br>
    </div>
    <br>
    <div>
        <h6>Favourite Actor</h6>
        <input type="text" class="form-control" placeholder="He/She should be Indian!" aria-label="Actor" name="actor"><br>
    </div>
    <br>
    <div>
        <h6>Favourite Movie</h6>
        <input type="text" class="form-control" placeholder="All time favourite movie of all time!" aria-label="Movie" name="movie"><br>
    </div>
    <div>
        <h6>Your Movie</h6>
        <input type="text" class="form-control" placeholder="If your life is a movie, what is your movie title?" aria-label="Your Movie" name="ownMovie"><br>
    </div>

    <div>
        <h6>You have a surprise, upload your image here!</h6>
        <input type="file" class="form-control" placeholder="You have a surprise, upload your image here!" aria-label="Image" name="image"><br>
    </div>
</div>

    <button type="submit" class="btn btn-primary">Lets Go!</button>
</form>
</body>
</html>