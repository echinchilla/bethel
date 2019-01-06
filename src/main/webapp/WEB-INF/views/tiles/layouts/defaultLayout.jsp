<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <!-- Favicon icon -->
    <link rel="icon" type="image/png" sizes="16x16" href="<c:url value='/resources/images/favicon.png'/>"/>
    <title><tiles:getAsString name="title" /></title>
    <link href="<c:url value='/resources/css/bootstrap.min.css' />"  rel="stylesheet"/>
    <link href="<c:url value='/resources/css/helper.css' />" rel="stylesheet"/>
    <link href="<c:url value='/resources/css/style.css' />" rel="stylesheet"/>
</head>
 
<body class="fix-header fix-sidebar">
    <!-- Preloader - style you can find in spinners.css -->
    <div class="preloader">
        <svg class="circular" viewBox="25 25 50 50">
        <circle class="path" cx="50" cy="50" r="20" fill="none" stroke-width="2" stroke-miterlimit="10" /> </svg>
    </div>
    
    <!-- Main wrapper  -->
    <div id="main-wrapper">
        
        <!-- header header  -->
        <div class="header">
            <tiles:insertAttribute name="header" />
        </div>
        <!-- End header header -->
        
        <!-- Left Sidebar  -->
        <div class="left-sidebar">
            <tiles:insertAttribute name="menu" />
        </div>
        
        <!-- Page wrapper  -->
        <div class="page-wrapper">
            <tiles:insertAttribute name="body" />
        </div>
        <tiles:insertAttribute name="footer" />
    </div>
            <!-- All Jquery -->
            <script src="<c:url value='/resources/js/jquery.min.js' />"></script>
            <!-- Bootstrap tether Core JavaScript -->
            <script src="<c:url value='/resources/js/popper.min.js' />"></script>
            <script src="<c:url value='/resources/js/bootstrap.min.js' />"></script>
            <!-- slimscrollbar scrollbar JavaScript -->
            <script src="<c:url value='/resources/js/jquery.slimscroll.js' />"></script>
            <!--Menu sidebar -->
            <script src="<c:url value='/resources/js/sidebarmenu.js' />"></script>
            <!--stickey kit -->
            <script src="<c:url value='/resources/js/sticky-kit.min.js' />"></script>
            <!--Custom JavaScript -->
            <script src="<c:url value='/resources/js/scripts.js' />"></script>
</body>
</html>