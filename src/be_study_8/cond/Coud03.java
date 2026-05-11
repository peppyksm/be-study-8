package be_study_8.cond;

public class Coud03 {

	public static void main(String[] args) {
		int dice = 2;
		
		if(dice == 1) {
			System.out.println("1칸 전진");
		}
		
		if(dice==1) {
			System.out.println("1칸 전진");
		}else {
			System.out.println("2칸 전진");
		}
		
		if(dice==1) {
			System.out.println("1칸 전진");
		}else if(dice==2) {
			System.out.println("2칸 전진");
		}else if(dice==3) {
			System.out.println("3칸 전진");
		}else if(dice==4) {
			System.out.println("4칸 전진");
		}else if(dice==5) {
			System.out.println("5칸 전진");
		}else if(dice==6){
			System.out.println("6칸 전진");
		}
		
		if(dice==1) {
			System.out.println("1칸 전진");
		}else if(dice==2) {
			System.out.println("2칸 전진");
		}else if(dice==3) {
			System.out.println("3칸 전진");
		}else if(dice==4) {
			System.out.println("4칸 전진");
		}else if(dice==5) {
			System.out.println("5칸 전진");
		}else {
			System.out.println("6칸 전진");
		}
		
		//else, else if를 쓰면 true일때 실행 후 코드가 종료되지만
		//아래처럼 if만을 사용하면 계속해서 물어보게 되는데 로직에 따라 불리할 수 있어 적절히 사용해아 함
		if(dice == 1) {}
		if(dice == 2) {}
		if(dice == 3) {}
		if(dice == 4) {}
		if(dice == 5) {}
		if(dice == 6) {}
		
		//조건식 -> true false 논리형
		if( dice > 10 ) {}
		
		//and && 연산자, or 연산자 || 활용 가능
		if( dice > 0 && dice <= 6) {}
		if( dice < 1 || dice > 6) {}
		
		System.out.println("=======switch ~ case=========");
		dice = 3;
		switch( dice ) {
		case 1:                            //dice == 1 이랑 같은 뜻
			System.out.println("1칸 전진");
			break;					 
		case 2: 
			System.out.println("2칸 전진");
			break;
		case 3: 
			System.out.println("3칸 전진");
			break;
		case 4: 
			System.out.println("4칸 전진");
			break;
		case 5: 
			System.out.println("5칸 전진");
			break;
		default:                           //else랑 같은 뜻
			System.out.println("6칸 전진");
			break;
		}
		//switch case 문은 case에서 true에 걸려도 아래 코드가 계속 진행되기 때문에
		//break를 입력해줘야 아래의 case 코드가 실행되지 않음
		
		
		
		int showTime = 8;
		

		if (showTime <= 8) {         //특정 변수값의 조건문에서만 실행
			//청소
		}else if( showTime <= 9) {
			//회의
		}else if( showTime <=10) {
			//업무
		}else if( showTime <= 11) {
			//외근
		}
		
		
		
		if (showTime <= 8) {       //switch문과 유사하게 실행
			//청소
			//회의
			//업무
			//외근
		}else if( showTime <= 9) {
			//회의
			//업무
			//외근
		}else if( showTime <=10) {
			//업무
			//외근
		}else if( showTime <= 11) {
			//외근
		}
		
		switch( showTime ) {       //break를 안 넣으면 아래까지 계속 실행
		case 8:
			//청소
		case 9:
			//회의
		case 10:
			//업무
		case 11:
			//외근
		}
		
		switch( showTime ) {      //특정 변수값에서만 실행
		case 8:
			//청소
			break;
		case 9:
			//회의
			break;
		case 10:
			//업무
			break;
		case 11:
			//외근
			break;
		}
	}

}
