package cn.jeans.exam;

public class GetNum {
	public static void main(String[] args) {
		String s = "i was in class 59, I studied english for 8 years!";
		String shortStr = " I like Emma when i was 16!";
		char[] ch = shortStr.toCharArray();
		System.out.println(ch.length);
		
		int digital=0;
		int character=0;
		int symbol = 0;
		int blank = 0;
		
		for(char c: ch){
			if((c>='a'&&c<='z')||(c>='A'&&c<='Z')){
				character++;
				System.out.println(c);
			}else if(c>='0'&&c<='9'){
				digital++;
			}else if(c==' '){
				blank++;
			}else{
				symbol++;
			}
		}
		System.out.println("��ĸ����Ϊ��"+character);
		System.out.println("���ָ���Ϊ��"+digital);
		System.out.println("�ո����Ϊ��"+blank);
		System.out.println("�����ַ�����Ϊ��"+symbol);
	}
}
