
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;
import javax.swing.text.html.HTMLDocument.Iterator;
import javax.xml.transform.Source;

public class Input {
	
	static Direcao dir;
	static Planalto p;
	Sonda s;
	 
	
	
	public static void main(String[] args) {
		//ler();
	}

	
	/*
	private static void ler() {
		char com;
		p = new Planalto(10);
		 Map<Character,Integer> map = new HashMap<Character,Integer>();
		try {
			BufferedReader buff = new BufferedReader(new FileReader("arquivo.txt"));
			 StringBuffer string = new StringBuffer();
			String line = null;
			
				line = buff.readLine();
				String[] dados;
				
				while (line != null) {
					dados = line.split(" ");
					line = buff.readLine();
					 string.append(line);
				}
				  for (int i = 0; i < string.length(); i++)
			            if (map.get(string.charAt(i)) == null)
			                map.put(string.charAt(i), 1);
			            else
			                map.put(string.charAt(i), map.get(string.charAt(i)) + 1);
			        // Imprime a quantidade de Cada letra
			        Object[] a = map.keySet().toArray();
			        Iterator i =  (Iterator) map.values().iterator();
			        int totalCaracteres = 0;
			        for (int j = 0; j < a.length; j++) {
			           totalCaracteres++;
			        }
			        
			        for(int k = 0; k <totalCaracteres;k++){
			        	 com = dados[k].charAt(0);
			        	
			        }
			       // Sonda sonda  = new Sonda(p, 0, 0, dir, com);
					
					
		

	}
	
	
	private static void verificarInstrucao(Sonda s){
		
	}
	*/
}