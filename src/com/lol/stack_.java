package com.lol;

public class stack_ {
    int x = -1;
    int[] stacks;
    int size;

    stack_(int n) {
        this.size = n;
        stacks = new int[n];
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("The present stack is Full!");
        } else {
            stacks[++x] = data;
        }
    }

    public int pop() {
        if (isempty()) {
            System.out.println("The present stack is Empty!");
            return 0;
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

}