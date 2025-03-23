package collectionExamplesProject;

import java.util.Comparator;

public class StudentCompRate implements Comparator<Student> {

  @Override
  public int compare(Student o1, Student o2) {
    if (o1.getHrs() < o2.getHrs()) {
      return -1;
    } else {
      return 1;
    }
  }
}
