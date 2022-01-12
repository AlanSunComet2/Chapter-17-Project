package com.company;

public class MorseTreeNode {
    public char data;
    public MorseTreeNode dot;
    public MorseTreeNode dash;

    public MorseTreeNode(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
    public MorseTreeNode(int data,IntTreeNode left, IntTreeNode right){
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
