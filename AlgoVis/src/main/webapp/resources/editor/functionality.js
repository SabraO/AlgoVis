$(document).ready(function(){
	 $("#algo-submit").click(function(){
		var editor = ace.edit("editor");
		var content = editor.getValue();
		if(!content){//If the user does not enter anything in the editor
			$("#nocode-submit-error").modal();
		}
		else{
			$.ajax({  
		        type : "POST",  
		        url : "handle",  
		        data : { 
		        	content : content
		        },  
		        success: function(data){
		        	if(data){
		        		var algorithm = data;
		        		window.location = "animate?&algorithm="+ algorithm;     
		        	}
		        	else{
		        		$("#wrongcode-submit-error").modal();
		        	}
		        } 
		    });  
	 }
  });
});