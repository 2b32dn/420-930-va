package designPatternsFaculty;

import java.util.*;

public class FacultySalaryIterator implements Iterator {
  private List<Faculty> sortedList;
  private int position;

  public FacultySalaryIterator(List<Faculty> list) {
    sortedList = new ArrayList<>(list);
    sortedList.sort((f1, f2) -> Double.compare(f2.getF_Salary(), f1.getF_Salary()));
    position = 0;
  }

  public boolean hasNext() {
    return position < sortedList.size();
  }

  public Faculty next() {
    return sortedList.get(position++);
  }
}