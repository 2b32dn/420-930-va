package designPatternsFaculty;

import java.util.*;

public class FacultyView2 implements FacultyView {
  public void display(Map<Integer, Faculty> facultyMap) {
    facultyMap.values().forEach(faculty -> {
      System.out.println(faculty);
      System.out.printf("Faculty Bonus=%.2f, Faculty Tax Bonus =%.2f\n",
          faculty.doCalc_Bonus(), faculty.doBonus_tax());
    });
  }
}
