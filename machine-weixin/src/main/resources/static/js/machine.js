/**
 * Machine JS
 */

// 水果
var fruits = {
	'pingguo' : 'pingguo.jpg',
	'pingguox3' : 'pingguox3.jpg',
	'juzi' : 'juzi.jpg',
	'juzix3' : 'juzix3.jpg',
	'ningmeng' : 'ningmeng.jpg',
	'ningmengx3' : 'ningmengx3.jpg',
	'lingdang' : 'lingdang.jpg',
	'lingdangx3' : 'lingdangx3.jpg',
	'xigua' : 'xigua.jpg',
	'xiguax3' : 'xiguax3.jpg',
	'xingxing' : 'xingxing.jpg',
	'xingxingx3' : 'xingxingx3.jpg',
	'qi' : 'qi.jpg',
	'qix3' : 'qix3.jpg',
	'barx50' : 'barx50.jpg',
	'barx100' : 'barx100.jpg',
	'goodluckl':'goodluckl.jpg',
	'goodluckr':'goodluckr.jpg'
};

var btnImgs = {
	1 : 'btn-bar.jpg',
	2 : 'btn-qi.png',
	3 : 'btn-xingxing.png',
	4 : 'btn-xigua.png',
	5 : 'btn-lingdang.png',
	6 : 'btn-ningmeng.png',
	7 : 'btn-juzi.png',
	8 : 'btn-pingguo.png'
};

var indexs = {
		'pingguo' :[4,10,16,22],
		'pingguox3' : [5],
		'juzi' : [0,12],
		'juzix3' : [11],
		'ningmeng' : [6,18],
		'ningmengx3' : [17],
		'lingdang' : [1,13],
		'lingdangx3' : [23],
		'xigua' : [7],
		'xiguax3' : [8],
		'xingxing' : [19],
		'xingxingx3' : [20],
		'qi' : [15],
		'qix3' : [14],
		'barx50' : [2],
		'barx100' : [3],
		'goodluckl':[21],
		'goodluckr':[9]
};

var last = 23;// 上次开奖位置
var nextOpenNum = null;
var nextGotScore = 0;
var moveNum = null;
var finalNum = null;
var bsScore = 0;// 大小分数

var mul = true;// 倍数按钮状态

var myScoreUrl = '/machine/myscore';


/** *******************************大小计时器******************************** */
var smTimer=new Timer(0,30,1);
var te1 = new TimedEvent(0,10,function(){
	$.toptip("10秒后停止", '2000','warning');
});
var te2 = new TimedEvent(0,0,function(){
	nextGotScore = 0;
	setGotScore(nextGotScore);
	getUserScore();
});
var arr=new Array();
arr.push(te1);
arr.push(te2);
smTimer.timedEvents=arr;
smTimer.perSecond=function(){
	$('#timeBSSpan').html(smTimer.realMinute+':'+smTimer.realSecond);
 }
/** *******************************大小计时器******************************** */
 
 
/**
 * 初始化机器UI
 */
function initMachine() {
	ui();
	data();
}

function ui() {
	console.log($('#headimgurl').val());
	$('#nicknameDiv').html($('#nickname').val());
	$("#headImg").attr('src',$('#headimgurl').val()); 
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
	for ( var key in btnImgs) {
		console.log(key);
		var imgName = btnImgs[key];
		var img = 'url(images/' + imgName+ ')';
		$('#bet' + key).css('background', img);
		$('#bet' + key).css('background-size', '35px 25px');
	}

	// 响应窗体大小
	var imgWidth = ($(document.body).width() - $(document.body).width() * 0.25) / 7;
	console.log('imgWidth=' + imgWidth);
	$('.screen').width(
			$(document.body).width() - $(document.body).width() * 0.25);
	$('.screen').css('margin-left', $(document.body).width() * 0.2 * 0.5);
	$('.operate-contain').width(
			$(document.body).width() - $(document.body).width() * 0.09);
	$('.operate-contain').css('margin-left',
			$(document.body).width() * 0.09 * 0.5);
	//	
	$('.control').width(
			$(document.body).width() - $(document.body).width() * 0.2);
	$('.control').css('left', "35px");
	// $('.control').css('bottom', '100px');

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
	console.log('td height=' + $('.screen table tr td').height());
}

