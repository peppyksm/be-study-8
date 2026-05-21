package be_study_8.quiz.Quiz26;

public class Monitor {

	String manufacturer;
	int inch;
	int price;
	String color;
	int pixel_X;
	int pixel_Y;
	
	Monitor(String manufacturer, int inch, int price){
		this.manufacturer = manufacturer;
		this.inch = inch;
		this.price = price;
	}
	
	void setXY(int pixel_X, int pixel_Y) {
		this.pixel_X=pixel_X;
		this.pixel_Y=pixel_Y;
	}
	
	void setColor(String color) {
		this.color = color;
	}
	
	void powerOn() {
		System.out.println("전원이 켜졌습니다");
	}
	
	int priceUp(int increase) {
		int result = price + increase;
		price = result;
		return result;
	}
	
	void info() {
		System.out.printf("제조사:%s 인치:%d인치 가격:%d원 색상:%s 최대해상도:%d*%d\n"
				,manufacturer,inch,price,color,pixel_X,pixel_Y);
	}
	
}

