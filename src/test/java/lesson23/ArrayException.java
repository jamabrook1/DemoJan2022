package lesson23;

public class ArrayException {

	public static void main(String[] args) {
		
		int[] intArr = new int[3];
		
		try {
			System.out.println(intArr[2]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			
		}
		System.out.println("After try catch");

	}

}
