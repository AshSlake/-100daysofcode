package Day10;

public class Teacher extends Person {

    private String departament;
    private String courseName;
    private double salary;

    public Teacher() {}

    public Teacher(String departament, String courseName, double salary) {
        this.departament = departament;
        this.courseName = courseName;
        this.salary = salary;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
