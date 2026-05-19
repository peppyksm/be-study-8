package be_study_8.refr;

public class Arr05 {

	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30, 40, 50};
		
		for(int i = 0; i<5; i++) {
			System.out.printf("arr[%d] = %d\n", i , arr[i]);
		}
		System.out.println();
		
		
		
		//향상 for문
		for(int v : arr) { //{10, 20, 30, 40, 50};
			//배열 전체 갯수만큼 처음부터 끝까지 반복
			//v : 값이 주어진다. 값을 바로 주입하고 현재 인덱스는 모름
	
			System.out.print(v + " ");
		}
		System.out.println();
		
		
		
		
		int index = 0;
		for(int v : arr) { //{10, 20, 30, 40, 50};

			//index == break;
			//if(index == 3){break;}
			System.out.println("index : " + index + " 값 : " + v);
			index++;
		}
		System.out.println();
		
		int [] scores = {90, 95, 100, 85, 80};
		int sum = 0;
		
		for(int i = 0; i<scores.length; i++) {
			sum = sum + scores[i];
		}
		System.out.println(sum);
		
		
		
		sum = 0;
		for(int s : scores) {
			sum = sum + s;
		}
		System.out.println(sum);
		
		//scores 에 있는 모든 점수 -5점 감점처리
		
		
		for(int i = 0; i<5; i++) {
			scores[i] = scores[i] - 5;
		}
		System.out.println();
		
		
//		for(int s : scores) {
//			s = s - 5;
//		}
		
//		for(int i = 0; i<5; i++) {
//			int s = scores[i];
//			s = s - 5;
//		}
		
		
		//출력용
		for(int s : scores) {
			System.out.print( s + " ");
		}
		System.out.println();
	}

}
