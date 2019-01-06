package FileReadingandWriting;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class FileWriting {

    public void writeFile(String filePath) {

        try {
            File file = new File(filePath);

            FileWriter fileWriter = new FileWriter(file, true);

            PrintWriter printWriter = new PrintWriter(fileWriter);

            printWriter.println("Today is a good day. Some other shit i am writing");

            printWriter.close();
        } catch (Exception e) {
            System.out.println("File path does not exist. Exception is " + e);
        }

    }

    public static void main(String[] args) {

        FileWriting fileWriting = new FileWriting();

        String filePath = "/Users/erich/Desktop/untitled/FirstFile.txt";
        fileWriting.writeFile(filePath);

        String filePath2 = "/Users/erich/Desktop/untitled/SecondFile.txt";
        fileWriting.writeFile(filePath2);

    }

}
