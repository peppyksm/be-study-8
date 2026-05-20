package be_study_8.quiz.Quiz24;

public class PersonMain {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		
		p1.name = "김승민";
		p1.sex = "남성";
		p1.age = 28;
		p1.height = 174.5;
		p1.weight = 67.5;
		p1.job = "학생";
		p1.bloodType = "B";
		p1.healthCondition = "건강함";
		p1.isSleeping = false;
		
		System.out.println("이름 : " + p1.name);
		System.out.println("성별 : " + p1.sex);
		System.out.println("나이 : " + p1.age + "세");
		System.out.println("키 : " + p1.height + "cm");
		System.out.println("몸무게 : " + p1.weight + "kg");
		System.out.println("직업 : " + p1.job);
		System.out.println("혈액형 : " + p1.bloodType + "형");
		System.out.println("건강상태 : " + p1.healthCondition);
		if(p1.isSleeping) {
			System.out.println("수면중 여부 : 자고 있음");
		}else {
			System.out.println("수면중 여부 : 깨어 있음");
		}
	}
}
