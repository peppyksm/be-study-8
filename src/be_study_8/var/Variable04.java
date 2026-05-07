package be_study_8.var;

public class Variable04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "12";
		int n1 = 11;
		int n2 = 22;
		
		System.out.println(n1 + n2 + s1); //n1+n2 연산값 + s1문자열 33"12"
		System.out.println(n1 + s1 + n2); //n1값, s1문자열, n2  11"12"22
		
		String s2 = "1234";
		int n3 = 16;
		System.out.println(s2 + n3); //"1234"16
		
		//문자열 -> 다은데이터형
		//String str = "1234 or 12.34 or true";
		//Integer.parseint(str);   
		//Double.parsedouble(str);
		//Boolean.parseboolean(str);
		System.out.println(Integer.parseInt(s2) + n3); //1234+16=1250
		
		String s3 = "33.55";
		//int n4 = Integer.parseInt(s3);
		//System.out.println(n4);  문자열 변환했을 때 실수가 되는걸 int로 변환 안됨
		
		double d4 = Double.parseDouble(s3);
		System.out.println(d4 + 12.1);
		
		//String s4 = "12a.12b";  숫자형 아닌 문자열을 숫자형으로 변환 안됨
		//Double.parseDouble(s4); 
		
		boolean b1 = true;
		
		String s5 = "false";
		
		boolean b2 = Boolean.parseBoolean(s5);
		System.out.println(b2);
		System.out.println(s5); //콘솔 출력은 같으나 내부 처리는 다름
		
		//기본타입(숫자, 논리) -> 문자열
		
		String s10 = String.valueOf(b1);
		String s11 = String.valueOf(123);
		String s12 = String.valueOf(133.568);
		
		String s13 = 123 + "";  //편법
		System.out.println(s13);
		
		
	}

}
