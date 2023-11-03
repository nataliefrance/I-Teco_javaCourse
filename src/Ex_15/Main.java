package Ex_15;

import javax.print.DocFlavor;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        File inputFile = createFile("Input");
        File outputFile = createFile("Output");

        MyClass myClass = new MyClass();

        try (FileReader reader = new FileReader(inputFile);
             FileWriter writer = new FileWriter(outputFile)) {

            StringBuilder text = new StringBuilder();
            StringBuilder word = new StringBuilder();

            int i;
            while ((i = reader.read()) != -1) {
                if (Character.isAlphabetic(i)) {
                    word.append((char) Character.toLowerCase(i));
                } else {
                    text.append(word);
                    if (word.length() >= 6) {
                        myClass.getBigWords().add(word.toString());
                    }
                    word.setLength(0);
                }
            }

            myClass.setText(text.toString());
            writer.write(text + "\n");

            for (String bigWord : myClass.getBigWords()) {
                writer.write(bigWord + " ");
            }
        }
    }

    private static File createFile(String name) throws IOException {
        File file = new File("C:\\Users\\Shipo\\IdeaProjects\\I-Teco\\src\\Ex_15", name + ".txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        return file;
    }
}
