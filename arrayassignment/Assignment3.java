package arrayassignment;

public class Assignment3 {

	public static void main(String[] args) {
		int[] haystack = {1,4,34,56,7};
		int needle = 56;
		int index = -1;
		
		for(int i =0; i<haystack.length;i++) {
			if(haystack[i] == needle) {
				index = i+1;
				break;
			}
		}
		
		System.out.println(index);
		

	}

}
