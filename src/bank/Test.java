package bank;

import com.sun.javaws.exceptions.ErrorCodeResponseException;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import static bank.ResourcesDirectories.*;

public class Test {

    public static void main(String[] args) {
        //Throvable
        //testFileUtils();

        try {
            //checked exception

            throw new Exception("Test exception!");
        }
    }

    private static void testFileUtils() {

        final String USER_DIR = System.getProperty("user.dir");

        System.out.println ("User directory:" + USER_DIR);

        Path fullFilePath = getLocalPath("employees.csv");



        System.out.println(fullFilePath);
    }
}
