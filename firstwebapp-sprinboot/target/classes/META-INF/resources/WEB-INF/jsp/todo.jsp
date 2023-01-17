
	<%@ include file="common/header.jspf" %>
	<%@ include file="common/navigation.jspf" %>
	
	<div class="container">
		<h1>Enter Todo details</h1>
		<form:form method="post" modelAttribute="todo">
		<fieldset class="mb-3">
			<form:label path="description">Description</form:label>
			<form:input type="text" path="description" name="description" required="required"/>
			<form:errors path="description" cssClass="text-warning"/>
		</fieldset class="mb-3">
		<fieldset>
			<form:label path="targetDate">Target Date</form:label>
			<form:input type="text" path="targetDate" name="description" required="required"/>
			<form:errors path="targetDate" cssClass="text-warning"/>
		</fieldset>
		
		
			<form:input type="hidden" path="id"	name="description"/>
			<form:input type="hidden" path="done" name="description"/>
			<input type="submit" class="btn btn-success"/>
		</form:form>
		
	</div>
	<%@ include file="common/footer.jspf" %>
	<script type="text/javascript">
	$('#targetDate').datepicker({
	    format: 'yyyy-mm-dd'
	});
	</script>
	



