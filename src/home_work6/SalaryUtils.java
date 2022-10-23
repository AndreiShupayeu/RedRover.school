package home_work6;

public class SalaryUtils {
    public double getSum(Employee[] employeeArray){
        double result=0;
        for(Employee a:employeeArray){
          result+=a.getSalary();
        }
        return result;
    }
}
