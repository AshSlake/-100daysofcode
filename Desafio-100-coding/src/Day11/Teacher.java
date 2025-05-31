package Day11;

public class Teacher extends Person {

    private String departament;
    private String courseName;
    private double wage;

    public Teacher() {
        super();
    }

    public Teacher(String name, int age, String gender, String email, String phone, String address, String departament, String courseName, double wage) {
        super(name, age, gender, email, phone, address);
        this.departament = departament;
        this.courseName = courseName;
        this.wage = wage;
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

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public String getAddressTag(){
        return String.format("the teacher´s address is: %s",super.getAddress());
    }
}
