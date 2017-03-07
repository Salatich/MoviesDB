<%@ page language="java" contentType="text/html; charset=utf8"
	pageEncoding="utf8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	 <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Bootstrap -->
    <link href="${webappRoot}/css/bootstrap.min.css" rel="stylesheet" media="screen">
	<title><spring:message code="label.title" /></title>
</head>
<body>

<a href="<c:url value="/logout" />">
	<spring:message code="label.logout" />
</a>
  
<h2><spring:message code="label.title" /></h2>

<form:form method="post" action="add" commandName="movie">

	<table>
		<tr>
			<td><form:label path="name">
				<spring:message code="label.name" />
			</form:label></td>
			<td><form:input path="name" /></td>
		</tr>
		<tr>
			<td><form:label path="genre">
				<spring:message code="label.genre" />
			</form:label></td>
			<td><form:input path="genre" /></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit"
				value="<spring:message code="label.addmovie"/>" /></td>
		</tr>
	</table>
</form:form>

<h3><spring:message code="label.movies" /></h3>
<c:if test="${!empty movieList}">
	<table class="data">
		<tr>
			<th><spring:message code="label.id" /></th>
			<th><spring:message code="label.name" /></th>
			<th><spring:message code="label.genre" /></th>
			<th>&nbsp;</th>
		</tr>
		<c:forEach items="${movieList}" var="movie">
			<tr>
			    <td>${movie.id}</td>
				<td>${movie.name}</td>
				<td>${movie.genre}</td>
				<td><a href="delete/${movie.id}"><spring:message code="label.delete" /></a></td>
			</tr>
		</c:forEach>
	</table>
</c:if>
  <script src="http://code.jquery.com/jquery.js"></script>
    <script src=" ${webappRoot}/js/bootstrap.min.js"></script>
</body>
</html>