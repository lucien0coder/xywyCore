package cn.wy.ams.core.exption;


/**
 * 婉约核心异常类
 *
 */
public class CoreException extends RuntimeException {

	private static final long serialVersionUID = 906042892362511213L;
	/**
	 * 错误码
	 */
	private ErrorCode errorCode;
	
	/**
	 * 
	 * @param errorCode 错误码
	 * @param message 消息
	 * @since 4.0.0
	 */
	public CoreException(ErrorCode errorCode, String message) {
		super(message);
		this.errorCode = errorCode;
	}

	/**
	 * 
	 * @return 错误码,可能为null
	 * @since 4.0.0
	 */
	public ErrorCode getErrorCode() {
		return errorCode;
	}

}
