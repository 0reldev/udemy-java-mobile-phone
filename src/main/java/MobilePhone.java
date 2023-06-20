import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact newContact) {
        return (findContact(newContact) == -1) ? true : false;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        if (myContacts.contains(oldContact)) {
            myContacts.add(myContacts.indexOf(oldContact), newContact);
            return true;
        } else {
            return false;
        }
    }

    public boolean removeContact(Contact contact) {
        if (myContacts.contains(contact)) {
            myContacts.remove(contact);
            return true;
        } else {
            return false;
        }
    }

    public int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    public int findContact(String nameOrNumber) {
        for (Contact contact : myContacts) {
            if (contact.getName().equals(nameOrNumber) || contact.getPhoneNumber().equals(nameOrNumber)) {
                return myContacts.indexOf(contact);
            }
        }
        return -1;
    }

    public void printContact() {
        System.out.println("Contact List:");
        int contactNumber = 1;
        for (Contact contact : myContacts) {
            System.out.println(contactNumber + ". " + contact.getName() + " -> " + contact.getPhoneNumber());
        }
    }
}
