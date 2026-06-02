package be_study_8.quiz.Quiz40.q2;

class Food implements Orderable {
	private String name;
	private int price;

	public Food(String name, int price) {
		this.name = name;
		this.price = price;
}

	@Override
	public int discountedPrice() {
		price -= price * 0.1;
		return price;
	}
}