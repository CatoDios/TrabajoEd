package GUIparaelnuv;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.font.TextAttribute;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class BotonLink extends JButton {
	String texto;
	Color ColorLetra;
        Color color1=new Color(1,85,106);
        Color color2=new Color(1,149,174);
        Color color3=new Color(133,200,222);
        Color color4=new Color(177,218,234);
        Color color5=new Color(218,229,234);
	public BotonLink(String texto, int ancho){
		
		this.texto=texto;
		/*this.setFont(new Font("Ebrima",Font.PLAIN,20));
		this.setBackground(Color.WHITE);
		this.setHorizontalTextPosition(SwingConstants.LEFT);
		this.setFocusPainted(false);
		this.setText(texto);
		this.setForeground(new Color(0,120,215));*/
		ColorLetra=new Color(0,120,215);
		this.setPreferredSize(new Dimension(ancho,20));
		this.setBorderPainted(false);
		this.addMouseListener(new MouseAdapter(){
			public void mouseEntered(MouseEvent e){
				setCursor(new Cursor(Cursor.HAND_CURSOR));
				
				
			}
			public void mouseExited(MouseEvent e){
				setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			
			public void mousePressed(MouseEvent e){
			}
			
			public void mouseReleased(MouseEvent e){
			}
			
		});
		
	}
	
	public void paintComponent(Graphics g){
		
		g.setColor(Color.white);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		g.setColor(ColorLetra);
		g.setFont(new Font("Ebrima",Font.PLAIN,20));
		g.drawString(texto,0, 19);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame fram= new JFrame();
		fram.setVisible(true);
		fram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fram.setLocation(200,150);
		JPanel Panel=new JPanel();
		
		BotonLink c=new BotonLink("�No tiene una cuenta?",200);
		BotonLink b=new BotonLink("Cree una.",90);
		
		
		Panel.add(c);
		
		Panel.add(b);
		
		fram.setContentPane(Panel);
		fram.pack();
	}

}
