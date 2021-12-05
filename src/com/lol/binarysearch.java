package com.lol;

public class binarysearch {
    int a[] = {11, 22, 33, 47, 68, 64, 76, 79};
    int data, start, end, mid;

    void BS() {
        data = 689;
        start = 0;
        end = 7;
        for (int i = 0; i < (a.length) / 2; i++) {
            mid = (start + end) / 2;
            if (start <= end) {
                if (a[mid] == data) {
                    System.out.println("The data is inside the array.");
                } else if (a[mid] > data) {
                    end = mid - 1;
                } else if (a[mid] < data) {
                    start = mid + 1;
                }
            } else {
                System.out.println("The data is not inside the array.");
            }
        }
    }

    public static void main(String[] args) {
        binarysearch b1 = new binarysearch();
        b1.BS();
    }
}
