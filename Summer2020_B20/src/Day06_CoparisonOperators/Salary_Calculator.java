package Day06_CoparisonOperators;

public class Salary_Calculator {

    /* find salary of 48 weeks
    double: rate * weeklyhours * 48
    double: totaltax: salary * total tax rate (state + federal)
    double: salary after tax: total - total salary
     */
    public static void main(String[] args) {
        double rate = 50;
        double stateTaxRate = 0.05, federalTaxRate = 0.2;
        int weeklyHours = 45;

        double salary = rate * weeklyHours * 48;
        double totalTax = salary * (stateTaxRate + federalTaxRate);
        double salaryAfterTax = salary - totalTax;

        System.out.println("Salary before tax is $" + salary);
        System.out.println("Total Tax is " + totalTax+ "USD");
        System.out.println("Total Salary After Tax :" + salaryAfterTax+ "USD");




    }

}
