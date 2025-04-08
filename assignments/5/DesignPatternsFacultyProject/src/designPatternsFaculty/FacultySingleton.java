package designPatternsFaculty;

import java.io.*;
import java.util.*;

public class FacultySingleton {
  private static FacultySingleton instance;
  private HashMap<Integer, Faculty> facultyMap;

  private FacultySingleton() throws IOException {
    facultyMap = new HashMap<>();
    loadFacultyData();
  }

  public static FacultySingleton getInstance() throws IOException {
    if (instance == null) {
      instance = new FacultySingleton();
    }
    return instance;
  }

  private void loadFacultyData() throws IOException {
    Scanner inputFile = new Scanner(new File("Faculty.in"));

    while (inputFile.hasNextLine()) {
      Faculty faculty = new Faculty();
      String fclt = inputFile.nextLine();
      String[] facultyParts = fclt.split("\\s+");
      faculty.setF_id(Integer.parseInt(facultyParts[0]));
      faculty.setF_Lname(facultyParts[1]);
      faculty.setF_Fname(facultyParts[2]);
      faculty.setF_Salary(Double.parseDouble(facultyParts[3]));
      faculty.setF_BonusRate(Double.parseDouble(facultyParts[4]));
      facultyMap.put(Integer.parseInt(facultyParts[0]), faculty);
    }
    inputFile.close();
  }

  public HashMap<Integer, Faculty> getFacultyMap() {
    return facultyMap;
  }
}