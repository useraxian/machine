package com.ahem.machine.weixin.core;

/**
 * 
 * 
 * <pre>
 * Response类：rest统一响应结构类
 * 
 * 包括两类通用返回值消息：ok 与 error，还包括两个常用的操作方法：success( ) 与 failure( )， <br>
 * 通过一个内部类来展现元数据结构。 <br>
 * 格式：{ "meta": { "success": true, "message": "ok" }, "data": ... }
 * 
 * @author ahem
 *
 */
public class RestResponse {
	/**
	 * 返回值消息:ok
	 */
	private static final String OK = "ok";

	/**
	 * 返回值消息:error
	 */
	private static final String ERROR = "error";

	/**
	 * 元数据
	 */
	private Meta meta;

	/**
	 * 返回的数据
	 */
	private Object data;

	public RestResponse success() {
		this.meta = new Meta(true, OK);
		return this;
	}

	public RestResponse success(Object data) {
		this.meta = new Meta(true, OK);
		this.data = data;
		return this;
	}

	public RestResponse failure() {
		this.meta = new Meta(false, ERROR);
		return this;
	}

	public RestResponse failure(String message) {
		this.meta = new Meta(false, message);
		return this;
	}

	public Meta getMeta() {
		return meta;
	}

	public Object getData() {
		return data;
	}

	/**
	 * 元数据内部类
	 * 
	 */
	public class Meta {

		/**
		 * 状态
		 */
		private boolean success;

		/**
		 * 回值消息：ok 与 error
		 */
		private String message;

		public Meta(boolean success) {
			this.success = success;
		}

		public Meta(boolean success, String message) {
			this.success = success;
			this.message = message;
		}

		public boolean isSuccess() {
			return success;
		}

		public String getMessage() {
			return message;
		}
	}
}
