package cn.wy.ams.core.exption;

/**
 *  婉约系统错误码
 */
public enum ErrorCode {
	NULL_OBJ(1000),
    ERROR_ADD_USER(1001),
    UNKNOWN_ERROR(1002),
    FILE_NOT_FOUND(1003);
    
	private int statusCode;
	
	/**
	 * 构造函数
	 * @param statusCode http状态码
	 * @since 4.0.12
	 */
	private ErrorCode(int statusCode) {
		this.statusCode = statusCode;
	}

	/**
	 * 取得错误代码对应的http状态码
	 * @return http状态码
	 * @since 4.0.12
	 */
	public int value() {
		return statusCode;
	}
}
