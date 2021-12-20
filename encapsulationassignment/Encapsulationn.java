package encapsulationassignment;

class Author{
	private String name;
	private String email;
	private char gender;
	
	public Author(String name, String email, char gender) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public char getGender() {
		return gender;
	}
}

class Book{
	private String name;
	private Author author;
	private double price;
	private int qtyInstock;
	
	public Book(String name, Author author,double price, int qtyInStock) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
		this.qtyInstock = qtyInStock;
		
		
	}
	
	
	public void setPrice(double price) {
		this.price = price;
	}

	public int getQtyInStock() {
		return qtyInstock;
	}

	public void setQtyInStock(int qtyInStock) {
		this.qtyInstock = qtyInStock;
	}

	public String getName() {
		return name;
	}

	public Author getAuthor() {
		return author;
	}
}

public class Encapsulationn {

	public static void main(String[] args) {
		Author author = new Author("Arpan Das", "arp14@yahoo.com", 'M');
		Book book = new Book("Java Fundamentals", author, 199.0, 500);
		
		System.out.println(book);
		

	}

}
