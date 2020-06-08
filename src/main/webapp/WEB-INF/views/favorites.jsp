<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<t:page>
	<jsp:attribute name="title">Favorites</jsp:attribute>
	<jsp:attribute name="name">Favorites</jsp:attribute>
	<jsp:body>
	<table class="table">
  			<thead class="thead-dark">
    			<tr>
    				<th>Favorites</th>
    				<th></th>
    				<th></th>
    			</tr>
  			</thead>
  			<tbody>
  			<c:forEach var = "favorite" items="${favorites }">
  				<tr>
      				<td><a href="/recipe-details?uri=<c:url value="${favorite.uri} " />"><c:out value="${favorite.recipeLabel}" /></a></td>
      				<td><a  href="/delete-favorite?id=${favorite.id}" class="btn btn-danger">Delete</a></td>
      			</tr>
      		</c:forEach>
  			</tbody>
	</table>
	<a href="/" class="btn btn-secondary">Search</a>
	<a href="/recipes" class="btn btn-secondary">Back to Results</a>
	
	
	
	
	
	</jsp:body>
</t:page>