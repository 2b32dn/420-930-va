package collectionExamplesProject;

import java.io.*;
import java.util.*;

public class TestStudentTreeSet {
  public static void main(String[] args) throws IOException {
    // Read from student1.in and load it into TreeSet Collection of Student Data
    // type. Sorted wit respect to s_rateHour increasing order
    Scanner inputFile = new Scanner(new FileReader("./student2.in"));
    Set<Student> studentTreeSet_RateASC = new TreeSet<>(new StudentCompRate());
    Set<Student> studentTreeSet_HourDESC = new TreeSet<>(new StudentCompNumHour());

    while (inputFile.hasNextLine()) {
      Student student = new Student();
      String studentFullName = inputFile.nextLine();
      String[] studentFullNameArr = studentFullName.split("\t");

      student.setStd_Id(Integer.parseInt(studentFullNameArr[0]));
      student.setStd_FullName(studentFullNameArr[1]);
      student.setHrs(Integer.parseInt(studentFullNameArr[2]));
      student.setRatePerhrs(Double.parseDouble(studentFullNameArr[3]));

      studentTreeSet_RateASC.add(student);
      studentTreeSet_HourDESC.add(student);
    }
    inputFile.close();

    // Read from student1.in and load it into TreeSet Collection of Student Data
    // type. Sorted wit respect to s_numberHour increasing order
    System.out.println("\nPrint all Students from the TreeSet Collection sorted by Rate in ASC order\n");
    for (Student std : studentTreeSet_RateASC) {
      System.out.println(std);
    }
    System.out.println("\nPrint all Students from the TreeSet Collection sorted by Hourly Rate in DESC order\n");
    for (Student std : studentTreeSet_HourDESC) {
      System.out.println(std);
    }
  }
}
