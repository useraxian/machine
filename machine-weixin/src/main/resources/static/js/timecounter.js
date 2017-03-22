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
		if (status == 'init'||status=='start') {
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
			console.log(time);

			if (minute == 0 && second == 30) {
				// TODO 剩余30秒 ，提醒用户，停止下注
				alert('距离开奖时间还有30秒，停止下注！');

			} else if (minute == 0 && second == 00) {
				// TODO 全为0 ，开奖调用动画,重新设置时间
				startRun();
				refreshTime();
				// $('#timeSpan').html("00:01:00");
			}

		}

	}, 1000);
}

function numberCover(num) {
	if (num < 10) {
		num = '0' + num;
	}
	return num;
}

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
			var timeVal = numberCover() + ":" + numberCover(obj.second);
			setTime(obj.minute, obj.second);
		},
		error : function() {
			time = '加载失败';
			minute = 0;
			seconde = 0;
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
	seconde = s;
	time = numberCover(minute) + ":" + numberCover(seconde);
	$('#timeSpan').html(time);
}

/**
 * 停止时间计时器
 */
function stopTimeCounter() {
	status = 'stop';
}

/**
 * 停止时间计时器
 */
function startTimeCounter() {
	status = 'start';
}
