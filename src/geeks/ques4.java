package geeks;
//Write a program to reverse an array or string 
public class ques4 {

	 public static String reverseWord(String str)
	    {
		 //https://practice.geeksforgeeks.org/problems/reverse-a-string/1
	        // Reverse the string str
	        char[] c = str.toCharArray();
	        int n = c.length -1;
	        char temp ;
	        int L = 0;
	        
	        while(L <= n){
	            temp = c[L];
	            c[L]=c[n];
	            c[n] = temp;
	            L++;
	            n--;
	        }
	        String st = new String();  
	        String string = st.valueOf(c);  
	        return string;
	    }
}
