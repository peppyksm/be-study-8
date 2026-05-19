package be_study_8.refr;

public class Arr04 {

	public static void main(String[] args) {
		
		//배열 참조타입 vs int 기본타입
		
		
		int a = 10;
		int b = a;
		System.out.println(a + " " + b);
		
		b = 20;
		System.out.println(a + " " + b);
		
		
		
		//배열 복사
		
		//참조타입인 경우 복사
		//얕은 복사(shallow copy) vs 깊은 복사(deep copy)
		
		int[] arr1 = {10, 20, 30};
		int[] arr2 = arr1;   //얕은 복사
		
		for(int i = 0; i<3; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		
		for(int i = 0; i<3; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		
		arr2[0] = 99;
		System.out.println("----값 수정 후 다시 출력----");
		//같은 주소를 참조하던걸 수정해서 복사 전 배열의 인덱스 주소의 데이터 값도 바뀜
		
		for(int i = 0; i<3; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		
		for(int i = 0; i<3; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		
		
		
		
		int[] arr3 = {10,20,30};
		int[] arr4 = new int[3];
		
		for(int i = 0; i < 3; i++) {
			arr4[i] = arr3[i];
		}
		
		System.out.println("----깊은 복사 출력----");
		for(int i = 0; i<3; i++) {
			System.out.print(arr3[i] + " ");
		}
		System.out.println();
		
		for(int i = 0; i<3; i++) {
			System.out.print(arr4[i] + " ");
		}
		System.out.println();
		
		arr4[0] = 99;
		
		System.out.println("----값 수정 후 다시 출력----");
		//새 주소에 다른 배열의 값만 가지고와서 복사한것이므로 원본배열은 변경x
		for(int i = 0; i<3; i++) {
			System.out.print(arr3[i] + " ");
		}
		System.out.println();
		
		for(int i = 0; i<3; i++) {
			System.out.print(arr4[i] + " ");
		}
		System.out.println();
		
		
		System.out.println("얕은 복사 주소값 비교"); //주소값 같음
		System.out.println(arr1 == arr2);
		System.out.println("깊은 복사 주소값 비교"); //주소값 다름
		System.out.println(arr3 == arr4);
		
		System.out.println("인덱스의 값 비교(얕은 복사)");
		System.out.println(arr1[2] == arr2[2]); //주소값, 값 모두 같음
		System.out.println("인덱스의 값 비교(깊은 복사)");
		System.out.println(arr3[2] == arr4[2]); //주소값은 다르지만 값은 같음
		
		//배열 복사
		//System.arraycopy(복사할 대상, 복사할 대상의 위치(index), 저장할 대상, 저장할 대상의 위치(index), 갯수(길이) );
		int[] arr5 = {10,20,30};
		int[] arr6 = new int[3];
		
		//arr5의 0 index부터 들어있는 값을 arr6의 0 index에 총 3개의 값을 복사할 것이다
		System.arraycopy(arr5, 0, arr6, 0, 3);
		
		System.out.println("----System.arraycopy 후 출력----");
		for(int i = 0; i<3; i++) {
			System.out.print(arr5[i] + " ");
		}
		System.out.println();
		
		for(int i = 0; i<3; i++) {
			System.out.print(arr6[i] + " ");
		}
		System.out.println();
		
		System.out.println(arr5 == arr6);
		
		
		arr6[0] = 99;
		
		System.out.println("----값 수정 후 다시 출력----");
		for(int i = 0; i<3; i++) {
			System.out.print(arr5[i] + " ");
		}
		System.out.println();
		
		for(int i = 0; i<3; i++) {
			System.out.print(arr6[i] + " ");
		}
		System.out.println();
		
		System.out.println(arr5 == arr6);
		System.out.println("----System.arraycopy는 깊은 복사임----");

		
	}

}
