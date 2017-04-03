
public class Planalto {

	private int tamanho;

	public Planalto(int tamanho) {
		this.tamanho = tamanho;
	}

	public Localizacao proximo(Sonda.Direcao direcao, Localizacao ponto) {

		Localizacao prox = null;
		switch (direcao) {
		case N:
			prox = new Localizacao(ponto.pontoX, ponto.pontoy + 1);
			break;
		case O:
			prox = new Localizacao(ponto.pontoX - 1, ponto.pontoy);
			break;
		case S:
			prox = new Localizacao(ponto.pontoX, ponto.pontoy - 1);
			break;
		case L:
			prox = new Localizacao(ponto.pontoX + 1, ponto.pontoy);
			break;
		}
		if ((prox.pontoX >= 0) 
				&& (prox.pontoy >= 0) 
				&& (prox.pontoX < tamanho) 
				&& (prox.pontoy < tamanho))
			return prox;
		return null;
	}
}
