package com.company;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Application {

    public static void main(String[] args) throws IOException {
        TreeSet<String> treeSet = new TreeSet<String>();
        ArrayList<String> words = new ArrayList<String>();
	    DuplicateCounter duplicateCounter = new DuplicateCounter();

        treeSet = duplicateCounter.count(new File("problem2.txt"));
        duplicateCounter.write(new File("unique_words_counts.txt"), treeSet);
    }
}
