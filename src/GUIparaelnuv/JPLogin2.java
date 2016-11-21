package GUIparaelnuv;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.*;

public class JPLogin2 extends JPanel{
	Color color1=new Color(1,85,106);
        Color color2=new Color(1,149,174);
        Color color3=new Color(133,200,222);
        Color color4=new Color(177,218,234);
        Color color5=new Color(218,229,234);
	JLabel JLBEscribe;
	public BotonLogin JBAtras;
	public BotonLogin JBIniciar;
	public TextoContra JPFContra;
	
	public JPLogin2(){
		configurarVentana();
		initComponents();
	}
	
	private void configurarVentana() {
		// TODO Auto-generated method stub
		FlowLayout fl=new FlowLayout(FlowLayout.CENTER);
		fl.setVgap(22);
		this.setPreferredSize(new Dimension(500,450));
		this.setBackground(Color.white);
		
		this.setLayout(fl);
		
	}
	
	private void initComponents(){
		
		JLBEscribe = new JLabel("Escribir contraseña");
		JLBEscribe.setHorizontalAlignment(SwingConstants.CENTER);
		JLBEscribe.setFont(new Font("Calibri Light",Font.PLAIN,44));
		
		JLBEscribe.setForeground(Color.black);
		
		JPFContra=new TextoContra(TextoContra.LARGO);
		
		JPanel p=new JPanel();
		p.setBackground(Color.white);
		JBAtras=new BotonLogin(BotonLogin.NORMAL,"Atrás",new Color(204,204,204), new Color(123,123,123));
                JBAtras.setForeground(Color.BLACK);
		JBIniciar=new BotonLogin(BotonLogin.NORMAL, "Iniciar sesión");
		p.add(JBAtras);
		p.add(JBIniciar);
		
		JLabel Separador=new JLabel("                                      ");
		Separador.setPreferredSize(new Dimension(200,30));
		Separador.setFont(new Font("Ebrima", Font.PLAIN,20));
		Separador.setBackground(Color.WHITE);
		Separador.setForeground(Color.BLACK);
		
		this.add(JLBEscribe);
		this.add(Separador);
		this.add(JPFContra);
		this.add(p);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame fram= new JFrame();
		fram.setVisible(true);
		fram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fram.setLocation(50,50);
		fram.setContentPane(new JPLogin2());
		fram.pack();
	}

}
