package stackBook;

public class Book {
  private int book_id;
  private String book_author;
  private String book_title;
  private String book_isbn;
  private String book_type;
  private double book_price;

  // Default Constructor
  public Book() {
    this.book_id = 0;
    this.book_author = "";
    this.book_title = "";
    this.book_isbn = "";
    this.book_type = "";
    this.book_price = 0;
  }

  // Parameterized Constructor
  public Book(int bookId, String bookAuthor, String bookTitle, String bookISBN, String bookType, double bookPrice) {
    this.book_id = bookId;
    this.book_author = bookAuthor;
    this.book_title = bookTitle;
    this.book_isbn = bookISBN;
    this.book_type = bookType;
    this.book_price = bookPrice;
  }

  // Getters and Setters
  public int getBook_id() {
    return book_id;
  }

  public void setBook_id(int book_id) {
    this.book_id = book_id;
  }

  public String getBook_author() {
    return book_author;
  }

  public void setBook_author(String book_author) {
    this.book_author = book_author;
  }

  public String getBook_title() {
    return book_title;
  }

  public void setBook_title(String book_title) {
    this.book_title = book_title;
  }

  public String getBook_isbn() {
    return book_isbn;
  }

  public void setBook_isbn(String book_isbn) {
    this.book_isbn = book_isbn;
  }

  public String getBook_type() {
    return book_type;
  }

  public void setBook_type(String book_type) {
    this.book_type = book_type;
  }

  public double getBook_price() {
    return book_price;
  }

  public void setBook_price(double book_price) {
    this.book_price = book_price;
  }

  // Methods
  public String toString() {
    return String.format(
        "The Book Information is %d//%s//%s//%s//%s//%.2f$ -> Book CAN Price: %.2f$ -> Book EUR Price: %.2f€", book_id,
        book_author, book_title,
        book_isbn,
        book_type, book_price, book_price, calculate_Price_Euro());
  }

  public Double calculate_Price_Euro() {
    return book_price * 0.7;
  }
}
