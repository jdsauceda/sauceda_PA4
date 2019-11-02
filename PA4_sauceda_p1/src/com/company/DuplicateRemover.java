package com.company;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class DuplicateRemover {

    public static HashSet<String> remove(File dataFile) throws IOException {
        HashSet<String> hashSet = new HashSet<String>();
        FileInputStream fileByteStream = null;
        Scanner inFS = null;

        System.out.println("Opening file problem1.txt");
        fileByteStream = new FileInputStream(dataFile);
        inFS = new Scanner(fileByteStream);

        System.out.println("Reading file to String.");
        while (inFS.hasNext()) {
            hashSet.add(inFS.next());
        }

        fileByteStream.close(); //close() may throw IOException if fails
        return hashSet;

    }

    public static void write(File outputFile, HashSet uniqueWords) throws IOException {
        FileOutputStream fileByteStream = null; // File output stream
        PrintWriter outFS = null;               // Output stream

        // Try to open file
        fileByteStream = new FileOutputStream("uniqueWords.txt");
        outFS = new PrintWriter(fileByteStream);

        outFS.println(uniqueWords);
        outFS.flush();

        fileByteStream.close();

     }
}
