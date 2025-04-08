package designPatternsFaculty;

import java.util.*;

public class FacultyView3 implements FacultyView {
  public void display(Map<Integer, Faculty> facultyMap) {
    facultyMap.values().stream()
        .sorted((f1, f2) -> Double.compare(f2.getF_Salary(), f1.getF_Salary()))
        .forEach(faculty -> {
          System.out.println(faculty);
          System.out.printf("Faculty Bonus=%.2f, Faculty Tax Bonus =%.2f\n",
              faculty.doCalc_Bonus(), faculty.doBonus_tax());
        });
  }
}