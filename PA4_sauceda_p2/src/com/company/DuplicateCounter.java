package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class DuplicateCounter {


    public static TreeSet<String> count (File dataFile) throws IOException {
        String currentWord;
        ArrayList<Integer> wordCounter = new ArrayList<Integer>();
        int count = 0;
        int i;
        ArrayList<String> words = new ArrayList<String>();
        TreeSet<String> treeSet = new TreeSet<String>();
        FileInputStream fileByteStream = null;
        Scanner inFS = null;
        // Trying to open file
        System.out.println("Opening file problem2.txt");
        fileByteStream = new FileInputStream(dataFile);
        inFS = new Scanner(fileByteStream);
        //read file into List then to Set
        System.out.println("Reading file to String.");
        while (inFS.hasNext()) {
           words.add(inFS.next());
        }
        treeSet.addAll(words);
        ArrayList<String> words2 = new ArrayList<String>(treeSet);

        for (i = 0; i < words2.size(); ++i) {
            currentWord = words2.get(i);
                if (currentWord.equals(words.get(i))) {
                    count++;
                    System.out.println(count);
                }
    }
        // Closing the file
        System.out.println("Closing file problem2.txt");
        fileByteStream.close(); // close() may throw IOException if fails

        return treeSet;
    }


    public static void write (File outputFile, TreeSet treeSet) throws IOException {
        FileOutputStream fileByteStream = null; // File output stream
        PrintWriter outFS = null;               // Output stream

        // Try to open file
        fileByteStream = new FileOutputStream("unique_word_counts.txt");
        outFS = new PrintWriter(fileByteStream);

        outFS.println(treeSet);
        outFS.flush();

        fileByteStream.close();

    }
}
