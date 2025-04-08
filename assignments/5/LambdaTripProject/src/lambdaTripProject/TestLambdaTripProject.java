package lambdaTripProject;

import java.io.*;
import java.util.*;
import java.util.function.*;

public class TestLambdaTripProject {
  public static void main(String[] args) throws IOException {
    Scanner inputFile = new Scanner(new FileReader("./Trip.in"));
    HashSet<Trip> tripSet = new HashSet<>();

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

    System.out.println("\nThe Employee Trip information you entered are: " + tripSet.size());

    System.out.println("\nThe Employee Trip information using Lambda Expression");
    tripSet.forEach(trip -> {
      System.out.println(trip.toString());
    });

    System.out.println("\nInvoking printCostTrip method using Lambda Expression");
    Consumer<Trip> tripMethod = n -> {
      n.printCostTrip();
    };
    tripSet.forEach(tripMethod);

    System.out.println("\nInvoking printCostTrip method using :: operator within foreach");
    tripSet.forEach(System.out::println);

    System.out.println("\nApplying discount Function to Trip set using Lambda Expression");
    Function<Trip, Double> tripDiscount = (trip) -> {
      return trip.CalculateCostTrip() - (trip.CalculateCostTrip() * 0.1);
    };
    tripSet.forEach(
        n -> System.out.printf("Cost Trip After Discount for %d, %s is: %.2f$\n", n.getEmp_id(), n.getEmp_name(),
            tripDiscount.apply(n)));

    System.out.println(
        "\nApplying tripAdvanceFee Function to Trip set using andThen method with Lambda Expression after tripDiscount");
    Function<Trip, Double> tripAdvanceFee = (n) -> {
      return tripDiscount.apply(n) * 0.3;
    };
    tripSet.forEach(
        n -> System.out.printf("Cost Trip After Advance Fee for %d, %s is: %.2f$\n",
            n.getEmp_id(), n.getEmp_name(),
            tripAdvanceFee.apply(n)));

    System.out.println("\nInvoking printCostTrip method using :: operator within foreach");
    Consumer<Trip> totalTripCostMethod = Trip::printCostTrip;
    tripSet.forEach(totalTripCostMethod);

    System.out.println("\nUsing Consumer Functional interface");
    Trip newTrip = new Trip(2, "Amine Khan", "Paris France", 1.11, 50, 75.00, 50.00);
    totalTripCostMethod.accept(newTrip);

  }
}
