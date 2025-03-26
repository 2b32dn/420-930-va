package collectionExamplesProject;

import java.util.*;

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
    System.out.println("");
    System.out.println("Printing Elements of nameList using get()");
    for (index = 0; index < nameList.size(); index++) {
      System.out.println(nameList.get(index));
    }

    // Reading LinkedList traversal using ListIterator
    System.out.println("");
    System.out.println("Printing Elements of LinkedList Using Iterator: ");
    ListIterator<String> myListIterator = nameList.listIterator();
    String strEle;
    while (myListIterator.hasNext()) {
      strEle = myListIterator.next();
      if (strEle.equals("Bravo")) {
        myListIterator.set("Delta");
      }
      System.out.println(strEle);
    }

    // Forward
    System.out.println("");
    System.out.println("Printing Elements of LinkedList Using in Forward: ");
    myListIterator = nameList.listIterator();
    while (myListIterator.hasNext()) {
      strEle = myListIterator.next();
      System.out.println(strEle);
    }

    // Backward
    System.out.println("");
    System.out.println("Printing Elements of LinkedList Using Backward: ");

    // You are initializing myListIterator again using nameList.listIterator();,
    // which positions the iterator at the beginning of the list.

    // The method hasPrevious() will return false at this point because the iterator
    // is at the start of the list, meaning there's no previous element to traverse.

    // Since the condition myListIterator.hasPrevious() is never true, the loop
    // doesn't execute.

    // To traverse backward, you need to first move the iterator to the end of the
    // list using while (myListIterator.hasNext()) { myListIterator.next(); } before
    // starting the backward iteration.

    while (myListIterator.hasNext()) {
      myListIterator.next();
    }
    while (myListIterator.hasPrevious()) {
      strEle = myListIterator.previous();
      System.out.println(strEle);
    }
  }
}
