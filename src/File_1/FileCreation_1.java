package File_1;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FileCreation_1 {
    public static void main(String[] args) throws Exception {
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8), true);
        File f = new File("C:\\Users\\bavad\\IdeaProjects\\HomeWork_20\\src\\File_1\\text.txt");
        if (f.createNewFile()) {
            System.out.println("File created");
        }
        else {
            System.out.println("File already exist");
        }
        String text = "Hello world! \nHello JAVA!";
        FileWriter fw = new FileWriter(f);
        fw.write(text);
        fw.close();

        Scanner sc = new Scanner(f);
        while (sc.hasNextLine()) {
            pw.println(sc.nextLine());
        }
    }
}
