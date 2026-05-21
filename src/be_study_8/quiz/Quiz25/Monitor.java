package be_study_8.quiz.Quiz25;

public class Monitor {

	int inchSize;
	String manufacturer;
	String model;
	
	Monitor(){}
	Monitor(int inchSize, String manufacturer, String model){
		this.inchSize = inchSize;
		this.manufacturer = manufacturer;
		this.model = model;
	}
	
	public void setManufacturer(String input) {
		manufacturer = input;
	}
	void printInfo() {
		System.out.printf("제조사:%s 모델명:%s 인치:%d인치\n",manufacturer, model, inchSize);
	}
	
}