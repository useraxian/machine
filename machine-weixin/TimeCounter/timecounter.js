/**
 * 倒计时器
 */

function Timer(minute,second) {
	  this.minute =minute;
	  this.second = second;
	  
}	

Timer.prototype.begin = function(m,s,event){
	 var min=this.minute;
	var sec = this.second ;
	self.setInterval(function() {
	var m=	minute;
		if (sec > 0) {
			sec--;
		} else if (sec == 0 && min > 0) {
			tmin--;
			sec = 60;
			sec--;
		}
		console.log(min+':'+sec);
		if (min == m && sec == s) {
			event();
		}
		if (min == 0 && sec == 0) {
			
		}
	}, 1000);
};

