package Day08;

public class Telephone {

    private String type;
    private String ddd;
    private String number;

    public Telephone(String type, String ddd, String number) {
        this.type = type;
        this.ddd = ddd;
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
