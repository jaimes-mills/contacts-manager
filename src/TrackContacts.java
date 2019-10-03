import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TrackContacts {

//display file contacts in a list of strings and formats
    public static List<String> getContacts() {
        Path p = Paths.get("src", "contacts.txt");
        List<String> contacts = new ArrayList<>();
        try {
            contacts = Files.readAllLines(p);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.printf("------------------------------------\n");
            System.out.printf("%-20s | %-10s|\n" ,"Name", "Phone number");
        System.out.printf("------------------------------------\n");
        String[] userContact;
        for (String name : contacts){
            userContact = name.split(" ");
            System.out.printf("%-20s | %12s|\n",userContact[0], userContact[1]);
        }
        System.out.printf("------------------------------------\n");
        return contacts;
    }
//allows user to add a contact
    public static void addContact(String newContact) {

        List<String> contact = new ArrayList<>();
        contact.add(newContact);
        try {
            Files.write(
                    Paths.get("src", "contacts.txt"),
                    Arrays.asList(newContact), // list with one item
                    StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
//searches for a contact

    public static void searchContacts(String userSearch) {
        List<String> contacts;
        try {
            contacts = Files.readAllLines(Paths.get("src", "contacts.txt"));
            for (String name : contacts) {
                if (name.toLowerCase().contains(userSearch.toLowerCase())) {
                    System.out.println("Contact:\n" + name);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("This contact does not exist");
        }
    }

    public static void deleteContact(String userDelete) {
        List<String> contacts;
        try {//import contacts list from original list string
            contacts = Files.readAllLines(Paths.get("src", "contacts.txt"));
            //create new empty list string
            List<String> newList = new ArrayList<>();
            for (String name : contacts) {//loop through original display for userDelete
                userDelete = userDelete.toLowerCase();
                if (name.toLowerCase().contains(userDelete)) {
                    continue;// skips over userDelete
                }
                newList.add(name); //adds remaining names to new ArrayList
            }
            for (String name : newList) {
                System.out.println(name);
            }
            Files.write(Paths.get("src", "contacts.txt"), newList); //overwrites old array list with new list
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}