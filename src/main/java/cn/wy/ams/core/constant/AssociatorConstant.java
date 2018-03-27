package cn.wy.ams.core.constant;

public class AssociatorConstant {
	/**
	 * 会员号总长度
	 */
	public static final int AID_LONG = 16;
	
	/**
	 * 会员号成员
	 *
	 */
	public static enum AidMembers {
		/**
		 * 业务模块
		 */
		MODULE(0,1),
		/**
		 * 模块编号
		 */
		MODULE_ID(6,6),
		/**
		 * 性别
		 */
		SIX(7,1),
		/**
		 * 自增长
		 */
		INCREASE(14,7),
		/**
		 * 校验码
		 */
		CHACK(15,1);
		
		private int len;
		private int index;
		private AidMembers(int index, int len){
			this.len = len;
			this.index = index;
		}
		public int getLen(){
			return this.len;
		}
		public Integer getIndex(){
			return this.index;
		}
	}
	
	/**
	 * 会员状态
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
		FREEZE(2),
		/**
		 * 挂失
		 */
		LOSS(3),
		/**
		 * 删除
		 */
		DELETE(4);
		
		private int status;
		private Status(int status){
			this.status = status;
		}
		public int value(){
			return this.status;
		}
	}
	
	/**
	 * 会员注册来源
	 *
	 */
	public static enum Source {
		/**
		 * 客户端
		 */
		CLIENT(0),
		/**
		 * 物理店
		 */
		PHYSICAL_STORE(1),
		/**
		 * 线上商城
		 */
		E_STORE(3),
		/**
		 * 后台录入
		 */
		BACKSTAGE(4),
		/**
		 * 第三方系统
		 */
		THIRD_PARTY(5),
		/**
		 * 其他
		 */
		OTHER(6);
		
		private int s;
		private Source(int s){
			this.s = s;
		}
		public int value(){
			return this.s;
		}
	}
	
	/**
	 * 会员卡类型
	 *
	 */
	public enum Type{
		/**
		 * 个人卡
		 */
		PERSONAL(0),
		/**
		 * 家庭卡
		 */
		FAMILY(1);
		private int type;
		private Type(int type){
			this.type = type;
		}
		public int value(){
			return this.type;
		}
	}
	
	/**
	 * 信息是否证实
	 */
	public static enum Isreal{
		/**
		 * 未证实
		 */
		NOT_KNOW(0),
		/**
		 * 真实
		 */
		REAL(1);
		
		private int value;
		private Isreal(int value){
			this.value = value;
		}
		public int value(){
			return this.value;
		}
	}
}
