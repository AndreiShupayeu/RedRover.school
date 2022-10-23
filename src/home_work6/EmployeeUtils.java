package home_work6;

// задал вопрос Дмитрию насчет возвращаемого типа
public class EmployeeUtils {
    public Employee employeeWithName(Employee[] employees, String name) {
        for (Employee a : employees) {
            if (a.getName().equals(name)) {
                System.out.println(a.getName() + " " + a.getYearOfBirth());
            }
        }
        return null;
    }

    // задал вопрос Дмитрию насчет возвращаемого типа
    public Employee employeeWithString(Employee[] employees, String string) {
        for (Employee a : employees) {
            if (a.getName().contains(string)) {
                System.out.println(a.getName() + " " + a.getYearOfBirth());
            }
        }
        return null;
    }

    public double totalBudget(Employee[] employeeArray) {
        double result = 0;
        for (Employee a : employeeArray) {
            result += a.getSalary();
        }
        return result;
    }

    public double minSalary(Employee[] employeeArray) {
        double min = employeeArray[0].getSalary();
        for (Employee a : employeeArray) {
            if (a.getSalary() < min) {
                min = a.getSalary();
            }
        }
        return min;
    }

    public double maxSalary(Employee[] employeeArray) {
        double max = employeeArray[0].getSalary();
        for (Employee a : employeeArray) {
            if (a.getSalary() > max) {
                max = a.getSalary();
            }
        }
        return max;
    }
}
