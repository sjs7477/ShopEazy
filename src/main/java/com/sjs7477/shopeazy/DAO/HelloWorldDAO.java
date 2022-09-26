package com.sjs7477.shopeazy.DAO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HelloWorldDAO{
public String HelloWorld(){
    System.out.println("Entering the DAO layer");
    File file = new File("/Users/shreyas/Desktop/Capstone/ShopEazy/DummyDBData");
    Scanner sc;
    String sb = "";

    {
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine())
                sb=sb+sc.nextLine();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    System.out.println("Leaving the DAO layer");
    return sb;
}
}
