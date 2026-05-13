package be_study_8.iter;

public class Iter01 {

	public static void main(String[] args) {
		
		//반복문 Iteration
		
		System.out.println("배고프다");
		
	  //for(초기화식; 조건식; 증감문){실행문}
		
		for(int i = 1; i<=10; i++) {
			if(i%2==0) {
				System.out.println("짝수 "+i);
			}else {
				System.out.println("홀수 "+i);
			}
		}
		
		int i = 0;
		
		for(i = 1; i < 3; i++) {
			System.out.println("피곤하다");
		}
		for(i = 35; i<45; ++i) {
			System.out.println("for 실행문");
		}

	}

}
