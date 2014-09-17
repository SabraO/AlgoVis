<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script src="<c:url value="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js" />"></script>
<script type="text/javascript">
$(document).ready(function() {
$("#butt").click(function(){
	var algo = "${algo}";
	if(algo=="insertion_sort"){
		$("#yes").text("yes");
	}
});
});
</script>
</head>
<body>
<div id = "yes">Holy</div>

<button id = "butt">Check</button>

</body>
</html>