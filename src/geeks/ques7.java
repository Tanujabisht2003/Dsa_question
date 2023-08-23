package geeks;

import java.util.HashSet;
// https://practice.geeksforgeeks.org/problems/union-of-two-arrays3538/1
// Union of two arrays
public class ques7 {

	public static long doUnion(int a[], int n, int b[], int m) 
    {
        //Your code here
        int t = n+m;
       int[] arr = new int[t];
       System.arraycopy(a,0,arr,0,n);
       System.arraycopy(b,0,arr,n,m);
        
       HashSet<Integer> hs = new HashSet<Integer>();
       for(int i=0;i<t;i++){
          hs.add(arr[i]);
       }
       return hs.size() ;
    }
}
