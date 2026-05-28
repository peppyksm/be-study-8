package be_study_8.homework.hw260528;

public class hw01_07_main {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };
		hw01_07_method max = new hw01_07_method();
		max.setArr(arr);

		System.out.println(max.max());
	}

}
