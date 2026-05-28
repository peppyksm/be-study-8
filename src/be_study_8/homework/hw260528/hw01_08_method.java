package be_study_8.homework.hw260528;

public class hw01_08_method {

	int[] arr;
	
	void setArr(int[] arr) {
		this.arr = arr;
	}
	
	void plus(int[] arr) {
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] ++;
			System.out.print(arr[i] + " ");
		}
	}
}
