package streamProcessingTripCollectionProject;

import java.io.*;
import java.util.*;

public class TestStreamProcessingTripCollection {
  public static void main(String[] args) throws IOException {
    Scanner inputFile = new Scanner(new FileReader("./Trip.in"));
    Set<Trip> tripSet = new HashSet<>();

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
    }
    inputFile.close();

    System.out.println("Using Stream Processing Filter Method");
    System.out.printf("\nNumber of Employees in the HashSet whose Total Trip Cost > 400$: %d\n",
        tripSet.stream().filter(totalCost -> totalCost.CalculateCostTrip() > 400).count());

    System.out.println("\nUsing Stream Processing Sorted Method");
    System.out.println("Display Employees in the HashSet sorted by Emp_id:");
    tripSet.stream().sorted(Comparator.comparingInt(trip -> trip.getEmp_id())).forEach(System.out::println);

    System.out.println("\nUsing Stream Processing Sorted Method");
    System.out.println("Display Employees in the HashSet sorted by CalculateCostTrip:");
    tripSet.stream().sorted(Comparator.comparingDouble(Trip::CalculateCostTrip)).forEach(System.out::println);

    System.out.println("\nUsing Stream Processing Max Method");
    System.out.println("Display Max Cost Trip of Employee in the HashSet");
    System.out.println(tripSet.stream().max(Comparator.comparingDouble(Trip::CalculateCostTrip)).get().toString2());

    System.out.println("\nUsing Stream Processing Min Method");
    System.out.println("Display Min Cost Trip of Employee in the HashSet");
    System.out.println(tripSet.stream().min(Comparator.comparingDouble(Trip::CalculateCostTrip)).get().toString2());

    System.out.println("\nUsing Stream Processing anyMatch Method");
    System.out.printf("Display if Employee Trip info matching emp_name Eduard is in the HashSet: %b\n",
        tripSet.stream().anyMatch(trip -> trip.getEmp_name().matches("(?i).*\\b(eduard)\\b.*")));

    System.out.println("\nUsing Stream Processing anyMatch Method");
    System.out.println("Display Employee Trip info where emp_name contains 'Paul':");
    tripSet.stream().filter(trip -> trip.getEmp_name().toLowerCase().contains("paul")).forEach(System.out::println);
  }
}
