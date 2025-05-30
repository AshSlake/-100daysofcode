package Day09;

import Day08.Telephone;

public class Contact {

    private String name;
    private Telephone telephone;
    private Email email;

    public Contact() {}

    public Contact(String name, Telephone telephone, Email email) {
        this.name = name;
        this.telephone = telephone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public Telephone getTelephone() {
        return telephone;
    }

    public Email getEmail() {
        return email;
    }



}
