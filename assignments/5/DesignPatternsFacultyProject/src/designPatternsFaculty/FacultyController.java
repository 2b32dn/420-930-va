package designPatternsFaculty;

import java.io.IOException;
import java.util.*;

public class FacultyController {
  private FacultyView view;
  private HashMap<Integer, Faculty> facultyMap;

  public FacultyController(FacultyView view) throws IOException {
    this.view = view;
    this.facultyMap = FacultySingleton.getInstance().getFacultyMap();
  }

  public void updateView() {
    view.display(facultyMap);
  }
}
