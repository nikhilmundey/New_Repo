<!DOCTYPE html>

<html lang="en">

<head>
    <link rel="stylesheet" href="app.css">
    <script src="https://code.jquery.com/jquery-3.4.1.min.js" crossorigin="anonymous"></script>
    <script src="app/js/app.js"></script>

</head>

<body>
        <div class="login-page">
            <div class="form">
                <h2>National Scholarship Portal</h2>
                Institute Home Page<br>
                Welcome, ${sessionScope.institute.instituteName}
                <form  action="view.lti" method="get" class="login-form" autocomplete="on">
<br>
                        <div class="row">
                                <div class="column">
                                    
                                    <a href="view.lti">Click here to view Details of Students</a>
                                    
                                </div>
                                <div class="column">

                                </div>
                                <div class="column">
                                    
                                </div>
                              </div>
                    </form>
</div>
</div>
</body>
</html>