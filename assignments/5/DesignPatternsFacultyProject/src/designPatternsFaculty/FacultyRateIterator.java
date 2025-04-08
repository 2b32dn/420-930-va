package designPatternsFaculty;

import java.util.*;

public class FacultyRateIterator implements Iterator {
  private List<Faculty> list;
  private int position;
  private double rate;

  public FacultyRateIterator(List<Faculty> list, double rate) {
    this.list = list;
    this.rate = rate;
    this.position = 0;
  }

  public boolean hasNext() {
    while (position < list.size()) {
      if (list.get(position).getF_BonusRate() == rate)
        return true;
      position++;
    }
    return false;
  }

  public Faculty next() {
    return list.get(position++);
  }
}