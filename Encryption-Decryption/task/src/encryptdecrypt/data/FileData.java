package encryptdecrypt.data;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileData {

    public static String readFileAsString(String path) throws IOException {
        return new String(Files.readAllBytes(Paths.get(path)));
    }

    public static void writeStringToFile(String path, String data) {
        File file = new File(path);
        try (PrintWriter printWriter = new PrintWriter(file)) {
            printWriter.print(data);
        } catch (IOException e) {
            System.out.printf("An exception occurs %s", e.getMessage());
        }
    }




}
