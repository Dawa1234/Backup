package com.lol;

public class trap_water {
    public void volume(int[] height) {
        int volume_trapped = 0;
        int n = height.length;


        for (int i = 0; i <= n - 1; i++) {  // i = 1
            int l_max = height[i]; // l_max = height[1] = 3;


            for (int j = i - 1; j >= 0; j--) {  // j = 1 - 1 = 0 ; (0 >= 0) = T
                l_max = Math.max(l_max, height[j]); // l_max = 3 | 2 = 3;
            }
            int r_max = height[i]; // r_max = 3;


            for (int k = i + 1; k < n; k++) {   // k = 1 + 1 = 2 ; 4<5; k;
                r_max = Math.max(r_max, height[k]); // r_max = 3 | 5 = 5
            }                   // 0               //     3      5    -     2
            volume_trapped = volume_trapped + (Math.min(l_max, r_max) - height[i]); // 3
        }
        System.out.println(volume_trapped);
    }

    public static void main(String[] args) {
        int[] height = {2, 3, 1, 2, 5};
        trap_water p1 = new trap_water();
        p1.volume(height);
    }
}
