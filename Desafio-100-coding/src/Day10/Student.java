package Day10;

public class Student extends Person{

    private String[] cursos;
    private String[][] notes;

    public Student() {}

    public Student(String[] cursos, String[][] notes) {
        this.cursos = cursos;
        this.notes = notes;
    }

    public String[] getCursos() {
        return cursos;
    }

    public void setCursos(String[] cursos) {
        this.cursos = cursos;
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
