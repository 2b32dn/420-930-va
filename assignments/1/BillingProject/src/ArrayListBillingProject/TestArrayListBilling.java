package ArrayListBillingProject;

import java.util.*;
import java.io.*;

public class TestArrayListBilling {
  public static void main(String[] args) throws FileNotFoundException {
    Scanner inputFile = new Scanner(new FileReader("./Billing.in"));
    List<Billing> billingArrList = new ArrayList<>();
    double totalBilling = 0;

    while (inputFile.hasNextLine()) {
      Billing billingObj = new Billing();
      billingObj.setPrd_Price(inputFile.nextDouble());
      billingObj.setPrd_Qty(inputFile.nextInt());
      Billing.setFed_Tax(inputFile.nextDouble());
      Billing.setPrv_Tax(inputFile.nextDouble());
      billingArrList.add(billingObj);

    }

    System.out.println("\nReading from Billing.in Input file: ");
    System.out.println("Printing ArrayList billingArrList and perform processing");
    for (int index = 0; index < billingArrList.size(); index++) {
      System.out.printf(
          "\nbillingArrList[%d] Object: Billing [prd_Price=%.2f, prd_Qty=%d]\nThe Total Billing of billingArrList[%d] object is %.2f$\n",
          index, billingArrList.get(index).getPrd_Price(), billingArrList.get(index).getPrd_Qty(), index,
          billingArrList.get(index).calculateBilling());
    }

    for (int i = 0; i < billingArrList.size(); i++) {
      totalBilling = totalBilling + billingArrList.get(i).calculateBilling();
    }
    System.out.println("\nAll Total of Billing is " + totalBilling + "$");
    System.out.println("Thank you for Doing Business with us!");

    inputFile.close();
  }
}
