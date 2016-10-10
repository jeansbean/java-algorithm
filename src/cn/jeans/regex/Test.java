package cn.jeans.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
	public static void main(String[] args) {
		String s = "aaaa876CDE543X";
		Pattern p = Pattern.compile("\\d+"); //ƥ��876
		//Pattern p = Pattern.compile("6");
		Matcher m = p.matcher(s);

		System.out.println("m.find()-----------------"+                m.find());//true ƥ��ɹ�
		System.out.println("m.start()----------------"+                m.start());//4
		System.out.println("m.end()------------------"+                m.end());//7
		System.out.println("m.group()----------------"+                m.group());//876
		System.out.println("m.lookingAt()------------"+                m.lookingAt());//true ƥ��ɹ�
		System.out.println(m.matches());//ֻ�������ַ���ƥ��������ʽʱ���ŷ���true
		
		System.out.println("m.groupCount()-----------------"+                m.groupCount());//true ƥ��ɹ�
//		System.out.println("m.start()----------------"+                m.start());//4
//		System.out.println("m.end()------------------"+                m.end());//7
//		System.out.println("m.group()----------------"+                m.group());//876
//		System.out.println(m.matches());//ֻ�������ַ���ƥ��������ʽʱ���ŷ���true
	
	}
}
