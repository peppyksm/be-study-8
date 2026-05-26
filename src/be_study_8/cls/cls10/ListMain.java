package be_study_8.cls.cls10;

import java.util.ArrayList;

public class ListMain {

	public static void main(String[] args) {
		
		
		ArrayList<String> a1 = new ArrayList<String>();
		
		
		//ArrayList<int> a2 = new ArrayList<int>(); 기본타입 불가 int double, boolean
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		ArrayList<Double> a3 = new ArrayList<Double>();
		ArrayList<Boolean> a4 = new ArrayList<Boolean>();
//		Wrapper Class(기본타입을 한번 감싸서 객체참조타입으로 인식되도록 하는 클래스) 으로 가능
//		Integer -> int
//		Double -> double
//		Boolean -> boolean
		
		int n1 = 10;
		Integer n2 = 10;
		int n3 = n1;
		int n4 = n2;
		
		

		
		
		
		// ArrayList

		String[] sArr1 = new String[4];// 4칸짜리 배열 공간 확보
		// 기본값 : null*4

		sArr1[0] = "A";
		sArr1[1] = "B";
		sArr1[2] = "C";
		sArr1[3] = "D";

		// sArr1[4] = "E"; // 배열 index 초과

		String[] sArr2 = new String[5];

		for (int i = 0; i < sArr1.length; i++) { // 배열 복사
			sArr2[i] = sArr1[i];
		}
		sArr2[4] = "E";

		for (String s : sArr2) {
			System.out.print(s + " ");
		}
		System.out.println();

		// ArrayList
		// ArrayList<타입> 변수명 = new ArrayList<타입>();
		// List<타입> 변수명 = new ArrayList<>(); -> 앞 Array, 뒤 타입 생략가능

		ArrayList<String> sList = new ArrayList<String>();

		sList.add("A"); // add() = 값 추가
		sList.add("B");
		sList.add("C");
		sList.add("D");

		for (String s : sList) {
			System.out.print(s + " ");
		}
		System.out.println();

		sList.add("E");
		sList.add("F");
		sList.add("G");

		for (int i = 0; i < sList.size(); i++) { // .size() == .length
			// List에서 특정 인덱스 위치의 값에 접근 .get(index) arr[index]
			System.out.print(sList.get(i) + " ");
		}
		System.out.println();

		System.out.println(sList.contains("B")); // sList.contains == 값 보유 여부 (boolean타입)
		// ㄴ 위는 "B"가 sList에 존재 하는지 -> true

		if (sList.contains("B")) {
			System.out.println("리스트에 B가 있다. contains 결과 true");
		} else {
			System.out.println("리스트 B가 없다.");
		}

		if (sList.contains("H") == false) {
			sList.add("H");
		}

		for (String s : sList) {
			System.out.print(s + " ");
		}
		System.out.println();

		// arr[2] = "H";
		// 위처럼 List의 특정 위치에 값 저장 -> .set(인덱스, 값)

		sList.set(2, "H");

		for (String s : sList) {
			System.out.print(s + " ");
		}
		System.out.println();

		// 값 지우기 -> .remove(index값 or 데이터값); List는 값을 지우면 공간 자체가 사라져서 땡겨짐
		sList.remove(2); // index값 삭제
		sList.remove("F"); // 데이터값 삭제 공간 사라지는건 index, 데이터값 둘 다 삭제시 동일함

		for (String s : sList) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		
	}

}
