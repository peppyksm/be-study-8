package be_study_8.quiz;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 1번. 삼각형의 밑변과 높이를 입력받아서 넓이를 출력하세요. (소수점까지 표현)
		// 삼각형의 넓이 = 밑변 * 높이 / 2 ;
		System.out.print("밑변의 길이를 입력하세요 : ");
		String lower = scanner.nextLine();
		System.out.print("높이를 입력하세요 : ");
		String height = scanner.nextLine();
		double lowerDb = Double.parseDouble(lower);
		double heightDb = Double.parseDouble(height);
		double extent1 = lowerDb * heightDb / 2;
		System.out.println("삼각형의 넓이 = " + extent1);

		
		
		
		// 2번. 사다리꼴의 윗변과 밑변과 높이를 입력받아서 넓이를 출력하세요. (소수점까지 표현)
		// 사다리꼴의 넓이 = (윗변 길이 + 밑변 길이) * 높이 / 2;
		System.out.print("윗변의 길이를 입력하세요 : ");
		String upper2 = scanner.nextLine();
		System.out.print("아랫변의 길이를 입력하세요 : ");
		String lower2 = scanner.nextLine();
		System.out.print("높이를 입력하세요 : ");
		String height2 = scanner.nextLine();
		double upperDb2 = Double.parseDouble(upper2);
		double lowerDb2 = Double.parseDouble(lower2);
		double heightDb2 = Double.parseDouble(height2);
		double extent2 = (upperDb2 + lowerDb2) * heightDb2 / 2;
		System.out.println("사다리꼴의 넓이 = " + extent2);
		
		
		
		// 3번. 우리반은 24명입니다. 과자가 100개 있습니다.
		// 모두에게 공정하게 동일한 숫자의 과자를 나누어주면
		// 한 명당 몇 개의 과자를 받게되는지와 나누어주고 나서 몇개의 과자가 남는지 출력하세요.
		int student = 24;
		int snack = 100;
		
		int take = snack / student;
		int left = snack % student;
		
		System.out.printf("한 명당 과자는 %d개 받았고, %d개의 과자가 남았다.\n",take,left);

		
		
		
		
		
		
		// 4번. 세자리의 정수를 입력 받아서 백의자리, 십의자리, 일의자리를 각각 출력하세요.
		// 158
		// 백의자리 : 1
		// 십의자리 : 5
		// 일의자리 : 8
		System.out.println("세자리의 정수를 입력하세요 : ");
		String num = scanner.nextLine();
		int numInt = Integer.parseInt(num);
		
		int third = numInt/100;
		int second = (numInt % 100)/10;
		int first = (numInt % 100)%10;
		
		System.out.println("백의 자리 : " + third);
		System.out.println("백의 자리 : " + second);
		System.out.println("백의 자리 : " + first);
		
		
		

		// 5번 x와 y 변수 안에 들어있는 서로의 값을 바꾸기
		int x = 10;
		int y = 20;
		System.out.println("x="+x+ " y="+y);

		int xOriginal = x;
		x = y;
		y = xOriginal;
		
		System.out.println("x="+x+ " y="+y);
	}
}
