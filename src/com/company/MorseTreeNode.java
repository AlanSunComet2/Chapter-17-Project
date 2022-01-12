package com.company;

public class MorseTreeNode {
    public char data;
    public MorseTreeNode dot;
    public MorseTreeNode dash;

    public MorseTreeNode(char data){
        this.data = data;
        this.dot = null;
        this.dash = null;
    }
    public MorseTreeNode(char data,MorseTreeNode left, MorseTreeNode right){
        this.data = data;
        this.dot = left;
        this.dash = right;
    }
}
