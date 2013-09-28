$(function() {
	var page = window.PageContext || {};
	if (!!page.activeNav) {
		$('.header .nav > li[data-active-nav='+page.activeNav+']').addClass('active');
	}
	if (!!page.init && $.isFunction(page.init)) {
		page.init();
	}
});