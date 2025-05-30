package Day09;

public class Agenda {

    private String name;
    private Contact[] contacts;

    public Agenda(String name, Contact[] contacts) {
        this.name = name;
        this.contacts = contacts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Contact getContact(int index) {
        return contacts[index];
    }

    public void setContacts(Contact[] contacts) {
        this.contacts = contacts;
    }

    public String[] printInformationAllCalendarContacts() {
        String[] information = new String[contacts.length];
        Contact[] c = this.contacts;
        for (int i = 0; i < contacts.length; i++) {
            // is used to create the formatted string with the correct values
            String contact = String.format("%nName Contact: %s%nPhone Contact: %s%nEmail Address: %s%n",
                    c[i].getName(),
                    c[i].getTelephone().getNumber(),
                    c[i].getEmail().getEmail());
            information[i] = contact;
        }
        // returns string formatted with correct values.
        return information;
    }
}
