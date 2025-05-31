package Day10;

public class TestHeritage {

    public static void main(String[] args) {

        // Defining attributes inherited from the Person superclass.
        Student student = new Student();
        student.setName("Pedro");
        student.setAddress("street of the south");
        student.setPhone("(19) 88888-8888");
        student.setCpf("777.777.777-88");

        // Doing interpolation using String.Format to print student fields inherited from the Person class.
        System.out.printf(String.format("student name: %s%n student address: %s%n student phone %s%n student cpf: %s",
                student.getName(), student.getAddress(), student.getPhone(), student.getCpf()));
    }
}
