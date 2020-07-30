//Responsible for keeping the track of students ID Name Grade & Fees Paid

public class Student {
    private int id;
    private String name;
    private int grade;
    private double feesPaid;
    private double feesTotal;

    /**
     *
     * @param id - unique for student
     * @param name - name of student
     * @param grade - grade of student
     * feesPaid - initially is 0
     * feesTotal $30,000 per year
     */

    public Student(int id, String name, int grade) {

        this.feesPaid = 0;
        this.feesTotal = 30000;

        this.id = id;
        this.name = name;
        this.grade = grade;

    }

    public int getId() {
        return id;
    }
    //Due to not altering name we don't need setters
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    //Due to not altering name we don't need setters
    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public double getFeesPaid() {
        return feesPaid;
    }

    /**
     * Add the fees to the fees paid
     * The shool is going to receive the funds
     * @param fees fee student pays
     */
    public void payFees(double fees) {
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    public double getRemainingFees(){
        return feesTotal-feesPaid;
    }

    public double getFeesTotal() {
        return feesTotal;
    }



}
