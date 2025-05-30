package Day09;

import Day08.Telephone;

import java.util.Scanner;

public class TestContact {
    public static void main(String[] args) {

          Scanner scanner = new Scanner(System.in);

//        Telephone telephone = new Telephone("cell phone","19","88888-8888");
//        Email email = new Email("Voldemort@gmail.com");
//        Contact contact = new Contact("Voldemort",telephone,email);
//
//        Telephone telephone1 = new Telephone("cell phone","19","77777-7777");
//        Email email1 = new Email("harry@gmail.com");
//        Contact contact1 = new Contact("Harry",telephone1,email1);
//
//        Telephone telephone2 = new Telephone("cell phone","19","66666-6666");
//        Email email2 = new Email("Hermione@gmail.com");
//        Contact contact2 = new Contact("Hermione Granger",telephone2,email2);
//
//        Contact[] contactsList = {contact,contact1,contact2};
//
//        Agenda myAgenda = new Agenda("My Agenda",contactsList);

          System.out.println("enter the name of the calendar");
          String nameAgenda = scanner.nextLine();

          System.out.println("now enter your contacts");

          // First Contact
          System.out.println("Enter the name of the first contact:");
          String nameFirstContact = scanner.nextLine();
          System.out.println("Enter the DDD of the first contact:");
          String dddFirst = scanner.nextLine();
          System.out.println("Enter the phone number of the first contact:");
          String numberFirst = scanner.nextLine();
          System.out.println("Enter the email of the first contact:");
          String emailFirstContact = scanner.nextLine();

          // Second Contact
          System.out.println("Enter the name of the second contact:");
          String nameSecondContact = scanner.nextLine();
          System.out.println("Enter the DDD of the second contact:");
          String dddSecond = scanner.nextLine();
          System.out.println("Enter the phone number of the second contact:");
          String numberSecond = scanner.nextLine();
          System.out.println("Enter the email of the second contact:");
          String emailSecondContact = scanner.nextLine();

          Telephone[] telephones = new Telephone[2];
          telephones[0] = new Telephone( "cell phone",dddFirst, numberFirst);
          telephones[1] = new Telephone( "cell phone",dddSecond, numberFirst);

          Email[] email = new Email[2];
          email[0] = new Email(emailFirstContact);
          email[1] = new Email(emailSecondContact);

          Contact[] contacts = new Contact[2];
          contacts[0] = new Contact(nameFirstContact,telephones[0],email[0]);
          contacts[1] = new Contact(nameSecondContact,telephones[1],email[1]);

          Agenda agenda = new Agenda(nameAgenda, contacts);

          System.out.println("\n" + agenda.getContact(0).getName());
          String[] infoContacts = agenda.printInformationAllCalendarContacts();
          for (String infoContact : infoContacts) {
              System.out.println(infoContact);
          }







    }

}
