package exceptions;

public class NegativeNumberException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private double weight;
	public NegativeNumberException(double w) {
		super("The number introduced can't be negative");
		weight = w;
	}
	
	public double getWeight() {
		return weight;
	}
	
}
