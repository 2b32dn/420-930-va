package courseSinglePattern;

import java.util.*;

public class TestCourseSingletonPattern {
  public static void main(String[] args) {

    // you can instantiate object from ArrayList
    List<Course> course1 = new ArrayList<>();

    // you can instantiate object from ArrayList
    List<Course> course2 = new ArrayList<>();

    // This statement is no longer valid since calling private constructor is not
    // doable.
    // CourseSingleton courseSingleton = new CourseSingleton();

    // Instantiate object to access database
    // one single object
    CourseSingleton courseSingleton = CourseSingleton.getInstance();

    // Read courses from collection
    List<Course> myCourseList = courseSingleton.getCourses();
    System.out.println("Priting elements of ArrayList using Lambda Expression: ");
    myCourseList.forEach(n -> {
      System.out.println(n);
    });
  }
}
