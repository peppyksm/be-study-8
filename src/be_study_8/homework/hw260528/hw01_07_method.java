package be_study_8.homework.hw260528;

public class hw01_07_method {

	int[] arr;
	int max;

	public void setArr(int[] arr) {
		this.arr = arr;
	}

	int max() {

		max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}

		return max;
	}

}
