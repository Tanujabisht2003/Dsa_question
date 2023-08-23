package geeks;

import java.util.ArrayList;

// https://practice.geeksforgeeks.org/problems/value-equal-to-index-value1330/1
public class ques14 {
	ArrayList<Integer> valueEqualToIndex(int arr[], int n) {

	 ArrayList<Integer> Arr = new ArrayList<>();
     if(n==0){
         return Arr;
     }
     for(int i=0;i<n;i++){
         if(arr[i] == (i+1)){
             Arr.add(i+1);
         }
     }
     return Arr;
	}
}
