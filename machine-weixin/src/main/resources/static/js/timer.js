/**
 * 倒计时器
 */

// type:1倒计时1次，2循环倒计时
function Timer(minute, second, type) {
	this.timeId = null;
	this.type = type;
	this.minute = minute;
	this.second = second;
	this.realMinute = minute;
	this.realSecond = second;
	this.timedEvents = null;
	this.perSecond = function() {
	};
	this.event = function() {
		for (var i = 0; i < this.timedEvents.length; i++) {
			try {
				var timedEvent = this.timedEvents[i];
				if (this.realMinute == timedEvent.min
						&& this.realSecond == timedEvent.sec) {
					timedEvent.event();
				}
			} catch (e) {
			}
		}

	};
	this.count = function() {
		if (this.realSecond > 0) {
			this.realSecond--;
		} else if (this.realSecond == 0 && this.realMinute > 0) {
			this.realSecond = 60;
			this.realSecond--;
		}
		this.perSecond();
		console.log(this.realMinute + ':' + this.realSecond);
		this.event();

		// 重新设置时间
		if (this.realMinute == 0 && this.realSecond == 0) {
			if (this.type == 1) {
				this.end();
			} else {
				this.realMinute = this.minute;
				this.realSecond = this.second;
			}
		}
	};

	this.start = function() {
		console.log(this);
		var t = this;
		this.timeId = self.setInterval(function() {
			t.count();
		}, 1000);
	};

	this.end = function() {
		self.clearInterval(this.timeId)
	};
}

function TimedEvent(min, sec, event) {
	this.min = min;
	this.sec = sec;
	this.event = event;
}
