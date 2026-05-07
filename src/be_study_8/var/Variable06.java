package be_study_8.var;

import java.util.Scanner;

public class Variable06 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num1 = scanner.nextInt();
		int num2 = 10;
		
		//기본타입 값이 같은가 비교연산자 ==
		// == 비교 --> 결과 --> 논리형(true/false)
		
		boolean b1 = num1 == num2;
		System.out.println(b1);
		
		scanner.nextLine();
		
		String str1 = scanner.nextLine();
		String str2 = "커피";
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1 == str2); //문자열은 == 비교연산자 인식 안됨
		System.out.println(str1.equals(str2));
		//문자열 비교는  문자열A.equals(문자열B)
		
		System.out.println(str1 == "커피");
		System.out.println(str1.equals("커피"));
		
		
	}
}
