package cn.wy.ams.core.constant;

/**
 * 员工常量
 */
public class EmployeeConstant {
	public static enum Status{
		/**
		 * 正常
		 */
		NORMAL(0),
		/**
		 * 停职
		 */
		SUSPENSION (1),
		/**
		 * 离职
		 */
		QUIT(2);
		private int status;
		private Status(int status){
			this.status = status;
		}
		public int value(){
			return status;
		}
	}
}
