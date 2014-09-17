<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<head>

<!-- Meta Tags -->
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />

<title>AlgoVis</title>   

<link href="<c:url value='/resources/animation/css/normalize.css' />" rel="stylesheet">

<!-- Bootstrap -->
<link href="<c:url value='/resources/mytheme/_include/css/bootstrap.min.css' />" rel="stylesheet">

<!-- Main Style -->
<link href="<c:url value='/resources/mytheme/_include/css/main.css' />" rel="stylesheet">

<!-- Supersized -->
<link href="<c:url value='/resources/mytheme/_include/css/supersized.css' />" rel="stylesheet">
<link href="<c:url value='/resources/mytheme/_include/css/supersized.shutter.css' />" rel="stylesheet">

<!-- FancyBox -->
<link href="<c:url value='/resources/mytheme/_include//css/fancybox/jquery.fancybox.css' /> " rel="stylesheet">

<!-- Font Icons -->
<link href="<c:url value='/resources/mytheme/_include/css/fonts.css' />" rel="stylesheet">

<!-- Shortcodes -->
<link href="<c:url value='/resources/mytheme/_include/css/shortcodes.css' />" rel="stylesheet">

<!-- Responsive -->
<link href="<c:url value='/resources/mytheme/_include/css/bootstrap-responsive.min.css' />" rel="stylesheet">
<link href="<c:url value='/resources/mytheme/_include/css/responsive.css' />" rel="stylesheet">

<!-- Google Font -->
<link href='http://fonts.googleapis.com/css?family=Titillium+Web:400,200,200italic,300,300italic,400italic,600,600italic,700,700italic,900' rel='stylesheet' type='text/css'>

<!-- Overlay Css -->

<link href="<c:url value='/resources/mytheme/_include/css/basic.css' />" rel="stylesheet">

<!-- Modernizr -->
<script src="<c:url value="/resources/mytheme/_include/js/modernizr.js" />"></script>

<!-- Editor -->

</head>


<body>

<!-- Splash Screen -->
<div class="ole">
<section id="jSplash">
	<div id="circle"></div>
</section>
</div>
<!-- End of Splash Screen -->

<!-- Homepage Slider -->
<div id = "home-slider">	

    <div class="overlay"></div>

    <div class="slider-text">
    	<div id="slidecaption"></div>
    </div>   
	
	<div class="control-nav">
        <a id="prevslide" class="load-item"><i class="font-icon-arrow-simple-left"></i></a>
        <a id="nextslide" class="load-item"><i class="font-icon-arrow-simple-right"></i></a>
        <ul id="slide-list"></ul>

        <a id="nextsection" href="#editor"><i class="font-icon-arrow-simple-down"></i></a>
    </div>
</div>
<!-- End Homepage Slider -->

<!-- Header -->
<header>
    <div class="sticky-nav">       
        <div id="logo">
        	<a href="#home-slider" title="AlgoVis">AlgoVis</a>
        </div>
        
        <nav id="menu">
        	<ul id="menu-nav">
            	<li class="current"><a href="#home-slider">Home</a></li>
                <li><a href="#edit">Editor</a></li>
                <li><a href="#idea">Our Idea</a></li>
                <li><a href="#opinion">Your Opinions</a></li>
            </ul>
        </nav>
    </div>
</header>
<!-- End Header -->

<!-- Editor Section -->
<div id="edit" class="page">
	<div class="container">
    	<!-- Title Page -->
        <div class="row">
            <div class="span12">
                <div class="title-page" style= "margin-bottom: 50px; margin-top: -50px;">
                    <h2 class="title">Editor</h2>
                    <h3 class = "title-description">Enter your JS code here</h3>
                </div>
            </div>
        </div>
        <!-- End Title Page -->
        
        <!-- Editor -->
        <div class = "row" >
        	<div class = "span12">
				<div id="editor"></div>
			</div>
		</div>
        <!-- End Editor -->
        
        <p><a id = "algo-submit" class="submit" >Submit</a></p>
    </div>
</div>
<!-- End Editor Section -->

<!-- Idea Section -->
<div id="idea" class="page-alternate">
	<div class="container">
	    <!-- Title Page -->
	    <div class="row">
	        <div class="span12">
	            <div class="title-page">
	                <h2 class="title">Our Idea</h2>
	                <h3 class="title-description">What We Think About AlgoVis</h3>
	            </div>
	        </div>
	    </div>
	    <!-- End Title Page -->
	    
		<!-- Message Section-->
		<div class="row">
		    <!-- Start Message -->
		    	<div class="span6">
		            <h3 class="message-name">Learning</h3>
		            <p class="message-description">As a programmer this will be a helpful to improve your programming skill basics. Enhance your coding by learning algorithms <a href="#edit">here</a>.</p>
		        </div>
		    <!-- End Message -->
		        
		    <!-- Start Message -->
		    	<div class="span6">
		        	<h3 class="message-name">Visualization</h3>
		            <p class="message-description">Visualization is an effective way to learn. Algovis provies the basis to learning the core and standard algorithms by giving rich visualizations. 
		            						Tell us what you think <a href="#opinion">here</a>.</p>
		        </div>
		    <!-- End Message -->        
		</div>
	    <!-- End Message Section -->
	</div>
</div>
<!-- End Idea Section -->

