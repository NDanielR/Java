public class EmpresaApp {
    public static void main(String[] args) {
        Employee employee1 = new Employee ("nelson ramirez", 12, 2000.0);
        employee1.salaryIncrease(600);
        Employee employee2 = new Employee ("jhorman ramirez",13,3000.0,0.0,"ventas");
        Employee employee3 = new Employee ();
        System.out.println(employee1.toString());
        System.out.println("salario anual = " + employee1.annualSalary());
        System.out.println(employee2.toString());
        System.out.println(employee3.toString());
    }
}
