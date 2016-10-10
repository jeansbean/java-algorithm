package cn.jeans.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
	public static void main(String[] args) {
		String s = "aaaa876CDE543X";
		Pattern p = Pattern.compile("\\d+"); //匹配876
		//Pattern p = Pattern.compile("6");
		Matcher m = p.matcher(s);

		System.out.println("m.find()-----------------"+                m.find());//true 匹配成功
		System.out.println("m.start()----------------"+                m.start());//4
		System.out.println("m.end()------------------"+                m.end());//7
		System.out.println("m.group()----------------"+                m.group());//876
		System.out.println("m.lookingAt()------------"+                m.lookingAt());//true 匹配成功
		System.out.println(m.matches());//只有整个字符串匹配正则表达式时，才返回true
		
		System.out.println("m.groupCount()-----------------"+                m.groupCount());//true 匹配成功
//		System.out.println("m.start()----------------"+                m.start());//4
//		System.out.println("m.end()------------------"+                m.end());//7
//		System.out.println("m.group()----------------"+                m.group());//876
//		System.out.println(m.matches());//只有整个字符串匹配正则表达式时，才返回true
	
	}
}
