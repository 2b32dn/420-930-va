package designPatternsFaculty;

import java.util.*;

public class FacultyView1 implements FacultyView {
  public void display(Map<Integer, Faculty> facultyMap) {
    facultyMap.keySet().forEach(System.out::println);
  }
}
