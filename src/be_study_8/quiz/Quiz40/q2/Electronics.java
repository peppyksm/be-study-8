package be_study_8.quiz.Quiz40.q2;

class Electronics implements Orderable {
	private String name;
	private int price;

	public Electronics(String name, int price) {
		this.name = name;
		this.price = price;
	}

	
	@Override
	public int discountedPrice() {
		price -= price * 0.2;
		return price;
	}
}