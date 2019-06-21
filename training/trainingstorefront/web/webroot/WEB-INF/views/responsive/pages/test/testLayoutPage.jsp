<%--
  Created by IntelliJ IDEA.
  User: daniels
  Date: 5/29/19
  Time: 2:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template" %>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="common" tagdir="/WEB-INF/tags/responsive/common" %>


<template:page pageTitle="${pageTitle}">
    <div id="globalMessages">
        <common:globalMessages/>
    </div>
    <cms:pageSlot position="testParagraph" var="feature" element="div" class="testBannerParagraph">
        <cms:component component="${feature}" />
    </cms:pageSlot>


    <div>
        <cms:pageSlot position="testBotBanner" var="feature" element="div" class="testBotBanner">
            <cms:component component="${feature}" />
        </cms:pageSlot>
    </div>
    <div>
        <cms:pageSlot position="testBotBanner2" var="feature" element="div" class="testBotBanner2">
            <cms:component component="${feature}" />
        </cms:pageSlot>
    </div>



</template:page>

