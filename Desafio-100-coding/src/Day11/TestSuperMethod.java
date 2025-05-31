package Day11;

public class TestSuperMethod {

    public static void main(String[] args) {

//        Worker worker = new Worker("João",45,"masculine","joao@gmail.com","street of the south","(19) 88888-8888","Manager","2500",false);

//        System.out.printf(String.format("name: %s%n age: %s%n wage: %s%n is missing last Month? : %s",
//                worker.getName(),
//                worker.getAge(),
//                worker.getWage(),
//                worker.isMissingLastMonth()));

        Person person = new Person();
        person.setAddress("street of the south, number 1");
        Person student = new Student();
        student.setAddress("street of the south, number 2");
        Person teacher = new Teacher();
        teacher.setAddress("street of the south, number 3");
        Person worker2 = new Worker();
        worker2.setAddress("street of the south, number 4");

        System.out.println(person.getAddressTag());
        System.out.println(student.getAddressTag());
        System.out.println(teacher.getAddressTag());
        System.out.println(worker2.getAddressTag());

    }
}
