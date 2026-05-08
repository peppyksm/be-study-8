package be_study_8.quiz;

public class Quiz03 {

	public static void main(String[] args) {
		
		//1번
		int x = 10;
		int y = 4;
		int result1_1 = x/y;
		System.out.println(result1_1);   //결과1
		double result1_2 = (double)x/y;
		System.out.println(result1_2);   //결과2
		
		
		//2번
		double a1 = 3.5;
		double b1 = 4.7;
		double result2 = a1 + (int)b1;
		System.out.println(result2);
		
		
		//3번
		String a2 = "3.4";
		String b2 = "4";
		int result3 = (int)(Double.parseDouble(a2)) * Integer.parseInt(b2);
		System.out.println(result3);
		
		
		//4번
		String a4 = "10";
		int b4 = 3;
		double c4 = 4.5;
		String result4 = a4 + (int)(b4 * c4);
		System.out.println(result4);
		

		//5번
		int a5 = 4;
		double b5 = 3.4;
		String c5 = "6.8";
		String result5 = (a5 * (int)(Double.parseDouble(c5))) + String.valueOf((int)b5);
		System.out.println(result5);
		
		
		//6번
		int x6 = 111;
		int y6 = 13;
		int result6_1 = (x6 % y6);
		System.out.println(result6_1); //결과 1
		int result6_2 = (x6 / y6);
		System.out.println(result6_2); //결과 2
	}
}
