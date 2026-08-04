<%@ page contentType="text/html;charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title>Processing Payment</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css"
          rel="stylesheet">
    <script>
        setTimeout(function () {
            window.location.href = "success.jsp";
        }, 4000);
    </script>
</head>

<body>
<div class="container text-center mt-5">

   <div class="spinner-border text-primary"
            style="width:80px;height:80px;"
            role="status">
       </div>

       <h2 class="mt-3">
           Processing Payment...
       </h2>

<p>Please wait while we verify your payment.</p>

</body>
</html>