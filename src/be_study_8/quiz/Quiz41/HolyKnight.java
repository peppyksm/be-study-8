package be_study_8.quiz.Quiz41;

class HolyKnight implements Healer, Tanker{
	
	private String name;
	private int hp;

	public HolyKnight(String name, int hp) {
		this.name = name;
		this.hp = hp;
		
	}

	@Override
	public void increaseHp() {
		System.out.println("전체 체력 +50 증가시킵니다.");
	}

	@Override
	public void heal() {
		System.out.println("체력을 +30 회복합니다.");
	}
}