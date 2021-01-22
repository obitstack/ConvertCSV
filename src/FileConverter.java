import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileConverter {

    private String fileName;  
    Scanner scanner; 
    BufferedWriter writer;

    FileConverter(String inputPath,String fileName, String outputPath){
        scanner = null;
        writer = null;
        alterFile(inputPath, fileName, outputPath);

    }

    FileConverter(String[] inputPath,String[] fileName, String outputPath){
        // alter-merge constructor
        scanner = null;
        writer = null;
        alterFile(inputPath, fileName, outputPath);

    }

    private void alterFile(String inputPath, String fileName, String outputPath){
        try {
            scanner = new Scanner(new BufferedReader(new FileReader("src/input/"+fileName)));
            scanner.useDelimiter(",");

            String words = "";
            writer = new BufferedWriter(new FileWriter("src/output/"+"out_"+fileName));

            while(scanner.hasNextLine()){
                String word = scanner.next();
                words += word+";";
               
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

    private void alterFile(String[] inputPath, String[] fileName, String outputPath){

        // alter+merge
        try {
            scanner = new Scanner(new BufferedReader(new FileReader("src/input/"+fileName)));
            scanner.useDelimiter(",");

            String words = "";
            writer = new BufferedWriter(new FileWriter("src/output/"+"out_"+fileName));

            while(scanner.hasNextLine()){
                String word = scanner.next();
                words += word+";";
               
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
