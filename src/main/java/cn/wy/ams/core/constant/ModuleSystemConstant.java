package cn.wy.ams.core.constant;

/**
 * 模块系统常量
 */
public class ModuleSystemConstant {
	/**
	 * 系统状态
	 *
	 */
	public static enum Status {
		/**
		 * 正常
		 */
		NORMAL(0),
		/**
		 * 停用
		 */
		DISABLE(1),
		/**
		 * 关闭
		 */
		CLOSE(2);
		private int status;
		private Status(int status){
			this.status = status;
		}
		public int value(){
			return status;
		}
	}
}
