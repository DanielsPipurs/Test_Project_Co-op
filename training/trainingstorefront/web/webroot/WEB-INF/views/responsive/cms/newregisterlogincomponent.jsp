<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags" %>


<%--<%@ taglib prefix="formElement" tagdir="/WEB-INF/tags/responsive/formElement"%>--%>


<html>
<head>
    <meta charset="utf-8">
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

<spring:htmlEscape defaultHtmlEscape="true" />

<c:set var="hideDescription" value="checkout.login.loginAndCheckout" />

<div class="login-page__headline">
    <spring:theme code="login.title" />
</div>

<c:if test="${actionNameKey ne hideDescription}">
    <p>
        <spring:theme code="login.description" />
    </p>
</c:if>

<form:form action="${action}" method="post" commandName="loginForm">
    <c:if test="${not empty message}">
		<span class="has-error"> <spring:theme code="${message}" />
		</span>
    </c:if>

    <formElement:formInputBox idKey="j_username" labelKey="login.email"
                              path="j_username" mandatory="true" />
    <formElement:formPasswordBox idKey="j_password"
                                 labelKey="login.password" path="j_password" inputCSS="form-control"
                                 mandatory="true" />

    <div class="forgotten-password">
        <ycommerce:testId code="login_forgotPassword_link">
            <a href="#" data-link="<c:url value='/login/pw/request'/>" class="js-password-forgotten" data-cbox-title="<spring:theme code="forgottenPwd.title"/>">
                <spring:theme code="login.link.forgottenPwd" />
            </a>
        </ycommerce:testId>
    </div>
    <ycommerce:testId code="loginAndCheckoutButton">
        <button type="submit" class="btn btn-primary btn-block">
            <spring:theme code="${actionNameKey}" />
        </button>
    </ycommerce:testId>


    <c:if test="${expressCheckoutAllowed}">
        <button type="submit" class="btn btn-default btn-block expressCheckoutButton"><spring:theme code="text.expresscheckout.header" /></button>
        <input id="expressCheckoutCheckbox" name="expressCheckoutEnabled" type="checkbox" class="form left doExpressCheckout display-none" />
    </c:if>

</form:form>



</body>

</html>


