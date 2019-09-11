package com.cww.common.pojo;

public class CommonResponse {
	
	public static final int SUCCESS_CODE = 0;
	
	/*
	 * 返回码
	 */
	private int code = SUCCESS_CODE;
	
	/*
	 * 提示信息msg
	 */
	private String msg;
	
	/*
	 * 返回数据data
	 */
	private Object data;
	
	 /*
	  * 时间戳
	  */
    private Long timestamp = System.currentTimeMillis();

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}
}
