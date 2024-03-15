package com.learning.core.day10;

import java.io.IOException;

import java.nio.file.*;



public class D10P04{



    public static void main(String[] args) {



      

        Path sourcePath = Paths.get("D:\\D04.txt");

        Path targetPath = Paths.get("D:\\D10p4ans.txt");



        

        try {

            Files.copy(sourcePath, targetPath, StandardCopyOption.REPLACE_EXISTING);

            System.out.println("File copied successfully!");

        } catch (IOException e) {

            System.err.println("Error occurred while copying file: " + e.getMessage());

        }

    }

}