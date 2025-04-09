package projectCDInventoryFinalExam;

import java.util.*;
import java.io.*;

public class TestCDInventoryFinalExam {
  public static void main(String[] args) throws IOException {
    Scanner inputFile = new Scanner(new FileReader("./MusicCDInventory.in"));
    Set<CDInventory> myCDset = new LinkedHashSet<>();
    while (inputFile.hasNextLine()) {
      CDInventory cdInventory = new CDInventory();
      String cd = inputFile.nextLine();
      String[] cdParts = cd.split("\t");

      cdInventory.setCD_No(Integer.parseInt(cdParts[0]));
      cdInventory.setCD_Name(cdParts[1]);
      cdInventory.setCD_Qty(Integer.parseInt(cdParts[2]));
      cdInventory.setCD_Price(Double.parseDouble(cdParts[3]));

      myCDset.add(cdInventory);
    }
    inputFile.close();

    System.out.println("The CDInventory you entered are : " + myCDset.size());
    System.out.println("\nThe List of CD Inventory is:\n");
    Iterator<CDInventory> cd = myCDset.iterator();
    while (cd.hasNext()) {
      System.out.println(cd.next());
    }
  }
}
