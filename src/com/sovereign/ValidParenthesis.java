package com.sovereign;

import java.util.Stack;

public class ValidParenthesis {

    public static void main(String[] args) {
        String a = "";
    }
    static String isBalanced(String s){
        Stack <Character> stack = new Stack<>();
        char cur;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='[' || s.charAt(i)=='{' || s.charAt(i)=='('){
                stack.push(s.charAt(i));
            }else {
                if(stack.isEmpty()){
                    return "NO";
                }else {
                    char pop = stack.pop();
                    if(s.charAt(i)=='[' && pop != ']'){
                        return "NO";
                    }else if (s.charAt(i)=='(' && pop != ')'){
                        return "NO";
                    }else if (s.charAt(i)=='{' && pop != '}'){
                        return "NO";
                    }
                }
            }
        }
        if(stack.isEmpty()){
            return "YES";
        }else {
            return "NO";
        }
    }

}
