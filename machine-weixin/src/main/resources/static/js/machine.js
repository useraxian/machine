/**
 * Machine JS
 */

// 水果
var fruits = {
	'seven' : 'seven.png',
	'cherry' : 'cherry.png',
	'prune' : 'prune.png',
	'banana' : 'banana.png',
	'lemo' : 'lemo.png',
	'orange' : 'orange.png',
	'watermelon' : 'watermelon.png',
	'bigwin' : 'bigwin.png',
	'bar' : 'bar.png'

};

var bets = {
	1 : 'seven',
	2 : 'cherry',
	3 : 'prune',
	4 : 'banana',
	5 : 'lemo',
	6 : 'orange',
	7 : 'watermelon'
};
var times = {
	1 : 50,
	2 : 40,
	3 : 30,
	4 : 20,
	5 : 15,
	6 : 10,
	7 : 5
};

var indexs = {
	'seven' : [ 0, 9, 18 ],
	'cherry' : [ 1, 10, 19 ],
	'prune' : [ 2, 11, 20 ],
	'banana' : [ 3, 12, 21 ],
	'lemo' : [ 4, 13, 22, 18 ],
	'orange' : [ 5, 14, 23 ],
	'watermelon' : [ 6, 15 ],
	'bigwin' : [ 7, 16 ],
	'bar' : [ 8, 17 ]
};

var last = 23;// 上次开奖位置
var nextOpenNum = null;
var moveNum = null;
var finalNum = null;

var myScoreUrl = '/machine/myscore';
/**
 * 初始化机器UI
 */
function initMachine() {
	ui();
	data();
}

function ui() {
	// 设置转盘图标
	for ( var key in indexs) {
		var img = 'url(images/' + fruits[key] + ')';
		for (var i = 0; i < indexs[key].length; i++) {
			var idx = indexs[key][i];
			$('#' + idx).css('background', img);
			$('#' + idx).css('background-size', 'cover');
		}
	}

	// 设置图标和按钮
	for ( var key in bets) {
		console.log(key);
		var fruitName = bets[key];
		var img = 'url(images/' + fruits[fruitName] + ')';
		$('#bet' + key).css('background', img);
		$('#bet' + key).css('background-size', 'cover');
	}
}

function data() {
//	 $.ajax({
//		url : "/machine/myscore",
//		success : function(result) {
//			var obj = JSON.parse(result);
//			if (obj.meta.success) {
//				console.log('我的分数:' + obj.data);
//				$('#myscore').html(numberCover(obj.data, 6));
//			} else {
//				console.log('加载分数失败!' + result);
//			}
//
//		},
//		error : function() {
//
//		}
//	});
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
		moveNum = i;
	});
}

/**
 * 开始开奖，进行转盘动画转动
 */
function startRun() {
	// TODO nextOpenNum改成从后台获取
	if (nextOpenNum == null) {
		return;
	}

	for (var i = last; i < 96; i++) {
		finalNum = i;
		moveToNext(i);
		if ((i % 24 == nextOpenNum) && i >= 48) {
			break;
		}
	}
	last = nextOpenNum;

	var id = self.setInterval(function() {
		console.log('动画正在执行');
		// 判断动画是否结束
		if (finalNum != null && moveNum != null && finalNum == moveNum) {
			// 判断输赢
			isWin();

			// 重置下注分数
			reset();
			window.clearInterval(id)
		}
	}, 500);

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
	var canBetSts= canBet();
	if(!canBetSts){
		$.toptip('已封盘，无法下注！', 1000, 'warning');
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
//
///**
// * 设置下次开奖号码
// */
//function setNextOpenNum() {
//	console.log('下次开奖号码：' + $('#openNum').val());
//	nextOpenNum = parseInt($('#openNum').val());
//}


/**
 * 判断输赢
 */

function isWin() {
	// TODO 1.根据NextOpenNum获取水果名称，2.根据水果名称获取下注分数 3.判断是否有下注分数，有则赢
	var fruitName = getFruitNameFromIndexs(nextOpenNum);
	getWinScore(fruitName);
	// console($('bet-num-tr td div').length);
}

function getFruitNameFromIndexs(num) {
	for ( var key in indexs) {
		if ($.inArray(num, indexs[key]) == 0) {
			return key;
		}
	}
}

function getWinScore(fruitName) {
	var betIdx = null;
	// 根据水果名称获取下注索引
	for ( var key in bets) {
		var val = bets[key];
		if (val == fruitName) {
			betIdx = key;
			break;
		}
	}
	// 根据下注索引获取下注分数
	var score = parseInt($('#score' + betIdx).html());
	var bs = times[betIdx];// 倍数
	var winScore = score * bs;
	console.log('winScore=' + winScore);
	var myScore = parseInt($('#myscore').html());
	$('#myscore').html(numberCover(myScore + winScore, 6));
}

function confirmBet() {
	// TODO 下注内容从获取
	var userId = $('#userid').val();
	var recordId = 1;
	var fruitId = 1;
	var score = 1;
	var multiple = 1;
	
	$.confirm({
		title : '确认下注？',
		text : '当前下注内容',
		onOK : function() {
			$.ajax({
				url : 'machine/bet',
				type : 'post',
				data : {
					'userId' : userId,
					'fruitId' : fruitId,
					'recordId' : recordId,
					'score' : score,
					'multiple' : multiple
				},
				success : function(result) {
					var obj = JSON.parse(result);
					$.alert(obj.data, "提示");
				},
				error : function() {
					$.alert("无法请求下注！", "提醒");
				}
			});
		},
		onCancel : function() {
		}
	});
}
