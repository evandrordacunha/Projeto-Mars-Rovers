
public class Sonda {

	private int pontoX, pontoY;
	private char pontoC;
	/**
	 * @param pontoX
	 *            - determina deslocamento para esquerda ou direita
	 * @param pontoY
	 *            - determina deslocamento para frente ou para atrás
	 * @param coordenada
	 *            - determina a cordenada (Norte/Sul/Leste/Oeste)
	 */
	public Sonda(Coordenada c) {
		this.pontoX = c.getPontoX();
		this.pontoY = c.getPontoY();
		this.pontoC = c.getPontoC();
	}
	public Sonda() {
		this.pontoX = 0;
		this.pontoY = 0;
		this.pontoC = '0';
	}
	
	/*Método utilizado para rastreio da sonda*/
	public String getCoordenada(){
		Coordenada c = new Coordenada(pontoX, pontoY, pontoC);
		return c.toString();
	}
	public void setCoordenada(Coordenada c){
		this.pontoX = c.getPontoX();
		this.pontoY = c.getPontoY();
		this.pontoC = c.getPontoC();
	}
	
	public void locomover(Coordenada c){
		try {
			if(c.getPontoC() != 'M'
			||c.getPontoC() != 'L'
			||c.getPontoC()!= 'R'
			){		
		}
		} catch (IllegalArgumentException e) {
			System.out.println("Coordenada inválida " +e.getMessage());
		}
		if(c.getPontoC() == 'M'){
			int novoPonto = c.getPontoY();
			System.out.println("Novo ponto "+novoPonto);
			Coordenada novaCoordenada = new Coordenada(pontoX, (pontoY+novoPonto), pontoC);
			setCoordenada(novaCoordenada);
		}
		else if(c.getPontoC() == 'L'){
			int novoPonto = c.getPontoX();
			System.out.println("Novo ponto "+novoPonto);
			Coordenada novaCoordenada = new Coordenada((pontoX-novoPonto), pontoY, pontoC);
			setCoordenada(novaCoordenada);
		}
		else if(c.getPontoC() == 'R'){
			int novoPonto = c.getPontoX();
			System.out.println("Novo ponto "+novoPonto);
			Coordenada novaCoordenada = new Coordenada((pontoX+novoPonto), pontoY, pontoC);
			setCoordenada(novaCoordenada);
		}
		
	}

	@Override
	public String toString() {
		String s = "Mars Rovers Localizada nas coordenadas : " +" ( " +pontoX +" "+pontoY +" "+pontoC +" ) ";
		return s;
	}
	
}
