import employees.*;
public class Company {

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Manager("Krystyna Ogorek", 4000.0, 0);
        employees[1] = new Worker("Katarzyna Pomidor", 5000.0, "Marketing");
        employees[2] = new Employee("Klaudia Pietruszka", 2200.0);
        employees[3] = new Employee("Kornelia Marchewka", 4000.0);
        employees[4] = new Worker("Klara Burak", 8000.0,"HR");

        System.out.println("Dane pracownika:");
        System.out.println(employees[3]);

        employees[3].setSalary(4444.0);

        int numberOfNonManagers = 0;
        for (Employee employee : employees) {
            if (!(employee instanceof Manager)) {
                numberOfNonManagers++;
            }
        }

       ((Manager) employees[0]).setNumberOfSubordinates(numberOfNonManagers);

        employees[0].setSalary(7500.0);


        System.out.println("\nDane dla wszystkich pracowników:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
