package geeks;

class Selectionsort {
    public void sort(int[] arr){
    int n = arr.length;
    for(int i=0;i<n-1;i++){
        for(int j=i+1;j<n;j++){
            int min_index = i;
            if(arr[min_index]>arr[j]){
                min_index = j;
            }
        }

        int temp = arr[i];
        arr[i] = arr[min_index];
        arr[min_index] = temp;
     }
    }
        public static void print(int[] arr){
            int n = arr.length;
            for(int i=0;i<n;i++)
                System.out.print(arr[i]+" ");
                System.out.println();
            
        }    
	public static void main(String args[]) {
	    Selectionsort ob = new Selectionsort();
        int arr[] = {64,25,12,22,11};
        ob.sort(arr);
        System.out.println("Sorted array");
        ob.print(arr);
	    
	}
}
