$(function()
		{
	//solving active menu problem
	//menu values are coming from pageController title
	//$ values for active coming form navbar.jsp li names
	switch (menu) {
	
   case 'About Us':
		$('#about').addClass('active');
		break;
   case 'Contact':
		$('#contact').addClass('active');
		break;
   case 'All Products':
		$('#listProducts').addClass('active');
		break;
	default:
		$('#listProducts').addClass('active');
	    $('#a_'+menu).addClass('active');
	     break;
	}
	
			
		});