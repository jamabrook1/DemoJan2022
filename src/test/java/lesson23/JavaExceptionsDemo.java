package lesson23;


public class JavaExceptionsDemo {
	public static void main(String[] args) {
		
		int a =2;
		int b =0;
		int result=100;
		// 2 isnot devidable by zero so it gives error ArithmeticException
				// to handle this kind of sutiation we use try catch clause
		// we use try and catch in order that our program wont crash because of the error
		
		try {
			// try this. it means if works, but if fails,then move to catch clause
			 result =a/b;
		} catch (ArithmeticException e) {
			//here you Catch the exception
			System.out.println("ERROR: Canot divide");
			//Write into log file
			e.printStackTrace();
		} finally { // finally always get executed
			System.out.println("Finally is executed");
		}
		System.out.println(result);
		System.out.println("After the result");
		}
		
		
		
		
		
	}
	
	
	
	
	


