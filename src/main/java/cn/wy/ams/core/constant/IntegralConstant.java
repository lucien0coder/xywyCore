package cn.wy.ams.core.constant;

/**
 * 积分常量
 */
public class IntegralConstant {
	public static enum Type{
		/**
		 * 消费
		 */
		CONSUMPTION(0),
		/**
		 * 获得
		 */
		GET  (1),
		/**
		 * 过期
		 */
		OVERDUE(2);
		private int type;
		private Type(int type){
			this.type = type;
		}
		public int value(){
			return type;
		}
	}
}
