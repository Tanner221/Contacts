import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
	    displayInstructions();
        ArrayList<contact> contacts = new ArrayList<contact>();
        Scanner userInput = new Scanner(System.in);
        char input = ' ';
        do {
            System.out.print("> ");
            input = userInput.next().charAt(0);
            option(input, contacts);
        }
        while(input != 'q');
    }
    public static void displayInstructions(){
        System.out.println("Instructions:");
        System.out.println("a. Add new Contact");
        System.out.println("b. Display Contacts");
        System.out.println("c. Search Contact by Name");
        System.out.println("d. Display Instructions");
        System.out.println("q. Quit");
    }
    public static void option(char input, ArrayList contacts) {
        if(input == 'a')
            addContact(contacts);
        else if(input == 'b')
            displayContacts(contacts);
        else if(input == 'c')
            searchContact(contacts);
        else if(input == 'd')
            displayInstructions();
        else if (input == 'q')
            System.out.println("Thank you for using this program");
        else{
            System.out.println("Not a valid command, try again");
        }
    }
    public static void searchContact(ArrayList contArray){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the first name of the contact you'd like to display");
        String input = userInput.next();
        for(int i = 0; i < contArray.size(); i++)
        {
            contact current = new contact();
            current = (contact) contArray.get(i);
            if(current.getFirstName().equals(input))
            {
                current.display();
                return;
            }
            else if(contArray.size() - 1 == i)
                System.out.println("Contact not found");
        }
    }
    public static void addContact(ArrayList contacts){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please Enter the contact's Info: ");
        System.out.print("First Name: ");
        String first = userInput.next();
        System.out.print("Last Name: ");
        String last = userInput.next();
        System.out.print("Phone Number: ");
        double phone = userInput.nextDouble();
        contact NewContact = new contact(first, last, phone);
        contacts.add(NewContact);
    }
    public static void displayContacts( ArrayList array){
        for(int i = 0; i < array.size(); i++)
        {
            contact current = new contact();
            current = (contact) array.get(i);
            current.display();
        }
    }
}
