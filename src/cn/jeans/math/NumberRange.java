package cn.jeans.math;

public class NumberRange {
	public static void main(String[] args) {
		
		
		System.out.println(Short.MAX_VALUE);//��ӡ��������:32767                  3E4
		System.out.println(Short.MIN_VALUE);//��ӡ��С������:32768 
		
		System.out.println(Integer.MAX_VALUE);//��ӡ�������:2147483647             2E9
		System.out.println(Integer.MIN_VALUE);//��ӡ��С����:-2147483648 
		
		System.out.println(Long.MAX_VALUE);//��ӡ�������:9223372036854775807     9E18
		System.out.println(Long.MIN_VALUE);//��ӡ��С������:-9223372036854775808 
		
		System.out.println(Float.MAX_VALUE);//									   3.4028235E38
		System.out.println(Float.MIN_VALUE); //									   1.4E-45
		
		System.out.println(Double.MAX_VALUE);//									   1.7976931348623157E308
		System.out.println(Double.MIN_VALUE);//									   4.9E-324
		
		//-------------------------------------------------------------------------------
		short s = 32767;
		Integer i = 32767;
		System.out.println(i.getClass().getName());//�鿴i������ ����int����ʱ�������ô˷���
		
		//long l = 2147483648; //�������  ����int(2147483647)���ڵ��������l
		long l = 9223372036854775807l; 
		
		
		//------------------------------------------------------------------------------
		
		/*
		 * ����int(2147483647)���ڵ�������Ӻ�׺  int(2147483648)-long(9223372036854775807) ֮���Ҫ�� l 
		 * long(9223372036854775808)-float(3.4028235E38)֮�ϵ�Ҫ�� f 
		 */
		//float f = 9223372036854775807;//�������

		float f1 = 32767;
		float f2 = 9223372036854775807l;
		float f3 = 3.4028235E38f;
		/*
		 * Java�е�С��Ĭ����double�͵ģ��Ӳ���d���У���Ҫ����float��Ҫ��f��ʶ��
		 */
		double d = 1.7976931348623157E308;//���ڱ���С������Ҳ���l��f��ʶ ����float��Χ��(3.4028235E38-)����ӱ�ʶ
		
	}
}