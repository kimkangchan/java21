package pack02;

public class Book {

	private String book;
	private int bookPrice;
	private double bookDiscountRate;

	public Book() {

	}

	public Book(String book, int bookPrice, double bookDiscountRate) {
		this.book = book;
		this.bookPrice = bookPrice;
		this.bookDiscountRate = bookDiscountRate;
	}

	public String getBook() {
		return book;
	}

	public void setBook(String book) {
		this.book = book;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}

	public double getBookDiscountRate() {
		return bookDiscountRate;
	}

	public void setBookDiscountRate(double bookDiscountRate) {
		this.bookDiscountRate = bookDiscountRate;
	}

	public double getDiscountBookPrice() {
		return bookPrice - (bookPrice * bookDiscountRate / 100);

	}

	public void showInfo() {
		System.out.println(
				getBook() + "\t" + getBookPrice() + "\t" + getBookDiscountRate() + "\t" + getDiscountBookPrice() + "\n");
	}

}
