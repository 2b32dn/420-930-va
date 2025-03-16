package linkedListCourseProject;

import java.util.*;
import java.io.*;

public class TestLinkedListCourse {
  public static void main(String[] args) throws IOException {
    Scanner inputFile = new Scanner(new FileReader("./Course.in"));
    LinkedListNode headNode = null, newNode = null, currentNode = null;

    while (inputFile.hasNextLine()) {
      Course courseObj = new Course();

      courseObj.setCourse_id(inputFile.next());
      courseObj.setCourse_name(inputFile.next());
      Course.setCredits(inputFile.nextInt());
      courseObj.setMax_enrollment(inputFile.nextInt());

      newNode = new LinkedListNode();
      newNode.info = courseObj;
      newNode.link = null;

      if (headNode == null) {
        headNode = newNode;
      } else {
        currentNode.link = newNode;
      }
      currentNode = newNode;
    }

    System.out.println("Displaying the components of the linked list stored from user input");
    currentNode = headNode;
    while (currentNode != null) {
      // process the current
      System.out.printf("Course Code: %s, Course Name: %s, Credits: %d, Max enrolled: %d\n\n",
          currentNode.info.getCourse_id(), currentNode.info.getCourse_name(), Course.getCredits(),
          currentNode.info.getMax_enrollment());

      currentNode = currentNode.link;
    }
    System.out.println("Enter the course code you are looking for: ");
    Scanner input = new Scanner(System.in);
    String courseCode = input.next();

    Course courseNewObj = new Course();
    courseNewObj.searchCourses(headNode, courseCode);

    input.close();
    inputFile.close();
  }
}
