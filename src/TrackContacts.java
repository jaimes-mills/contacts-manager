import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TrackContacts {
//    public TrackContacts() {
//
//    }

    public  List<String> getFiles(String x) {
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
}
