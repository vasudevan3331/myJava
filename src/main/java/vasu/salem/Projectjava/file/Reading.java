package vasu.salem.Projectjava.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Reading {
    public static void main(String[] args) throws IOException, IOException {
        //File obj=new File("D:\\Course backups\\Java\\Vasudevan\\myobj.txt");
        File obj=new File("D:\\Course backups\\Python\\Bhuvana\\ConsoleApp\\Controller.py");

        FileInputStream fis=new FileInputStream(obj);

        byte[] arr=new byte[fis.available()];
        fis.read(arr);
        fis.close();

        String tmp=new String(arr);
        System.out.println(obj.getAbsoluteFile()+" contains following content \n"+tmp);
    }
}
