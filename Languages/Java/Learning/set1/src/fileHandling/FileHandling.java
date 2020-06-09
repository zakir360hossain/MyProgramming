package fileHandling;

import java.io.*;
import java.util.Properties;

public class FileHandling {
    public static void main(String[] args) throws Exception {

        File f = new File("set1/src/fileHandling/content.txt");

        FileOutputStream fos = new FileOutputStream(f);
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeUTF("There is a pandemic in the world!");

        FileInputStream fis = new FileInputStream(f);
        DataInputStream dis = new DataInputStream(fis);
        System.out.println(dis.readUTF());

    }
}
