package ua.artcode.week6.day1;

import java.io.File;
import java.io.IOException;

/**
 *
 */
public class TestFile {

    public static void main(String[] args) throws IOException {
                            //f:\flat.xml
        File file = new File("../IDEA_Projects/ACO3/new.txt");// obj -> file(folder) in filesystem

        if(!file.exists()){
            file.createNewFile();
        }

        System.out.println("Path " + file.getPath());
        System.out.println("AbsolutePath  " + file.getAbsolutePath());
        System.out.println("CanonicalPath  " + file.getCanonicalPath());

        System.out.println("Length " + file.length());
        System.out.println("IsFile " + file.isFile());
        System.out.println("IsDir " + file.isDirectory());

        File dir = new File("f:\\acer_data");
        System.out.println("*************************");
        String[] list = dir.list();
        for(String el : list){
            System.out.println(el);
        }
        System.out.println("*************************");
        File[] children = dir.listFiles();
        for(File child : children){
            System.out.println(child.getCanonicalPath());
        }
        System.out.println("*************************");




    }


}
