package GUIparaelnuv;
import javax.swing.*;
import java.awt.*;

public class JPLogin1 extends JPanel{
	
	public TextoLogin JTFLogin;
	public BotonLogin JBSiguiente;
	JLabel JLBInicio;
	
	JLabel JLBPregunta;
	public BotonLink JBCrear;
	
	
	public JPLogin1 (){
		configurarVentana();
		initComponents();
	}
	
	// M�todo para configurar el panel
	private void configurarVentana() {
		// TODO Auto-generated method stub
		FlowLayout fl=new FlowLayout(FlowLayout.CENTER);
		fl.setVgap(22);
		fl.setHgap(60);
		
		this.setPreferredSize(new Dimension(500,450));
		this.setBackground(Color.WHITE);
		
		this.setLayout(fl);
		
	}
	
	// M�todo para inicializar los componentes y agregarlos
	private void initComponents() {
		// TODO Auto-generated method stub
		
		JTFLogin = new TextoLogin(TextoLogin.LARGO,TextoLogin.TODOS,"Nombre de usuario, DNI o teléfono");
		JBSiguiente = new BotonLogin(BotonLogin.LARGO,"Siguiente");
				
		JLBInicio = new JLabel("Iniciar sesión");
		JLBInicio.setHorizontalAlignment(SwingConstants.CENTER);
		JLBInicio.setFont(new Font("Calibri Light",Font.PLAIN,44));
		JLBInicio.setForeground(Color.black);

		JPanel aux=new JPanel();
		aux.setBackground(Color.white);
		FlowLayout fl=new FlowLayout();
		fl.setHgap(0);
		aux.setLayout(fl);
		
		JLBPregunta=new JLabel("¿No tiene una cuenta?");
		JLBPregunta.setPreferredSize(new Dimension(200,30));
		JLBPregunta.setFont(new Font("Ebrima", Font.PLAIN,20));
		JLBPregunta.setForeground(Color.black);
		
		JLabel Separador=new JLabel("                                      ");
		Separador.setPreferredSize(new Dimension(200,30));
		Separador.setFont(new Font("Ebrima", Font.PLAIN,20));
		Separador.setBackground(Color.WHITE);
		Separador.setForeground(Color.BLACK);
		
		JBCrear= new BotonLink("Cree una.",80);
		
		aux.add(JLBPregunta);
		aux.add(JBCrear);
		
		
		this.add(JLBInicio);
		this.add(Separador);
		this.add(JTFLogin);
		this.add(JBSiguiente);
		this.add(aux);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame fram= new JFrame("Cato nuv");
		fram.setVisible(true);
		fram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fram.setLocation(50,50);
		fram.setContentPane(new JPLogin1());
		
		fram.pack();
	}

}
