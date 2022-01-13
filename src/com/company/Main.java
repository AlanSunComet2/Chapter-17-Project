package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //BufferedReader bufferedReader = new BufferedReader(new FileReader(""));
        MorseTree mTree = new MorseTree();
       System.out.println(mTree.find('L'));
    }

   // public static String decode(String morse){
   //     String decoded = "";
       // MorseTreeNode node = new MorseTreeNode();
   //     for (int i = 0; i < morse.length(); i++) {
           // if (morse.charAt(i))
  //      }

//    }
}
