/**
 * Viraj Nimmagadda, CSE 360 Monday, Assignment1
 * This class has is a basic calculator that can add and subtract, clear and show the answer.
 * It has 5 methods that 
*/

package cse360assign2;

public class AddingMachine {
	private int total;
	private String history;
	
	/**
	 * this is the constructor method used to create a new object.
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * this method returns the total variable when called.
	 * @return
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * this method will add to the current total and add to the history string.
	 * @param value is the value that will be added to the total.
	 */
	public void add (int value) {
		total += value;
		history += "+ " + value;
	}
	
	/**
	 * this method will subtract from the current total and add to the history string.
	 * @param value is the value that will be subtracted.
	 */
	public void subtract (int value) {
		total -= value;
		
		history += "- " + value;
	}
		
	/**
	 * this method will return a string or all the calculations until the clear method is used.
	 */
	public String toString () {
		return "0 "+ history;
	}


	/**
	 * this method will clear the history.
	 */
	public void clear() {
		history = "";
	}
}
