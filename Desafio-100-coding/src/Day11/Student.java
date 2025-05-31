package Day11;

public class Student extends Person {

    private String[] courses;
    private String[][] notes;

    public Student() {
        super();
    }

    public Student(String name, int age, String gender, String email, String phone, String address, String[] courses, String[][] notes) {
        super(name, age, gender, email, phone, address);
        this.courses = courses;
        this.notes = notes;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public String[][] getNotes() {
        return notes;
    }

    public void setNotes(String[][] notes) {
        this.notes = notes;
    }

    public double calculateAverage(double[][] notes) {
        return 0;
    }

    public double checkApproved(double[][] notes) {
        return 0;
    }

    public String getAddressTag(){
        return String.format("the student´s address is: %s",super.getAddress());
    }
}
