package collectionTripProject;

import java.io.*;
import java.util.*;

public class TestHashSetCollectionTrip {
  public static void main(String[] args) throws IOException {
    Scanner inputFile = new Scanner(new FileReader("./Trip.in"));
    HashSet<Trip> tripSet = new HashSet<>();
    HashSet<Trip> tripLinkedHashSet = new LinkedHashSet<>();
    Set<Trip> tripSetDescEmp_Id = new TreeSet<>(new TripEmpIdComparator());
    Set<Trip> tripSetDescTotal_cost = new TreeSet<>(new TripTotalCostComparator());

    while (inputFile.hasNextLine()) {
      Trip tripObj = new Trip();
      String trp = inputFile.nextLine();
      String[] trpEle = trp.split("\t");

      tripObj.setEmp_id(Integer.parseInt(trpEle[0]));
      tripObj.setEmp_name(trpEle[1]);
      tripObj.setEmp_address(trpEle[2]);
      tripObj.setEmp_gasprice(Double.parseDouble(trpEle[3]));
      tripObj.setEmp_distance(Integer.parseInt(trpEle[4]));
      tripObj.setEmp_costhotel(Double.parseDouble(trpEle[5]));
      tripObj.setEmp_costfood(Double.parseDouble(trpEle[6]));

      tripSet.add(tripObj);
      tripLinkedHashSet.add(tripObj);
      tripSetDescEmp_Id.add(tripObj);
      tripSetDescTotal_cost.add(tripObj);
    }
    inputFile.close();

    // Display number of elements in the HashSet using the method size()
    System.out.println("\nThe Employee Trip information you entered are: " + tripSet.size());

    System.out.println("\nUsing Iterator interface, the Employee Trip information are:");
    List<Trip> tripList = new ArrayList<>(tripSet);
    ListIterator<Trip> myListIterator = tripList.listIterator();
    while (myListIterator.hasNext()) {
      Trip listIteratorTrip = myListIterator.next();
      System.out.println(listIteratorTrip);
    }

    System.out.println("\nAfter adding new Client, the List is:");
    Trip sameTrip = new Trip(2, "Amine Khan", "Paris France", 1.11, 50, 75.00, 50.00);
    tripSet.add(sameTrip);
    for (Trip trip : tripSet) {
      System.out.println(trip);
    }

    System.out.println("\nPreventing duplicated objects in the set");
    if (tripSet.contains(sameTrip)) {
      System.out.println("Duplicate entry found: " + sameTrip);
      tripSet.remove(sameTrip);
    }
    for (Trip trip : tripSet) {
      System.out.println(trip);
    }

    System.out.println("\nThe Trip Employee information added to the TreeSet with respect wemp_id:");
    for (Trip trip : tripSetDescEmp_Id) {
      System.out.println(trip);
    }

    System.out.println("\nThe Trip Employee information added to the TreeSet with respect the total cost:");
    for (Trip trip : tripSetDescTotal_cost) {
      System.out.println(trip);
    }

    System.out.println(
        "\nThe Trip Employee information added to the LinkedHashSet (Notice it keeps the order found in the input file), the LinkedHashSet is:");
    for (Trip trip : tripLinkedHashSet) {
      System.out.println(trip);
    }
  }
}
