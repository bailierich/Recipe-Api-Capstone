<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>

<t:page>
	<jsp:attribute name="title">Homepage</jsp:attribute>
	<jsp:attribute name="name">Homepage</jsp:attribute>
	<jsp:body>
		<form action="/recipes">
			<div class="accordion" id="accordionExample">
				<div class="card">
					<div class="card-header" id="headingOne">
						<h2 class="mb-0">
							<button class="btn btn-link btn-block text-left" type="button" data-toggle="collapse" data-target="#collapseOne" aria-expanded="true" aria-controls="collapseOne">
								Search By Keyword
							</button>
						</h2>
					</div>
					<div id="collapseOne" class="collapse show" aria-labelledby="headingOne" data-parent="#accordionExample">
						<div class="card-body">
							<input class="form-control" name="q" type="text" required />
						</div>
					</div>
				</div>
				<div class="card">
					<div class="card-header" id="headingTwo">
						<h2 class="mb-0">
							<button class="btn btn-link btn-block text-left collapsed" type="button" data-toggle="collapse" data-target="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">
								Health Restrictions
							</button>
						</h2>
					</div>
					<div id="collapseTwo" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionExample">
						<div class="card-body">
							<div class="checkbox">	<label>
								<input type="checkbox" name="health" value="alcohol-free"> Alcohol-Free
							</label>
						</div>
						<div class="checkbox">
							<label>
								<input type="checkbox" name="health" value="peanut-free"> Peanut-Free
							</label>
						</div>
						<div class="checkbox">
							<label>
								<input type="checkbox" name="health" value="sugar-conscious"> Sugar-Conscious
							</label>
						</div>
						<div class="checkbox">
							<label>
								<input type="checkbox" name="health" value="tree-nut-free"> Tree-Nut-Free
							</label>
						</div>
						<div class="checkbox">
							<label>
								<input type="checkbox" name="health" value="vegan"> Vegan
							</label>
						</div>
						<div class="checkbox">
							<label>
								<input type="checkbox" name="health" value="vegetarian"> Vegetarian
							</label>
						</div>
					</div>
				</div>
				</div>
				<div class="card">
					<div class="card-header" id="headingThree">
						<h2 class="mb-0">
							<button class="btn btn-link btn-block text-left collapsed" type="button" data-toggle="collapse" data-target="#collapseThree" aria-expanded="false" aria-controls="collapseThree">
								Calories
							</button>
						</h2>
					</div>
					<div id="collapseThree" class="collapse" aria-labelledby="headingThree" data-parent="#accordionExample">
						<div class="card-body">
							<select name="calories" class="custom-select my-1 mr-sm-2" id="inlineFormCustomSelectPref">
								<option >Choose...</option>
								<option value="250">250</option>
								<option value="500">500</option>
								<option value="750">750</option>
							</select>
						</div>
					</div>
				</div>
			</div>
			<button class="btn btn-block btn-secondary">Submit</button>
		</form>
	</jsp:body>
</t:page>