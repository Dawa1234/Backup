package com.lol;

public class stack_1 {
    int x = -1;
    char[] stacks;
    int size;

    stack_1(int n) {
        this.size = n;
        stacks = new char[n];
    }

    public void push(char data) {
        if (isFull()) {
            System.out.println("The present stack is Full!");
        } else {
            stacks[++x] = data;
        }
    }

    public char pop() {
        if (isempty()) {
            System.out.println("The present stack is Empty!");
            return 'F';
        } else {
            return stacks[x--];
        }
    }


    public boolean isFull() {
        if (x == size - 1) {
            return true;
        }
        return false;
    }

    public boolean isempty() {
        if (x == -1) {
            return true;
        }
        return false;
    }

    public static boolean exp_check(String exp){
        stack_1 s1 = new stack_1(5);
        String open_bracket = "[{(";
        String close_bracket = "]})";
        for (int i=0; i<exp.length();i++){
            char braces = exp.charAt(i);

            if (braces == '[' || braces == '{' || braces == '('){
                s1.push(braces);
            }
            else {
                char pop_bracket = s1.pop();
                int close_bracket_index = close_bracket.indexOf(braces);
                char corresponding_O_bracket = open_bracket.charAt(close_bracket_index);
                if (pop_bracket != corresponding_O_bracket){
                    return false;
                }
            }

        }
        if (s1.isempty()) {
            return true;
        }
        return false;
    }

//  Main method.
    public static void main(String[] args) {
        System.out.println(exp_check(""));
    }
}
