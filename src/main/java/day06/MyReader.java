package day06;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MyReader {
    public static void main(String[] args) throws IOException {
        
        FileInputStream fis = new FileInputStream(args[0]);
        // Insert Cipher to decrypt
        // CipherInputStream cis = new CipherInputStream(fos);
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);

        int lines = ois.readInt();
        System.out.printf("There are %d lines in the file\n", lines);

        for (int i = 0; i < lines; i++) {
            String line = ois.readUTF();
            System.out.printf("%d: %s", i, line);
        }
        fis.close();
    }
}
