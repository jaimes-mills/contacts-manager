import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TrackContacts {
//    public TrackContacts() {
//      List contacts = getFiles("contacts.txt");
//
//    }
//display file contacts in a list of strings


    public static List<String> getFiles() {
        Path p = Paths.get("src", "contacts.txt");
        List<String> contacts = new ArrayList<>();


        try {
            contacts = Files.readAllLines(p);
        } catch (IOException e) {
            e.printStackTrace();
        }

//        for (int i = 0; i < contacts.size(); i += 1) {
//            System.out.println(contacts.get(i));
//
//        }
            System.out.printf("%-20s | %s\n" ,"Name", "Phone number");
        System.out.printf("--------------------------------------\n");
        String[] userContact;
        for (String name : contacts){
            userContact = name.split(" ");
            System.out.printf("%-20s | %s\n",userContact[0], userContact[1]);
//            System.out.println(userContact[0]);
//            System.out.println(userContact[1]);

        }

//        String yourInteger = "123450";
//        System.out.printf("%10s%n", "Name|Num");
//        String s = String.format("%10s%n", (yourInteger.substring(0,3)) + " | "+ (yourInteger.substring(3)));
//        System.out.println(s);
        return contacts;


    }

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

    public static void searchContacts(String userSearch) {
        List<String> contacts;
        try {
            contacts = Files.readAllLines(Paths.get("src", "contacts.txt"));
            for (String name : contacts) {
                if (name.contains(userSearch)) {
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