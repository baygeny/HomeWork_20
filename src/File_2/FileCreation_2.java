package File_2;

import java.io.File;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FileCreation_2 {
    public static void main(String[] args) throws Exception{
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8), true);
        File f = new File("C:\\Users\\bavad\\IdeaProjects\\HomeWork_20\\src\\File_2\\test");
        Scanner sc = new Scanner(f);
        while (sc.hasNextLine()) {
            pw.println(sc.nextLine());
        }

    }
}
