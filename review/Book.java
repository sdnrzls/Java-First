package review;

public class Book {
	String bookname;
	String author;

	public Book(String bookname, String author) {
		this.bookname = bookname;
		this.author = author;
	}
	public String getbookname() {
		return bookname;
	}
	public void setbookname(String bookname) {
		this.bookname=bookname;
	}
	public String getauthor() {
		return author;
	}
	public void setauthor() {
		this.author = author;
	}
	public void showbookinfo() {
		System.out.println(bookname+","+author);
	}
}
