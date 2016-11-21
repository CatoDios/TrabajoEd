/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIparaelnuv;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import javax.swing.*;

/**
 *
 * @author Billy
 */
public class JPReg1 extends JPanel{
   
    
     
    JLabel Label1;
    public TextoLogin JTFNombre;
    public TextoLogin JTFApellidos;
    public TextoLogin JTFDni;
    public TextoLogin JTFUsuario;
    public TextoLogin JTFCorreo;
    public TextoLogin JTFTelefono;
    public BotonLogin JBTSiguiente;
    
    public JComboBox JCBCorreo;
    
    public JPReg1(){
        configurarVentana();
        initComponents();
    } 
    
    
    public void initComponents(){
        Label1 = new JLabel("Datos personales");
	Label1.setHorizontalAlignment(SwingConstants.CENTER);
	Label1.setFont(new Font("Calibri Light",Font.PLAIN,44));
	Label1.setForeground(Color.BLACK);
        
        this.add(Label1);
        
        JTFNombre=new TextoLogin(TextoLogin.CORTO,TextoLogin.SOLO_LETRAS,"Nombres");
        JTFApellidos = new TextoLogin(TextoLogin.CORTO,TextoLogin.SOLO_LETRAS,"Apellidos");
        JTFDni = new TextoLogin(TextoLogin.CORTO,TextoLogin.SOLO_NUMEROS,"Ingrese su DNI");
        JTFTelefono=new TextoLogin(TextoLogin.CORTO,TextoLogin.SOLO_NUMEROS,"Teléfono o celular");
        JTFCorreo= new TextoLogin(TextoLogin.CORTO,TextoLogin.TODOS,"Ingrese su correo");
        
        String[]correos={"@gmail.com","@hotmail.com","@outlook.com","@yahoo.com","@unmsm.edu.pe"};
        JCBCorreo=new JComboBox(correos);
	JCBCorreo.setFont(new Font("Ebrima",Font.PLAIN,21));
	JCBCorreo.setPreferredSize(new Dimension(216,40));
        JCBCorreo.setBackground(Color.WHITE);
	JCBCorreo.setFocusable(true);
        
        JBTSiguiente = new BotonLogin(BotonLogin.LARGO,"Siguiente");
        
        this.add(JTFNombre);
        this.add(JTFApellidos);
        this.add(JTFDni);
        this.add(JTFTelefono);
        this.add(JTFCorreo);
        this.add(JCBCorreo);
        this.add(JBTSiguiente);
    }
    
    private void configurarVentana() {
		// TODO Auto-generated method stub
		FlowLayout fl=new FlowLayout(FlowLayout.CENTER);
		fl.setVgap(22);
		//fl.setHgap(60);
                fl.setHgap(17);
		
		this.setPreferredSize(new Dimension(500,450));
		this.setBackground(Color.WHITE);
		
		this.setLayout(fl);
		
    }
   
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame fram= new JFrame("Cato nuv");
		fram.setVisible(true);
		fram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fram.setLocation(50,50);
		fram.setContentPane(new JPReg1());
		
		fram.pack();
	}
    
    
}
