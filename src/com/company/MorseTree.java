package com.company;

public class MorseTree {
    MorseTreeNode root;

    public MorseTree() {
        root.dot = new MorseTreeNode('E');
        root.dot.dot = new MorseTreeNode('I');
        root.dot.dot.dot = new MorseTreeNode('S');
        root.dot.dot.dot.dot = new MorseTreeNode('H');
        root.dot.dot.dot.dot.dot = new MorseTreeNode('5');
        root.dot.dash = new MorseTreeNode('A');
        root.dot.dash.dash = new MorseTreeNode('W');
        root.dot.dash.dash.dash = new MorseTreeNode('J');
        root.dot.dash.dash.dash.dash = new MorseTreeNode('1');
        root.dot.dot.dash = new MorseTreeNode('U');
        root.dot.dot.dash.dash = new MorseTreeNode('');
        root.dot.dot.dash.dash.dash = new MorseTreeNode('2');
        root.dot.dot.dash.dot = new MorseTreeNode('F');
        root.dot.dot.dot.dash = new MorseTreeNode('V');
        root.dot.dot.dot.dash.dash = new MorseTreeNode('3');
        root.dot.dot.dot.dot.dash = new MorseTreeNode('4');
        root.dot.dash.dot = new MorseTreeNode('R');
        root.dot.dash.dot.dot = new MorseTreeNode('L');
        root.dot.dash.dot.dash = new MorseTreeNode('');
        root.dot.dash.dot.dash.dot = new MorseTreeNode('+');
        root.dot.dash.dash.dot = new MorseTreeNode('P');
        root.dash = new MorseTreeNode('T');
        root.dash.dash = new MorseTreeNode('M');
        root.dash.dot = new MorseTreeNode('N');
        root.dash.dash.dash = new MorseTreeNode('O');
        root.dash.dash.dot = new MorseTreeNode('G');
        root.dash.dot.dash = new MorseTreeNode('K');
        root.dash.dot.dot = new MorseTreeNode('D');
        root.dash.dot.dot.dash = new MorseTreeNode('X');
        root.dash.dot.dot.dot = new MorseTreeNode('B');
        root.dash.dot.dot.dot.dot = new MorseTreeNode('6');
        root.dash.dot.dot.dot.dash = new MorseTreeNode('=');
        root.dash.dot.dot.dash.dot = new MorseTreeNode('/');
        root.dash.dash.dash.dot = new MorseTreeNode('');
        root.dash.dash.dash.dot.dot = new MorseTreeNode('8');
        root.dash.dash.dash.dash = new MorseTreeNode('');
        root.dash.dash.dash.dash.dash = new MorseTreeNode('0');
        root.dash.dash.dash.dash.dot = new MorseTreeNode('9');
        root.dash.dash.dot.dot = new MorseTreeNode('Z');
        root.dash.dash.dot.dash = new MorseTreeNode('Q');
        root.dash.dash.dot.dot.dot = new MorseTreeNode('7');
    }
}
