package com.company;
import java.io.File;
import java.util.ArrayList;
import java.io.IOException;
import java.util.HashSet;

public class Application {

    public static void main(String[] args) throws IOException {
        HashSet<String> uniqueWords = new HashSet<String>();
        DuplicateRemover duplicateRemover = new DuplicateRemover();

        uniqueWords = duplicateRemover.remove(new File("problem1.txt"));
        duplicateRemover.write(new File("uniqueWords.txt"), uniqueWords);
        }
    }

