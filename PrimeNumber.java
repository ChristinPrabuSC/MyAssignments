package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input1 = 97;
		
		for (int i = 2; i < input1; i++) {

			if (input1 % i == 0) {

				System.out.println(input1 + " is not a prime number");
				
				break;

			} else if(i == input1 - 1) {
				
				System.out.println(input1 + " is a prime number");
	
				}
			
			}
		
	}
	
}
