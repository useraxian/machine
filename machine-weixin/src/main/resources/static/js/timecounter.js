/**
 * 倒计时器
 */
var minute = 0;
var second = 0;
var timeId = '';
var time = '';// 计时器内容
var status = 'init';// 计时器状态

/**
 * 启动计时器
 */
function initTimeCounter() {
	timeId = self.setInterval(function() {
		// 第一次启动
		if (status == 'init' || status == 'start') {
			refreshTime();
			status = 'run';
			return;
		}

		if (status == 'run') {
			if (second > 0) {
				second--;
			} else if (second == 0 && minute > 0) {
				minute--;
				second = 60;
				second--;
			}
			setTime(minute, second);

			if (minute == 0 && second == 30) {
				// TODO 剩余30秒 ，提醒用户，停止下注
				$.toptip('距离开奖时间还有30秒，停止下注！', 2000, 'warning');

			} else if (minute == 0 && second == 00) {
				// TODO 全为0 ，开奖调用动画,重新设置时间
				startRun();
				refreshTime();
				// 判断输赢
				// $('#timeSpan').html("00:01:00");
			}

		}

	}, 1000);
}

// function numberCover(num) {
// if (num < 10) {
// num = '0' + num;
// }
// return num;
// }

/**
 * 
 * 获取服务端当前计数器
 */
function refreshTime() {
	$.ajax({
		url : "/time",
		success : function(result) {
			var obj = JSON.parse(result);
			minute = obj.minute;
			second = obj.second;
			var timeVal = numberCover(obj.minute, 2) + ":"
					+ numberCover(obj.second, 2);
			setTime(obj.minute, obj.second);
		},
		error : function() {
			time = '加载失败';
			minute = 0;
			second = 0;
			$('#timeSpan').html(time);

			stopTimeCounter();

		}
	});
}

/**
 * 
 * 设置时间计时器的值
 */
function setTime(m, s) {
	minute = m;
	second = s;
	time = numberCover(minute, 2) + ":" + numberCover(second, 2);
	$('#timeSpan').html(time);
}

/**
 * 停止时间计时器
 */
function stopTimeCounter() {
	status = 'stop';
}

/**
 * 判断是否能下注
 */
function canBet() {
	if (minute == 0 && second <= 30) {
		return false;
	} else {
		return  true;
	}
}

/**
 * 停止时间计时器
 */
function startTimeCounter() {
	alert('111');
	status = 'start';
	$.modal({
		title : "提醒",
		text : "test",
		buttons : [ {
			text : "取消",
			className : "default",
			onClick : function() {
				alert('取消');
			}
		}, {
			text : "确认",
			onClick : function() {
				alert('quren');
			}
		}, ]
	});
}
