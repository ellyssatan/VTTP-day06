package day06;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class MyWriter {
    public static void main(String[] args) throws IOException {
        
        FileOutputStream fos = new FileOutputStream(args[0]);
        // Insert Cipher to encrypt
        // CipherOutputStream cis = new CipherOutputStream(fos);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream oos = new ObjectOutputStream(bos);

        //Number of lines
        oos.writeInt(2);
        oos.writeUTF("She sells seashells by the sea shore");
        oos.writeUTF("Bee poo");
        
        oos.flush();
        oos.close();
        
    }
}
