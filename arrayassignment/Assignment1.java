package arrayassignment;

public class Assignment1 {

	public static void main(String[] args) {
		int[] array = {8,4,3,45,1,7,9};
		
		double sum =0;
		double avg;
		
		for(int i =0;i<array.length;i++) {
			sum+= array[i];
		}
		
		avg = sum/array.length;
		System.out.println("Sum: "+sum);
		System.out.println("Average: "+avg);

	}

}
