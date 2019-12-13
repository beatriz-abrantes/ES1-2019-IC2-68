package softeng;

// TODO: Auto-generated Javadoc
/**
 * The Class Registo.
 */
public class Registo {

	/** The integer. */
	private int integer;
	
	/** The bool. */
	private boolean bool;
	
	/**
	 * Instantiates a new registo.
	 *
	 * @param integer the integer
	 * @param bool the bool
	 */
	public Registo(int integer, boolean bool) {
		this.integer=integer; 
		this.bool=bool;
	}

	/**
	 * Gets the integer.
	 *
	 * @return the integer
	 */
	public int getInteger() {
		return integer;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Registo [integer=" + integer + ", bool=" + bool + "]";
	}

	/**
	 * Checks if is bool.
	 *
	 * @return true, if is bool
	 */
	public boolean isBool() {
		return bool;
	}


	/**
	 * Sets the bool.
	 *
	 * @param bool the new bool
	 */
	public void setBool(boolean bool) { 
		this.bool = bool;
	}
	 
	
	
}
