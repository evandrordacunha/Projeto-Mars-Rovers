
public class MarsRovers {

	private int pontoX, pontoY;
	private char coordenada;
	/**
	 * @param pontoX
	 *            - determina deslocamento para esquerda ou direita
	 * @param pontoY
	 *            - determina deslocamento para frente ou para atrás
	 * @param coordenada
	 *            - determina a cordenada (Norte/Sul/Leste/Oeste)
	 */
	public MarsRovers(int pontoX, int pontoY, char coordenada) {
		this.pontoX = pontoX;
		this.pontoY = pontoY;
		this.coordenada = coordenada;
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
	 * @return the coordenada
	 */
	public char getCoordenada() {
		return coordenada;
	}
	/**
	 * @param coordenada the coordenada to set
	 */
	public void setCoordenada(char coordenada) {
		this.coordenada = coordenada;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String s = "Localização: " +getPontoX() +","
					+""+getPontoY() +","
					+""+getCoordenada();
		return s;
	}
	
}
