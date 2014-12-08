package ua.artcode.week6.day1;

import ua.artcode.FileUtils;

import java.io.File;
import java.util.Scanner;

/**
 * Created by admin on 08.12.2014.
 */
public class TestTreeTask {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input path to dir");
        String path = sc.nextLine();
        FileUtils.tree(new File(path), "");
    }
}
