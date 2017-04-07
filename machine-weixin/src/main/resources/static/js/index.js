/**
 * 首页面JS
 */

/**
 * 初始化页面:调整页面各个位置的大小;添加事件
 */
$(document)
		.ready(
				function() {
					initMachine();
					console.log($(window).height()); // 浏览器当前窗口可视区域高度
					console.log($(document).height()); // 浏览器当前窗口文档的高度
					console.log($(document.body).height());// 浏览器当前窗口文档body的高度
					console.log($(document.body).outerHeight(true));// 浏览器当前窗口文档body的总高度
					// 包括border
					// padding
					// margin
					console.log($(window).width()); // 浏览器当前窗口可视区域宽度
					console.log($(document).width());// 浏览器当前窗口文档对象宽度
					console.log($(document.body).width());// 浏览器当前窗口文档body的高度
					console.log($(document.body).outerWidth(true));// 浏览器当前窗口文档body的总宽度
					// 包括border
					// padding
					// margin
					addVisibilityChangeListener();
				});

function addVisibilityChangeListener(){
	//各种浏览器兼容
	 var hidden, state, visibilityChange; 
	 if (typeof document.hidden !== "undefined") {
	 hidden = "hidden";
	 visibilityChange = "visibilitychange";
	 state = "visibilityState";
	 } else if (typeof document.mozHidden !== "undefined") {
	     hidden = "mozHidden";
	     visibilityChange = "mozvisibilitychange";
	     state = "mozVisibilityState";
	 } else if (typeof document.msHidden !== "undefined") {
	     hidden = "msHidden";
	     visibilityChange = "msvisibilitychange";
	     state = "msVisibilityState";
	     } else if (typeof document.webkitHidden !== "undefined") {
	     hidden = "webkitHidden";
	     visibilityChange = "webkitvisibilitychange";
	     state = "webkitVisibilityState";
	     }
	 // 添加监听器，在title里显示状态变化
	 document.addEventListener(visibilityChange, function() {
	alert(document[state]);
		 if(document[state]=='visible'){
			 getUserScore();
			 refreshTime();
		 }
	 }, false);

}