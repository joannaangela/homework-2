
public class Party {

	public static void main(String [] args) {
		
		System.out.println("How many people are attending?");
		int attendees = IO.readInt();
		System.out.println("How many slices of pizza can each person eat?");
		int pizzaIntake = IO.readInt();
		System.out.println("How many drinks can each person drink?");
		int sodaIntake = IO.readInt();
		System.out.println("What's the cost of the pizza pie?");
		double pizzaPrice = IO.readDouble();
		System.out.println("How many slices are in a pie?");
		int slicesPerPie = IO.readInt();
		System.out.println("What's the cost of each soda case?");
		double sodaPrice = IO.readDouble();
		System.out.println("How many sodas are in a case?");
		int sodaBottles = IO.readInt();
		
		double totalSlices = attendees*pizzaIntake;
		double totalPies = Math.ceil(totalSlices/slicesPerPie);
		double totalPizzaPrice = totalPies*pizzaPrice;
		
		double totalSodas = attendees*sodaIntake;
		double totalCases = Math.ceil(totalSodas/sodaBottles);
		double totalSodaPrice = totalCases*sodaPrice;
		
		double TOTAL = totalPizzaPrice + totalSodaPrice;
		
		IO.outputDoubleAnswer(TOTAL);
	}
}
