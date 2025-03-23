package collectionExamplesProject;

import java.util.Comparator;

public class StudentCompNumHour implements Comparator<Student> {

  @Override
  public int compare(Student o1, Student o2) {
    if (o1.getRatePerhrs() < o2.getRatePerhrs()) {
      return -1;
    } else {
      return 1;
    }
  }
}
