/*
* Converts Gallons to Liters in a Table Format
* Author: Kurtis Kubal
*/
public class GalToLitTable {

	public static void main(String[] args) {
	
		double gallons, liters;
		int counter;

		counter = 0;
		for(gallons = 1; gallons <= 100; gallons++ ) { //loop that will increment gallons till it is equal to 100
				liters = gallons * 3.7854;
				System.out.println(gallons + " gallons is " + liters + " liters.");

				counter++;
				if(counter == 10){
					System.out.println(); //creates empty line
					counter = 0; //resets counter for new line break
				}	
			}	
	}
}
