<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<t:page>
	<jsp:attribute name="title">Recipe Information</jsp:attribute>
	<jsp:attribute name="name">Recipe Information</jsp:attribute>
	<jsp:body>
<div class="accordion" id="accordionExample">
  <div class="card">
    <div class="card-header" id="headingOne">
      <h2 class="mb-0">
        <button class="btn btn-link btn-block text-left" type="button" data-toggle="collapse" data-target="#collapseOne" aria-expanded="true" aria-controls="collapseOne">
          <c:forEach var="recipe" items="${recipes}">
          <c:out value="${recipe.label}"></c:out> Recipe Information
          </c:forEach>
        </button>
      </h2>
    </div>

    <div id="collapseOne" class="collapse show" aria-labelledby="headingOne" data-parent="#accordionExample">
      <div class="card-body">
      <ul>
       <c:forEach var="recipe" items="${recipes}">
       		<c:forEach var="ingredient" items="${recipe.ingredients}">
       			<li><c:out value="${ingredient.text}"></c:out></li>
       		</c:forEach>
       </c:forEach>
       </ul>
      </div>
    </div>
  </div>
  <div class="card">
    <div class="card-header" id="headingTwo">
      <h2 class="mb-0">
        <button class="btn btn-link btn-block text-left collapsed" type="button" data-toggle="collapse" data-target="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">
          Calories
        </button>
      </h2>
    </div>
    <div id="collapseTwo" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionExample">
      <div class="card-body">
      <c:forEach var="recipe" items="${recipes}">
      <p>Total Calories = <fmt:formatNumber value="${recipe.calories}" type="number" pattern="###,###.##"></fmt:formatNumber></p>
      </c:forEach>
      </div>
    </div>
  </div>
  <div class="card">
    <div class="card-header" id="headingThree">
      <h2 class="mb-0">
        <button class="btn btn-link btn-block text-left collapsed" type="button" data-toggle="collapse" data-target="#collapseThree" aria-expanded="false" aria-controls="collapseThree">
          Total Daily Nutrients
        </button>
      </h2>
    </div>
    <div id="collapseThree" class="collapse" aria-labelledby="headingThree" data-parent="#accordionExample">
      <div class="card-body">
      		<table class="table">
  				<thead class="thead-dark">
  					<tr>
  					<th>Energy</th>
  					<th>Fat</th>
  					<th>Cholesterol</th>
  					<th>Carbs</th>
  					<th>Fiber</th>
  					<th>Protein</th>
  					</tr>
  			</thead>
  			<tbody>
  				<tr>
  				<c:forEach var="recipe" items="${recipes}">
  					<td><fmt:formatNumber value="${recipe.totalDaily.energy.quantity}" type="number" pattern="###.##"></fmt:formatNumber></td>
  					<td><fmt:formatNumber value="${recipe.totalDaily.fat.quantity}" type="number" pattern="###.##"></fmt:formatNumber></td>
  					<td><fmt:formatNumber value="${recipe.totalDaily.cholesterol.quantity}" type="number" pattern="###.##"></fmt:formatNumber></td>
  					<td><fmt:formatNumber value="${recipe.totalDaily.carbs.quantity}" type="number" pattern="###.##"></fmt:formatNumber></td>
  					<td><fmt:formatNumber value="${recipe.totalDaily.fiber.quantity}" type="number" pattern="###.##"></fmt:formatNumber></td>
  					<td><fmt:formatNumber value="${recipe.totalDaily.protein.quantity}" type="number" pattern="###.##"></fmt:formatNumber></td>
  				</c:forEach>
  				</tr>
  			</tbody>
		</table>
      </div>
    </div>
  </div>
    <div class="card">
    <div class="card-header" id="headingFour">
      <h2 class="mb-0">
        <button class="btn btn-link btn-block text-left" type="button" data-toggle="collapse" data-target="#collapseFour" aria-expanded="true" aria-controls="collapseFour">
          OG Source
        </button>
      </h2>
    </div>

    <div id="collapseFour" class="collapse show" aria-labelledby="headingFour" data-parent="#accordionExample">
      <div class="card-body">
      <c:forEach var="recipe" items="${recipes}">
      <a href="${recipe.shareAs}" class="btn btn-primary">Link to original source</a>
      </c:forEach>
      </div>
    </div>
  </div>
</div>
	</jsp:body>
</t:page>