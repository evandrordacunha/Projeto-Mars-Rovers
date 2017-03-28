import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class LeitorCordenadas {
	
	
	
public void ler(File arquivo){
	   String linha = "";

	    FileReader arq = null;
		try {
			arq = new FileReader(arquivo);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	    //armazenando conteudo no arquivo no buffer
	    BufferedReader lerArq = new BufferedReader(arq);
	    //lendo a primeira linha
	    //String linha = lerArq.readLine();
	    //a variavel linha recebe o valor 'null' quando chegar no final do arquivo
	    while (linha != null){
	        System.out.printf("%s\n",linha);
	        //lendo a segundo até a última
	        try {
				linha = lerArq.readLine();
			} catch (IOException e) {
				System.out.println("Linha não pode ser lida! "+e.getMessage());
				e.printStackTrace();
			}

	    }
	    try {
			arq.close();
		} catch (IOException e) {
			 System.out.println("Arquivo não pode ser fechado! "+e.getMessage());
			e.printStackTrace();
		}

	}
	    
}

 
