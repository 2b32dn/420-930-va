package lambdaExpressionProject;

import java.util.*;
import java.util.function.*;
import java.io.*;

public class TestLambdaExpressionDivide {
  public static void main(String[] args) throws IOException {
    // Reading from input file divide.in
    // Filling up HashSet data structure divideInFileSet
    Scanner inputFile = new Scanner(new FileReader("./divide.in"));
    Set<Divide> myDoubleList = new HashSet<>();

    while (inputFile.hasNextLine()) {
      Divide dvdObj = new Divide();
      dvdObj.setX(inputFile.nextDouble());
      dvdObj.setY(inputFile.nextDouble());
      myDoubleList.add(dvdObj);
    }
    inputFile.close();

    // Print Divide HashSet collection using Lambda Expression
    System.out.println("Print using Lambda Expression");
    myDoubleList.forEach(n -> {
      System.out.printf("[x=%.2f, y=%.2f]\n", n.getX(), n.getY());
    });

    // Print Divide HashSet collection using method reference operator ::
    System.out.println("Print using Method Reference Operator");
    myDoubleList.forEach(System.out::println);

    // Define variable divMethod of type Consumer that performs x/y
    // apply it to every data structure divideInFileSet
    System.out.println("Print using a Consumer type");
    Consumer<Divide> divMethod = n -> {
      System.out.println(n.getX() / n.getY());
    };
    myDoubleList.forEach(divMethod);

    // testing divMethod using accept
    System.out.println("testing this divMethod variable to given element");
    divMethod.accept(new Divide(6, 3));
    divMethod.accept(myDoubleList.iterator().next());
    myDoubleList.forEach(divMethod);

    // Define variable divMethod2 of type Consumer using operator ::
    // apply it to every data structure divideInFileSet
    System.out.println("testing this divMethod2 variable to given element with Consumer");
    Consumer<Divide> divMethod2 = Divide::calculateDivision;
    myDoubleList.forEach(divMethod2);

    // Define variabvle divMethod3 of type Function that returns (n*3)/(n-2)
    // apply it to every data structure divideInFileSet where n = (field1 + field2)
    System.out.println("testing this divMethod3 variable to given element with Function");
    Function<Divide, Double> divMethod3 = (n) -> {
      return ((n.getX() + n.getY()) * 3) / ((n.getX() + n.getY()) / 2);
    };
    myDoubleList.forEach(n -> System.out.println(divMethod3.apply(n)));
  }

}
