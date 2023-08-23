package geeks;

import java.util.Arrays;
//https://www.programiz.com/java-programming/examples/check-valid-shuffle-of-strings

	public class ques13 {
	    public static boolean checkLength(String first,String second,String result){
	        if(first.length()+second.length() != result.length()){
	            return false;
	        }else{
	            return true;
	        }
	    }
	    public static String sort(String str){
	        char[] chararr = str.toCharArray();
	        Arrays.sort(chararr);
	        str = String.valueOf(chararr);
	        return str;
	    }
	    
	    public static boolean checkshuffle(String first,String second,String result){
	        
	        first = sort(first);
	        second = sort(second);
	        result = sort(result);
	        
	        
	        int i=0;
	        int j = 0;
	        int k = 0;
	        
	        
	        while(k != result.length()){
	            if(i < first.length() && first.charAt(i) == result.charAt(k)){
	                i++;
	            }else if(j< second.length() && second.charAt(j) == result.charAt(k)){
	                j++;
	            }else{
	                return false;
	            }
	            k++;
	        }
	        // this one check whether the element is left on first and second array
	        if(i<first.length()||j<second.length()){
	            return false;
	        }
	        return true;
	    }
		public static void main (String[] args) {
		  String first = "XY";
		  String second = "12";
		  String[] results = {"1XY2","Y1X2","Y21XX"};
		  for(String result : results){
		  
			  if(checkLength(first,second,result) == true && checkshuffle(first,second,result) == true){
		      
				  System.out.println("true");
              }else{
				  System.out.println("false");
		     }
		  } 
	   }
	}

