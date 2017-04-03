
public class Sonda {
	private Localizacao localizacaoAtual;
	private Planalto planalto;
	private String comando;
	
	  public enum Direcao{
		  N,S,L,O
		}
	    Direcao direcao;
	
	public Sonda (Planalto p, int pX, int pY, Direcao d, String com) {
        this.planalto = p;
        this.direcao=d;
        this.localizacaoAtual=new Localizacao(pX, pY);
        this.comando = com;
    }
	
	 public Sonda(){
		 
	 }
	public Direcao setDirecao(Direcao d, char comando) {
		if (comando == 'L') {
			switch (d) {
			case N:
				d = Direcao.O;
				break;
			case O:
				d = Direcao.S;
				break;
			case S:
				d = Direcao.L;
				break;
			case L:
				d = Direcao.N;
				break;
			}
		}
        else if(comando=='R'){
            switch (d) {
                case N:d = Direcao.L;
                    break;
                case O:d = Direcao.N;
                    break;
                case S:d = Direcao.O;
                    break;
                case L:d = Direcao.S;
                    break;
            }
        }
        return d;
	}
	    private void processarComando() {
	        int i = 0;
	        while (i < comando.length()) {
	            char com = comando.charAt(i++); 
	            if (com == 'M') {
	                Localizacao proximaLocalidade = planalto.proximo(direcao, localizacaoAtual);            
	                if (proximaLocalidade != null)
	                	localizacaoAtual = proximaLocalidade;
	                else
	                    System.out.println("This move is not possible. Going to next Instruction");
	            }
	            if (com == 'L' || com == 'R') {
	            direcao = setDirecao(direcao, com);
	            }
	        }
	    }
	    public String rastrear(){
	    String s = 
	    "Localização "
	    +"(" +localizacaoAtual.pontoX 
	    +" "
	    +"+localizacaoAtual.pontoy)"
	    +" "
	    +direcao;
	    return s;
	    }
	    
	}
