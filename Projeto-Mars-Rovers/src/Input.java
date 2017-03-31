
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.xml.transform.Source;

public class Aplicacao {
	
	public static void main(String[] args) {
		ler();
	}

	private static void ler() {
		 
		
		try {
			BufferedReader buff = new BufferedReader(new FileReader("arquivo.txt"));
			String line = null;
			try {
				line = buff.readLine();
				String[] dados;
				Sonda sonda = new Sonda();
				while (line != null) {
					dados = line.split(" ");
					line = buff.readLine();
					int x = Integer.parseInt(dados[0]);
					int y = Integer.parseInt(dados[1]);
					char c = dados[2].charAt(0);
					System.out.println("Dados Pos: " +x +" "+y +" "+ c);
					Coordenada coordenada = new Coordenada(x, y, c);
					sonda.setCoordenada(coordenada);
					sonda.locomover(coordenada);
					System.out.println(sonda +"\n");
					System.out.println(sonda.toString());
				}
			} finally {
				buff.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}