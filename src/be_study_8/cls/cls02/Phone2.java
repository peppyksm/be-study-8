package be_study_8.cls.cls02;

public class Phone2 {

	// 필드
		String model; // 모델명
		int price; // 가격
		int battery; // 배터리 용량

		
		
		// 생성자
		
		//기본생성자 Phone(){}
//		Phone(){ //생성자가 있다면 기본생성자도 생성 해줘야함(생성자 없으면 자동 생성)
//			System.out.println("Phone() 기본생성자 호출");
//		}
		
		
		
		
		//생성자 오버로딩    매개변수의 타입, 순서, 갯수
		
		Phone2(String model) { //String 타입 1개
//			System.out.println("Phone(String model) 생성자 호출");
//			this.model = model;
//			this.price = 0;
//			this.battery = 2500;
			
			//같은 클래스 파일 내부에서 내 다른 생성자 호출 this();
//			this(); // 외부 입장 : new Phone2();
			this(model, 0, 2500);  //new Phone2("갤럭시 폴드4", 210000, 4200);
			
			
			//필드 초기화
			//기타 다른 생성시 할 일
			//알콜소독
			//필름부착
			//불량검사
			//재부팅
		}

		
		Phone2(String model, int price) { //String int 순서로 2개
//			System.out.println("Phone(String model, int price) 생성자 호출");
//			this.model = model;
//			this.price = price;
//			this.battery = 2500;
			this(model, price, 2500);
		}
		
//		Phone(String model, int battery){}
//		위에 이미 String int를 받는 생성자가 있으므로 같은 타입 같은 순서 생성자는 만들 수 없음
		
		Phone2(int battery){  //변수 한개 받는 생성자는 있지만 타입이 달라 생성 가능
			this.battery = battery;
		}
		
		Phone2(int battery, String model){   //타입, 갯수가 같아도 순서 다르면 생성 가능
//			this.battery = battery;
//			this.model = model;
//			this.price = 0;
			this(model, 0, battery);
		}
		
		Phone2(String model, int price, int battery) { //String int int 순서로 3개
			System.out.println("Phone(String model, int price, int battery) 생성자 호출");
			this.model = model;
			this.price = price;
			this.battery = battery;
		}
		
		Phone2(int battery, String model, int price){ //위처럼 3개 받지만 순서 달라 생성 가능
			this.model = model;
			this.price = price;
			this.battery = battery;
		}
		}

		// 메소드
