package cn.jeans.math;

import java.math.*;

public class Sswr {
	public static void main(String[] args) {
		//float f = 7; ����Ҫ��f ��Ϊ7Ϊint����   ת������С����������ʱ�������ʽת��������Ҫ�������������ͣ�����7.0f ����7.0F��
		long l = 9;
		//long ll = 9999999999;  9999999999 ������int�ķ�ΧӦ�ü�l��L;
		long lll = 9999999999l;
		
		
		float a = 1.123456789123456789f; //�������С�����7λ
		double b = 1.123456789123456789d; //�������С�����16λ
		System.out.println(a+" "+b);
		
		float f = 1.6f;
		double d1 = Math.ceil(f);//2.0
		double d2 = Math.floor(f);//1.0
		double d3 = Math.round(f);//2.0 +0.5������ȡ��
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
