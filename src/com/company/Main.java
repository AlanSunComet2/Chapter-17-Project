package com.company;
import java.util.*;
import java.io.BufferedReader;
import java.io.*;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //BufferedReader bufferedReader = new BufferedReader(new FileReader(""));
        MorseTree mTree = new MorseTree();
        Scanner scanner = new Scanner(new File("/Users/steven/IdeaProjects/ch17 morse code/src/com/company/morsecode.txt"));
       //System.out.println(mTree.encode(scanner));
       //Scanner sc = new Scanner(".. /.... .- - . /-- ... /..-. --- .-- .-.. . .-. ..--.. .---- ..--- ---.. ");
       // System.out.println(mTree.decode(sc));
        System.out.println(mTree.endecode(scanner));
    }

   // public static String decode(String morse){
   //     String decoded = "";
       // MorseTreeNode node = new MorseTreeNode();
   //     for (int i = 0; i < morse.length(); i++) {
           // if (morse.charAt(i))
  //      }

//    }
}