function data() {
	// 获取分数
	getUserScore();
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
			// TODO 判断输赢，结合动画效果
			if (nextGotScore > 0) {
				bsScore = nextGotScore;
				setGotScore(nextGotScore);
				// TODO 押大小
				$.confirm("押大小", function() {
					smTimer.start();
				}, function() {
					nextGotScore = 0;
					setGotScore(nextGotScore);
					getUserScore();
				});
			}

			// 获取分数
			// getUserScore();

			// 重置下注分数
			reset();
			window.clearInterval(id)
		}
	}, 500);

}

/**
 * 重置分数
 */
function reset() {
	mul = true;// 重置加倍按钮状态
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
	var canBetSts = canBet();
	if (!canBetSts) {
		$.toptip('已封盘，无法下注！', 1000, 'warning');
		return false;
	}

	mul = false;
	// 判断是否在开奖动画
	var $score = $('#score' + idx);
	var $myscore = $('#myscore');
	var scoreVal = parseInt($score.html());// 下注分数
	var myscoreVal = parseInt($myscore.html());// 我的分数
	var mul = getMultiple();
	if (myscoreVal - 1 * mul < 0) {

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
			myscoreVal = myscoreVal - mul * 1;
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

/**
 * 根据位置，获取水果时间
 */
function getFruitNameFromIndexs(num) {
	for ( var key in indexs) {
		if ($.inArray(num, indexs[key]) == 0) {
			return key;
		}
	}
}

function getUserScore() {
	var userId = $('#userid').val();
	$.ajax({
		url : 'machine/myscore/' + userId,
		type : 'post',
		success : function(result) {
			var obj = JSON.parse(result);
			if (obj.meta.success) {
				var scr = parseInt(obj.data);
				$('#myscore').html(numberCover(scr, 6));
			} else {
				$.alert(obj.data, "提示");
			}

		},
		error : function() {
			$.alert('无法获取分数', "提示");
		}
	});
}

// 设置得分框分数
function setGotScore(scoreVal) {
	$('#gotscore').html(numberCover(scoreVal, 6));
}
// 获取得分框分数
function getGotScore() {
	var scVal = parseInt($('#gotscore').html());
	return scVal;
}

function confirmBet() {
	var canBetSts = canBet();
	if (!canBetSts) {
		$.toptip('已封盘，无法下注！', 1000, 'warning');
		return false;
	}

	var userId = $('#userid').val();
	var multiple = getMultiple();

	$.confirm({
		title : '确认下注？',
		text : '当前下注内容',
		onOK : function() {
			$.ajax({
				url : 'machine/bet',
				type : 'post',
				data : {
					'userId' : userId,
					'recordId' : recordId,
					'score1' : parseInt($('#score1').html()),
					'score2' : parseInt($('#score2').html()),
					'score3' : parseInt($('#score3').html()),
					'score4' : parseInt($('#score4').html()),
					'score5' : parseInt($('#score5').html()),
					'score6' : parseInt($('#score6').html()),
					'score7' : parseInt($('#score7').html()),
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
// 获取我的分数
function getMyScore() {
	var $myscore = $('#myscore');
	return parseInt($myscore.html());// 我的分数
}
// 设置我的分数
function setMyScore(val) {
	var $myscore = $('#myscore');
	$myscore.html(numberCover(val, 6))
}

// 加倍
function addMultiple() {
	var valStr = $('#addMul').html();
	valStr = valStr.substr(1);
	var intVal = parseInt(valStr)
	if (intVal >= 0 && intVal <= 100) {
		$('#addMul').html("X" + (intVal + 10));
	}
}

// 获取当前倍数
function getMultiple() {
	var valStr = $('#addMul').html();
	valStr = valStr.substr(1);
	return parseInt(valStr);
}

// 赢得的分数-减
function reduceScore() {
	var gscVal = getGotScore();
	if (gscVal <= 1) {
		return;
	}
	setGotScore(gscVal / 2);// 得分-
	setMyScore(getMyScore() + (gscVal / 2));// 我的分数+
}
// 赢得的分数-减
function addScore() {
	var gscVal = getGotScore();
	if(gscVal>=bsScore){
		return;
	}
	setGotScore(gscVal * 2);// 得分-
	setMyScore(getMyScore() - (gscVal *2));// 我的分数+
}
