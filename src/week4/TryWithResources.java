package week4;

import java.awt.geom.IllegalPathStateException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources{

    //Try with resources not fund exception
    public static void readFile(String fileName) {

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName)))
        {

//            reader = new BufferedReader(new FileReader(fileName));
            String line = reader.readLine();

            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (IOException fileNotFoundException) {
            System.out.printf("The file %s could not be found %s", fileName, fileNotFoundException.getMessage());
//            throw new FileNotFoundException("File not found");
//        } finally {
//
//            try {
//                if (reader != null) {
//                    reader.close();
//                }
//            } catch (IOException e) {
//                System.out.println(e.getMessage());
//            }

        }
    }

    public static void main(String[] args) throws FileNotFoundException{
        readFile("/Users/decagon/Desktop/INGRID/project1/lecture/src/week4/text.txt");
    }
}
