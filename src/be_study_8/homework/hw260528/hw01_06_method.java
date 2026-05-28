package be_study_8.homework.hw260528;

public class hw01_06_method {

	int[] arr;
	int total;
	int avg;


	void avg(int[] arr) {
		this.arr = arr;
		for (int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		avg = total / arr.length;
		avg = total / arr.length;
		System.out.println("평균 : " + avg);
	}

}
