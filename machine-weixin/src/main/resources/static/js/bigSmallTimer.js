/**
 * 倒计时器
 */
var minute = 0;
var second = 0;
var bsStatus = 'stop';

/**
 * 启动计时器
 */
function initTimeCounter() {
	self.setInterval(function() {
		if (second > 0) {
			second--;
		} else if (second == 0 && minute > 0) {
			minute--;
			second = 60;
			second--;
		}
		setTime(minute, second);

		if (minute == 0 && second == 0) {
			// 押大小时间结束
		}

	}, 1000);
}
/**
 * 
 * 设置时间计时器的值
 */
function setTime(m, s) {
	minute = m;
	second = s;
	// time = numberCover(minute, 2) + ":" + numberCover(second, 2);
	// $('#timeSpan').html(time);
}

/**
 * 开始时间计时器
 */
function startTimeCounter() {
	status = 'start';
}
/**
 * 停止时间计时器
 */
function stopTimeCounter() {
	status = 'stop';
}
