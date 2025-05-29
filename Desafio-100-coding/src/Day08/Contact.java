package Day08;

public class Contact {
        private String nome;
        private Address address;
        private Telephone telephone;

    public Contact(String nome, Address address, Telephone telephone) {
        this.nome = nome;
        this.address = address;
        this.telephone = telephone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Telephone getTelephone() {
        return telephone;
    }

    public void setTelephone(Telephone telephone) {
        this.telephone = telephone;
    }
}
