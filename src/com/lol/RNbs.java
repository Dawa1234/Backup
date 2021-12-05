package com.lol;

public class RNbs {
    int A[] = {1,2,3,4,5,6,7,8,9};
    int mid;
    int RBinsearch(int l,int h,int key){
        if(l == h){
            if (A[l] == key){
                System.out.println(l);
                return l;
            }
            else {
                System.out.println("0");
                return 0;
            }
        }
        else {
            mid = (l + h) /2;
            if (key == A[mid]){
                System.out.println(mid);
                return mid;
            }
            else if (key < A[mid]){
                System.out.println("Less than key");
                return RBinsearch(l,mid-1,key);
            }
            else {
                System.out.println("Greater than key");
                return RBinsearch(mid + 1,h,key);
            }
        }
    }

    public static void main(String[] args) {
        RNbs r1 = new RNbs();
        r1.RBinsearch(0,8,6);
    }
}
