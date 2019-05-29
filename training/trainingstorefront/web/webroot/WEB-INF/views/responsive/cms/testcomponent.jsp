<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<c:url value="${fn:escapeXml(urlLink)}" var="encodedUrl" />

<div class="testcomponent">
<p class="compText">${compText}</p>
<img alt="test img" src="${img.url}" class="test_img">
<button type="button" onClick="window.location.href='${url}'">${buttonText}</button>

<p class="customOffersComponent_header_text">${footerText}</p>
</div>