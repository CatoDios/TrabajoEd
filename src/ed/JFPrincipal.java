package ed;

import GUIparaelnuv.PanelInicio;
import GUIparaelnuv.PanelRegistrar;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.*;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFPrincipal extends JFrame {
        
    
        CardLayout cl=new CardLayout();
        PanelInicio JPLogin;
        PanelRegistrar JPRegistrarse;
        
                
	JFPrincipal (){
		super("Tienda Virtual");
		configurarVentana();
                initComponents();
                AsignarEventos();
                
	}

	private void initComponents() {
            
            JPLogin= new PanelInicio();
            this.add(JPLogin);
            
            JPRegistrarse=new PanelRegistrar();
            this.add(JPRegistrarse);
            
            
            
            cl.addLayoutComponent(JPLogin, "CartaInicio");
            cl.addLayoutComponent(JPRegistrarse, "CartaRegistro");
    
            this.setLayout(cl);
            cl.show(this.getContentPane(), "CartaInicio");        
            
	}
        
        public void AsignarEventos(){
            
            JPLogin.P1.JBSiguiente.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                   JPLogin.cl.show(JPLogin.Pan, "P2");
                }
                
            });
            
            
		
	}

	private void configurarVentana() {
		// TODO Auto-generated method stub
		this.setLayout(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setAlwaysOnTop(false);
		this.setResizable(false);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.getContentPane().setBackground(Color.WHITE);
	}
        
        
        
        
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
                /*try{
  
                        JFrame.setDefaultLookAndFeelDecorated(true);
                        //JDialog.setDefaultLookAndFeelDecorated(true);
                        UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
                        //UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
                        //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                        //UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
                      }
                      catch (Exception e)
                       {
                        e.printStackTrace();
                       }
                System.out.print("Estilo cambiado...\n");*/
		new JFPrincipal();
	}
}
