package Day08;

/*
 * Day 08 to #100 Days of code:
 *
 * Today we saw about relationships between classes
 * */

import java.lang.reflect.Field;

public class TestContact {
    public static void main(String[] args) {

        Telephone telephone = new Telephone("Cell Phone","19","99999-9999");
        Address address = new Address("avenue of happiness","1988","after the red house","188885412","New York","EUA");
        Contact contact = new Contact("Alfred",address,telephone);
        System.out.println(contact.getNome());

//        if (contact.getAddress()!= null){
//            System.out.println(contact.getAddress().getStreet());
//            System.out.println(contact.getAddress().getNumber());
//            System.out.println(contact.getAddress().getComplement());
//            System.out.println(contact.getAddress().getPostalCode());
//            System.out.println(contact.getAddress().getCity());
//            System.out.println(contact.getAddress().getCountry());
//        }

        // Another way to write the address code:
        if (contact.getAddress()!= null){ // if contact address is not null.
            for (Field field : Address.class.getDeclaredFields()){ // get all attributes(fields) of the address class.
                field.setAccessible(true); // allows access to private fields
                try{
                    Object value = field.get(address); // get the object values in the address field
                    System.out.println(value); // display value from to console
                }catch (IllegalAccessException e){
                    e.printStackTrace(); // error if unable to access
                }
            }
        }

        /*
        * 🛑 When not to use reflection?

            When you can directly access attributes with getters.

            When performance is critical (reflection is slower).

            When the code needs to be simple to understand (reflection can be confusing).
        *
        * */

        if (contact.getTelephone()!= null){
            System.out.println(contact.getTelephone().getType());
            System.out.println(contact.getTelephone().getDdd() + contact.getTelephone().getNumber());
        }
    }
}
