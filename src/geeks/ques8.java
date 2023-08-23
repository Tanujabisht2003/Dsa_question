package geeks;
//Palindrome String
//https://practice.geeksforgeeks.org/problems/palindrome-string0817/1
public class ques8 {

	 public int isPalindrome(String S) {
	        // code here
	        char[] c = S.toCharArray();
	        int j=c.length-1;
	        for(int i=0;i<c.length;i++){
	            if(c[i]!=c[j--]){
	                 return 0;
	            }
	        }
	          return 1;  
	        }
}
