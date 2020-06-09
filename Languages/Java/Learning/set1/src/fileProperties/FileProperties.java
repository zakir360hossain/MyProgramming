package fileProperties;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Properties;

public class FileProperties {
    public static void main(String[] args) throws Exception {
        //        Properties in file
        Properties p = new Properties();
        //Extension could have txt, etc.
        OutputStream os = new FileOutputStream("set1/src/fileProperties/content.properties");
        p.setProperty("url", "localhost:3306/myDb");
        p.setProperty("username", "zakir");
        p.setProperty("password", "1234");
        p.store(os, null);
    }
}


