import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileConverter {

    private String fileName = "n26-csv-transactions.csv";  
    Scanner scanner; 
    BufferedWriter writer;

    FileConverter(){
        scanner = null;
        writer = null;
        alterFile();

    }

    
    public void alterFile(){
        try {
            scanner = new Scanner(new BufferedReader(new FileReader("src/input/"+fileName)));
            scanner.useDelimiter(",");

            String words = "";
            writer = new BufferedWriter(new FileWriter("src/output/"+"out_"+fileName));

            while(scanner.hasNextLine()){
                String word = scanner.next();
                words += word+";";
                // scanner.skip(",");
               
            }
            System.out.println(words);
            writer.write(words);
            scanner.close();
            writer.close();
            
        } catch (IOException e) {
            try {
                scanner.close();
                writer.close();
  
            } catch (IOException ee) {
                System.out.println(ee);
            }
            System.out.println(e);
        }
        
    }
    
}
