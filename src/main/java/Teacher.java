/**
 * This class is responsible for keeping track of the id, name, and salary
 */
public class Teacher {

    private int id;
    private String name;
    private double salary;
    private double salaryEarned;

    /**
     * Creates a new Teacher Object
     * @param id unique id for teacher
     * @param name of the teacher
     * @param salary of the teacher
     */

    public Teacher(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void receiveSalary(double salary){
        salaryEarned+= salary;
        School.updateTotalMoneySpent(salary);
    }
}
