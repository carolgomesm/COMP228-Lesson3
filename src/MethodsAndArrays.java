import java.security.SecureRandom;

public class MethodsAndArrays {

	public static void main(String[] args) {
		
		System.out.println(rollDice(2,6));
		

	}
	
	public static int rollDice(int numDice, int numSide){
		
		SecureRandom generateRandom = new SecureRandom();
		int result = 0;
		
		for(int i = 0; i <= numDice - 1; i++ ){
			
			result += generateRandom.nextInt(numSide) + 1;
		}
		
		return result;
	}

}
