import util.Input;

import java.util.Scanner;

public class Welcome extends TrackContacts {


public void welcomeDisplay(){
    System.out.println("1. View contacts.\n" +
            "2. Add a new contact.\n" +
            "3. Search a contact by name.\n" +
            "4. Delete an existing contact.\n" +
            "5. Exit.\n" +
            "Enter an option (1, 2, 3, 4 or 5):");
}

public void userOptions(int userSelect){
    Input userInput = new Input();
    switch(userSelect){
        case 1: getFiles();
                break;

        case 2: System.out.println("Enter a name and number to add to contact list:");
                addContact(userInput.getString());
                break;
        case 3: System.out.println("Enter a name to search");
                searchContacts(userInput.getString());
                break;
        case 4: System.out.println("Enter a name to delete:");
                deleteContact(userInput.getString());
                break;
        case 5:
    }
}




}