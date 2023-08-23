package geeks;

import java.util.Arrays;
//https://www.geeksforgeeks.org/print-all-the-duplicates-in-the-input-string/
//Print all the duplicates in the input string
public class ques10 {

	public static void printDuplicates(String s)
    {
	 int x =  s.length();
	 char[] str = s.toCharArray();
     Arrays.sort(str);
     String string = new String(str);
   
       for(int i=0;i<s.length();i++){
           int count = 1;
             while(i<s.length()-1 && string.charAt(i)== string.charAt(i+1)){
                   count++;
                    i++;
             }
             if(count > 1){
                  System.out.println(string.charAt(i) + ", count = " + count);
             } 
       }
	}
}