<!-- Opinion Section -->
<div id="opinion" class="page">
	<div class="container">
	    <!-- Title Page -->
	    <div class="row">
	        <div class="span12">
	            <div class="title-page">
	                <h2 class="title">Tell Us What You Think</h2>
	                <h3 class="title-description">We Value Your Insight</h3>
	            </div>
	        </div>
	    </div>
	    <!-- End Title Page -->
	    
	    <!-- Contact Form -->
	    <div class="row">
	    	<div class="span9">
	        	<form id="contact-form" class="contact-form">
	            	<p class="contact-name">
	            		<input id="contact_name" type="text" placeholder="Name" value="" name="name" />
	                </p>
	                <p class="contact-email">
	                	<input id="contact_email" type="text" placeholder="Email Address" value="" name="email" />
	                </p>
	                <p class="contact-message">
	                	<textarea id="contact_message" placeholder="Your Opinion" name="message" rows="15" cols="40"></textarea>
	                </p>
	                <p class="contact-submit">
	                	<a id="opinion-submit" class="submit">Send Your Message</a>
	                </p>
	            </form>
	        </div>
	        
	        <div class="span3">
	        	<div class="contact-details">
	        		<h3>Contact Details</h3>
	                <ul>
	                    <li><a href="https://accounts.google.com/ServiceLogin">algovis@gmail.com</a></li>
	                </ul>
	            </div>
	        </div>
	    </div>
	    <!-- End Contact Form -->
	</div>
</div>
<!-- End Opinion Section -->

<!-- Socialize Section -->
<div id="social-area" class="page-alternate">
	<div class="container">
    	<div class="row">
            <div class="span12">
                <nav id="social">
                    <ul>
                        <li><a href="https://twitter.com" title="Follow Us on Twitter" target="_blank"><span class="font-icon-social-twitter"></span></a></li>
                        <li><a href="http://dribbble.com" title="Follow Us on Dribbble" target="_blank"><span class="font-icon-social-dribbble"></span></a></li>
                        <li><a href="https://www.facebook.com" title="Follow Us on Facebook" target="_blank"><span class="font-icon-social-facebook"></span></a></li>
                        <li><a href="https://plus.google.com" title="Follow Us on Google Plus" target="_blank"><span class="font-icon-social-google-plus"></span></a></li>
                        <li><a href="http://www.linkedin.com" title="Follow Us on LinkedIn" target="_blank"><span class="font-icon-social-linkedin"></span></a></li>
                        <li><a href="http://zerply.com" title="Follow Us on Zerply" target="_blank"><span class="font-icon-social-zerply"></span></a></li>
                    </ul>
                </nav>
            </div>
        </div>
    </div>
</div>
<!-- End Socialize Section-->

<!-- Back To Top -->
<a id="back-to-top" href="#">
	<i class="font-icon-arrow-simple-up"></i>
</a>
<!-- End Back to Top -->

<!-- Popup Content-->
<div id="nocode-submit-error" style = "display: none;">
	<h3>Please enter code before submitting</h3>
</div>

<div id="wrongcode-submit-error" style = "display: none;">
	<h3>We are sorry. We do not have a visualization. Try entering the algorithm in a standard manner</h3>
</div>

<div id="opinion-submit-success" style = "display: none;">
	<h3>We have recorded your response. Thank you</h3>
</div>

<div id="opinion-submit-error" style = "display: none;">
	<h3>Please fill the form before submitting</h3>
</div>
<!-- End Popup Content -->

<!-- Js -->

	<!-- Main Js -->
	<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script> <!-- jQuery Core -->
	<script src="<c:url value="/resources/mytheme/_include/js/bootstrap.min.js" />"></script> <!-- Bootstrap -->
	<script src="<c:url value="/resources/mytheme/_include/js/supersized.3.2.7.min.js" />"></script> <!-- Slider -->
	<script src="<c:url value="/resources/mytheme/_include/js/waypoints.js" />"></script> <!-- WayPoints -->
	<script src="<c:url value="/resources/mytheme/_include/js/waypoints-sticky.js" />"></script> <!-- Waypoints for Header -->
	<script src="<c:url value="/resources/mytheme/_include/js/jquery.isotope.js" />"></script> <!-- Isotope Filter -->
	<script src="<c:url value="/resources/mytheme/_include/js/jquery.fancybox.pack.js" />"></script> <!-- Fancybox -->
	<script src="<c:url value="/resources/mytheme/_include/js/jquery.fancybox-media.js" />"></script> <!-- Fancybox for Media -->
	<script src="<c:url value="/resources/mytheme/_include/js/jquery.tweet.js" />"></script> <!-- Tweet -->
	<script src="<c:url value="/resources/mytheme/_include/js/plugins.js" />"></script> <!-- Contains: jPreloader, jQuery Easing, jQuery ScrollTo, jQuery One Page Navi -->
	<script src="<c:url value="/resources/mytheme/_include/js/main.js" />"></script> <!-- Default JS -->
	
	<!-- Overlay specific JS -->
	
	<script src="<c:url value="/resources/mytheme/_include/js/jquery.simplemodal.js" />"></script>
	
	<!-- Editor specific Js -->
	<script src="<c:url value="/resources/editor/functionality.js" />"></script>
	<script src="<c:url value="/resources/ace-builds/src-noconflict/ace.js" />"></script>
	<script src="<c:url value="/resources/editor/init.js" />"></script>
	
	<!-- Contact Form Specific JS -->
	<script src="<c:url value="/resources/contact/functionality.js" />"></script>

<!-- End Js -->

</body>
</html>