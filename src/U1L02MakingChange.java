import javax.swing.JOptionPane;

public class U1L02MakingChange {

	public static void main(String[] args) {
		
		//using a loop
		
		// define variables for the amounts for each coin
		int nickels = 0;
		int pennies = 0;
		int dimes = 0;
		int quarters = 0;
		int dollars = 0; 
		// Get input from user (change to usable  value)
		String answer = JOptionPane.showInputDialog("Ener a"
				+ " monitary value (ex: 1.56)");
		double cash = Double.parseDouble(answer);
		pennies = (int)(cash * 100);
		//System.out.println(pennies);
	
		// loop subtracting coin amount until money < coin amount 
		
		//count dollars 
		dollars = (int)(pennies/100);
		pennies = pennies % 100;
		
		// count quarters
		quarters = (int)(pennies/25);
		pennies = pennies % 25;
		
		// count dimes
		dimes = (int)(pennies/10);
		pennies = pennies % 10;

		// count nickels
		nickels = (int)(pennies/5);
		pennies = pennies % 5;
		
		//pennies = money * 100 < don't need this b/c 
		//converted to an integer vale 
	
		
		// print money 
		JOptionPane.showMessageDialog(null,"$" + cash + " is "
				+ dollars + " dollars "
				+ quarters + " quarters "
				+ dimes + " dimes, "
				+ nickels + " nickels and "
				+ pennies + " pennies.") ;
		
	}

}
