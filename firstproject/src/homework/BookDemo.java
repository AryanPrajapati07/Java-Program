package homework;

public class BookDemo {

	public static void main(String[] args) {

		Author author = new Author("Aryan", "Prajapati");
		Book book = new Book("Game Development", author, 199.99);
		System.out.println(book);
	}

}
