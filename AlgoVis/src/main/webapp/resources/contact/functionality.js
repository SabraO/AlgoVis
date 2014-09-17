$(document).ready(function(){
	  $("#opinion-submit").click(function(){
		  var name = $("#contact_name").val();
		  var email = $("#contact_email").val();
		  var opinion = $("#contact_message").val();
		  
		  if((!name)|| (!email) || (!opinion)){
			  $("#opinion-submit-error").modal();
		  }
		  else{
			  $.ajax({  
			        type : "POST",  
			        url : "contact",  
			        data : { 
			        	name : name,
			        	email : email,
			        	opinion : opinion
			        },  
			        success: function(response){
			        	$("#opinion-submit-success").modal();
			        } 
			  });  
		  }
	  });
	});