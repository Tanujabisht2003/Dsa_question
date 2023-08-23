package geeks;

import java.util.Arrays;
//https://www.geeksforgeeks.org/move-negative-numbers-beginning-positive-end-constant-extra-space/
// Move all negative numbers to beginning and positive to end with constant extra space
public class ques2 {
	public static void main (String[] args) {
	    int[] arr = {-12,11,-13,-5,6,-7,5,-3,-6};
	  		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++){
		    System.out.print(arr[i]+" ");
		}
	}
}
