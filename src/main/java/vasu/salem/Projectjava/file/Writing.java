package vasu.salem.Projectjava.file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Writing {
    public static void main(String[] args) throws IOException, IOException {
        //File obj=new File("D:\\Course backups\\Java\\Vasudevan\\mybasic.xls");
        File obj=new File("D:\\Course backups\\Java\\Vasudevan\\myobj.txt");
        FileOutputStream fos=new FileOutputStream(obj);

//        Integer hai=90;Double maxi=89.4;
//        String h=hai+" "+maxi;
//        fos.write(h.getBytes());

        String hey="";
        Scanner scanner=new Scanner(System.in);
        hey=scanner.nextLine();
        fos.write(hey.getBytes());

        fos.close();

        System.out.println(obj.getAbsoluteFile()+" got the content");
    }
}
