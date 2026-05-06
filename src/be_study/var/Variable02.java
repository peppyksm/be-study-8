package be_study.var;

public class Variable02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num2 = 0b10;
		int num8 = 012;
		int num10 = 10;
		int num16 =0x30;
		
		char chr1 = 'A'; //문자 1개 저장
		
		char chr2 = 86;    //유니코드 아스키코드 맵핑 값으로 컴파일됨
		char chr3 = 0x23;
		
		char chr4 = 'f';
		System.out.println(chr1);
		System.out.println(chr2);
		System.out.println(chr3);
		System.out.println(chr4);
		
		String s1 = "안"; //문자열 저장
		String s2 = "녕";
		String s3 = "안녕하세요~";
		String s4 = "123123"; 
		
		System.out.println(s3);
		System.out.println(s4);
		
		int n = 1234;
		
		System.out.println( n + 10 );
		System.out.println((s4 + 10)); //숫자연산 안먹음
		
		System.out.println("지금은 16시 입니다.");
		System.out.println("지금은 " + 16 + "시 입니다.");
		
		String msg = "\"안녕\"하세요";   // \를 붙이면 ""도 문자열로 인식
		System.out.println(msg);
		
		System.out.println("어서\t오세요~ \n반갑습니다.");  // \t = tap, \n = 줄바꿈
		
		double d1 = 12.123;
		double d2 = 500.0;
		double d3 = 5e2; //e2=10의 2승, 5e2 = 5 * 100 = 500
		double d4 = 0.0012;
		double d5 = 0.12E-2;  // E-2 = 10의 -2승, 100분의 1
		
		float f1 = 123.45f; //f 붙여야함
		
		boolean open = true;  //참 거짓
		boolean close = false;
		boolean stop = false;
		
		boolean isOpend = true;
		boolean inClosed = false;
		
		boolean hasOption = true;
		
		
	}
}
