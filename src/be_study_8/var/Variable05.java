package be_study_8.var;

import java.util.Scanner;
//scanner import

public class Variable05 {

	public static void main(String[] args) {
		
		System.out.println("println1");
		System.out.println("println2");  //println은 줄바뀜o
		String s1 = "text test";
		System.out.println(s1);
		
		System.out.print("print1");
		System.out.print("print2\n"); //print는 줄바꿈 x, \n 줄바꿈
		
		System.out.println(); //줄바꿈
		
		System.out.println("println3");
		
		int hour = 15;
		int minute = 2;
		//현재 시간은 15시 2분 입니다.
		System.out.println("현재 시간은 " + hour + "시 " + minute + "분 입니다.");
		System.out.printf("현재 시간은 %d시 %d분 입니다.\n", hour, minute);
		//printf - %d로 미리 자리를 정하고 콤마 붙여 변수를 넣으면 해당 위치에 변수 삽입
		//printf는 줄바뀜이 안되므로 \n 혹은 println으로 줄바꿈 해줘야함
		
		System.out.println("앙기모따");
		
		String menu = "갈비부리또";
		
		System.out.println("오늘 점심 메뉴는 " + menu + "입니다.");
		System.out.printf("오늘 점심 메뉴는 %s입니다.\n",menu);
		//%d는 정수형, %s는 문자형
		
		double rate = 3.4612;
		System.out.println("오늘 기준 이자율은 " + rate + "% 입니다.");
		System.out.printf("오늘 기준 이자율은 %f%% 입니다.\n", rate);
		//%f가 실수형이나 뒤에 %가 붙어야 한다면 %f% 후에 %를 붙여야함
		
		System.out.printf("오늘 기준 이자율은 %.2f%% 입니다.\n", rate);
		System.out.printf("오늘 기준 이자율은 %.3f%% 입니다.\n", rate);
		// %.3f는 소수점 세자리까지, %4f는 소수점 네자리까지 라는 뜻
		
		System.out.printf("오늘 기준 이자율은 %10.4f%% 입니다.\n", rate);
		System.out.printf("오늘 기준 이자율은 %-10.4f%% 입니다.\n", rate);
		//%10.4f는 자릿수 10개를 미리 맡아놓고 소수점은 4개까지 보여준다는 뜻
		//일반 숫자면 오른쪽 정렬, -를 붙이면 왼쪽정렬
		
		
		//입력 받기 Scanner
		Scanner scanner = new Scanner(System.in); //스캐너 사용하려면 선입력
		//int = scanner.nextInt()
		//double = scanner.nextDouble()
		//string = scanner.nextLine()
		
		System.out.print("숫자를 입력하세요 : ");
		int number = scanner.nextInt();
		System.out.printf("당신이 입력한 숫자는 %d입니다.\n", number);
		
		System.out.print("실수형 숫자를 입력하세요 : ");
		double number2 = scanner.nextDouble();
		System.out.printf("당신이 입력한 실수형 숫자는 %.3f입니다.\n", number2);
		
		
		scanner.nextLine();//앞에서 입력된 찌꺼기 엔터를 청소하는 역할
		
		
		System.out.print("문자열을 입력하세요 : ");
		String str = scanner.nextLine();
		System.out.printf("입력한 문자열 : %s 입니다.", str);
		
		
		
		
		
		
		
		
	}
}