
public class Sonda {

	private int pontoX, pontoY,id;
	private char pontoC;
	private int novoPontoX,novoPontoY = 0;
	
	/**
	 * @param pontoX
	 *            - determina deslocamento para esquerda ou direita
	 * @param pontoY
	 *            - determina deslocamento para frente ou para atrás
	 * @param coordenada
	 *            - determina a cordenada (Norte/Sul/Leste/Oeste)
	 */
	public Sonda(int id,Coordenada c) {
		this.pontoX = c.getAcumX();
		this.pontoY = c.getAcumY();
		this.pontoC = c.getPontoC();
		this.id = id;

	}
	public Sonda(int id) {
		this.pontoX = 0;
		this.pontoY = 0;
		this.pontoC = '0';
		this.id = id;
	}
	
	/*Método utilizado para rastreio da sonda*/
	public Coordenada getCoordenada(Sonda s){
		return s.getCoordenada(s);
	}
	public void setCoordenada(Coordenada c){
		this.pontoX = c.getAcumX();
		this.pontoY = c.getAcumY();
		this.pontoC = c.getPontoC();
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId() {
		this.id = id;
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
		//soma apenas no Y fazendo a nave andar reta e para frente
		if(c.getPontoC() == 'M'){
			Coordenada novaCoordenada = new Coordenada(c.getAcumX(),c.getAcumY()+1,c.getPontoC());
			setCoordenada(novaCoordenada);
		}
		
		 if(c.getPontoC() == 'L'){
			int valor = c.getAcumX() - c.getValorAtualX();
			System.out.println("L = "+valor +"acum x "+c.getAcumX() +"acum y "+ c.getAcumY());
			Coordenada novaCoordenada = new Coordenada(valor,c.getAcumY(),c.getPontoC());
			setCoordenada(novaCoordenada);
		}
		if(c.getPontoC() == 'R'){
		    novoPontoX = c.getAcumX();
			Coordenada novaCoordenada = new Coordenada(c.getAcumX()+c.getValorAtualX(),c.getAcumY(), c.getPontoC());
			setCoordenada(novaCoordenada);
		}	
	}

	 
	public String rastrear(Coordenada c) {
		String s = "Mars Rovers Localizada nas coordenadas : "+"(" +c.getAcumX() +" "+c.getAcumY() +" "+pontoC +")";
		return s;
	}
	
}
