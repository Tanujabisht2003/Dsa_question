package geeks;

import java.util.Arrays;

//Kth smallest element
//https://practice.geeksforgeeks.org/problems/kth-smallest-element5635/1
public class ques6 {

	 public static int kthSmallest(int[] arr, int l, int r, int k) 
	    { 
	        //Your code here
	        Arrays.sort(arr);

	        return arr[k-1];
	    } 
}
