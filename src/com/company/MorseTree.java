package com.company;

public class MorseTree {
    MorseTreeNode root;

    public MorseTree() {
        root = new MorseTreeNode('\0');
        root.dot = new MorseTreeNode('E');
        root.dot.dot = new MorseTreeNode('M');
        root.dot.dot.dot = new MorseTreeNode('O');
        root.dot.dot.dot.dot = new MorseTreeNode('-');
        root.dot.dot.dot.dot.dot = new MorseTreeNode('0');
        root.dot.dot.dot.dot.dash = new MorseTreeNode('9');
        root.dot = new MorseTreeNode('E');
        root.dot = new MorseTreeNode('E');
        root.dot = new MorseTreeNode('E');
        root.dot = new MorseTreeNode('E');
        root.dot = new MorseTreeNode('E');
        root.dot = new MorseTreeNode('E');
        root.dot = new MorseTreeNode('E');
        root.dot = new MorseTreeNode('E');
        root.dot = new MorseTreeNode('E');
        root.dot = new MorseTreeNode('E');

    }
}
