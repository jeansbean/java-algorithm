package cn.jeans.exam;

public class Fibonacci {
	public static void main(String[] args) {
		int x=0;
		int y=1;
		for(int i=3;i<20;i++){
			int z = y;
			y = x + y;
			x = z;
			System.out.println("斐波那契数列的第"+i+"项为："+y);
		}
	}
}
