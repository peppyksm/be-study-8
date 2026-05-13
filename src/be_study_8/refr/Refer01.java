package be_study_8.refr;

import java.util.Scanner;

public class Refer01 {

	public static void main(String[] args) {


		int n;
		int num = 0 ;
		
		String s1;
		String s2 = null ;
		
		System.out.println(num);
		System.out.println(s2);
		
		Scanner scanner = new Scanner(System.in);
		
		String t1 = "사과";
		String t2 = "사과";
		String t3 = scanner.nextLine();
		String t4 = new String("사과");
		
		System.out.println(t1 == t2);              //문자열을 == 으로 비교하면 주소를 비교
		System.out.println(t1.equals(t2));		   //문자열을 .equals로 비교하면 실제 문제열을 비교
		
		System.out.println(t1 == t3);
		System.out.println(t1.equals(t3));
		
		System.out.println(t1 == t4);
		System.out.println(t1.equals(t4));
		
		System.out.println("==========================");
		
		String ne = null;
		System.out.println(ne == null);
		
		
		int n1 = 10;
		int n2 = n1;		//정수형 변수 안에 들어있는 값을 복사
		System.out.println(n1);
		System.out.println(n2);
		
		String str1 = "커피";
		String str2 = str1;		//참조형 변수 안에 있는 주소를 복사
		System.out.println(str1);
		System.out.println(str2);
	}

}
