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
    <title>Profile</title>
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
        <a class="nav-link" href="Home.jsp">
            Home
        </a>
    </li>
    <li class="nav-item" role="presentation">
        <a class="nav-link-item" href="Profile.jsp">
            Profile
        </a>
    </li>
</ul>

<%@ page import="com.xworkz.smartChat.dto.HomeDto" %>

<%
    HomeDto homeDto = (HomeDto) request.getAttribute("homeDto");
    if (homeDto != null) {
%>

<div class="container mt-4">
    <div class="card">
        <div class="card-header bg-primary text-white">
            <h4>Your Profile</h4>
        </div>
        <div class="card-body">
            <div class="row">
                <div class="col-md-6">
                    <p><strong>Name:</strong> <%= homeDto.getName() != null ? homeDto.getName() : "Not provided" %></p>
                    <p><strong>Date of Birth:</strong> <%= homeDto.getDateOfBirth() != null ? homeDto.getDateOfBirth() : "Not provided" %></p>
                    <p><strong>Favourite Actor:</strong> <%= homeDto.getActor() != null ? homeDto.getActor() : "Not provided" %></p>
                </div>
                <div class="col-md-6">
                    <p><strong>Favourite Movie:</strong> <%= homeDto.getMovie() != null ? homeDto.getMovie() : "Not provided" %></p>
                    <p><strong>Your Movie Title:</strong> <%= homeDto.getOwnMovie() != null ? homeDto.getOwnMovie() : "Not provided" %></p>
                    <p><strong>Image Uploaded:</strong> <%= homeDto.isImageUploaded() ? "Yes" : "No" %></p>
                </div>
            </div>
        </div>
    </div>
</div>

<%
    } else {
%>
    <div class="alert alert-warning mt-4">
        <h4>No profile data found. Please fill out the Home form first.</h4>
    </div>
<%
    }
%>

</body>
</html>