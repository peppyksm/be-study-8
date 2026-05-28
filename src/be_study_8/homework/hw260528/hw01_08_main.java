package be_study_8.homework.hw260528;

public class hw01_08_main {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };

		hw01_08_method plus = new hw01_08_method();
		
		plus.plus(arr);
		
		System.out.println();
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
