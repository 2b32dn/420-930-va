package courseSinglePattern;

public class Course {
  private String course_code;
  private String course_name;
  private int max_enrollment;
  public static int credits;

  // Constructor
  public Course() {
    this.course_code = "";
    this.course_name = "";
    credits = 3;
    this.max_enrollment = 0;
  }

  // Constructor with parameters
  public Course(String course_code, String course_name, int credits, int max_enrollment) {
    this.course_code = course_code;
    this.course_name = course_name;
    Course.credits = credits;
    this.max_enrollment = max_enrollment;
  }

  // Getters and Setters
  public String getCourse_code() {
    return course_code;
  }

  public void setCourse_code(String course_code) {
    this.course_code = course_code;
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
  public String toString() {
    return "Course [" +
        "course_code='" + course_code + '\'' +
        ", course_name='" + course_name + '\'' +
        ", credits=" + credits +
        ", max_enrollment=" + max_enrollment +
        ']';
  }
}
