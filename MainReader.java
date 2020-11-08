package lesson2;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MainReader {


   public static void bookReader() throws IOException {
       RandomAccessFile raf = new RandomAccessFile("D:\\Java_projects\\j3_lesson2\\src\\main\\java\\lesson2\\test.txt", "r");

       long utf8ByteValue = 3600;
       long pagesValue = raf.length() / utf8ByteValue;

       System.out.println("Выбирете страницу из " + pagesValue + ":");

       Scanner scanner = new Scanner(System.in);
       long a = scanner.nextLong();
       if (a == 1) {
           raf.seek(1);
           byte[] arr = new byte[(int) utf8ByteValue];
           int x = raf.read(arr);
           System.out.print(new String(arr, 0, x, "UTF-8"));
       } else {
           long ourSelectPage = a * utf8ByteValue;
           raf.seek(ourSelectPage - 3600);
           byte[] arr = new byte[(int) utf8ByteValue];
           int x = raf.read(arr);
           System.out.print(new String(arr, 0, x, "UTF-8"));
       }

   }


    public static void readerFromArr() {
        try (FileInputStream in = new FileInputStream("D:\\Java_projects\\j3_lesson2\\src\\main\\java\\lesson2\\text.txt")) {
        byte[] arr = new byte[512];
        int x;
        while ((x = in.read(arr)) > 0) {
            System.out.print(new String(arr, 0, x, "UTF-8"));
        }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void fiveTxtFilesIntoOne() throws IOException {
        ArrayList<InputStream> arrL = new ArrayList<>();
        arrL.add(new FileInputStream("D:\\Java_projects\\j3_lesson2\\src\\main\\java\\lesson2\\text.txt"));
        arrL.add(new FileInputStream("D:\\Java_projects\\j3_lesson2\\src\\main\\java\\lesson2\\text1.txt"));
        arrL.add(new FileInputStream("D:\\Java_projects\\j3_lesson2\\src\\main\\java\\lesson2\\text2.txt"));
        arrL.add(new FileInputStream("D:\\Java_projects\\j3_lesson2\\src\\main\\java\\lesson2\\text3.txt"));
        arrL.add(new FileInputStream("D:\\Java_projects\\j3_lesson2\\src\\main\\java\\lesson2\\text4.txt"));
        SequenceInputStream in = new SequenceInputStream(Collections.enumeration(arrL));
        int x;
        while ((x = in.read()) != -1) {
            System.out.print((char) x);
        }
    }



    public static void main (String[] args) throws IOException {
//        readerFromArr();
//        fiveTxtFilesIntoOne();
        bookReader();



    }
}
