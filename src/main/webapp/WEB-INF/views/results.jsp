<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Results</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
<link href="/style.css" rel="stylesheet" />
</head>
<body>

<table class="table">
  <thead class="thead-dark">
    <tr>
      <th scope="col">Image</th>
      <th scope="col">Yield</th>
      <th scope="col">Title</th>
      <th scope="col">Energy</th>
      <th scope="col">Nutrients</th>
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
    </tr>
</c:forEach>
  </tbody>
</table>






</body>
</html>