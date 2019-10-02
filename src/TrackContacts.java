import java.io.IOException;
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


    public static List<String> getFiles(String file) {
        Path p = Paths.get("src", file);
        List<String> contacts = new ArrayList<>();

        try {
            contacts = Files.readAllLines(p);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < contacts.size(); i += 1) {
            System.out.println("| " + contacts.get(i));

        }
        return contacts;


    }

    public static void addContact(String newContact) {

        List<String> contact = new ArrayList<>();
        contact.add(newContact);
        try {
            if (contact.contains(newContact)) {
                System.out.println(newContact + "Already Exists.");
            } else {
                Files.write(
                        Paths.get("src", "contacts.txt"),
                        Arrays.asList(newContact), // list with one item
                        StandardOpenOption.APPEND);
            }
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
        ArrayList<String> contact;
        try {
            contact = new ArrayList<>(Files.readAllLines(Paths.get("src", "contacts.txt")));

                 if(contact.contains(userDelete)){
                     contact.remove(userDelete);
                 }


            System.out.println(contact);

        } catch (IOException e) {
            e.getMessage();
        }
    }
}


//        try {
//            List<String> groceryList = Files.readAllLines(groceriesPath);
//        for (int i = 0; i < groceryList.size(); i += 1) {
//            System.out.println((i + 1) + ": " + groceryList.get(i));
//        }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }