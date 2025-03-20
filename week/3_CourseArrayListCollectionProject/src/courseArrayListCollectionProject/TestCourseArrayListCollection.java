package courseArrayListCollectionProject;

import java.util.*;
import java.io.*;

public class TestCourseArrayListCollection {
  public static void main(String[] args) throws IOException {
    // Read from input File "Course.in" used in Lab2 and load it into ArrayList
    // Collection
    Scanner inputFile = new Scanner(new FileReader("./Course.in"));
    List<Course> inFileArrayList = new ArrayList<>();
    while (inputFile.hasNextLine()) {
      Course courseObj = new Course();
      courseObj.setCourse_code(inputFile.next());
      courseObj.setCourse_name(inputFile.next());
      Course.setCredits(inputFile.nextInt());
      courseObj.setMax_enrollment(inputFile.nextInt());
      inFileArrayList.add(courseObj);
    }

    inputFile.close();
    // Print ArrayList Collection using method get()
    int index = 0;
    for (index = 0; index < inFileArrayList.size(); index++) {
      System.out.println(inFileArrayList.get(index).getCourse_code());
    }

    // Print ArrayList collection by Traversing Forward Arraylist using ListIterator
    System.out.println("\nTraversing Forward:");
    ListIterator<Course> listIterator = inFileArrayList.listIterator();
    while (listIterator.hasNext()) {
      System.out.println(listIterator.next().getCourse_code());
    }

    // Print ArrayList collection by Traversing Backward Arraylist using
    // ListIterator calling the method previous()
    System.out.println("\nTraversing Backward:");
    while (listIterator.hasPrevious()) {
      System.out.println(listIterator.previous().getCourse_code());
    }
  }
}
