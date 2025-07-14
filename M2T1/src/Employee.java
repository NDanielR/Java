public class Employee {

    private String name;

    private Integer employeeCode;

    private Double salary;

    private Double bonus;

    private String department;


    //construtors
    public Employee(String name, Integer employeeCode, Double salary, Double bonus, String department) {
        this.name = name;
        this.employeeCode = employeeCode;
        this.salary = salary;
        this.bonus = bonus;
        this.department = department;
    }

    public Employee(String name, Integer employeeCode, Double salary, Double bonus) {
        this(name, employeeCode, salary, bonus, "Indefinido");
    }

    public Employee(String name, Integer employeeCode, Double salary) {
        this(name, employeeCode, salary,0.0,"Indefinite");
    }

    public Employee(String name, Integer employeeCode) {
        this(name, employeeCode, 1250000.0, 0.0, "Indefinite");
    }

    public Employee(){
        this("usuarioPrueba", 0, 0.0, 0.0, "indefinite");
    }


    //methods
    public void salaryIncrease(double increase){
        this.salary = salary + increase;
    }

    public void addBonus (double addBonus){
        this.bonus = addBonus;
    }

    public void modifyDepartment(String modifDepartment){
        this.department = modifDepartment;
    }

    public double annualSalary(){
        return salary * 12;
    }


    //getters
    private String getName() {
        return name;
    }

    private Integer getEmployeeCode() {
        return employeeCode;
    }

    private Double getSalary() {
        return salary;
    }

    private Double getBonus() {
        return bonus;
    }

    private String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return 
        ("name = " + getName() + " employeeCode = " + getEmployeeCode() + " salary = " + getSalary() + " bonus = " + getBonus()
        + " departamento = " + getDepartment());
    }
}
