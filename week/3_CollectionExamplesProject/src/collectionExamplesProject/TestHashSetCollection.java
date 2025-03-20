package collectionExamplesProject;

import java.util.*;

public class TestHashSetCollection {
  public static void main(String[] args) {
    // Instantiate set from HashSet and TreeSet of String elements

    // Account Example
    // Account myAccount;
    // myAccount = new CheckingAccount();
    // // Processing of CheckingAccount using myAccount
    // myAccount = new SavingAccount();
    // // Processing of SavingAccount using myAccount
    // myAccount = new InvestmentAccount();
    // Processing of InvestmentAccount using myAccount

    // Divide dvdObj = new Divide();
    // System.out.println(dvdObj); // hashed address of ref Obj dvdObj

    Set<String> set1 = new HashSet<>();
    set1.add("Pear");
    set1.add("Apple");
    set1.add("Strawberry");
    set1.add("Banana");

    System.out.println("Printing elements of HashSet");
    for (String element : set1) {
      System.out.println(element);
      // Apple, Pear, Strawberry, Banana. The order is not the same as when the
      // elements are added. Th ASCII value of each character are added and total and
      // sorted in asc order.
    }

    Set<String> set2 = new LinkedHashSet<>();
    set2.add("Pear");
    set2.add("Apple");
    set2.add("Strawberry");
    set2.add("Banana");
    System.out.println("Printing elements of LinkedHashSet");
    for (String element : set2) {
      System.out.println(element);
    }
  }
}