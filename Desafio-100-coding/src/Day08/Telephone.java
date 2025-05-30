package Day08;

public class Telephone {

    private String type;
    private String ddd;
    private String number;

    public Telephone() {}

    public Telephone(String type, String ddd, String number) {
        this.type = type;
        this.ddd = ddd;
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public String getDdd() {
        return ddd;
    }

    public String getNumber() {
        return number;
    }
}
