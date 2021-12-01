package com.lol;

public class bs {
    int A[] = {4, 5, 6, 7, 8, 14, 16, 18, 19};
    int l, h;

    int Bin_search(int n, int Key) {
        this.l = 1;
        this.h = n;
        while (l <= h) {
            int mid = (l + h) / 2;
            if (Key == A[mid]) {
                System.out.println("It's found!");
                return mid;
            } else if (Key < A[mid]) {
                h = mid - 1;
            } else if (Key > A[mid]) {
                l = mid + 1;
            }
        }
        System.out.println("It's not found!");
        return 0;
    }

    public static void main(String[] args) {
        bs b1 = new bs();
        b1.Bin_search(9, 91);
    }
}
