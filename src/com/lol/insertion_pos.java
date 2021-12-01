package com.lol;

import java.util.List;

public class insertion_pos {

    void arrays(int array[],int n, int pos, int data){
        int x[] = new int[n+1];
        for (int i= 0; i <(n +1);i++){

            if (i < pos-1){
                x[i] = array[i];
            }
            else if (i == pos -1){
                x[i] = data;
            }
            else{
                x[i] = array[i-1];
            }
            System.out.println(x[i]);
        }

    }

    public static void main(String[] args) {
        int a[] = {10,20,30,40,50};
        insertion_pos a1 = new insertion_pos();
        a1.arrays(a,5,4,25);
    }
}

