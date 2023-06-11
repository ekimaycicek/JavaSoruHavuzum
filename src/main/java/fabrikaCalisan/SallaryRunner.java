package fabrikaCalisan;

public class SallaryRunner {

    public static void main(String[] args) {
        SalaryCalculation_Employee employee = new SalaryCalculation_Employee("Drake",20000,41,2020);
        System.out.println("employee.name = " + employee.name);
        System.out.println("employee.salary = " + employee.salary);
        System.out.println("Ödenecek vergi = " + employee.tax() + "$");
        System.out.println("ödenecek bonus = " + employee.bonus());
        System.out.println("employee.raiseSalary() = " + employee.raiseSalary());

        System.out.println("employee.salary+ employee.raiseSalary() = " + ((employee.salary) + (employee.raiseSalary())));

        System.out.println("employee.toString() = " + employee.toString());
    }
}
