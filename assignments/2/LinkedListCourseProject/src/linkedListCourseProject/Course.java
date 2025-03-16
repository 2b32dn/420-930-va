package linkedListCourseProject;

public class Course {
  private String course_id;
  private String course_name;
  private int max_enrollment;
  public static int credits;

  // Constructor
  public Course() {
    this.course_id = "";
    this.course_name = "";
    credits = 0;
    this.max_enrollment = 0;
  }

  // Constructor with parameters
  public Course(String course_id, String course_name, int credits, int max_enrollment) {
    this.course_id = course_id;
    this.course_name = course_name;
    Course.credits = credits;
    this.max_enrollment = max_enrollment;
  }

  // Getters and Setters
  public String getCourse_id() {
    return course_id;
  }

  public void setCourse_id(String course_id) {
    this.course_id = course_id;
  }

  public String getCourse_name() {
    return course_name;
  }

  public void setCourse_name(String course_name) {
    this.course_name = course_name;
  }

  public static int getCredits() {
    return credits;
  }

  public static void setCredits(int credits) {
    Course.credits = credits;
  }

  public int getMax_enrollment() {
    return max_enrollment;
  }

  public void setMax_enrollment(int max_enrollment) {
    this.max_enrollment = max_enrollment;
  }

  // Methods
  public void searchCourses(LinkedListNode headNode, String courseCode) {
    LinkedListNode currentNode = headNode;
    while (currentNode != null) {
      if (currentNode.info.getCourse_id().equals(courseCode)) {
        System.out.printf("Course Code: %s, Course Name: %s, Credits: %d, Max enrolled: %d\n\n",
            currentNode.info.getCourse_id(), currentNode.info.getCourse_name(), Course.getCredits(),
            currentNode.info.getMax_enrollment());
      }
      currentNode = currentNode.link;
    }
  }
}
