package Day10;

public class Student extends Person{

    private String[] courses;
    private String[][] notes;

    public Student() {}

    public Student(String[] courses, String[][] notes) {
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
}
