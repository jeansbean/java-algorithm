package cn.jeans.exam;

import java.util.Scanner;

import com.sun.org.glassfish.external.statistics.impl.StatisticImpl;

import sun.print.resources.serviceui;

public class FibonacciTest {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("请输入一个目标位置：");
		int pos = s.nextInt();
		long tar = getValue(pos);
		System.out.println("您要的菲波那切数列第"+pos+"位为:"+tar);
	}
	
	public static long getValue(int x){
		long[] fibonacci = new long[x];
		fibonacci[0]=0;
		fibonacci[1]=1;
		if(x==1){
			return 0;
		}
	    long a = 0;
	    long b = 1;
	    long sum = 1;
		for(int i=2;i<x;i++){
			sum=a+b;
			fibonacci[i]=sum;
			a=b;
			b=sum;
		}
		
		for (int i = 0; i < fibonacci.length; i++) {
			System.out.println("斐波那契数列第"+i+"位:"+fibonacci[i]);
		}
		return sum;
		
	}
}
