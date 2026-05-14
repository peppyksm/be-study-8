package be_study_8.refr;

public class Arr02 {

	public static void main(String[] args) {
		
		//다차원 배열
		
		int n = 10;
		int[] arr1 = new int[5];
		
		int[][] arr2 = new int[3][5]; //3열 5행 index 15개
		
		/*   012345
		 * 0 ㅁㅁㅁㅁㅁ
		 * 1 ㅁㅁㅁㅁㅁ
		 * 2 ㅁㅁㅁㅁㅁ
		 */
		
		int[][] arr3 = new int[4][3]; //4열 3행 index 12개
		
		/*   012
		 * 0 ㅁㅁㅁ
		 * 1 ㅁㅁㅁ
		 * 2 ㅁㅁㅁ
		 * 3 ㅁㅁㅁ
		 */
		
		int[] arr11 = {1,2,3,4,5,6};
		
		              //     0         1
		int[][] arr22 = {{1, 2, 3},{4, 5, 6}}; //2열 3행
		              //  0  1  2   0  1  2
		/*      1 2 3         
		 *      4 5 6 *
		 */
		
		
		int[][] arr33 = {{1, 2},{3, 4},{5, 6}}; //3열 2행
		
		/* 		1 2
		 * 		3 4
		 * 		5 6
		 */
		
		System.out.println(arr22[0][2]); //3
		System.out.println(arr33[2][1]); //6
		
		int[][] arr4 = new int[2][3];
		
		for(int i = 0; i<arr4.length; i++) {              //                        열 index 번호
			for(int j = 0; j<arr4[i].length; j++) {       //2차원배열 행index값 배열변수이름[].length
				System.out.print(arr4[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
