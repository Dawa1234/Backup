package com.lol;

public class stack_test{

    public static void main(String[] args) {
    stack_ s1 = new stack_(5);
        s1.push(40);
        s1.push(30);
        System.out.println(s1.pop());
        s1.push(20);
        s1.push(10);
        s1.push(90);
        System.out.println(s1.pop());


    }
}
