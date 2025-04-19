package com.altair;
import java.io.FileWriter;
import java.io.IOException;

public class createAFile {
    public static void main(String[] args) {
        String data="Altair Technologies";
        String filePath= "C:/Users/madhu/development/altairproject1/src/com/altair/AltairTechnologies.txt";
        try {
            FileWriter writer= new FileWriter(filePath);
            writer.write(data);
            writer.close();
            System.out.println("File created successfully at: "+ filePath);
        } catch (IOException e) {
            System.out.println("An error occurred while writing the file. ");
            e.printStackTrace();
        }
    }
}
