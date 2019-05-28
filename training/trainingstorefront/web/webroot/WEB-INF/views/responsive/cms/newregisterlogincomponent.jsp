<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <link href="css/style.css" rel='stylesheet' type='text/css' />
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
    <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700,800' rel='stylesheet' type='text.css'/>

</head>
<body>
<div class="main-newregister">
    <div class="header" >
        <h1>Login or Create a Free Account!!!</h1>
    </div>
    <p>Register Or Login on Site </p>
    <form>
        <ul class="left-form">
            <h2>New Account:</h2>
            <select>
                <option disabled>Please Select</option>
                <option value="">MRS</option>
                <option value="">MISS</option>
                <option value="">PRO</option>
            </select>
            <li>
                <input type="text"   placeholder="First Name" required/>
                <a href="#" class="icon ticker"> </a>
                <div class="clear"> </div>
            </li>
            <li>
                <input type="text"   placeholder="Last Name" required/>
                <a href="#" class="icon ticker"> </a>
                <div class="clear"> </div>
            </li>
            <li>
                <input type="text"   placeholder="Email" required/>
                <a href="#" class="icon ticker"> </a>
                <div class="clear"> </div>
            </li>
            <li>
                <input type="password"   placeholder="password" required/>
                <a href="#" class="icon into"> </a>
                <div class="clear"> </div>
            </li>
            <li>
                <input type="password"   placeholder="password" required/>
                <a href="#" class="icon into"> </a>
                <div class="clear"> </div>
            </li>
            <label class="checkbox"><input type="checkbox" name="checkbox" checked=""><i> </i>This is a sample consent description that will need to be updated or replaced, based on the valid registration consent required.
            </label>
            <p>To view other options or to change your settings, go to the Consent Management page in My Account.</p>
            <label class="checkbox"><input type="checkbox" name="checkbox" checked=""><i> </i>I am confirming that I have read and agreed with the Terms & Conditions
            </label>
            <input type="submit" onclick="myFunction()" value="Create Account">
            <div class="clear"> </div>
        </ul>


    </form>
    <form>
        <ul class="right-form">
            <h3>Login:</h3>
            <div>
                <li><input type="text"  placeholder="Username" required/></li>
                <li> <input type="password"  placeholder="Password" required/></li>
                <h4>I forgot my Password!</h4>
                <input type="submit" onclick="myFunction()" value="Login" >
            </div>
            <div class="clear"> </div>
        </ul>
        <div class="clear"> </div>
    </form>

</div>


</body>

</html>

