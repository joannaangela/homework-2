
public class PayFee {

	public static void main(String [] args) {
		
		System.out.println("How much money was sent?");
		double moneySent = IO.readDouble();
		
		if (moneySent <= 500) {
			
			IO.outputDoubleAnswer(10.0);
		} else if (moneySent > 500 && moneySent < 5000) {
			
			double onePercent = moneySent*.01;
			if (onePercent>20) {
						IO.outputDoubleAnswer(onePercent);
			}else {
			IO.outputDoubleAnswer(20.0);
			}
		} else if (moneySent >= 5000 && moneySent < 10000){
			
			double twoPercent = moneySent*0.02;
			if (twoPercent>120) {
				
				IO.outputDoubleAnswer(twoPercent);
			}else {
				IO.outputDoubleAnswer(120.0);
			}
			
		}else {
			double firstTenThousand = 200;
			double subtractionOfTenAndFive = moneySent - 10000;
			double nextFiveThousand = (subtractionOfTenAndFive)*0.03;
			double remainderOverFifteen = moneySent - 15000;
			double overFiveThousand = (remainderOverFifteen)*0.04;
			double exactlyFifteen = 150;
				//remainder would be (moneySent - 15000)0.04
			
			if (moneySent == 10000) {
				IO.outputDoubleAnswer(firstTenThousand);
			}else if (moneySent > 10000 && moneySent <= 15000) {
				IO.outputDoubleAnswer(firstTenThousand + nextFiveThousand);
				
			}else {
				IO.outputDoubleAnswer(firstTenThousand + overFiveThousand + exactlyFifteen);
			}
		}
		
	}
}
