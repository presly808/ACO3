package ua.artcode;

import java.io.File;

/**
 * Created by admin on 08.12.2014.
 */
public class FileUtils {


    public static void tree(File point, String deep){
        if(!point.exists()){
            return;
        }

        for(File child : point.listFiles()){
            if(child.isDirectory()){
                System.out.println(deep + child.getName());
                tree(child, deep + "\t");
            } else {
                System.out.println(deep + child.getName());
            }
        }
    }

    public static void dir(File dir){
        if(!dir.isDirectory()){
            throw new IllegalArgumentException("arg is not a dir");
        }

        for(File child : dir.listFiles()){
            System.out.println(child.getAbsolutePath());
        }

    }

    public static void main(String[] args) {
        dir(new File("c:/"));
    }

}
