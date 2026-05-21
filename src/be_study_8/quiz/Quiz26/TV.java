package be_study_8.quiz.Quiz26;

public class TV {

	String manufacturer;
	int birth;
	int inch;
	
	TV(String manufacturer, int birth, int inch){
		this.manufacturer = manufacturer;
		this.birth = birth;
		this.inch = inch;
	}
	
	void show() {
		System.out.printf("%s제품 %d년형 %d인치 TV",manufacturer, birth, inch);
	}
}
