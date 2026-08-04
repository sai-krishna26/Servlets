<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.net.URLEncoder" %>

<%
Double amount = (Double) request.getAttribute("amount");

String guestName = (String) request.getAttribute("guestName");
String roomType = (String) request.getAttribute("roomType");
String guestNo = (String) request.getAttribute("guestNo");
String checkIn = (String) request.getAttribute("checkIn");
String checkOut = (String) request.getAttribute("checkOut");

String upiId = "6363326263@slc";
String name = "Saikrishna Badiger";

String upiLink =
"upi://pay?pa=" + upiId +
"&pn=" + name +
"&am=" + amount +
"&cu=INR";

String qrUrl =
"https://api.qrserver.com/v1/create-qr-code/?size=250x250&data=" +
URLEncoder.encode(upiLink, "UTF-8");
%>

<!DOCTYPE html>
<html>

<head>

<title>Payment</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css"
      rel="stylesheet">

</head>

<body class="container mt-5">

<div class="card shadow p-4">

<h2 class="text-primary">Payment Details</h2>

<hr>

<h4>Guest Name : <%= guestName %></h4>

<h4>Room Type : <%= roomType %></h4>

<h4>Guests : <%= guestNo %></h4>

<h4>Check-In : <%= checkIn %></h4>

<h4>Check-Out : <%= checkOut %></h4>

<h4>UPI ID : <%= upiId %></h4>

<h3 class="text-danger">
Amount : ₹<%= amount %>
</h3>

<p>Scan the QR code below to complete the payment.</p>

<img src="<%= qrUrl %>" width="250" height="250" alt="UPI QR">

<br><br>

<form action="payment" method="post">

    <input type="hidden" name="guestName" value="<%= guestName %>">
    <input type="hidden" name="roomType" value="<%= roomType %>">
    <input type="hidden" name="guestNo" value="<%= guestNo %>">
    <input type="hidden" name="checkIn" value="<%= checkIn %>">
    <input type="hidden" name="checkOut" value="<%= checkOut %>">
    <input type="hidden" name="amount" value="<%= amount %>">

    <button type="submit" class="btn btn-success">
        I've Paid
    </button>

</form>

</div>

</body>
</html>