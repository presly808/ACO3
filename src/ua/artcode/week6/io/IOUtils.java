package ua.artcode.week6.io;

import java.io.*;
import java.rmi.NoSuchObjectException;

/**
 * Created by admin on 08.12.2014.
 */
public class IOUtils {

    public static final String PATH = "f:/write.txt";

    public static void main(String[] args) {
        testBuffFileInputStream("f:/new.txt");

        //testWriteFileOutputStream("Abrakadabra", PATH);

        writeWriter("Доброго дня!",PATH);



    }


    public static void testFileInputStream(String path){
        try {
            InputStream is = new FileInputStream(path);
            int readByte = -1;
            while((readByte = is.read()) != -1){
                System.out.print((char) readByte);
            }
            is.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void testBuffFileInputStream(String path){
        try {
            byte[] buff = new byte[1024];

            InputStream is = new FileInputStream(path);
            int countRead = -1;
            while((countRead = is.read(buff)) != -1){
                System.out.println(new String(buff, 0, countRead));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void testWriteFileOutputStream(String src, String path){
        try {
            byte[] bytes = src.getBytes();
            OutputStream os = new FileOutputStream(path);
            for (byte b : bytes){
                os.write(b); //
            }
            os.close();//wrong approach
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void testWriteBuffFileOutputStream(String src, String path){
        OutputStream os = null;
        try {
            byte[] bytes = src.getBytes();
            os = new FileOutputStream(path);
            os.write(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(os != null){
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public static void writeWriter(String line,String path){
        try (PrintWriter printWriter = new PrintWriter(new FileWriter(path,true))) {
            printWriter.write(line);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void saveObjToFile(Object o, String path){
        try (FileOutputStream fos = new FileOutputStream(path);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(o);
        } catch (IOException e ) {
            e.printStackTrace();
        }
    }

    public static Object loadObjectFromFile(String path) throws NoSuchObjectException {
        try (FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis)){
            return ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            throw new NoSuchObjectException("can not deserialize");
        }
    }

}
