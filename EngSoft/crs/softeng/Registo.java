package softeng;

public class Registo {

	private int integer;
	private boolean bool;
	
	public Registo(int integer, boolean bool) {
		this.integer=integer;
		this.bool=bool;
	}

	public int getInteger() {
		return integer;
	}

	@Override
	public String toString() {
		return "Registo [integer=" + integer + ", bool=" + bool + "]";
	}

	public boolean isBool() {
		return bool;
	}


	public void setBool(boolean bool) {
		this.bool = bool;
	}
	 
	
	
}
