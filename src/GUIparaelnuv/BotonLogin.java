package GUIparaelnuv;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class BotonLogin extends JButton implements FocusListener{
	
	public static int NORMAL =1;
	public static int LARGO =2;
	
	Color Normal=new Color(0,120,215);
	Color EnFoco=new Color(0,78,140);
	
	Border BordeNormal, BordeFoco;
	
	// Constructor : Modo (largo o normal) +  texto
	public BotonLogin(int Modo,String Texto){
		initComponents();
		configurarBoton(Modo,Texto);
		asignarEventos();
	}
	
	// Constructor : Modo (largo o normal) + texto + Color 1 + Color 2
	public BotonLogin(int Modo,String Texto, Color ColorNormal, Color ColorFoco){
		Normal=ColorNormal;
		EnFoco=ColorFoco;
		initComponents();
		configurarBoton(Modo,Texto);
		asignarEventos();
	}
	
	
	private void configurarBoton(int Modo,String Texto){
		if(Modo==2){ // LARGO
			this.setPreferredSize(new Dimension(439,39));
			this.setForeground(Color.white);
		}
		if(Modo==1){ // NORMAL
			this.setPreferredSize(new Dimension(216,39));
			this.setForeground(Color.white);
			
		}
		this.setText(Texto);
		this.setBorder(BordeNormal);
		
		this.setBackground(Normal);
		this.setFont(new Font("Ebrima",Font.PLAIN,20));
		this.setFocusPainted(false);
		
	}

	private void asignarEventos() {
		// TODO Auto-generated method stub
		
		this.addMouseListener(new MouseAdapter(){
			
			public void mouseEntered(MouseEvent e){
				setCursor(new Cursor(Cursor.HAND_CURSOR));
				setBorder(BordeFoco);
			}
			public void mouseExited(MouseEvent e){
				setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				setBorder(BordeNormal);
			}
		});
		
		this.addFocusListener(this);
		
		
	}

	private void initComponents() {
		// TODO Auto-generated method stub
		
		
		BordeNormal=BorderFactory.createMatteBorder(2, 2, 2, 2,Normal);
		BordeFoco=BorderFactory.createMatteBorder(2, 2, 2, 2, EnFoco);
	}

	@Override
	public void focusGained(FocusEvent arg0) {
		// TODO Auto-generated method stub
		setBorder(BordeFoco);
	}

	@Override
	public void focusLost(FocusEvent arg0) {
		// TODO Auto-generated method stub
		setBorder(BordeNormal);
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame fram= new JFrame();
		fram.setVisible(true);
		fram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fram.setLocation(50,50);
		JPanel p=new JPanel();
		p.add(new BotonLogin(BotonLogin.NORMAL,"Atr�s",new Color(204,204,204), new Color(123,123,123)));
		p.add(new BotonLogin(BotonLogin.NORMAL, "Iniciar sesi�n"));
		fram.setContentPane(p);
		
		fram.pack();
		
	}
}
