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

    public static  List<String> getFiles(String x) {
        Path p = Paths.get("src", x);
        List<String> lines = new ArrayList<>();

        try {
            lines = Files.readAllLines(p);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < lines.size(); i += 1) {
           System.out.println( "| " + lines.get(i));

        }
        return lines;


    }

    public static void addContact(String newContact) {

        List<String> contact = new ArrayList<>();
            contact.add(newContact);
        try {
        Files.write(
                Paths.get("src", "contacts.txt"),
                Arrays.asList(newContact), // list with one item
                StandardOpenOption.APPEND );
        }catch (IOException e) {
            e.printStackTrace();
        }

    }
}
