<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
<link href="/style.css" rel="stylesheet" />
</head>
<body>

<main class="container">

		<article class="card mx-auto">

			<section class="card-header"></section>
			<section class="card-body">

				<form action="/recipes">
				<div class="form-group">
						<label>Search by Keyword</label> <input class="form-control"
							name="q" type="text" required />
					</div>
					
					
					
					
					
					
					
<div class="form-group">
						<label>Health Restrictions</label>
	<ul>
    <li class="dropdown">
        <a data-toggle="dropdown" class="dropdown-toggle">Health Restrictions<b class="caret"></b></a>
        <ul class="dropdown-menu">
            <li>
                <div class="checkbox">
                    <label>
                        <input type="checkbox" name="health" value="alcohol-free">Alcohol-Free
                    </label>
                </div>
            </li>
            <li>
                <div class="checkbox">
                    <label>
                        <input type="checkbox" name="health" value="celery-free">Celery-Free
                    </label>
                </div>
            </li>
             <li>
                <div class="checkbox">
                    <label>
                        <input type="checkbox" name="health" value="crustacean-free">Crustacean--Free
                    </label>
                </div>
            </li>
            <li>
                <div class="checkbox">
                    <label>
                        <input type="checkbox" name="health" value="dairy-free">Dairy-Free
                    </label>
                </div>
            </li>
            <li>
                <div class="checkbox">
                    <label>
                        <input type="checkbox" name="health" value="egg-free">Egg-Free
                    </label>
                </div>
            </li>
            <li>
                <div class="checkbox">
                    <label>
                        <input type="checkbox" name="health" value="fish-free">Fish-Free
                    </label>
                </div>
            </li>
            <li>
                <div class="checkbox">
                    <label>
                        <input type="checkbox" name="health" value="gluten-free">Gluten-Free
                    </label>
                </div>
            </li>
            <li>
                <div class="checkbox">
                    <label>
                        <input type="checkbox" name="health" value="keto">Keto
                    </label>
                </div>
            </li>
            <li>
                <div class="checkbox">
                    <label>
                        <input type="checkbox" name="health" value="kidney-friendly">Kidney Friendly
                    </label>
                </div>
            </li>
            <li>
                <div class="checkbox">
                    <label>
                        <input type="checkbox" name="health" value="kosher">Kosher
                    </label>
                </div>
            </li>
            <li>
                <div class="checkbox">
                    <label>
                        <input type="checkbox" name="health" value="low-potassium">Low Potassium
                    </label>
                </div>
            </li>
            <li>
                <div class="checkbox">
                    <label>
                        <input type="checkbox" name="health" value="lupine-free">Lupine-Free
                    </label>
                </div>
            </li>
            <li>
                <div class="checkbox">
                    <label>
                        <input type="checkbox" name="health" value="mustard-free">Mustard-Free
                    </label>
                </div>
            </li>
            <li>
                <div class="checkbox">
                    <label>
                        <input type="checkbox" name="health" value="No-oil-added">No Oil Added
                    </label>
                </div>
            </li>
            <li>
                <div class="checkbox">
                    <label>
                        <input type="checkbox" name="health" value="low-sugar">No-Sugar
                    </label>
                </div>
            </li>
            <li>
                <div class="checkbox">
                    <label>
                        <input type="checkbox" name="health" value="paleo">Paleo
                    </label>
                </div>
            </li>
            <li>
                <div class="checkbox">
                    <label>
                        <input type="checkbox" name="health" value="peanut-free">Peanut-Free
                    </label>
                </div>
            </li>
            <li>
                <div class="checkbox">
                    <label>
                        <input type="checkbox" name="health" value="pecatarian">Pescatarian
                    </label>
                </div>
            </li>
            <li>
                <div class="checkbox">
                    <label>
                        <input type="checkbox" name="health" value="pork-free">Pork-Free
                    </label>
                </div>
            </li>
            <li>
                <div class="checkbox">
                    <label>
                        <input type="checkbox" name="health" value="red-meat-free">Red Meat-Free
                    </label>
                </div>
            </li>
            <li>
                <div class="checkbox">
                    <label>
                        <input type="checkbox" name="health" value="seasame-free">Seasame-Free
                    </label>
                </div>
            </li>
            <li>
                <div class="checkbox">
                    <label>
                        <input type="checkbox" name="health" value="shellfish-free">Shellfish-Free
                    </label>
                </div>
            </li>
            <li>
                <div class="checkbox">
                    <label>
                        <input type="checkbox" name="health" value="soy-free">Soy-Free
                    </label>
                </div>
            </li>
            <li>
                <div class="checkbox">
                    <label>
                        <input type="checkbox" name="health" value="sugar-conscious">Sugar-Conscious
                    </label>
                </div>
            </li>
            <li>
                <div class="checkbox">
                    <label>
                        <input type="checkbox" name="health" value="tree-nut-free">Tree-Nut-Free
                    </label>
                </div>
            </li>
            <li>
                <div class="checkbox">
                    <label>
                        <input type="checkbox" name="health" value="vegan">Vegan
                    </label>
                </div>
            </li>
            <li>
                <div class="checkbox">
                    <label>
                        <input type="checkbox" name="health" value="vegetarian">Vegetarian
                    </label>
                </div>
            </li>
             <li>
                <div class="checkbox">
                    <label>
                        <input type="checkbox" name="health" value="wheat-free">Wheat-Free
                    </label>
                </div>
            </li>
        </ul>
    </li>
</ul>
</div>
					
					
					
					
					
					
					

					<div class="form-group">
		 <label class="my-1 mr-2" for="inlineFormCustomSelectPref">Calories</label>
  			<select name="calories" class="custom-select my-1 mr-sm-2" id="inlineFormCustomSelectPref">
    			<option selected>Choose...</option>
    			<option value="250">250</option>
    			<option value="500">500</option>
    			<option value="750">750</option>
  			</select>
					</div>

					<button class="btn btn-block btn-secondary">Submit</button>

				</form>


			</section>


		</article>

	</main>



<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>