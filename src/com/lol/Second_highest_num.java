package com.lol;

import java.util.Arrays;

public class Second_highest_num {
    int i;
    int maximum;

    void display() {
        int[] array = {0, 4, 5, 7, 1,9, 3};
        int lengths = array.length;
        maximum = array[0];
        for (i = 0; i < lengths; ) {
            if (array[i] > maximum) {
                maximum = array[i];
            }
            i += 1;
        }
        System.out.println("The maximum number out of the given array is " + maximum);

        // Sorting the number of arrays in ascending order.
        Arrays.sort(array);
        System.out.println("The second maximum number out of the given array is " + array[lengths - 2]);
    }
    
    public static void main(String[] args) {
        Second_highest_num SHM = new Second_highest_num();
        SHM.display();
    }


}
