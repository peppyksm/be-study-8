package be_study_8.var;

public class Operator01 {

	public static void main(String[] args) {
		
		//산술  + - * / %
		
		System.out.println( 1+1 );
		System.out.println( 10-5 );
		System.out.println( 5*9 );
		System.out.println( 30/7 );
		System.out.println( (double)30 / 7);
		System.out.println( 30/7.0 );
		System.out.println( 9%5 );
		System.out.println( 28%9 );
		
		//부호 + -
		System.out.println( 10);
		System.out.println( +10 );
		System.out.println( -10 );
		System.out.println( -(-10));
		
		//증감 ++ -- 처리 후 대상 변수 값이 변경됨
		
		
		
		
		System.out.println("======== 증감 =========");
		
		int x = 10;
		System.out.println( x ); //원본값 10
		System.out.println( ++x ); //처리 후 출력 11
		System.out.println( x ); //11
		
		System.out.println( 1+x ); //1+11
		System.out.println( x ); //11
		
		System.out.println( x++ ); //출력 후 처리 11
		System.out.println( x ); //위에서 처리된 값 12
		
		int y = 8;
		System.out.println( y-- ); //8
		System.out.println( --y ); //6 
		System.out.println( y ); //6
		
		int z = 30;
		System.out.println( z + 1 ); //31
		System.out.println( z++ ); //30
		System.out.println( z ); //31
		
		z++;
		++z;
		z = z + 1;
		
		int q = 1;
		int w = 3;
		int e = 10 + ++q;
		int r = 3 + w--;
		
		System.out.printf("%d %d %d %d",q,w,e,r); 
		//e에서 ++된 q값 2, r에서 --된 w값 2
		//++처리된 q와 10 더한 e값 12, --처리되기 전 값 3과 3 더한 r 값 6
		
		System.out.println("======== 논리부정 =========");
		//! not    true flase
		
		boolean isHungry = true;
		System.out.println(isHungry);
		System.out.println(!isHungry); //증감처럼 초기화 되진 않음
		System.out.println(isHungry);
		System.out.println(true);
		System.out.println(false);
		System.out.println(!true);
		System.out.println(!false);
		
		isHungry = false;
		System.out.println(isHungry);
		isHungry = !isHungry;
		System.out.println(isHungry);
		
		System.out.println( 133 + 3.345 + "문자");
		
		
		System.out.println("======== 비교(t/f)=========");
		System.out.println( 1 == 2 ); //f
		System.out.println( 1 != 2 ); //t
		System.out.println( 3 < 5 ); //t
		System.out.println( 10 >= 9 ); //t
		System.out.println( 4 > 4 ); //f
		System.out.println( 9 <= 1 ); //f
		
		boolean b1 = (9 > 8);
		System.out.println(b1);
		
		
		System.out.println("===========논리============");
		// AND,  && = 모두 true여야 true, 하나라도 false면 false
		// OR,   || = 하나라도 true이면 true, 모두 다 false면 false
		// XOR,  ^ == 서로 값이 다르면 true, 둘 다 ture거나 false면 false
		             //true && true = true
		boolean b2 = 10 > 6 && 10 > 5;
		System.out.println(b2);
		
		             //true || false = true
		boolean b3 = 5 != 1 || 10 < 4;
		System.out.println(b3);
		
		             //true && false = false
		boolean b4 = 2 >= 1 && !(3 < 4);
		System.out.println(b4);
		
		System.out.println("=========대입=========");
		int a = 30;
		a = 50;
		
		a += 30; //a에 30을 더함 = 80
		System.out.println(a);
		a -= 10; //a에 10을 뺌 = 70
		System.out.println(a);
		a *= 3; //a에 3을 곱함 = 210
		System.out.println(a);
		a /= 2; //a를 2로 나눔 = 105
		System.out.println(a);
		a %= 4; //a를 4로 나눈 나머지값 = 1
		System.out.println(a);
		//단체의 성향에 따라 대입연산자보다 일반 피연산자로 풀어 쓰는 경우 있음
		
		System.out.println("========삼항 연산자========");
		//조건식 ? (true일 때) : (false일 때)
		
		int point = 301;
		//포인트 200 >= point -> 사은품 생수
		//포인트 200 > point -> 사은품 커피
		
		String eventItem = (point > 200) ? "커피" : "생수";
		System.out.println(eventItem);
		
		eventItem = (point >= 200) ? "커피" : "생수";
		System.out.println(eventItem);
		
		/*삼항 연산자 중첩
		(조건식) ? (참일 때 삼항연산자) : (거짓일 때 삼항연산자)
		중첩이 많을 땐 삼항 연산자보단 if문이 유리할 경우가 많음*/
		
		//0~200=생수, 201~300=커피, 301~ =맥주.
		
		eventItem = (point < 200 ) ? "생수" : (point > 300)? "맥주" : "커피";
		System.out.println(eventItem);
		
		int num = 1;
		System.out.println( num == 0 ? "0" : num > 0 ? "양수" : "음수");
		System.out.println( num != 0 ? (num < 0 ? "음수" : "양수") : "0" );
		System.out.println( num > 0 ? "양수" : num < 0 ? "음수" : "0");
		System.out.println( num >= 0 ? (num == 0 ? "0" : "양수") : "음수");
		System.out.println( num < 0 ? "음수" : num > 0 ? "양수" : "0");
	}
}