/**
 * 页面初始化调用
 */
jQuery(document).ready(function(){
	var qcloud={};
	$('[_t_nav]').hover(function(){
		var _nav = $(this).attr('_t_nav');
		clearTimeout( qcloud[ _nav + '_timer' ] );
		qcloud[ _nav + '_timer' ] = setTimeout(function(){
		$('[_t_nav]').each(function(){
		$(this)[ _nav == $(this).attr('_t_nav') ? 'addClass':'removeClass' ]('nav-up-selected');
		});
		$('#'+_nav).stop(true,true).slideDown(200);
		$('.head-v3').css("z-index",9999); //解决遮挡问题
		}, 150);
	},function(){
		var _nav = $(this).attr('_t_nav');
		clearTimeout( qcloud[ _nav + '_timer' ] );
		qcloud[ _nav + '_timer' ] = setTimeout(function(){
		$('[_t_nav]').removeClass('nav-up-selected');
		$('#'+_nav).stop(true,true).slideUp(200);
		$('.head-v3').css("z-index",99); //解决遮挡问题
		}, 150);
	});
	
	//点击选中li
	/*$("li").on("click",function(){
		$(this).siblings().removeClass("nav-up-selected-inpage");
		$(this).addClass("nav-up-selected-inpage");
	});*/
});