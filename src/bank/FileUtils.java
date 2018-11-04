package bank;

import java.nio.file.Path;
import java.nio.file.Paths;

public interface FileUtils {

    public static Path getLocalPath(String filename) {

        return Paths.get(System.getProperty("user.dir"), "employees.csv");
    }
}
