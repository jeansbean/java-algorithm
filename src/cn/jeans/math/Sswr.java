package cn.jeans.math;

import java.math.*;

public class Sswr {
	public static void main(String[] args) {
		//float f = 7; 不需要加f 因为7为int类型   转换比它小的数据类型时候可以显式转换，否则要声明字面量类型（例如7.0f 或者7.0F）
		long l = 9;
		//long ll = 9999999999;  9999999999 超出了int的范围应该加l或L;
		long lll = 9999999999l;
		
		
		float a = 1.123456789123456789f; //输出保留小数点后7位
		double b = 1.123456789123456789d; //输出保留小数点后16位
		System.out.println(a+" "+b);
		
		float f = 1.6f;
		double d1 = Math.ceil(f);//2.0
		double d2 = Math.floor(f);//1.0
		double d3 = Math.round(f);//2.0 +0.5后向下取整
		float  f1 = Math.round(f);//2.0
		
		System.out.println(d1+" "+d2+" "+d3+" "+f1+" ");
		
		double d = -1.5;
		double dd1 = Math.ceil(d);//-1.0
		double dd2 = Math.floor(d);//-2.0
		double dd3 = Math.round(d);//-1.0
		float  ff1 = Math.round(d);//-1.0
		System.out.println(dd1+" "+dd2+" "+dd3+" "+ff1+" ");
		
		double dd = -1.6;
		double ddd1 = Math.ceil(dd);//-1.0
		double ddd2 = Math.floor(dd);//-2.0
		double ddd3 = Math.round(dd);//-1.0
		float  fff1 = Math.round(dd);//-1.0
		System.out.println(ddd1+" "+ddd2+" "+ddd3+" "+fff1+" ");
	}
}
