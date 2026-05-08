package be_study_8.quiz;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1번
		
		int num = -1;
		System.out.println((num > 0) ? "양수" : (num == 0) ? "0" : "음수");

		//2번

		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하세요 : ");
		String num1 = scanner.nextLine();
		System.out.println("입력한 숫자 = "+num1);
		
		System.out.print("두번째 숫자를 입력하세요 : ");
		String num2 = scanner.nextLine();
		System.out.println("입력한 숫자 = "+num2);
		
		//int num1 = scanner.nextInt();   String 말고 다른 형식값으로도 입력 받을 수 있음, 변환 필요 없어짐
		
		int numInt1 = Integer.parseInt(num1); 
		int numInt2 = Integer.parseInt(num2); 
		
		System.out.printf("더하기 : %d + %d = %d \n",numInt1,numInt2,(numInt1+numInt2));
		System.out.printf("빼기 : %d - %d = %d \n",numInt1,numInt2,(numInt1-numInt2));
		System.out.printf("곱하기 : %d * %d = %d \n",numInt1,numInt2,(numInt1*numInt2));
		System.out.printf("나누기 : %d / %d = %f \n",numInt1,numInt2,(numInt1/(double)numInt2));
		
	}

}
