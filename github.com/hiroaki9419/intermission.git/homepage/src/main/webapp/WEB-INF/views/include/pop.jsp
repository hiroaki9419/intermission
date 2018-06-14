<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<span><script
			src="<a class="linkclass" href="https://code.jquery.com/jquery-3.2.1.min.js">https://code.jquery.com/jquery-3.2.1.min.js</a>"
			integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4="
			crossorigin="anonymous">
		
	</script> <script src="dialog.jquery.js"></script> </span>
	<div id="myID" style="display: none;">This is some text from a
		local div element on the page.</div>
	<a href="javascript:void(0)" class="trigger"
		data-dialog-title="Dialog Title" data-dialog-body-source="#myID">
		Launch </a> 
		<script>$(".trigger").dialog();</script>
	<a href="javascript:void(0)" class="trigger"
		data-dialog-title="Ajax Dialog Title" data-dialog-url="dialog.html">
		Open ajax dialog box </a> 
		
		<script>$(".trigger").dialog({

	<!--  // Whether or not to use animation when showing/hiding the dialog box -->
	use
	<a href="https://www.jqueryscript.net/animation/">Animation</a> : true,

	<!--  // Type of animation to use if userAnimation is enabled (accepts: slide, fade) -->
	animationType : "slide",

	<!-- // Duration of the animation (in milliseconds) -->
	animationDuration : 300,

	<!--  // Whether or not a modal backdrop should be used when the dialog box is visible -->
	use
	<a href="https://www.jqueryscript.net/tags.php?/Modal/">Modal</a> :
	true,

	<!--   // Transparency/opacity of the modal backdrop, if enabled -->
	modalTransparency : 0.5, // 50% transparent

	<!--  // Whether or not to style the dialog box with jQuery or to have the user style it with CSS -->
	styleWithCSS : false,

	<!--  // Any custom CSS styles for the dialog container element -->
	customCSS : {},

	<!-- // Width of the dialog box (in pixels), if styleWithCSS is disabled -->
	width : 500,

	<!--  // Distance the dialog box will end at (if animating)/where the dialog box will be positioned on the Y axis (in pixels) -->
	distanceFromTop : 100,

	<!--  // Whether or not the user can close the dialog box by pressing the escape key -->
	closeWithEsc : true,

	<!-- // Whether or not the user can close the dialog box by clicking/tapping the modal backdrop -->
	closeWithModal : true,


	<!-- // Class for the modal, used to style the modal with CSS -->
	modalClass : "jQueryDialogModal",

	<!--  // Class for the dialog container, used to style the dialog box with CSS -->
	dialogClass : "jQueryDialogContainer",

	<!--  // Class for the title element within the dialog container -->
	titleClass : "jQueryDialogTitle",

	<!-- // Class for the body element within the dialog container -->
	bodyClass : "jQueryDialogBody",

	<!-- // Class for the close button in the upper right corner of the title -->
	closeButtonClass : "jQueryDialogCloseButton" });
		</script>
</body>
</html>