/**
 * websocket js
 */
var websocket = null;
var serverUrl = "ws://localhost:8080/websocket";

// 判断当前浏览器是否支持WebSocket
if ('WebSocket' in window) {
	websocket = new WebSocket(serverUrl);
} else {
	alert('Not support websocket')
}

// 连接发生错误的回调方法
websocket.onerror = function() {
	setMessageInnerHTML("error");
};

// 连接成功建立的回调方法
websocket.onopen = function(event) {
	console.log('成功连接websocket！');

}

// 接收到消息的回调方法
websocket.onmessage = function(event) {
	console.log('接收到服务端的消息:' + event.data);
	setTimeCounter(event.data);
	startTimeCounter(event.data);
	// var obj = JSON.parse(event.data);
	// var type = obj.type;
	// var msg = obj.message;
	// var innerHTML = "";
	// if ("chat" == type) {
	// var username = obj.datas.username;
	// innerHTML = obj.datas.username + ":" + "<div class=\"roundedCorner\">"
	// + msg + "</div>"
	// } else if ("warn" == type) {
	// innerHTML = "<div>" + msg + "</div>"
	// }
	// setMessageInnerHTML(innerHTML);
}

// 连接关闭的回调方法
websocket.onclose = function() {
	$('#timeSpan').html("时间加载失败");
}

// 监听窗口关闭事件，当窗口关闭时，主动去关闭websocket连接，防止连接还没断开就关闭窗口，server端会抛异常。
window.onbeforeunload = function() {
	websocket.close();
}

// 关闭连接
function closeWebSocket() {
	websocket.close();
}

// 发送消息
function send() {
	var message = document.getElementById('message').value;
	websocket.send(message);
}

// 设置时间计时器的值
function setTimeCounter(time) {
	$('#timeSpan').html(time);
	timer = time;
}