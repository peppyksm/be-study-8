package be_study_8.quiz.Quiz34;

public class Gas {

	int fireHoles;
	String brand;
	int price;
	boolean isBurning;
	int burnPower;

	Gas(int fireHoles, String brand, int price) {
		this.fireHoles = fireHoles;
		this.brand = brand;
		this.price = price;
	}

	void gasInfo() {
		System.out.println("===가스렌지 정보===");
		System.out.printf("화구 개수 : %d 브랜드 : %s 가격 : %d", fireHoles, brand, price);
	}

	void BurnOn() {
		isBurning = true;
		System.out.println("불 켜짐");
		burnPower = 1;
	}

	void BurnOff() {
		isBurning = false;
		System.out.println("불 꺼짐");
	}

	void burnPowerUp() {
		burnPower++;
		if (burnPower >= 10) {
			System.out.println("최대 파워 : 10");
			burnPower = 10;
		} else {
			System.out.println("현재 불 세기 : " + burnPower);
		}
	}

	void burnPowerDown() {
		burnPower--;
		if (burnPower <= 0) {
			BurnOff();
		} else {
			System.out.println("현재 불 세기 : " + burnPower);
		}
	}

}
