package bookArrayListCollection;

import java.util.*;
import java.io.*;

public class TestBookArrayListCollection {
  public static void main(String[] args) throws IOException {
    Scanner inputFile = new Scanner(new FileReader("./Book.in"));
    List<Book> bookArrList = new ArrayList<>();

    while (inputFile.hasNextLine()) {
      Book bookObj = new Book();
      String bkObj = inputFile.nextLine();
      String[] bkParts = bkObj.split("\t");

      bookObj.setBook_id(Integer.parseInt(bkParts[0]));
      bookObj.setBook_author(bkParts[1]);
      bookObj.setBook_title(bkParts[2]);
      bookObj.setBook_isbn(bkParts[3]);
      bookObj.setBook_type(bkParts[4]);
      bookObj.setBook_price(Double.parseDouble(bkParts[5]));

      bookArrList.add(bookObj);
    }
    inputFile.close();

    // Display number of elements of the ArrayList using the size()
    System.out.println("The book you entered are: " + bookArrList.size());

    // Print all elements of the ArrayList using the get() method
    System.out.println("\nPrinting ArrayList elements using the get() method:");
    for (int index = 0; index < bookArrList.size(); index++) {
      System.out.println(bookArrList.get(index));
    }

    // Print all elements of the ArrayList using the next() of ListIterator
    // interface
    System.out.println("\nPrinting ArrayList elements using the ListIterator with the next() method:");
    ListIterator<Book> listIterator = bookArrList.listIterator();
    while (listIterator.hasNext()) {
      System.out.println(listIterator.next());
    }

    // Print all elements of the ArrayList in reverse order using the method
    // previous()
    System.out.println("\nPrinting ArrayList elements in reverse using the ListIterator with the previous () method:");
    while (listIterator.hasPrevious()) {
      System.out.println(listIterator.previous());
    }
    bookArrList.add(2, new Book(13, "Joshawa Pierre", "Python", "1209845", "BG", 99.99));
    System.out.printf("\nThe new added book is: \n");
    System.out.println(bookArrList.get(2));

    System.out.printf("\nThe new Book List has a size of %d\n", bookArrList.size());
    for (Book book : bookArrList) {
      System.out.println(book);
    }
  }
}
