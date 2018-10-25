package ltu;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*; 
import java.nio.charset.StandardCharsets; 
import java.nio.file.*; 
import java.io.*; 
import java.net.*;
import java.util.concurrent.*;


public class Utils {

    public ArrayList<String> redApples;
	public ArrayList<String> greenApples;

    public ArrayList<String> readRedAppleFiles() throws Exception, NoSuchFileException {
        System.out.println("Files are being read!");
        try{
            redApples = new ArrayList<String>(Files.readAllLines(Paths.get("./", "redApples.txt"), StandardCharsets.ISO_8859_1)); 
        } catch (NoSuchFileException e) 
            {   
            System.out.println(redApples);
            e.printStackTrace(System.out); 
            }	
        System.out.println("Files are done being read!");
        return redApples;
    }

    public ArrayList<String> readGreenAppleFiles() throws Exception, NoSuchFileException {
        System.out.println("Files are being read!");
        try{        
            greenApples = new ArrayList<String>(Files.readAllLines(Paths.get("./", "greenApples.txt"), StandardCharsets.ISO_8859_1));
        } catch (NoSuchFileException e) {   
            System.out.println(greenApples);
            e.printStackTrace(System.out); 
        }	
        System.out.println("Files are done being read!");
        return greenApples;
    }
    
}