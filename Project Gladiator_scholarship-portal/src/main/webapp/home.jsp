<!DOCTYPE html>
<html>
   <!--   <link rel="stylesheet" href="codepen.css">-->
<head>
<style>
.container {
    display: grid;
    width: 950px;
    height: 650px;
    grid-template-columns: 200px 1fr 1fr;
    grid-template-rows: 80px 1fr 1fr 100px;
    grid-gap: 1rem;
  }
  
  .header {
    grid-row: 1 / 2;
    grid-column: 1 / 4;
  }
  
  .sidebar {
    grid-row: 2 / 4;
    grid-column: 1 / 2;
  }
  
  .content-1 {
    grid-row: 2 / 3;
    grid-column: 2 / 4;
  }
  
  .content-2 {
    grid-row: 3 / 4;
    grid-column: 2 / 3;
  }
  
  .content-3 {
    grid-row: 3 / 4;
    grid-column: 3 / 4;
  }
  
  /* OTHER STYLES */
  
  body {
    padding: 200px;
    background-color:rgb(146, 220, 250);
    display: flex;
    justify-content: center;
    padding: 20px;
    font-family: -apple-system, BlinkMacSystemFont, "Segoe UI", Roboto, Helvetica, Arial, sans-serif, "Apple Color Emoji", "Segoe UI Emoji", "Segoe UI Symbol";
  }
  
  .item {
    background-color: white;
    box-shadow: 0 10px 20px rgba(0,0,0,0.19), 0 6px 6px rgba(0,0,0,0.23);
    color: black;
    border-radius: 4px;
    border: 2px solid #171717;
    display: flex;
    justify-content: center;
    align-items: center;
    font-size: 18px;
    font-weight: bold;
  }

  body {
    margin: 0;
    font-family: 'Times New Roman', Times, serif;
  }
  
  .topnav {
    overflow: hidden;
    background-color: white;
  }
  
  .topnav a {
    float: left;
    display: block;
    color: black;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
    font-size: 17px;
  }
  
  .topnav a:hover {
    background-color: #ddd;
    color: black;
  }
  
  .topnav a.active {
    background-color: black;
    color: white;
  }
  
  .topnav .icon {
    display: none;
  }
  
  @media screen and (max-width: 600px) {
    .topnav a:not(:first-child) {display: none;}
    .topnav a.icon {
      float: right;
      display: block;
    }
  }
  
  @media screen and (max-width: 600px) {
    .topnav.responsive {position: relative;}
    .topnav.responsive .icon {
      position: absolute;
      right: 0;
      top: 0;
    }
    .topnav.responsive a {
      float: none;
      display: block;
      text-align: left;
    }
  }
</style>
</head>
<body>
<div class="container">
       <!-- <container>
         <header align="center" style="display: block; border : 2px; ">NATIONAL SCHOLARSHIP PORTAL</header>
       </container> -->
    
        <div class="item header"><div class="topnav" id="myTopnav">

                <a href="home.jsp" class="active">Home</a>
                <a href="studentregister.lti">Student Registration</a>
                <a href="instregister.jsp">Institute Registration</a>
                <a href="javascript:void(0);" class="icon" onclick="myFunction()">
                  <i class="fa fa-bars"></i>
                </a>
              </div></div>
        <div class="item sidebar">
            <ul>
          <li><a href="studentlogin.jsp">Student Login</a></li>
          <li> <a href="institutelogin.jsp">Institute Login</a></li>
          <li><a href="statenodallogin.jsp">State Nodal Login</a></li>
          <li> <a href="ministrylogin.jsp">Ministry Login</a></li>
        </ul>
        </div>
        <div class="item content-1" >
          
          <p>Our portal allows students to connect directly to the government system,
             wherein they can browse through all the available scholarships and avail these schemes. 
             This system as a part of government schema will ensure that scholarship will be granted 
             to the students by checking various criteria as per the scholarships available.</p>
        </div>
        <div class="item content-2">Latest update</div>
        <div class="item content-3">Helpdesk</br>
          Contact - 9527542676</br>
          Email - Some.mail@lntinfotech.com
        </div>
</div>
</body>
</html>