package week1.day2;

public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input = 8;
		
		for (int i = 0; i < input; i++) {

			if (i*i > input) {

				System.out.println("The square root of number " + input + " without decimal values is " + (i-1));
				
				break;

				}
			
			}
		
	}

}
