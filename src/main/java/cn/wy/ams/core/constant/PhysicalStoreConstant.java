package cn.wy.ams.core.constant;

/**
 * 线下店常量
 */
public class PhysicalStoreConstant {
	public static enum Status{
		/**
		 * 正常
		 */
		NORMAL(0),
		/**
		 * 停业
		 */
		OUT_BUSINESS (1),
		/**
		 * 关闭
		 */
		DELETE(2);
		private int status;
		private Status(int status){
			this.status = status;
		}
		public int value(){
			return status;
		}
	}
}
