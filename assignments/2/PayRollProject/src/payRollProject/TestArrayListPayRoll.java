package payRollProject;

import java.util.*;
import java.io.*;

public class TestArrayListPayRoll {
  public static void main(String[] args) throws IOException {
    Scanner inputFile = new Scanner(new FileReader("./Payroll.in"));
    ArrayList<PayRollEmployeeClass> payRollArrayList = new ArrayList<>();
    double totalIncomeAmount = 0, totalNetAmount = 0, totalDeductionAmount = 0;

    while (inputFile.hasNextLine()) {
      PayRollEmployeeClass payRollObj = new PayRollEmployeeClass();
      payRollObj.setEmp_id(inputFile.nextInt());
      payRollObj.setEmp_name(inputFile.next());
      payRollObj.setEmp_ssn(inputFile.next());
      payRollObj.setNumber_whr(inputFile.nextInt());
      payRollObj.setH_rate(inputFile.nextDouble());
      payRollArrayList.add(payRollObj);

      System.out.println("\n\nReading from Payroll.in Input File");
      System.out.println("Printing ArrayList payRollArrayList and perform processing\n");
      System.out.printf(
          "\u001B[32mpayRollArrList[%d] Object: PayRollEmployee [emp_id=%d, emp_name=%s, emp_SSN=%s, number_whr=%d, h_rate=%.2f] \u001B[0m\n\n",
          payRollArrayList.indexOf(payRollObj),
          payRollObj.getEmp_id(),
          payRollObj.getEmp_name(),
          payRollObj.getEmp_ssn(),
          payRollObj.getNumber_whr(),
          payRollObj.getH_rate());
      System.out.printf("The Total Earning is %.2f$\n", payRollObj.calculate_TotalIncome());
      System.out.printf("The Fed_Tax Deduction is %.2f$\n", payRollObj.calculate_FedTaxDeduction());
      System.out.printf("The Prv_Tax Deduction is %.2f$\n", payRollObj.calculate_PrvTaxDeduction());
      System.out.printf("The QP_Ins Deduction is %.2f$\n", payRollObj.calculate_QP_InsDeduction());
      System.out.printf("The E_ins Deduction is %.2f$\n", payRollObj.calculate_E_InsDeduction());
      System.out.printf("The Qpp Deduction is %.2f$\n", payRollObj.calculate_QppDeduction());
      System.out.printf("The Union_d Deduction is %.2f$\n", payRollObj.calculate_UnionDeduction());
      System.out.printf("Total Deduction is %.2f$\n", payRollObj.calculate_TotalDeduction());
      System.out.printf("Net Amount is %.2f$\n", payRollObj.calculate_TotalNetAmount());
    }

    for (int i = 0; i < payRollArrayList.size(); i++) {
      totalIncomeAmount = totalIncomeAmount + payRollArrayList.get(i).calculate_TotalIncome();
      totalDeductionAmount = totalDeductionAmount + payRollArrayList.get(i).calculate_TotalDeduction();
      totalNetAmount = totalNetAmount + payRollArrayList.get(i).calculate_TotalNetAmount();
    }
    System.out.printf("\nAll Employee Total of Earning is %.2f$\n", totalIncomeAmount);
    System.out.printf("All Employee Total of Deduction is %.2f$\n", totalDeductionAmount);
    System.out.printf("All Employee Total of Net Amount is %.2f$\n", totalNetAmount);
    inputFile.close();
  }
}
