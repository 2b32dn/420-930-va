package gradeProject;

import java.util.*;
import java.io.*;

public class TestGradeProject {
  public static void main(String[] args) throws FileNotFoundException {
    // Read from Grade.in and load it into arrayList
    Scanner inputFile = new Scanner(new FileReader("./Grade.in"));
    List<Grade> all_sgrades = new ArrayList<>();

    while (inputFile.hasNextLine()) {
      Grade gradeObj = new Grade();
      gradeObj.setStudent_id(inputFile.nextInt());
      gradeObj.setStudent_lname(inputFile.next());
      gradeObj.setStudent_fname(inputFile.next());
      gradeObj.setS_grade_Assignment1(inputFile.nextInt());
      gradeObj.setS_grade_Assignment2(inputFile.nextInt());
      gradeObj.setS_grade_Assignment3(inputFile.nextInt());
      gradeObj.setS_grade_Mid_Term(inputFile.nextInt());
      gradeObj.setS_grade_Final_Term(inputFile.nextInt());
      all_sgrades.add(gradeObj);

      System.out.printf("\u001B[32ms_id: %d, Student Last Name: %s, Student First Name: %s\u001B[0m\n\n",
          gradeObj.getStudent_id(),
          gradeObj.getStudent_lname(), gradeObj.getStudent_fname());
      System.out.printf("Assignment 1: %d\n", gradeObj.getS_grade_Assignment1());
      System.out.printf("Assignment 2: %d\n", gradeObj.getS_grade_Assignment2());
      System.out.printf("Assignment 3: %d\n", gradeObj.getS_grade_Assignment3());
      System.out.printf("Mid Term Exam: %d\n", gradeObj.getS_grade_Mid_Term());
      System.out.printf("Final Exam: %d\n\n", gradeObj.getS_grade_Final_Term());
      System.out.printf("The Average score for this student is %.2f\n\n\n",
          gradeObj.Calculate_GradeAverage());
    }

    // Print all students_id into a one-dimensional array
    int[] student_id = new int[all_sgrades.size()];
    for (int i = 0; i < all_sgrades.size(); i++) {
      student_id[i] = all_sgrades.get(i).getStudent_id();
    }
    System.out.printf("Student ID: %s\n", Arrays.toString(student_id));

    // Store all second and third columns in Grade.in and print it
    String[] student_lname = new String[all_sgrades.size()];
    String[] student_fname = new String[all_sgrades.size()];
    for (int i = 0; i < all_sgrades.size(); i++) {
      student_lname[i] = all_sgrades.get(i).getStudent_lname();
      student_fname[i] = all_sgrades.get(i).getStudent_fname();
    }
    System.out.printf("Student Last Name: %s\n", Arrays.toString(student_lname));
    System.out.printf("Student First Name: %s\n", Arrays.toString(student_fname));

    // Store all average grades + midterm and final in Grade.in into a
    // two-dimensional array and print it
    double[][] st_grades = new double[all_sgrades.size()][6];
    for (int i = 0; i < all_sgrades.size(); i++) {
      st_grades[i][0] = all_sgrades.get(i).getS_grade_Assignment1();
      st_grades[i][1] = all_sgrades.get(i).getS_grade_Assignment2();
      st_grades[i][2] = all_sgrades.get(i).getS_grade_Assignment3();
      st_grades[i][3] = all_sgrades.get(i).getS_grade_Mid_Term();
      st_grades[i][4] = all_sgrades.get(i).getS_grade_Final_Term();
      st_grades[i][5] = all_sgrades.get(i).Calculate_GradeAverage();
    }
    System.out.printf("Student Grades: %s\n", Arrays.deepToString(st_grades));

    inputFile.close();
  }
}
