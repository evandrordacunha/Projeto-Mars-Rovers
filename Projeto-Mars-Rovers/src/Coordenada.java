
public enum Coordenadas {	
	Norte('N'),Sul('S'),Leste('L'),Oeste('O');
	private char coordenada;

	/**
	 * @param coordenada
	 */
	private Coordenadas(char coordenada) {
		this.coordenada = coordenada;
	}

	/**
	 * @return the coordenada
	 */
	public char getCoordenada() {
		return coordenada;
	}

}
