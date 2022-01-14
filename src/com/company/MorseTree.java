package com.company;
import java.util.*;
public class MorseTree {
    MorseTreeNode root;
    char[] key = {'E', 'I', 'A'};
    public MorseTree() {
        root = new MorseTreeNode('\0');
        root.dot = new MorseTreeNode('E');
        root.dot.dot = new MorseTreeNode('I');
        root.dot.dot.dot = new MorseTreeNode('S');
        root.dot.dot.dot.dot = new MorseTreeNode('H');
        root.dot.dot.dot.dot.dot = new MorseTreeNode('5');
        root.dot.dash = new MorseTreeNode('A');
        root.dot.dash.dash = new MorseTreeNode('W');
        root.dot.dash.dash.dash = new MorseTreeNode('J');
        root.dot.dash.dash.dash.dash = new MorseTreeNode('1');
        root.dot.dash.dash.dash.dot = new MorseTreeNode('~');
        root.dot.dot.dash = new MorseTreeNode('U');
        root.dot.dot.dash.dash = new MorseTreeNode('~');
        root.dot.dot.dash.dash.dot = new MorseTreeNode('~');
        root.dot.dot.dash.dash.dot.dot = new MorseTreeNode('?');
        root.dot.dot.dash.dash.dot.dash = new MorseTreeNode('_');
        root.dot.dot.dash.dash.dash = new MorseTreeNode('2');
        root.dot.dot.dash.dot = new MorseTreeNode('F');
        root.dot.dot.dot.dash = new MorseTreeNode('V');
        root.dot.dot.dot.dash.dot = new MorseTreeNode('~');
        root.dot.dot.dot.dash.dash = new MorseTreeNode('3');
        root.dot.dot.dot.dot.dash = new MorseTreeNode('4');
        root.dot.dash.dot = new MorseTreeNode('R');
        root.dot.dash.dot.dash = new MorseTreeNode('~');
        root.dot.dash.dot.dash.dash = new MorseTreeNode('~');
        root.dot.dash.dot.dash.dot = new MorseTreeNode('+');
        root.dot.dash.dot.dash.dot.dot = new MorseTreeNode('~');
        root.dot.dash.dot.dash.dot.dash = new MorseTreeNode('.');
        root.dot.dash.dot.dot = new MorseTreeNode('L');
        root.dot.dash.dot.dash = new MorseTreeNode('~');
        root.dot.dash.dash.dot = new MorseTreeNode('P');
        root.dash = new MorseTreeNode('T');
        root.dash.dash = new MorseTreeNode('M');
        root.dash.dot = new MorseTreeNode('N');
        root.dash.dash.dash = new MorseTreeNode('O');
        root.dash.dash.dash.dot = new MorseTreeNode('~');
        root.dash.dash.dot = new MorseTreeNode('G');
        root.dash.dot.dash = new MorseTreeNode('K');
        root.dash.dot.dot = new MorseTreeNode('D');
        root.dash.dot.dot.dash = new MorseTreeNode('X');
        root.dash.dot.dot.dot = new MorseTreeNode('B');
        root.dash.dot.dot.dash = new MorseTreeNode('~');
        root.dash.dot.dot.dot.dot = new MorseTreeNode('6');
        root.dash.dot.dot.dot.dot.dash = new MorseTreeNode('.');
        root.dash.dot.dot.dot.dot.dot = new MorseTreeNode('~');
        root.dash.dot.dot.dot.dash = new MorseTreeNode('=');
        root.dash.dot.dot.dash.dot = new MorseTreeNode('/');
        root.dash.dot.dot.dash.dash = new MorseTreeNode('~');
        root.dash.dash.dash.dot = new MorseTreeNode('~');
        root.dash.dash.dash.dot.dot = new MorseTreeNode('8');
        root.dash.dash.dash.dot.dash = new MorseTreeNode('~');
        root.dash.dash.dash.dash = new MorseTreeNode('~');
        root.dash.dash.dash.dash.dash = new MorseTreeNode('0');
        root.dash.dash.dash.dash.dot = new MorseTreeNode('9');
        root.dash.dash.dot.dot = new MorseTreeNode('Z');
        root.dash.dash.dot.dash = new MorseTreeNode('Q');
        root.dash.dash.dot.dot.dot = new MorseTreeNode('7');
        root.dash.dash.dot.dot.dash = new MorseTreeNode('~');
        root.dash.dash.dot.dot.dash.dot = new MorseTreeNode('~');
        root.dash.dash.dot.dot.dash.dash = new MorseTreeNode(',');
    }

    public String encode(Scanner sc) {
        StringBuilder result = new StringBuilder();
        char[] word;
        while(sc.hasNext()) {
            String lexicon = sc.next().toUpperCase();
            word = lexicon.toCharArray();
            for(char x : word) {
                result.append(extractCode(root, x)).append(" ");
            }
            if(sc.hasNext())
            result.append("/");
            else if(sc.hasNextLine())
                result.append("\n");
        }
        return result.toString();
    }
    public String endecode(Scanner sc){

        StringBuilder result = new StringBuilder();
        String temp;
        while(sc.hasNextLine()){
            temp = sc.nextLine();
            result.append("\n");
            if(temp.charAt(0) == '.' || temp.charAt(0) == '-' || temp.charAt(0) == '/'){
                result.append(decode(new Scanner(temp)));
            }else{
                result.append(encode(new Scanner(temp)));
            }
        }
        return result.toString();
    }

    private String extractCode(MorseTreeNode node, char Alpha){
        //System.out.println(node.data);
        if(node.dot==null && node.dash==null){
            return "";
        }
        else {
            assert node.dot != null;
            if(node.dot.data==Alpha){
                return ".";
            }
            else if(node.dash.data==Alpha){
                return "-";
            }
        }
        String dot, dash;
        dot = extractCode(node.dot,Alpha);
        dash = extractCode(node.dash,Alpha);
        if(!dash.isEmpty()){
            return "-" + dash;
        }else if(!dot.isEmpty()){
            return "." + dot;
        }
        return "";
    }
//    public void encode(Scanner s){
//        char Alpha;
//        char[] c;
//        while(s.hasNext()){
//            c = s.next().toCharArray();
//            Alpha = c[0];
//
//        }
//    }
    public String decode(Scanner s){
        String code;
        StringBuilder result = new StringBuilder();
        while(s.hasNext()){
            code = s.next();
            char[] c = code.toCharArray();
            MorseTreeNode node = root;
            for(char x : c){
                if(x == '.'){
                    node = node.dot;
                }else if(x=='-'){
                    node = node.dash;
                }else if(x=='/'){
                    result.append(node.data).append(" ");
                }
            }
            if(!result.substring(result.length()).equals(" ")) {
                result.append(node.data);
            }
            if(s.hasNextLine())
                result.append("\n");
        }
        return result.toString();

    }

}

