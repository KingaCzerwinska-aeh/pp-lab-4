package employees;
public class Worker extends Employee {
    public String position;
    public Worker(String name, double salary, String position) {
        super(name, salary);
        this.position = position;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    @Override
    public String toString() {
        return "Worker: " + getFullName() + ", Salary: " + getSalary() + ", Position: " + position;
    }
}
