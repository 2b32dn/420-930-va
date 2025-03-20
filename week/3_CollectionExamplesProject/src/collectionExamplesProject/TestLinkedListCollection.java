package collectionExamplesProject;

import java.util.List;
import java.util.ListIterator;
import java.util.LinkedList;

public class TestLinkedListCollection {
  public static void main(String[] args) {
    // Using Sytem-defined class n Java Collection Framework
    List<String> nameList = new LinkedList<>();
    String[] names = {
        "Alpha",
        "Bravo",
        "Charlie"
    };

    // Reading from array and loading into nameList
    int index = 0;
    for (index = 0; index < names.length; index++) {
      nameList.add(names[index]);
    }

    // Reading loaded LinkedList nameList
    System.out.println("Printing Elements of nameList using a For-Loop");
    for (index = 0; index < nameList.size(); index++) {
      System.out.println(nameList.get(index));
    }

    // Reading LinkedList traversal using ListIterator
    System.out.println("Printing Elements of LinkedList Using ListIterator: ");
    ListIterator<String> myListIterator = nameList.listIterator();
    String strEle;
    while (myListIterator.hasNext()) {
      strEle = myListIterator.next();
      if (strEle.equals("Bravo")) {
        myListIterator.set("Delta");
      }
      System.out.println(strEle);
    }

    System.out.println("Printing Elements of LinkedList Using in Forward: ");
    myListIterator = nameList.listIterator();
    while (myListIterator.hasNext()) {
      strEle = myListIterator.next();
      System.out.println(strEle);
    }

    System.out.println("Printing Elements of LinkedList Using Backward: ");
    myListIterator = nameList.listIterator();
    while (myListIterator.hasPrevious()) {
      strEle = myListIterator.previous();
      System.out.println(strEle);
    }
  }
}
