/**
 * websocket js
 */
var websocket = null;
//var url = "localhost:8080";
var url = "ittun.com:52317";

// 判断当前浏览器是否支持WebSocket
if ('WebSocket' in window) {
//	alert(document.location.host);
	websocket = new WebSocket( "ws://"+url + "/websocket");
} else {
	websocket = new SockJS("http://" + url + "/sockjs/websocket");
}

// 连接发生错误的回调方法
websocket.onerror = function() {
	setMessageInnerHTML("error");
};

// 连接成功建立的回调方法
websocket.onopen = function(event) {
	console.log('成功连接websocket！');
	// TODO 成功之后，启动定时器
	initTimeCounter();
}

// 接收到消息的回调方法
websocket.onmessage = function(event) {
	console.log('接收到服务端的消息:' + event.data);
	var obj = JSON.parse(event.data);
	if (obj.type == 'openRecord') {
		// 设置开奖号码
		recordId=obj.content.id;
		nextOpenNum = obj.content.openNumber;
	} else {

	}

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

function sendMsg() {
	websocket.send('我是客户端');
}