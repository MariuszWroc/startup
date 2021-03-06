<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html lang="en" ng-app="StarterApp">
	<head>
		<title>Hack and slash MMO game</title>
		<c:set var="contextPath" value="${pageContext.request.contextPath}" />
		<link rel="stylesheet" type="text/css" href="${contextPath}/resources/css/home.css">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
		<link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/angular_material/0.9.4/angular-material.min.css">
		<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=RobotoDraft:300,400,500,700,400italic">
        <link rel="stylesheet" type="text/css" href="${contextPath}/resources/css/common.css">
		<meta name="viewport" content="initial-scale=1" />
	</head>
	<body layout="column" ng-app="StarterApp" ng-controller="AppCtrl">
		<div id="wrapper">
			<div id="headerwrap">
				<div id="header">
					<div ng-include = "'${contextPath}/header'"></div>
				</div>
			</div>
			<div id="leftcolumnwrap">
				<div id="leftcolumn">
					<div ng-include = "'${contextPath}/left'"></div>				
				</div>
			</div>
			<div id="contentwrap">
				<div id="content">
					<md-content layout="column" flex class="md-padding">
						<div ng-view align="center"></div>
					</md-content>
				</div>
			</div>
				<div ng-include = "'${contextPath}/footer'"></div>
		</div>
                <!-- Javascripts are always put last in body that way the page will render even if the scripts wont load-->
                <script
			src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
		<script
			src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular-route.min.js"></script>
		<!--     Angular Material Dependencies -->
		<script
			src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular-animate.min.js"></script>
		<script
			src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular-aria.min.js"></script>
		<script src="https://ajax.googleapis.com/ajax/libs/angular_material/0.9.4/angular-material.min.js"></script>
                <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
                <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
		<script src="${contextPath}/resources/js/app.js"></script>
		<script src="${contextPath}/resources/js/menuController.js"></script>
		<script src="${contextPath}/resources/js/registerController.js"></script>
		<script src="${contextPath}/resources/js/userController.js"></script>
		<script src="${contextPath}/resources/js/heroController.js"></script>
		<script src="${contextPath}/resources/js/gameController.js"></script>
		<script src="${contextPath}/resources/js/emailController.js"></script>
        <script src="${contextPath}/resources/js/dialogController.js"></script>
	</body>
</html>