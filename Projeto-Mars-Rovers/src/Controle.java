/*
Para controlar a sonda, a NASA envia uma string de letras. 
As letras poss�veis s�o L,R e M. As letras L e R fazem a sonda 
virar 90 graus para esquerda e direita respectivamente sem se mover. 
A letra M faz a sonda se mover para frente um quadro na grid sem mudar 
sua dire��o.
Assuma que o quadro diretamente ao norte de (x, y) � (x, y+1).*/
public class Controle {

	public Controle() {
		super();
		// TODO Auto-generated constructor stub
	}

	/*
	 * Rastreia a coordenada de onde se encontra a sonda retornando sua
	 * localiza��o.
	 */
	public String rastrear(MarsRovers sonda) {
		String localizacao = sonda.getPontoX() + " " + sonda.getPontoY() + " " + sonda.getCoordenada();
		return localizacao;
	}

	/*
	 * Atrav�s do m�todo controlar conseguimos direcionar as coordenadas
	 * geograficas de onde a sonda deve se mover (Norte/Sul/Leste/Oeste)
	 */
	public void controlar(MarsRovers sonda) {
		if (sonda.getCoordenada() == Coordenadas.Norte.getCoordenada()) {
			int posicao = sonda.getPontoY();
			sonda.setPontoY(posicao++);
		}
		if (sonda.getCoordenada() == Coordenadas.Sul.getCoordenada()) {
			int posicao = sonda.getPontoY();
			sonda.setPontoY(posicao--);
		}
		if (sonda.getCoordenada() == Coordenadas.Leste.getCoordenada()) {
			int posicao = sonda.getPontoX();
			sonda.setPontoY(posicao++);
		}
		if (sonda.getCoordenada() == Coordenadas.Oeste.getCoordenada()) {
			int posicao = sonda.getPontoX();
			sonda.setPontoY(posicao--);
		}
	}

	public void virar(char comando, MarsRovers sonda) {
		// Verifica se � v�lido o comando informado
		if (comando != 'L' || comando != 'R' || comando != 'M') {
			try {
				throw new Exception();
			} catch (Exception e) {
				System.out.println("Comando n�o encontrado! " + e.getMessage());
			}
		}

		if (sonda.getCoordenada() == Coordenadas.Norte.getCoordenada()
				|| sonda.getCoordenada() == Coordenadas.Sul.getCoordenada()
				|| sonda.getCoordenada() == Coordenadas.Leste.getCoordenada()
				|| sonda.getCoordenada() == Coordenadas.Oeste.getCoordenada()) {
			if (comando == 'L') {
				sonda.setCoordenada(Coordenadas.Oeste.getCoordenada());
			}
			if (comando == 'R') {
				sonda.setCoordenada(Coordenadas.Leste.getCoordenada());
			}
		}
	}
}
