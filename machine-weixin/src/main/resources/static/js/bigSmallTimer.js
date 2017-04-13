/**
 * 倒计时器
 */

function Timer(minute,second) {
	　this.minute = minute;
　　　this.secondOrg = second;
	  this.minute = minute;
	  this.second = second;
}	

Timer.prototype.begin = function(m,s,event){
	self.setInterval(function() {
		if (this.second > 0) {
			this.second--;
		} else if (this.second == 0 && this.minute > 0) {
			this.minute--;
			this.second = 60;
			this.second--;
		}
		console.log(this.minute+':'+this.second);
		if (this.minute == m && this.second == s) {
			event();
		}
		if (this.minute == 0 && this.second == 0) {
			 this.minute=this.minuteOrg;
			 this.second=this.secondOrg;
		}
	}, 1000);
};

