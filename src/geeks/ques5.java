package geeks;

//https://practice.geeksforgeeks.org/problems/max-min/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article
public class ques5 {
	
	 public static int findSum(int A[],int N) 
	    {
	        //code here
	        int max = A[0];
	        int min = A[0];
	        for(int j=1; j<N; j++){
	        if(max < A[j]){max = A[j];}
	        if(min > A[j]){min = A[j];}
	        }
	        int sum = min + max ;
	        return sum;
	    }

}
