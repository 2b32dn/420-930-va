package stackBook;

import java.util.*;
import java.io.*;

public class TestStackBookProject {
  public static void main(String[] args) throws IOException {
    Scanner inputFile = new Scanner(new FileReader("./Book.in"));
    LinkedStackClass myBookStack = new LinkedStackClass();
    int count = 0;
    while (inputFile.hasNextLine()) {
      Book book = new Book();
      String bk = inputFile.nextLine();
      String[] bkParts = bk.split("\t");

      book.setBook_id(Integer.parseInt(bkParts[0]));
      book.setBook_author(bkParts[1]);
      book.setBook_title(bkParts[2]);
      book.setBook_isbn(bkParts[3]);
      book.setBook_type(bkParts[4]);
      book.setBook_price(Double.parseDouble(bkParts[5]));

      myBookStack.push(book);
      count++;
    }
    inputFile.close();

    myBookStack.print();
    System.out.printf("The size of the stack is: %d\n\n", count);
    System.out.printf("The Book Information is %d//%s//%s//%s//%s//%.2f\n", myBookStack.peek().getBook_id(),
        myBookStack.peek().getBook_author(),
        myBookStack.peek().getBook_title(), myBookStack.peek().getBook_isbn(), myBookStack.peek().getBook_type(),
        myBookStack.peek().getBook_price());
  }
}
