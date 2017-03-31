
public class Coordenada {	
	 private int pontoX, pontoY,valorAtualY,valorAtualX;
	 private char pontoC;
	
	/* Construtor recebendo todos valores de X e Y além dos valores ACUMULADOS para usar
	 durante a soma e subtração dos pontos*/
    public   Coordenada (int x, int valorAtualX, int y, int valorAtualY, char c) {
    	this.pontoX = x;
    	this.pontoY = y;
    	this.pontoC = c;
    	this.valorAtualY = valorAtualY;
    	this.valorAtualX = valorAtualX;
    	
    }
/*    Sobrecarga de construtor para criar objeto já com as coordenadas 
    definidas e prontas para serem impressas.*/
    public   Coordenada (int x,  int y, char c) {
    	this.pontoX = x;
    	this.pontoY = y;
    	this.pontoC = c;
    	
    }
	/**
	 * @return the pontoX
	 */
	public int getAcumX() {
		return pontoX;
	}
	/**
	 * @param pontoX the pontoX to set
	 */
	public void setAcumX(int pontoX) {
		this.pontoX = pontoX;
	}

	/**
	 * @return the pontoY
	 */
	public int getAcumY() {
		return pontoY;
	}

	/**
	 * @param pontoY the pontoY to set
	 */
	public void setAcumY(int pontoY) {
		this.pontoY = pontoY;
	}

	/**
	 * @return the pontoC
	 */
	public char getPontoC() {
		return pontoC;
	}
	

	/**
	 * @return the valorAtualY
	 */
	public int getValorAtualY() {
		return valorAtualY;
	}
	/**
	 * @param valorAtualY the valorAtualY to set
	 */
	public void setValorAtualY(int valorAtualY) {
		this.valorAtualY = valorAtualY;
	}
	/**
	 * @return the valorAtualX
	 */
	public int getValorAtualX() {
		return valorAtualX;
	}
	/**
	 * @param valorAtualX the valorAtualX to set
	 */
	public void setValorAtualX(int valorAtualX) {
		this.valorAtualX = valorAtualX;
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
		String s = " ( "+getAcumX() +" "+getAcumY()+" "+getPontoC() +" ) ";
		return s;
	}
 
    
    
}
