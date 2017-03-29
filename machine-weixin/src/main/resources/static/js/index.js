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

					var imgWidth = ($(document.body).width() - $(document.body)
							.width() * 0.1) / 7;
					console.log('imgWidth=' + imgWidth);

					$('.screen table tr td').width(imgWidth);
					$('.screen table tr td').height(imgWidth);
					$('.control table tr td').width(imgWidth - 5);
					$('.control table tr td').height(imgWidth - 5);

					var $target = $('div.target');// 代表找到div.target的元素
					var offset = $('#0').offset();
					$target.css('top', offset.top);
					$target.css('left', offset.left);
					$target.width(imgWidth - 3);
					$target.height(imgWidth - 3);
					console.log('td width=' + $('.screen table tr td').width());
					console.log('td height='
							+ $('.screen table tr td').height());
				});

