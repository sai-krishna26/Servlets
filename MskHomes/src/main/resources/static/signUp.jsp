<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Sign Up</title>
    <style>
        /* From Uiverse.io by doniaskima */
        .btn-53,
        .btn-53 *,
        .btn-53 :after,
        .btn-53 :before,
        .btn-53:after,
        .btn-53:before {
          border: 0 solid;
          box-sizing: border-box;
        }

        .btn-53 {
          -webkit-tap-highlight-color: transparent;
          -webkit-appearance: button;
          background-color: #000;
          background-image: none;
          color: #fff;
          cursor: pointer;
          font-family: ui-sans-serif, system-ui, -apple-system, BlinkMacSystemFont,
            Segoe UI, Roboto, Helvetica Neue, Arial, Noto Sans, sans-serif,
            Apple Color Emoji, Segoe UI Emoji, Segoe UI Symbol, Noto Color Emoji;
          font-size: 100%;
          line-height: 1.5;
          margin: 0;
          -webkit-mask-image: -webkit-radial-gradient(#000, #fff);
          padding: 0;
        }

        .btn-53:disabled {
          cursor: default;
        }

        .btn-53:-moz-focusring {
          outline: auto;
        }

        .btn-53 svg {
          display: block;
          vertical-align: middle;
        }

        .btn-53 [hidden] {
          display: none;
        }

        .btn-53 {
          border: 1px solid;
          border-radius: 999px;
          box-sizing: border-box;
          display: block;
          font-weight: 900;
          overflow: hidden;
          padding: 1.2rem 3rem;
          position: relative;
          text-transform: uppercase;
        }

        .btn-53 .original {
          background: #fff;
          color: #000;
          display: grid;
          inset: 0;
          place-content: center;
          position: absolute;
          transition: transform 0.2s cubic-bezier(0.87, 0, 0.13, 1);
        }

        .btn-53:hover .original {
          transform: translateY(100%);
        }

        .btn-53 .letters {
          display: inline-flex;
        }

        .btn-53 span {
          opacity: 0;
          transform: translateY(-15px);
          transition: transform 0.2s cubic-bezier(0.87, 0, 0.13, 1), opacity 0.2s;
        }

        .btn-53 span:nth-child(2n) {
          transform: translateY(15px);
        }

        .btn-53:hover span {
          opacity: 1;
          transform: translateY(0);
        }

        .btn-53:hover span:nth-child(2) {
          transition-delay: 0.1s;
        }

        .btn-53:hover span:nth-child(3) {
          transition-delay: 0.2s;
        }

        .btn-53:hover span:nth-child(4) {
          transition-delay: 0.3s;
        }

        .btn-53:hover span:nth-child(5) {
          transition-delay: 0.4s;
        }

        .btn-53:hover span:nth-child(6) {
          transition-delay: 0.5s;
        }
    </style>

    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>

<body class="p-3 m-0 border-0 bd-example m-0 border-0">


<nav class="navbar bg-body-tertiary fixed-top">
    <div class="container-fluid">
        <a class="navbar-brand" href="index.html">MSK Homes</a>
        <button
                class="navbar-toggler"
                type="button"
                data-bs-toggle="offcanvas"
                data-bs-target="#offcanvasNavbar"
                aria-controls="offcanvasNavbar"
                aria-label="Toggle navigation"
        >
            <span class="navbar-toggler-icon"></span>
        </button>
        <div
                class="offcanvas offcanvas-end"
                tabindex="-1"
                id="offcanvasNavbar"
                aria-labelledby="offcanvasNavbarLabel"
        >
            <div class="offcanvas-header">
                <h5 class="offcanvas-title" id="offcanvasNavbarLabel">Index</h5>
                <button
                        type="button"
                        class="btn-close"
                        data-bs-dismiss="offcanvas"
                        aria-label="Close"
                ></button>
            </div>
            <div class="offcanvas-body">
                <ul class="navbar-nav justify-content-end flex-grow-1 pe-3">
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page" href="signIn.jsp"
                        >Sign In</a
                        >
                    </li>
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page" href="signUp.jsp"
                        >Sign Up</a
                        >
                    </li>
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page" href="feedback.jsp"
                        >Feedback</a
                        >
                    </li>
                </ul>
                <form class="d-flex mt-3" role="search">
                    <input
                            class="form-control me-2"
                            type="search"
                            placeholder="Still in development state"
                            aria-label="Search"
                    />
                    <button class="btn btn-outline-success" type="submit">
                        Search
                    </button>
                </form>
            </div>
        </div>
    </div>
</nav>





<h3>Sign Up</h3>
<br>
<form action="signUp" method="post">

    <h1><span style="color: green">${successMessage}</span></h1>

    <div class="input-group mb-3">
      <span class="input-group-text" id="basic-addon1">@</span>
      <input type="text" class="form-control"  name="username" placeholder="Username" >
    </div>

    <div class="form-floating mb-3">
      <input type="email" class="form-control" id="floatingInput" name="email" placeholder="name@example.com">
      <label for="floatingInput">Email address</label>
    </div>

    <div class="form-floating">
      <input type="password" class="form-control" id="floatingPassword" name="password" placeholder="Password">
      <label for="floatingPassword">Password</label>
    </div>
    <br>

    <div class="form-floating">
      <input type="Password" class="form-control" id="floatingConfirmPassword" name="confirmPassword" placeholder="Confirm Password">
      <label for="floatingConfirmPassword">Confirm Password</label>
    </div>

    <br>

    <button class="btn-53">
      <div class="original">Click Here</div>
      <div class="letters">

        <span>S</span>
        <span>i</span>
        <span>g</span>
        <span>n</span>
        <span>U</span>
        <span>p</span>
      </div>
    </button>

</form>

${message}
<br>
${important}
<br>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js"></script>
</body>
</html>

