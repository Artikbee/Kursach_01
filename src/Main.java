public class Main {

    public static void typeAllStaff(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static int sumSalary (Employee[] employees){ // как объявлять массив в методе // почему не void
        int sum =0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        System.out.println("Summary salary: "+sum);
        return sum;
    }

    public static void minSalary(Employee[] employees) {
        int minSalary = employees[0].getSalary();
        String staffPerson = "";
        for (Employee employee : employees) { // question
            if (minSalary > employee.getSalary()) {
                minSalary = employee.getSalary();
                staffPerson = employee.getFullNameName(); //emp question
            }
        }
        System.out.println("Staff has a min salary: " + staffPerson + " " + minSalary);
    }

    public static void maxSalary(Employee[] employees) {
        int maxSalary = employees[0].getSalary();
        String staffPerson = "";
        for (Employee employee : employees) { // question
            if (maxSalary < employee.getSalary()) {
                maxSalary = employee.getSalary();
                staffPerson = employee.getFullNameName(); //emp question
            }
        }
        System.out.println("Staff has a max salary: " + staffPerson + " " + maxSalary);
    }

    public static void averageSalary (Employee[] employees) {
        int average;
        int sum = sumSalary(employees);
        average = sum/employees.length;
        System.out.println("Average salary: "+average);
    }

    public static void AllName(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println("Full name: " + employee.getFullNameName());
        }
    }

    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Ivanov Ivan Ivanovich", 1, 2000);
        employee[1] = new Employee("Gorbynov Max Mikhalovich", 3, 5000);
        employee[2] = new Employee("Kyzov Andrey Igorevich", 4, 2500);
        employee[3] = new Employee("Sevostyanov Alexander Mikhalovich", 2, 2700);
        employee[4] = new Employee("Medvedev Dmitriy Ivanovich", 5, 500);
        employee[5] = new Employee("Usov Artemii Olegovich", 3, 2550);
        employee[6] = new Employee("Putin Max Igorevich", 2, 750);
        employee[7] = new Employee("Norkin Egor Nikolaevich", 1, 7600);
        employee[8] = new Employee("Kylaev Artem Romanovich", 4, 9000);
        employee[9] = new Employee("Lifanov Max Mikhalovich", 5, 9100);
        typeAllStaff(employee);
        sumSalary(employee);
        minSalary(employee);
        maxSalary(employee);
        averageSalary(employee);
        AllName(employee);
    }
}