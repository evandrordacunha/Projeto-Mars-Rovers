import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class Interface extends JFrame{
	
	ImageIcon fundo = new ImageIcon(getClass().getResource("marte.jpg"));
	ImageIcon imgSonda = new ImageIcon(getClass().getResource("sonda.png"));
	JLabel planofundo = new JLabel(fundo);
	JLabel imagemSonda = new JLabel(imgSonda);
	public static void main(String[] args) {
		new Interface();
	}
	
	public Interface(){
		
		super( "Projeto Mars Rovers -> #Missão Marte - By Evandro Rocha da Cunha" );
		 setSize(1260,679);
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
		 setLocationRelativeTo(null);
		 setVisible(true);
		 planofundo.setFont(new Font("Arial",Font.LAYOUT_LEFT_TO_RIGHT,86));
		 add(planofundo);
		 
		 Panel painel =new Panel();
		 painel.setLayout(new BorderLayout());
		 add(painel);
		 painel.add(imagemSonda);

	}
	/*Criando o painel e setando o plano de fundo*/
	public class Panel extends JPanel{
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			Image objFundo = fundo.getImage();
			g.drawImage(objFundo,0,0,this);
		}
	}

 


}
