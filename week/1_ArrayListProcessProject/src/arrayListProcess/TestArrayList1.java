// Compile:
// On ~/420-930-va/week/1_ArrayListProcessProject/src
// javac arrayListProcess/TestArrayList1.java 
// java arrayListProcess/TestArrayList1.java 

package arrayListProcess;

import java.util.ArrayList;

public class TestArrayList1 {
  public static void main(String[] args) {

    // List with Generic data type: in this case String
    ArrayList<String> nameList = new ArrayList<>();
    String[] names = {
        "Ann",
        "Bob",
        "Carol",
    };

    int index = 0;
    // Reading from array names and populatin ArrayList nameList
    for (index = 0; index < names.length; index++) {
      nameList.add(names[index]);
    }

    // Print all elements of ArrayList nameList
    for (index = 0; index < nameList.size(); index++) {
      System.out.println(nameList.get(index));
    }

    // With Enhanced For-Loop
    // for (String name : names) {
    // System.out.println(name);
    // }
  }
}