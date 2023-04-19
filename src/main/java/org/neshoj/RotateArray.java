package org.neshoj;

import java.util.Arrays;

/**
 * Problem:
 * Rotate an array of n elements to the right by k steps. For example,
 * with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4]. How many different
 * ways do you know to solve this problem?
 */
public class RotateArray {

    public void rotateUseIntermediateArray(int[] nums, int k) {
        if (k > nums.length)
            k = k % nums.length;

        int[] result = new int[nums.length];

        for (int i = 0; i < k; i++) {
            result[i] = nums[nums.length - k + i];
        }
        System.out.println("1 result = " + Arrays.toString(result));

        int j = 0;
        for (int i = k; i < nums.length; i++) {
            result[i] = nums[j];
            j++;
        }

        System.out.println("2 result = " + Arrays.toString(result));

        System.arraycopy(result, 0, nums, 0, nums.length);

        System.out.println("3 result = " + Arrays.toString(result));
    }

    public void bubbleRotate(int[]arr, int order){
        for(int i=0; i < order; i++){
            for(int j = arr.length-1; j > 0; j--){
                int temp = arr [j]; // temp=7
                arr[j] = arr[j -1]; // arr[6] = 6
                arr[j - 1] = temp;  // arr[5] = 7
                // breaks after moving the last digit to the front
            }
        }

        System.out.println("Bubble Sort Rotate = " + Arrays.toString(arr));
    }

}
