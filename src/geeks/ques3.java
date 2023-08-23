package geeks;

public class ques3 {

	//https://practice.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614/1
	// Cyclically rotate an array by one
	public int[] rotate(int arr[], int n)
    {
        int temp = arr[0];
        int j = arr[arr.length-1];
        arr[0] = j;
        for(int i=1;i<arr.length;i++){
            int temp2 = arr[i];
            arr[i] = temp;
            temp = temp2;
        }
        return arr;
    }
}
