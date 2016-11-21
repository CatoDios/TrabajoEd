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
import javax.swing.*;

/**
 *
 * @author Billy
 */
public class JPReg2 extends JPanel{
    
    public JLabel Label2;
    public TextoLogin JTFUsuario;
    public TextoContra JPFContra;
    public TextoLogin JTFRuta;
    public BotonLogin JBAbrir;
    public  BotonLogin JBGuardar;
    public BotonLogin JBAtras;
    
    JLabel JLBFoto;
    
    public JPReg2(){
        configurarVentana();
        initComponents();
        
    }
    

    private void initComponents() {
        Label2 = new JLabel("Datos de acceso");
	Label2.setHorizontalAlignment(SwingConstants.CENTER);
	Label2.setFont(new Font("Calibri Light",Font.PLAIN,44));
	Label2.setForeground(Color.BLACK);
        
        JTFUsuario= new TextoLogin(TextoLogin.CORTO,TextoLogin.TODOS,"Nombre de Usuario");
        JPFContra = new TextoContra(TextoContra.CORTO);
        
        JTFRuta = new TextoLogin(TextoLogin.LARGO,TextoLogin.TODOS,"");
        JTFRuta.setPreferredSize(new Dimension(350,40));
        JBAbrir = new BotonLogin(BotonLogin.NORMAL,"Abrir");
        JBAbrir.setPreferredSize(new Dimension(80,40));
        
        JBGuardar = new BotonLogin(BotonLogin.NORMAL,"Registrar");
        JBGuardar.setSize(136,40);
        
        JBAtras=new BotonLogin(BotonLogin.NORMAL,"Atrás",new Color(204,204,204), new Color(123,123,123));
        JBAtras.setForeground(Color.BLACK);
        JBAtras.setSize(136,40);
        
        JLBFoto = new JLabel();
        JLBFoto.setSize(294,230);
        
        JPanel aux = new JPanel();
        aux.setPreferredSize(new Dimension(440,240));
        aux.setLayout(null);
        
        aux.add(JLBFoto);
        aux.add(JBGuardar);
        aux.add(JBAtras);
        aux.setBackground(Color.WHITE);
        
        JLBFoto.setLocation(0,0);
        JBGuardar.setLocation(304,80);
        JBAtras.setLocation(304,130);
        
        
        this.add(Label2);
        this.add(JTFUsuario);
        this.add(JPFContra);
        this.add(JTFRuta);
        this.add(JBAbrir);
        this.add(aux);
        
        
    
    
    }
    
    private void configurarVentana() {
	// TODO Auto-generated method stub
	FlowLayout fl=new FlowLayout(FlowLayout.CENTER);
	fl.setVgap(14);
	//fl.setHgap(60);
        fl.setHgap(12);
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
		fram.setContentPane(new JPReg2());
		
		fram.pack();
	}    
}
