
public class Multiply {

	public static void main(String [] args) {
		
		System.out.println("Enter your first number.");
		int firstInput = IO.readInt();
		System.out.println("Enter your second number.");
		int secondInput = IO.readInt();
		
		int RESULT = firstInput*secondInput;
		
		IO.outputIntAnswer(RESULT);
	
		
	}
}
