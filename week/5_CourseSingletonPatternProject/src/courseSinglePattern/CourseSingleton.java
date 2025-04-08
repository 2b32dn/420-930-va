package courseSinglePattern;

import java.util.*;

// Global access: No limited to Database
public class CourseSingleton {

  // One single object
  private static CourseSingleton courseSingleton;
  private List<Course> courseList;

  // Main trick
  // It has to be public to be called in TestCourseSingletonPattern
  public static CourseSingleton getInstance() {
    if (courseSingleton == null) { // if the first one is null, create a new courseSingleton obj
      courseSingleton = new CourseSingleton();
    }
    return courseSingleton;
  }

  // Private constructor
  private CourseSingleton() {
    courseList = new ArrayList<>();
    for (int index = 0; index < 7; index++) {
      Course course = new Course();
      course.setCourse_name("course #: " + index);
      courseList.add(course);
    }
  }

  public List<Course> getCourses() {
    return courseList;
  }

  // Report 1
  // Iterate over collection(s)

  // Report 2
  // Iterate over collection(s)

  // Report 3
  // Iterate over collection(s)
}
