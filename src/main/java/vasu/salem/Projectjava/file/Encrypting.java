package vasu.salem.Projectjava.file;

import java.awt.print.Paper;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.DeflaterOutputStream;

public class Encrypting {
    public static void main(String[] args) throws IOException {
        File file=new File("D:\\Course backups\\Java\\Vasudevan\\queen.doc");

        FileOutputStream fos=new FileOutputStream(file);
        DeflaterOutputStream dos=new DeflaterOutputStream(fos);

//        String hey="";
//        Scanner scanner=new Scanner(System.in);
//        hey=scanner.nextLine();
//        dos.write(hey.getBytes());

//        Paper p1=new Paper();p1.name="DSA";p1.code=9123;p1.internals=50;p1.grade='B';
//        Paper p2=new Paper();p2.name="DBMS";p2.code=8420;p2.internals=35;p2.grade='D';
//        Paper p3=new Paper();p3.name="OOPS";p3.code=2230;p3.internals=30;p3.grade='A';
//        Paper p4=new Paper();p4.name="COA";p4.code=8531;p4.internals=30;p4.grade='S';

//        dos.write(p1.toString().getBytes());
//        dos.write(p2.toString().getBytes());

        dos.close();
        fos.close();

        System.out.println(file.getAbsoluteFile()+" has written safely");
    }
}
