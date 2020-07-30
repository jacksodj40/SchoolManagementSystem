import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Teacher lizzy = new Teacher (1,"Lizzy", 500);
        Teacher melissa = new Teacher (2,"Melissa", 700);
        Teacher robert = new Teacher (3,"Robert", 600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(melissa);
        teacherList.add(robert);

        Student tamara = new Student(1,"Tamara",4);
        Student derek = new Student(2,"Derek",12);
        Student ravi = new Student(3, "Ravi",5);

        List<Student> studentList = new ArrayList<>();
        studentList.add(tamara);
        studentList.add(derek);
        studentList.add(ravi);

        School deeprun = new School(teacherList,studentList);


        tamara.payFees(5000);
        System.out.println("GHS has earned " + deeprun.getTotalMoneyEarned());
        ravi.payFees(6000);
        System.out.println("GHS has earned " + deeprun.getTotalMoneyEarned());

        System.out.println("------Making GHS PAY SALARY------");
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("GHS has spent for salary to " + lizzy.getName() + " and now has $"
        + deeprun.getTotalMoneyEarned());



    }
}
