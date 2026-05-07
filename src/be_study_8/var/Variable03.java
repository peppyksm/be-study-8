package be_study_8.var;

public class Variable03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//타입 변환
		//int -> double
		
		int i1 = 30;
		int i2 = i1;  //정수형 -> 정수형
//		int i3 = 3.11; 실수 -> 정수형 불가능
		
		double d1 = 3.11;
		double d2 = d1;  //실수형 -> 실수형
		double d3 = 40;  //40.0, 정수가 실수로 자동타입변환
		double d4 = 40.0; 
		
		System.out.println(i1);
		System.out.println(d3);
		
		double d5 = i1; //실수형 <- 정수형   정수가 실수로 자동타입변환 
		System.out.println(d5); 
		
		char c1 = 'A';
		int i3 = c1;
		System.out.println(c1);
		System.out.println(i3); //A의 유니코드 값이 출력
		
		//char c2=i3;  큰걸(int) 작은거(char)에 넣는건 자동타입변환 x 
		char c2 = (char)i3; //수동으로 형변환
		System.out.println(c2);
		
		double dd1 = 12.64;
		//int ii1 = dd1; 작은거(int)에 큰거(dd1)넣으려 해서 자동타입변환 x
		int ii1 = (int) dd1; //수동타입변환, 소수부분은 짤림
		System.out.println(ii1);
		
		
		//java 정수 = int, 실수 = double
		//float f1 = 4.45; 이렇게 넣으면 4.45가 double로 인식되므로 뒤에 f혹은 (float) 붙여야됨
		
		float f1 = 4.45f;
		float f2 = (float)4.45;
		double dd2 = f1; //여기서는 자용타입변환
		
		//연산에서 타입변환
		int i10= 3;
		double d10 = 5;
		
		//int i11 = i10 + d10;  int + double = double 강제형변환 or double에 넣어야함
		double d11 = i10 + d10;
		
		int i12 = 10;
		double d12 = 5.5;
		
		int i13 = (int)(i12 + d12);  //강제 형변환, 소수점은 날아감
		
		i13 = i12 + (int)d12;  //double을 int로 바꾸며 소수점을 날렸으므로 int형에 넣을 수 있음
		   //실질적으로 int(10)+int(5)= int(15)
		
		double dv1 = 5.5;
		double dv2 = 6.6;
		
		int result = (int)dv1 + (int)dv2; //5+6 형변환 후 계산해서 11 
		System.out.println(result);
		
		result = (int)(dv1 + dv2); //5.5+6.6= 12.1에서 형변환해서 12
		System.out.println(result);
		
		int x = 1;
		int y = 2;
		double result2 = x / y; //int / int = int, 0.5 ->0, double에 저장해 0.0
 		System.out.println(result2);
 		
 		result2 = (double)x / (double) y;
 		System.out.println(result2); //형변환 후 연산했으므로 올바른 값 나옴
 		
 		result2 = (double)x / y; //double / int
 		System.out.println(result2);
 		result2 = x / (double)y; //int / double
 		System.out.println(result2);
 		result2 = (double)x / (double)y; //double // double
 		System.out.println(result2);
 		
 		result2 = 1/2; //int / int
 		System.out.println(result2);
 		result2 = (double)1/2;  //double / int
 		System.out.println(result2);
 		result2 = 1/2.0; //int / double
 		System.out.println(result2);
		//int를 double로 나누거나 double을 int로 나눠서 double에 초기화하면 double로 인식
 		//int를 int로 나눠서 double에 저장하는것만 아니면 됨
		
	}
}
