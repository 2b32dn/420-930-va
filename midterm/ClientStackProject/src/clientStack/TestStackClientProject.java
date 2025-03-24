package clientStack;

import java.util.*;
import java.io.*;

public class TestStackClientProject {
  public static void main(String[] args) throws IOException {
    Scanner inputFile = new Scanner(new FileReader("./Client.in"));
    LinkedStackClass myClientStackClass = new LinkedStackClass();
    int count = 0;

    while (inputFile.hasNextLine()) {
      Client client = new Client();
      String cl = inputFile.nextLine();
      String[] clParts = cl.split("\t");

      client.setClient_id(Integer.parseInt(clParts[0]));
      client.setClient_Name(clParts[1]);
      client.setClient_Qty(Integer.parseInt(clParts[2]));
      client.setClient_Price(Double.parseDouble(clParts[3]));

      myClientStackClass.push(client);
      count++;
    }
    inputFile.close();

    myClientStackClass.print();
    System.out.printf("\nThe size of the stack is: %d\n", count);
    System.out.printf("StackTop is: The Client Information is %d//%s//%d//%.2f -> Client Total: %.2f$",
        myClientStackClass.peek().client_id, myClientStackClass.peek().client_Name,
        myClientStackClass.peek().client_Qty, myClientStackClass.peek().client_Price,
        myClientStackClass.peek().calculateTotal());
  }
}
