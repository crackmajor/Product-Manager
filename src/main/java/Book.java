public class Book extends Product {
    private String author;
    private String bookName;

    public Book(int id, String author, String bookName, int price) {
        super(id, "Книга", price);
        this.author = author;
        this.bookName = bookName;
    }
}
