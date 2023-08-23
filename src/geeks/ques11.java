package geeks;
// https://www.geeksforgeeks.org/a-program-to-check-if-strings-are-rotations-of-each-other/
public class ques11 {

	public static boolean stringsRotation(String s1,String s2,int size,int indexFound ) {
		for (int i=0;i<size;i++) {
			if(s1.charAt(i)!=s2.charAt((indexFound+i)%size)){
				return false;
			}
			// %size keeps the (indexFound+i) in bounds
		}
		return true;
		
	}
	public static void main(String[] args) {
		String s1 = "abcd";
		String s2 = "cdab";
	}
	
}
