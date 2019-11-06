package kata4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MailListReader {

    public static List<Mail> read(String fileName) {
        List<Mail> list = new ArrayList();
        
        try {
            BufferedReader reader = new BufferedReader((new FileReader(new File(fileName))));
            IteratorReader iterator = new IteratorReader(reader);
            for (String line : iterator) {
                if(Mail.isMail(line)) {
                    list.add(new Mail(line));
                }
            }
        }
        catch(FileNotFoundException e) {
            System.out.println("Error");
        }
        catch(IOException e) {
            System.out.println("Error");
        }
        return list;
    }

    
}
