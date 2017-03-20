var timer = '00:00:00';
/**
 * 倒计时器
 */
function startTimeCounter() {
	window.setInterval(function() {
		var timeHtml = $('#timeSpan').html();
		var times = timeHtml.split(':');
		var hour = parseInt(times[0]);
		var minute = parseInt(times[1]);
		var second = parseInt(times[2]);

		if (second > 0) {
			second--;
		} else if (second == 0 && minute > 0) {
			minute--;
			second = 60;
			second--;
		}

		time = numberCover(hour) + ':' + numberCover(minute) + ':'
				+ numberCover(second);
		console.log(time);
		$('#timeSpan').html(time);

		// TODO 剩余30秒 ，提醒用户，停止下注
		if (hour == 0 && minute == 0 && second == 30) {
			alert('距离开奖时间还有30秒，停止下注！');
		}

		// TODO 全为0 ，开奖调用动画,重新设置时间
		if (hour == 0 && minute == 0 && second == 00) {
			alert('开奖');
			$('#timeSpan').html("00:01:00");
		}

	}, 1000);
}

function numberCover(num) {
	if (num < 10) {
		num = '0' + num;
	}
	return num;
}
