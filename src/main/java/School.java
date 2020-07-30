import java.util.List;

/**
 * School can have many teachers and many students (List)
 */
public class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private static double totalMoneyEarned;
    private static double totalMoneySpent;

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void addTeachers(Teacher teacher) {
        teachers.add(teacher);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudents(Student student) {
        students.add(student);
    }

    public double getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public static void updateTotalMoneyEarned(double MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    public double getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * update money spent which is the salary given to thee teachers
     * @param MoneySpent
     */
    public static void updateTotalMoneySpent(double MoneySpent) {
        totalMoneyEarned -= MoneySpent;
    }

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;


    }
}
