public class Employee {
    // ФИО, отделе и зарплате сотрудников
    private String fullName;
    private int department;
    private int salary;

    private int id;
    private static int counter; // delete 0


    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = getCounter();
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public String getFullNameName() {
        return this.fullName;
    }

    public int getDepartment() {
        return this.department;
    }

    public int getSalary() {
        return this.salary;
    }

    public int getId() {
        return this.id;
    }

    public void setDepartment(int department) {
        this.department= department;
    }

    public void setSalary(int salary) {
        this.salary= salary;
    }

    @Override
    public String toString () {
        return "Full Name staff: " + fullName+
                " Salary staff: " + salary+
                " Number department: " + department+
                " Id: " + id;
    }

}
