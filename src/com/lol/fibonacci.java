package com.lol;

public class fibonacci {

    void fibb() {
    int next = 5;
    int current = 1;
    int prev = 0;
        if (next == 0) {
            System.out.println("0");
        } else if (next == 1) {
            System.out.println("1");
        } else {
            for (int i = 2; i <= next;i++) {
                next = current + prev;
                prev = current;
                current = next;
            }
                System.out.println(next);
        }
    }

    public static void main(String[] args) {
        fibonacci f1 = new fibonacci();
        f1.fibb();
    }
}
