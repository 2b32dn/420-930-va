package designPatternsFaculty;

import java.io.IOException;
import java.util.*;

public class FacultyRepository {
  private final List<Faculty> facultyList;

  public FacultyRepository() throws IOException {
    facultyList = new ArrayList<>(FacultySingleton.getInstance().getFacultyMap().values());
  }

  public Iterator getRateIterator(double rate) {
    return new FacultyRateIterator(facultyList, rate);
  }

  public Iterator getSalaryIterator() {
    return new FacultySalaryIterator(facultyList);
  }
}