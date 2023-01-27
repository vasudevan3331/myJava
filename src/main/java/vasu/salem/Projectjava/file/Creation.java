package vasu.salem.Projectjava.file;

import java.io.File;
import java.io.IOException;

public class Creation {
    public static void main(String[] args) throws IOException {
        File obj=new File("D:\\Course backups\\Java\\Vasudevan\\mybasic.xls");
        obj.createNewFile();
        System.out.println(obj.getAbsoluteFile()+" has created");
    }
}
