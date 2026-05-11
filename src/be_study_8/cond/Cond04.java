package be_study_8.cond;

public class Cond04 {

	public static void main(String[] args) {
		
		//조건문 중첩 && ||   이중 if문
		
		int goBedTime = 23; //23시에 자러가고
		int sleepTime = 5; //5시간 수면
		
		if(goBedTime <= 21) {//일찍
			if(sleepTime >= 8) {//많이
				System.out.println("일찍 많이");
			}else {//적게
				System.out.println("일찍 적게");
			}
		}else {//늦게
			if(sleepTime >= 8) {//많이
				System.out.println("늦게 많이");
			}else {//적게
				System.out.println("늦게 적게");
			}
		}
		
		
		if (goBedTime <= 21 && sleepTime >= 8) {
			System.out.println("일찍 많이");
		}else if(goBedTime <= 21 && sleepTime < 8) {   //(goBedTime <= 21 && !(sleepTime >= 8))  ! 부정으로도 처리
			System.out.println("일찍 적게");
		}else if(goBedTime >= 21 && sleepTime >= 8) {
			System.out.println("늦게 많이");
		}else {
			System.out.println("늦게 적게");
		}
		
		int point = 50;
		
		if (point >= 0 && point <= 100) {
			if(point >= 50) {
				System.out.println("잘했네");
			}else {
				System.out.println("아쉽네");
			}
		}else {
			System.out.println("잘못된 점수가 들어왔습니다. 점수는 0~100점만 가능.");
		}
	}

}
