package collectionExamplesProject;

import java.util.*;
import java.io.*;

public class TestStudentSet {
  public static void main(String[] args) throws IOException {
    // id, fullname, numberofhrs, rateofhrs
    Scanner inputFile = new Scanner(new FileReader("./student.in"));
    // load it into hashset and treeset collection
    Set<Student> mySet = new HashSet<>();

    while (inputFile.hasNextLine()) {
      Student std = new Student();
      String stdFN = inputFile.nextLine();
      String[] stdFNArr = stdFN.split("\t");

      std.setStd_Id(Integer.parseInt(stdFNArr[0]));
      std.setStd_FullName(stdFNArr[1]);
      std.setHrs(Integer.parseInt(stdFNArr[2]));
      std.setRatePerhrs(Double.parseDouble(stdFNArr[3]));

      mySet.add(std);
    }
    inputFile.close();

    System.out.println("Printing elements of student.in: ");
    for (Student std : mySet) {
      System.out.printf("Student ID: %d\nStudent Full Name: %s\nStudent hours: %d\nStudent Hourly Rate: %.2f$\n\n",
          std.getStd_Id(),
          std.getStd_FullName(),
          std.getHrs(),
          std.getRatePerhrs());
    }
  }
}
