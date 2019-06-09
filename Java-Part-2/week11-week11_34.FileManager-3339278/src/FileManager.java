
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManager {

    public List<String> read(String file) throws FileNotFoundException {
        File filu = new File(file);
        List<String> rivit = new ArrayList<String>();
        
        Scanner reader = new Scanner(filu);
        
        while(reader.hasNextLine()){
            String line = reader.nextLine();
            rivit.add(line);
        }
        return rivit;
    }

    public void save(String file, String text) throws IOException {
        FileWriter writer = new FileWriter(file);
        
        writer.write(text);
        writer.close();
    }

    public void save(String file, List<String> texts) throws IOException {
        FileWriter writer = new FileWriter(file);
        for(String s:texts) {
            writer.write(s + "\n");
        }
        writer.close();
    }
}
