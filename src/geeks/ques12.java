package geeks;

import java.util.Arrays;

//https://www.geeksforgeeks.org/maximum-and-minimum-in-an-array/
public class ques12 {

	 public static int[] maxmin(int A[],int N) 
	    {
	        //code here
		    
	        int max = A[0];
	        int min = A[0];
	        for(int j=1; j<N; j++){
	        if(max < A[j]){max = A[j];}
	        if(min > A[j]){min = A[j];}
	        }
	        int[] arr = new int[2];
	        int m = arr.length;
	        for(int i = 0; i < m; i++) {
	        	arr[i] = max;
	        	arr[i] = min;
	        }  
	        return arr;
	    }
}
