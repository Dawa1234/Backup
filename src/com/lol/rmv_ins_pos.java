package com.lol;

public class rmv_ins_pos {

    // To insert data in any position in an array.
    public static int[] array(int[] arr, int n, int pos, int data) {
    int[] new_arr = new int[n+1];
        for (int i = n - 1;i >= pos -1;i --){
            new_arr[i+1] = arr[i];
        }
        new_arr[pos-1] = data;
        for (int x = 0;x<pos-1;x++){
            new_arr[x] = arr[x];
        }
        for (int j = 0;j<new_arr.length;j++){
            System.out.println(new_arr[j]);
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] elements = {5,7,2,3,9,10};
        array(elements, 6, 4, 60);
    }
}

