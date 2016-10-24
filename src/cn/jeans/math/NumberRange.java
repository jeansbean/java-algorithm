package cn.jeans.math;

public class NumberRange {
	public static void main(String[] args) {
		
		
		System.out.println(Short.MAX_VALUE);//打印最大短整型:32767                  3E4
		System.out.println(Short.MIN_VALUE);//打印最小短整型:32768 
		
		System.out.println(Integer.MAX_VALUE);//打印最大整数:2147483647             2E9
		System.out.println(Integer.MIN_VALUE);//打印最小整数:-2147483648 
		
		System.out.println(Long.MAX_VALUE);//打印最大长整型:9223372036854775807     9E18
		System.out.println(Long.MIN_VALUE);//打印最小长整型:-9223372036854775808 
		
		System.out.println(Float.MAX_VALUE);//									   3.4028235E38
		System.out.println(Float.MIN_VALUE); //									   1.4E-45
		
		System.out.println(Double.MAX_VALUE);//									   1.7976931348623157E308
		System.out.println(Double.MIN_VALUE);//									   4.9E-324
		
		//-------------------------------------------------------------------------------
		short s = 32767;
		Integer i = 32767;
		System.out.println(i.getClass().getName());//查看i的类型 当用int定义时，不可用此方法
		
		//long l = 2147483648; //编译错误  对于int(2147483647)以内的数无需加l
		long l = 9223372036854775807l; 
		
		
		//------------------------------------------------------------------------------
		
		/*
		 * 对于int(2147483647)以内的数无需加后缀  int(2147483648)-long(9223372036854775807) 之间的要加 l 
		 * long(9223372036854775808)-float(3.4028235E38)之上的要加 f 
		 */
		//float f = 9223372036854775807;//编译错误

		float f1 = 32767;
		float f2 = 9223372036854775807l;
		float f3 = 3.4028235E38f;
		/*
		 * Java中的小数默认是double型的（加不加d都行）。要定义float需要加f标识。
		 */
		double d = 1.7976931348623157E308;//对于比其小的类型也添加l、f标识 大于float范围的(3.4028235E38-)无需加标识
		
	}
}