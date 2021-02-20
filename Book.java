package OopsAssignment;

public class Book {
	private int BookNo;
	private String title;
	private String Author;
	private float price;

	public int getBookNo() {
		return BookNo;
	}
	public void setBookNo(int bookNo) {
		this.BookNo = BookNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String toString() {
		return "Book [BookNo=" + BookNo + ", title=" + title + ", author=" + Author + ", price=" + price + "]";

	}


}
