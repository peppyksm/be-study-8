package be_study_8.inherit.inherit02;
import be_study_8.inherit.inherit01.Parent;

public class HideChild extends Parent {

	//다른 패키지의 자식의 경우
	//부모의 생성자에 public or private 넣어줘야함
	
	HideChild(){ 
		super(0);
	}

	public HideChild(int money){
		super(money);
	}
	
	public void showMoney() {
		//protected int money;    public이 조금 더 허용 
		//같은 패키지 접근 가능 + 다른 패키지여도 자식 클래스면 접근 가능
		System.out.println(money);
	}
}
