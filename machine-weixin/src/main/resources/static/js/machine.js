/**
 * Machine JS
 */

var last = 23;// 上次开奖位置
var nextOpenNum = null;

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
	// TODO randomNumber改成从后台获取
	if (nextOpenNum == null) {
		return;
	}

	for (var i = last; i < 96; i++) {
		moveToNext(i);
		if ((i % 24 == nextOpenNum)&&i>=48) {
			break;
		}
	}
	last = nextOpenNum;
}

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

function setNextOpenNum() {
	console.log('下次开奖号码：' + $('#openNum').val());
	nextOpenNum = parseInt($('#openNum').val());
}
