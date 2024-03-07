package week4;

import java.awt.geom.IllegalPathStateException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileException2 {
    public static void readFile(String fileName) throws FileNotFoundException{

        FileReader reader = null;
        try {

            reader = new FileReader(fileName);
            char line = (char) reader.read();

            while (line != -1) {
                System.out.println(line);
                line = (char)reader.read();
            }
        } catch (IOException fileNotFoundException) {
            System.out.printf("The file %s could not be found %s", fileName, fileNotFoundException.getMessage());
//            throw new FileNotFoundException("File not found");
        } finally {

            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

        }
    }

    public static void main(String[] args) throws FileNotFoundException{
        readFile("/Users/decagon/Desktop/INGRID/project1/lecture/src/week4/text.txt");
    }
}
