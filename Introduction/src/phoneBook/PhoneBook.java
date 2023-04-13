package phoneBook;

import introduction.Tools;
import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBook {
    ArrayList<Contact> contacts = new ArrayList();
    Scanner cmd = new Scanner(System.in);

    public PhoneBook() {}
    
    public void addContact() {
        Tools tools = new Tools();
        boolean correctData = false;
        String firstName;
        String lastName;
        String phoneNumber;
        
        do {
            System.out.println("Please enter the first name");
            firstName = cmd.nextLine();
            
            System.out.println("Please enter the last name");
            lastName = cmd.nextLine();
            
            System.out.println("Please enter the phone number");
            phoneNumber = cmd.nextLine();
            
            Contact newContact = new Contact(firstName, lastName, phoneNumber);
            
            // If the contact does not exits, the phone number has the correct structure and the contacts is not full
            if(!isThereAContact(newContact) && tools.isAPhoneNumber(phoneNumber) && !bookFull()) {
                contacts.add(newContact);
                
                System.out.println("Contact added successfully.");
                
                correctData = true;
            } else {
                newContact = null;
                
                correctData = false;
            }
        } while(!correctData);
    }
    
    public boolean isThereAContact(Contact contact) {
        return contacts.contains(contact);
    }
    
    public void listContacts() {
        String finalText = "";
        
        for(int i = 0; i < contacts.size(); i++) {
            finalText += "First name: " + contacts.get(i).getFirstName() + "\nLast name: " + contacts.get(i).getLastName() + "\nPhone number: " + contacts.get(i).getPhoneNumber() + "\n\n";
        }
        
        System.out.println(finalText);
    }
    
    public void searchContact(String firstName, String lastName) {
        for(int i = 0; i < contacts.size(); i++) {
            if(contacts.get(i).getFirstName().equalsIgnoreCase(firstName) && contacts.get(i).getLastName().equalsIgnoreCase(lastName)) {
                System.out.println("Phone number: " + contacts.get(i).getPhoneNumber());
            }
        }
    }
    
    public void removeContact(Contact contact) {
        /*
        for(int i = 0; i < contacts.size(); i++) {
            if(contacts.get(i).getPhoneNumber().equals(phoneNumber)) {
                contacts.remove(i);
                
                System.out.println("First name: " + contacts.get(i).getFirstName() + "\nLast name: " + contacts.get(i).getLastName() + "\nPhone number: " + contacts.get(i).getPhoneNumber() + " has beend removed successfully.\n\n");
                
                break;
            }
        } */
        
        if(contacts.remove(contact)) {
            System.out.println("Contact removed successfully.");
        } else {
            System.out.println("Not posible to remove contact due existence.");
        }
        
        
    }
    
    public boolean bookFull() {
        return contacts.size() == 10;
    }
    
    public int capacity() {
        return 10 - contacts.size();
    }
}
