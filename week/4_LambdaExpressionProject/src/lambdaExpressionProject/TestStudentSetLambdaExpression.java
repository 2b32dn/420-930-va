package lambdaExpressionProject;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.io.*;

public class TestStudentSetLambdaExpression {
  public static void main(String[] args) throws IOException {
    Scanner inputFile = new Scanner(new FileReader("./student.in"));
    Set<Student> studentSet = new HashSet<>();

    while (inputFile.hasNextLine()) {
      Student student = new Student();
      String studentFullName = inputFile.nextLine();
      String[] studentFullNameArr = studentFullName.split("\t");

      student.setStd_Id(Integer.parseInt(studentFullNameArr[0]));
      student.setStd_FullName(studentFullNameArr[1]);
      student.setHrs(Integer.parseInt(studentFullNameArr[2]));
      student.setRatePerhrs(Double.parseDouble(studentFullNameArr[3]));

      studentSet.add(student);
    }
    inputFile.close();

    System.out.println("\n Print studentSet elements from LinkedHashSet Collection using Lambda Expression");
    studentSet.forEach(n -> {
      System.out.println(n);
    });

    System.out.println("\n Print studentSet elements from LinkedHashSet Collection using Method Reference operator ::");
    studentSet.forEach(System.out::println);

    System.out.println("\nPrint using a Consumer type");
    Consumer<Student> stdMethod = n -> {
      System.out.println(n.getStd_FullName().toUpperCase());
    };
    studentSet.forEach(stdMethod);

    System.out.println("\ntesting this stdMethod variable to given element");
    stdMethod.accept(new Student(108, "Jeonyul", 30, 150));
    studentSet.forEach(stdMethod);

    System.out.println("\ntesting this stdMethod2 variable to given element with Consumer");
    Consumer<Student> stdMethod2 = Student::CalculateSalary;
    studentSet.forEach(stdMethod2);

    System.out.println("\ntesting this stdMethod3 variable to given element with Function");
    Function<Student, String> stdMethod3 = (n) -> {
      String upper = n.getStd_FullName().toUpperCase();
      Double salary = n.getRatePerhrs() * n.getHrs();
      return "Student Name: " + upper + " ,Salary: " + salary + "$";
    };
    studentSet.forEach(n -> System.out.println(stdMethod3.apply(n)));
  }
}
