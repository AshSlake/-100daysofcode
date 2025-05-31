package Day11;

public class Worker extends Person{

    private String function;
    private String wage;
    private boolean missingLastMonth;

    public Worker(){
        super();
    }

    public Worker(String name, int age, String gender, String address, String email, String phone, String function, String wage, boolean missingLastMonth) {
        super(name, age, address,gender, email, phone);
        this.function = function;
        this.wage = wage;
        this.missingLastMonth = missingLastMonth;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public String getWage() {
        return wage;
    }

    public void setWage(String wage) {
        this.wage = wage;
    }

    public boolean isMissingLastMonth() {
        return missingLastMonth;
    }

    public void setMissingLastMonth(boolean missingLastMonth) {
        this.missingLastMonth = missingLastMonth;
    }

    public String getAddressTag(){
        return String.format("the worker´s address is: %s",super.getAddress());
    }
}
