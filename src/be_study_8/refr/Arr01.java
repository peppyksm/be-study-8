package be_study_8.refr;

public class Arr01 {

	public static void main(String[] args) {
		
		//Array 배열, 시험 5번 본 점수
		
		int score1 = 100; 
		int score2 = 50;
		int score3 = 75;
		int score4 = 80;
		int score5 = 40;
		
		int sum = 0;
		sum = score1 + score2 + score3 + score4 + score5;
		
		double avg = sum / 5.0;
		
		System.out.println("총점 : " + sum + " 평균 : " + avg);
		
		//배열은 보통 변수명에 배열임을 알려주도록 scores, scoreArr, scoreArray 등으로 지음
		int[] scoreArr = {100, 50, 75, 80, 40};       //배열 값 초기화
		//index           0    1    2   3  4
		
		sum = 0;
		
		for(int i = 0; i<=4; i++) {
			sum += scoreArr[i];
		}
		
		System.out.println(sum);
		System.out.println(sum / 5);
		
		//배열 생성
		int n;
		int[] menuArr; //단순 선언
		
		int n2 = 0;
		int[] pointArr = null; //null값 초기화
		
		//pointArr = {1, 2, 3, 4,5}; 변수 생성한 시점에 써야 사용가능
		
		pointArr = new int[] {30, 20, 10, 5, 1}; //index 0~4 (5개)
		pointArr = new int[5]; //사이즈 명시로 생성
		
		n = 30;
		n = n+5;
		
		pointArr[2] = 10;  //pointArr[2] : pointArr배열의 2인덱스
		
		
		pointArr[0] = 30;
		pointArr[1] = 12;
		pointArr[2] = 10;
		pointArr[3] = 5;
		pointArr[4] = 1;
		//pointArr[5] = 500; indet 범위 벗어남
		
		
		//배열 1 2 3 4 5 저장
		for(int i = 0; i<5; i++) { //index기준 0 1 2 3 4
			pointArr[i] = i + 1;
			System.out.print(pointArr[i]);
		}
		System.out.println();
		
		for(int i = 1; i<=5; i++) { //값 기준 1 2 3 4 5
			pointArr[i - 1] = i;
			System.out.print(pointArr[i-1]);
		}
		System.out.println();
		
		System.out.println(pointArr); //참조변수 주소값
		
		
		System.out.println("==========초기값 확인==========");
		int[] intArr = new int[6];
		double[] doubleArr = new double[12];
		String[] stringArr = new String[30];
		boolean[] booleanArr = new boolean[14];
		
		
		//배열변수명.length = 그 배열의 index 수
		System.out.println();
		for(int i = 0; i < intArr.length; i++) {
			System.out.print(intArr[i]);
		}
		System.out.println();
		
		for(int i = 0; i < doubleArr.length; i++) {
			System.out.print(doubleArr[i]);
		}
		System.out.println();
		
		for(int i = 0; i < stringArr.length; i++) {
			System.out.print(stringArr[i]);
		}
		System.out.println();
		
		for(int i = 0; i < booleanArr.length; i++) {
			System.out.print(booleanArr[i]);
		}
		System.out.println();
	}
}
