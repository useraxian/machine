/**
 * 通用工具函数JS
 */

/**
 * 
 * 根据总长度和数字，不满长度在数字前面补零
 * 
 * @param num:数字
 * @param len:总长度
 * 
 */
function numberCover(num, len) {
	if (!isNull(num)) {
		var strLen = String(num).length;
		var diff = len - strLen;
		for (var int = 0; int < diff; int++) {
			num = '0' + num;
		}
		try {
			parseInt(num);
		} catch (e) {
			console.log('myscore不是数字:' + num + e);
		}
	}
	return num;
}

/**
 * 判断是否null
 * 
 * @param data
 */
function isNull(data) {
	return (data == "" || data == undefined || data == null);
}



/**
 * 等待
 * 
 * @param data
 */
function sleep(numberMillis) {
	　　var now = new Date();
	　　var exitTime = now.getTime() + numberMillis;
	　　while (true) {
	　　now = new Date();
	　　if (now.getTime() > exitTime)
	　　return;
	　　}
	　　}