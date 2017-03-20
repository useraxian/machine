/**
 * 首页面JS
 */

/**
 * 初始化页面:调整页面各个位置的大小;添加事件
 */
$(document)
		.ready(
				function() {
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

var last = 23;// 上次开奖位置

/**
 * 重置下注分数
 */
function reset() {
	var $scoreDivs = $('.bet-num-tr td div');
	for (var i = 0; i < $scoreDivs.length; i++) {
		var div = $scoreDivs[i];
		$(div).html("00");
	}
}

/**
 * 移动到下个目标
 */
function moveToNext(i) {
	var $target = $('div.target');// 代表找到div.target的元素
	var offset = $('#' + (i % 24)).offset();
	$target.animate({
		top : offset.top - 2,
		left : offset.left - 2
	}, 50, function() {
		reset();
	});
	n = i;
}

/**
 * 开始开奖，进行转盘动画转动
 */
function startRun() {
	// randomNumber改成从后台获取
	// Math.random(10) * 20;
	var randomNumber = 1;// 随机生成0-20之间的数字

	if (randomNumber >= last) {
		randomNumber = randomNumber + 48;// +上一个50的基数

	} else if (randomNumber < last) {
		randomNumber = 24 - last + randomNumber + 48;// +上一个50的基数

	}

	for (var i = last; i <= randomNumber; i++) {
		moveToNext(i);
	}
	last = (randomNumber) % 24;
}

/**
 * 下注按钮事件
 */

function bet(idx) {
	if ($("div.target").is(":animated")) {
		return false;
	}
	// 判断是否在开奖动画
	var $score = $('#score' + idx);
	var $myscore = $('#myscore');
	var scoreVal = parseInt($score.html());// 下注分数
	var myscoreVal = parseInt($myscore.html());// 我的分数
	console.log("scoreVal=" + scoreVal);
	console.log("myscoreVal=" + myscoreVal);
	if (myscoreVal <= 0) {
		$.confirm({
			title : '提醒',
			text : '对不起，您的分数不足！',
			onOK : function() {
				// 点击确认
			},
			onCancel : function() {
			}
		});

		$.modal({
			title : "提醒",
			text : "对不起，您的分数不足！",
			buttons : [ {
				text : "取消",
				className : "default",
				onClick : function() {
					console.log(3)
				}
			}, {
				text : "充值积分",
				onClick : function() {
					alert('充值界面');
				}
			}, ]
		});
	} else {
		if (scoreVal < 99) {
			scoreVal++;
			myscoreVal--;
			if (scoreVal < 10) {
				$score.html("0" + scoreVal);
			} else {
				$score.html(scoreVal);
			}

			var myscoreLength = String(myscoreVal).length;
			if (myscoreLength < 6) {
				for (var i = 0; i < 6 - myscoreLength; i++) {
					myscoreVal = "0" + myscoreVal;
				}
			}
			$myscore.html(myscoreVal);
		}
	}

}
