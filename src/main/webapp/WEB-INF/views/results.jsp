<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<t:page>
	<jsp:attribute name="title">Recipes</jsp:attribute>
	<jsp:attribute name="name">Recipes</jsp:attribute>
	<jsp:body>
		<table class="table">
  			<thead class="thead-dark">
    			<tr>
      				<th scope="col">Image</th>
      				<th scope="col">Yield</th>
      				<th scope="col">Title</th>
      				<th scope="col">Energy</th>
      				<th scope="col">Nutrients</th>
      				<th></th>
    			</tr>
  			</thead>
  			<tbody>
  				<c:forEach var="result" items="${results}">
    				<tr>
      					<td><img src="${result.recipe.image}" /></td>
       					<td>${result.recipe.yield} Servings</td>
      					<td><a href="/recipe-details?uri=${result.recipe.uri}"><c:out value="${result.recipe.label }"></c:out></a></td>
      					<td><c:out value="${result.recipe.totalNutrients.energy}"></c:out></td>
      					<td>
      					<p>Protein ${result.recipe.totalNutrients.protein}</p>
      					<p>Fat ${result.recipe.totalNutrients.fat}</p>
      					<p>Carbs ${result.recipe.totalNutrients.carbs}</p>
      					</td>
      					<td><a href="/add-to-favorites?uri=${result.recipe.uri}&label=${result.recipe.label }" class="btn btn-secondary">Add To Favorites</a></td>
    				</tr>
				</c:forEach>
  			</tbody>
		</table>
		<a href="/favorites" class="btn btn-secondary">Favorites</a>
		<a href="/" class="btn btn-secondary">Search</a>
	</jsp:body>
</t:page>