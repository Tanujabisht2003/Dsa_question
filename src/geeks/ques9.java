package geeks;
// https://practice.geeksforgeeks.org/problems/kadanes-algorithm/0
public class ques9 {

long maxSubarraySum(int arr[], int n){
        
        // Your code here
        long sum =0;
        long max =arr[0];
        for(int i =0;i<n;i++){
            sum += arr[i];
            max = Math.max(sum,max);
          if(sum<0){
            sum = 0;
          }
        }
        return max;
    }
}
