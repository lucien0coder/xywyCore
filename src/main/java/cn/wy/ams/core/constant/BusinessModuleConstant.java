package cn.wy.ams.core.constant;

/**
 * 业务板块常量
 *
 */
public class BusinessModuleConstant {
	/**
	 * 板块值
	 */
	public static enum ModuleType {
		/**
		 * 婉约养老金融
		 */
		PENSION_FINANCE(1),
		/**
		 * 婉约养老其它
		 */
		PENSION_OTHER(2),
		/**
		 * 婉约公益
		 */
		PUBLIC_BENEFIT(3),
		/**
		 * 婉约便利
		 */
		STORE(4),
		/**
		 * 婉约旅居
		 */
		LIVING(5),
		/**
		 * 婉约线上商城
		 */
		E_STORE(6),
		/**
		 * 婉约文旅
		 */
		CULTURAL_LIVING(7),
		/**
		 * 市民卡
		 */
		CITIZEN(8),
		/**
		 * 合作医院
		 */
		HOSPITAL(9),
		/**
		 * 其它第三方
		 */
		OTHER(0);
		private int type;
		private ModuleType(int type){
			this.type = type;
		}
		public int value(){
			return type;
		}
	}
	
	/**
	 * 板块状态
	 *
	 */
	public static enum Status {
		/**
		 * 正常
		 */
		NORMAL(0),
		/**
		 * 未激活
		 */
		NOT_ACTIVE(1),
		/**
		 * 冻结
		 */
		FREEZE(2);
		private int status;
		private Status(int status){
			this.status = status;
		}
		public int value(){
			return status;
		}
	}
}
