package com.lol;

import java.util.Scanner;

public class trap_water2 {
    int total_water;

    public void trapped_water(int[] height){
        int n = height.length;
        int[] l_max = new int[n];
        int[] r_max = new int[n];

        l_max[0] = height[0];
        for (int i = 1; i<n;i++){
            if (height[i] > l_max[i-1]){
                l_max[i] = height[i];
            }
            else {
             l_max[i] = l_max[i-1];
            }
        }
        r_max[n - 1] = height[n -1];
        for (int j = n - 2;j>=0;j--){
            if (height[j]>r_max[j+1]){
                r_max[j] = height[j];
            }
            else {
                r_max[j] = r_max[j+1];
            }
        }
        for (int k = 0; k< n;k++){
            total_water = total_water + Math.min(l_max[k],r_max[k]) - height[k];
        }
        System.out.println("The volume of water trapped is '"+total_water+"' unit.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number of buildings: ");
        int build = sc.nextInt();
        int[] height = new int[build];

        System.out.println("Please enter building's heights: ");
        for (int i = 0;i< height.length;i++){
            height[i] = sc.nextInt();
        }

        trap_water2 t2 = new trap_water2();
        t2.trapped_water(height);

    }
}
