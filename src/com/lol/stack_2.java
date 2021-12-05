package com.lol;

public class stack_2 {
    int size;
    char[] stacks;
    int top = -1;

    stack_2(int size) {
        this.size = size;
        stacks = new char[size];
    }

    public char pop() {
        if (is_Empty()) {
            System.out.println("Stack is empty");
            return 'F';
        } else {
            return stacks[top--];
        }
    }

    public void push(char data) {
        if (is_Full()) {
            System.out.println("Stack is full");
        } else {
            stacks[++top] = data;
        }
    }

    public boolean is_Full() {
        if (top == size - 1) {
            System.out.println("Stack is Full!");
            return true;
        }
        return false;
    }

    public boolean is_Empty() {
        if (top == -1) {
            System.out.println("Stack is Empty!");
            return true;
        }
        return false;
    }

    public static boolean is_Balanced(String exp) {
        stack_2 stack_size = new stack_2(exp.length());
        String o_bracket = "[{(";
        String c_bracket = "]})";

        for (int i = 0; i < exp.length(); i++){
            char braces = exp.charAt(i);

            if (braces == '[' || braces == '{' || braces == '(') {
                stack_size.push(braces);
            }
            else {
                char popping = stack_size.pop();
                int c_index_no = c_bracket.indexOf(braces);
                char corres_o_bracket = o_bracket.charAt(c_index_no);
                if (popping == corres_o_bracket || stack_size.is_Empty()){
                    System.out.println("Balanced");
                    return true;
                }
            }
        }
        System.out.println("Not balanced!");
            return false;
    }

    public static void main(String[] args) {
        System.out.println(is_Balanced(""));
    }

}
