package be_study_8.quiz.Quiz40.q2;

class Clothing implements Orderable {
	private String name;
	private int price;

	public Clothing(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public int discountedPrice() {
		price -= price * 0.3;
		return price;
	}
}