package designPatternsFaculty;

import java.util.*;
import java.io.*;

public class TestDesignPatternsFaculty {
  public static void main(String[] args) throws IOException {
    System.out.println("Faculty 1:");
    System.out
        .println("Implement Singleton and Use MVC patterns to Print Faculty keys collection using Lambda Expression");
    new FacultyController(new FacultyView1()).updateView();

    System.out.println("Faculty 2:");
    System.out.println(
        "\nImplement Singleton and Use MVC patterns to Print Faculty info V Collection using Lambda Expression");
    new FacultyController(new FacultyView2()).updateView();

    System.out.println("Faculty 3:");
    System.out.println("\n");
    new FacultyController(new FacultyView3()).updateView();

    System.out.println("\nPlease enter Faculty Bonus Rate to Iterate its collection: ");
    Scanner input = new Scanner(System.in);
    double facultyBonusRate = input.nextDouble();
    input.close();

    FacultyRepository repo = new FacultyRepository();
    Iterator rateIterator = repo.getRateIterator(facultyBonusRate);
    while (rateIterator.hasNext()) {
      Faculty faculty = (Faculty) rateIterator.next();
      System.out.println(faculty);
      System.out.printf("Bonus: %.2f, Tax Bonus: %.2f\n", faculty.doCalc_Bonus(), faculty.doBonus_tax());
    }

    System.out.println("\nFaculty Salary Iterator View");
    Iterator salaryIterator = repo.getSalaryIterator();
    while (salaryIterator.hasNext()) {
      Faculty faculty = (Faculty) salaryIterator.next();
      System.out.println(faculty);
      System.out.printf("Bonus: %.2f, Tax Bonus: %.2f\n", faculty.doCalc_Bonus(), faculty.doBonus_tax());
    }
  }
}
