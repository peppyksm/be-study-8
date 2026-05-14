package be_study_8.refr;

public class Arr03 {

	public static void main(String[] args) {
		
		int[] arr1 = {1, 2, 3};
		
		System.out.println(arr1[0] == arr1[0]);
		System.out.println(arr1[0] == arr1[2]);
		//기본타입 변수여서 값 비교
		
		String[] arr2 = {"A", "B", "C"};
		System.out.println(arr2[0] == arr2[2]);
		//참조타입 변수여서 주소로 비교
		
		System.out.println(arr2[0].equals(arr2[2]));
		//.equals로 비교해야 내부 문자열 값 비교
		
		String[][] arr3 = { {"A","B","C"},{"D","E","F"}};
		
		System.out.println(arr3.length); //행 길이
		System.out.println(arr3[0].length); //열 길이
		
		System.out.println(arr3[0] == arr3[1]);          //주소비교
		System.out.println(arr3[0][0] == arr3[1][1]);    //주소비교 
		System.out.println(arr3[0][0].equals(arr3[1][1]));	 //값비교
		
		int[][] arr4 = {{1,2,3},{4,5,6}};
		System.out.println(arr4[0] == arr4[1]);          //주소비교
		System.out.println(arr4[0][0] == arr4[1][1]);    //값 비교
	}

}
