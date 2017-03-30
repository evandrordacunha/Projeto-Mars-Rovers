
public class Coordenada {	
	 private int pontoX, pontoY;
	 private char pontoC;
	
    public   Coordenada (int x, int y, char c) {
    	this.pontoX = x;
    	this.pontoY = y;
    	this.pontoC = c;
    }
	/**
	 * @return the pontoX
	 */
	public int getPontoX() {
		return pontoX;
	}
	/**
	 * @param pontoX the pontoX to set
	 */
	public void setPontoX(int pontoX) {
		this.pontoX = pontoX;
	}

	/**
	 * @return the pontoY
	 */
	public int getPontoY() {
		return pontoY;
	}

	/**
	 * @param pontoY the pontoY to set
	 */
	public void setPontoY(int pontoY) {
		this.pontoY = pontoY;
	}

	/**
	 * @return the pontoC
	 */
	public char getPontoC() {
		return pontoC;
	}

	/**
	 * @param pontoC the pontoC to set
	 */
	public void setPontoC(char pontoC) {
		this.pontoC = pontoC;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String s = " ( "+getPontoX() +" "+getPontoY()+" "+getPontoC() +" ) ";
		return s;
	}
 
    
    
}
