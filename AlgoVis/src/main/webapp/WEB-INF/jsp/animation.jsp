<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>

	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>AlgoVis</title>
		
	<!-- Js -->
		<script src="<c:url value="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js" />"></script>
		<script src="<c:url value="/resources/animation/js/common.js" />"></script>
		<script src="<c:url value="/resources/animation/js/d3.v3.js" />"></script>
		<script src="<c:url value="/resources/animation/js/jquery-1.10.2.js" />"></script>
		<script src="<c:url value="/resources/animation/js/jquery-ui.js" />"></script>
		<script src="<c:url value="/resources/animation/js/sorting_actions.js" />"></script>
		<script src="<c:url value="/resources/animation/js/SortingWidget.js" />"></script>
		<script src="<c:url value="/resources/animation/js/viz.js" />"></script>
	<!-- End Js -->
	
	<!-- Css-->
		<link href="<c:url value='/resources/animation/css/normalize.css' />" rel="stylesheet">
		<link href="<c:url value='/resources/animation/css/viz.css' />" rel="stylesheet">
		<link href="<c:url value='/resources/animation/css/sorting.css' />" rel="stylesheet">
		<link href="<c:url value='/resources/animation/css/main.css' />" rel="stylesheet">
	<!-- End Css -->

</head>

<body>
	<!-- Navigation To Home-->
    <nav>
        <ul>
           	<li>
           		<a id = "back-to-home" href="/AlgoVis/home">Home</a>
           	</li>
        </ul>
    </nav>
   	<!-- End Navigation To Home -->
   	
   	<!-- Visualization Canvas -->
    <div id="viz" >
    
    	<!-- Educational Information -->
			<aside id = "side">
				<p><a id="analysis" class="submit">Analysis</a></p>
	            <p><a id="pseudo" class="submit">Pseudocode</a></p>
	            <p><a id="variant" class="submit">Variant</a></p>
			
			<div id = "algo-title"></div>
			
			<div id = "educational-info"></div>
			</aside>
			
		<!-- End Educational Information -->
		
    	<svg id="viz-canvas" height="490" width="500">
			<g transform="translate(125, 216.2)">
				<rect height="13.799999999999999" width="45"></rect>
				<text dy=".35em" x="22.5" y="-15" >4</text>
			</g>
			<g transform="translate(175, 27.599999999999994)">
				<rect height="202.4" width="45"></rect>
				<text dy=".35em" x="22.5" y="187.4">43</text>
			</g>
			<g transform="translate(225, 55.19999999999999)">
				<rect height="174.8" width="45"></rect>
				<text dy=".35em" x="22.5" y="159.8">37</text>
			</g>
			<g transform="translate(275, 207)">
				<rect height="23" width="45"></rect>
				<text dy=".35em" x="22.5" y="-15">5</text>
			</g>
			<g transform="translate(325, 13.799999999999983)">
				<rect height="216.20000000000002" width="45"></rect>
				<text dy=".35em" x="22.5" y="201.20000000000002">48</text>
			</g>
			<g transform="translate(375, 161)">
				<rect height="69" width="45"></rect>
				<text dy=".35em" x="22.5" y="54">13</text>
			</g>
			<g transform="translate(425, 64.4)">
				<rect height="165.6" width="45"></rect>
				<text dy=".35em" x="22.5" y="150.6">35</text>
			</g>
			<g transform="translate(475, 110.39999999999999)">
				<rect height="119.60000000000001" width="45"></rect>
				<text dy=".35em" x="22.5" y="104.60000000000001">24</text>
			</g>
			<g transform="translate(525, 105.8)">
				<rect height="124.2" width="45"></rect>
				<text dy=".35em" x="22.5" y="109.2">26</text>
			</g>
			<g transform="translate(575, 220.8)">
				<rect height="9.200000000000001" width="45"></rect>
				<text dy=".35em" x="22.5" y="-15">1</text>
			</g>
		</svg><br>
		
    	<svg id="viz-counting-sort-secondary-canvas" height="60" width="500"></svg>
    	
    	
    </div>
    <!-- End Visualization Canvas -->
    	
    <!-- Action Panel -->
    <div id="actions" class="panel">
    	<p id="create">Create</p>
        <p id="sort">Sort</p>
    </div>
    
    <div id="actions-hide" class="panel-hide">
    	<img src="./resources/animation/img/arrow_white_right.png" title="show/hide actions panel" class="rotateRight">
    </div>
    
    <div id="actions-extras">
    	<div id = "action-options" class="create action-menu-pullout">
    		<div id="create-userdefined-input" class="new-menu-option">
    			<input type="text" id="userdefined-input" title="Enter a list of numbers between 0 and 100, separated by commas." autocomplete="off"></div>
            <div id="create-userdefined-go" class="execAction new-menu-option coloured-menu-option"><p>GO</p></div>
    	</div>
        
        <div id = "sort-menu" class="sort action-menu-pullout">
        	<div id="sort-go" class="execAction new-menu-option coloured-menu-option" onclick="sort()"><p>GO</p></div>
        </div>
    </div>
    <!-- End Action Panel -->
    
	<!-- Background Specifics -->
	<div id="left-bar"></div>
	<div id="right-bar"></div>
	
	<div id="speed-control">slow<div id="speed-input" class="ui-slider ui-slider-horizontal ui-widget ui-widget-content ui-corner-all" area-disabled="false"></div>fast</div>
	
	<div id="dark-overlay"></div>
	<!-- End Background Specifics -->
		
	<!-- Animation Specifics Js-->
	<script type="text/javascript">
		
		//initialization
		var sortingWidget = new Sorting();
		
		$(document).ready(function() {
			hideAllSubmenus();
			showStandardCanvas();
			var algo = "${algo}";
			
			if(algo=="insertion sort"){
				changeSortType(sortingWidget.insertionSort);
			}
			else if(algo=="bubble sort"){
				changeSortType(sortingWidget.bubbleSort);
			}
			else if(algo=="selection sort"){
				changeSortType(sortingWidget.selectionSort);
			}
			else if(algo=="quick sort"){
				changeSortType(sortingWidget.quickSort);
			}
			else if(algo=="counting sort"){
				$("#viz-counting-sort-secondary-canvas").show();
				changeSortType(sortingWidget.countingSort, "4,3,1,2,9,8,2,4,4,6,7,9");
			}
			
			
			 
			 $("#algo-title").text(algo.toUpperCase());
			 
			 $("#analysis").click(function(){
			 	$.ajax({  
					type : "POST",  
				    url : "analysis",  
				    data : { 
				    	content : algo
				    },  
				    success: function(data){
				    	$("#educational-info").text(data);
				    } 
				});  
			 });
			 $("#pseudo").click(function(){
				 	$.ajax({  
						type : "POST",  
					    url : "pseudo",  
					    data : { 
					    	content : algo
					    },  
					    success: function(data){
					    	$("#educational-info").text(data);
					    } 
					});  
			 });
			 $("#variant").click(function(){
				 	$.ajax({  
						type : "POST",  
					    url : "variant",  
					    data : { 
					    	content : algo
					    },  
					    success: function(data){
					    	$("#educational-info").text(data);
					    } 
					});  
			 });
		});
	
		//sorting depending on the type of algorithm
		function changeSortType(newSortingFunction, customNumberList) {
			if(!customNumberList)
				$('#userdefined-input').val("4,43,37,5,48,13,35,24,26,1");
			else
				$('#userdefined-input').val(customNumberList);
			createList('userdefined');
	
			if(isPlaying) {	stop(); }
			showActionsPanel();
			hideStatusPanel();
			hideCodetracePanel();
			sortingWidget.clearPseudocode();
			sortingWidget.setSelectedSortFunction(newSortingFunction);
		}
	
		function createList(type) {
			if(isPlaying) { stop(); }
			setTimeout( function() {
				if((mode=="exploration") && sortingWidget.createList(type)) {
					closeCreate();
					isPlaying = false;
				}
			}, 500)
		}
	
		function sort() {
			sortingWidget.useEnhancedBubbleSort = $('#sort-bubble-enhanced-checkbox').prop('checked');
			sortingWidget.computeInversionIndex = $('#sort-bubble-merge-inversion-checkbox').prop('checked');
	
			if(isPlaying) {	stop(); }
			setTimeout( function() {
				if((mode=="exploration") && sortingWidget.sort()) {
					$('#current-action').show();
					triggerRightPanels();
					isPlaying = true;
				}
			}, 500);
		}
	
		//submenu 
		var lastSubmenuShown = null;
		
		function triggerSubmenu(which) {
			hideAllSubmenus();
			if(lastSubmenuShown == which) {
				lastSubmenuShown = null;
				return;
			}
	
			lastSubmenuShown = which;
			
			$(".create").css("bottom", "60px");
			if(which == "sorted") {
				$("#create-sorted-increasing").show();
				$("#create-sorted-decreasing").show();
			}
			else if(which == "nearly-sorted") {
				$("#create-nearly-sorted-increasing").show();
				$("#create-nearly-sorted-decreasing").show();
			}
		}
	
		function hideAllSubmenus() {
			$(".create").css("bottom", "92px");
			$("#create-sorted-increasing").hide();
			$("#create-sorted-decreasing").hide();
			$("#create-nearly-sorted-increasing").hide();
			$("#create-nearly-sorted-decreasing").hide();
		}
	
		//sort options
		function hideAllSortingOptions() {
			$("#sort-bubble-enhanced").css("display", "none");
			$("#sort-bubble-merge-inversion").css("display", "none");
		}
	
		//canvas
		function hideAllCanvases() {
			$("#viz-canvas").hide();
	    	$("#viz-counting-sort-secondary-canvas").hide();
		}
		function showStandardCanvas() {
			$("#viz-canvas").show();
	    	$("#viz-counting-sort-secondary-canvas").hide();
		}
		
		//speed slider
		$("#speed-input").slider({
			min: 200,
			max: 2000,
			value: 1700,
			change: function(event, ui) {
				sortingWidget.setAnimationDuration(2200-ui.value);
			}
		});
		
	</script>
	
	<script type="text/javascript">
		$("#create-userdefined-go").click( function(){
			createList('userdefined');	
		});

	</script>

</body>
</html>