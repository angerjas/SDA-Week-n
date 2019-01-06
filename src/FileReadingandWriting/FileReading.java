package FileReadingandWriting;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class FileReading {

    public static void main(String[] args) {

        FileReading fileReading = new FileReading();
        String filePath = "/Users/erich/Desktop/untitled/FirstFile.txt";
        System.out.println("Buffer file reading");
        fileReading.readFileWithBuffer(filePath);
        System.out.println("Scanner file reading");
        fileReading.readFileWithScanner(filePath);


    }

    public void readFileWithBuffer(String filePath) {

        try {

            File file = new File(filePath);

            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = bufferedReader.readLine();

            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void readFileWithScanner(String filePath) {
        try {
            File file = new File(filePath);

            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
