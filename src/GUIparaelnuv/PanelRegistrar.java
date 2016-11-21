/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIparaelnuv;


import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javafx.stage.FileChooser;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Billy
 */
public class PanelRegistrar extends JPanel implements ActionListener{
	
	JPanel Pan;
	public JPReg1 P1;
	public JPReg2 P2;
	public CardLayout cl;
        
	
	public PanelRegistrar(){
            
		
		FlowLayout fl=new FlowLayout(FlowLayout.CENTER);
		fl.setVgap(50);
		this.setLayout(fl);
		
		this.setBackground(Color.WHITE);
		initComponents();
		asignarEventos();
		
	}
	private void initComponents() {
		// TODO Auto-generated method stub
		P1=new JPReg1();
		P2=new JPReg2();
		
		cl=new CardLayout();
		cl.addLayoutComponent(P1, "P1");
		cl.addLayoutComponent(P2, "P2");
		
		Pan=new JPanel(cl);
		Pan.add(P1);
		Pan.add(P2);
		
		cl.show(Pan, "P1");
		
		this.add(Pan);
		
	}
	
	private void asignarEventos(){
		
		P1.JBTSiguiente.addActionListener(this);
		P2.JBAtras.addActionListener(this);
                P2.JBAbrir.addActionListener(this);
                P2.JBGuardar.addActionListener(this);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		/*// TODO Auto-generated method stub
		Object obj=e.getSource();
		if(obj==P1.JBTSiguiente){
                    
                    if( (P1.JTFNombre.getText().equalsIgnoreCase(" "))||(P1.JTFApellidos.getText().equalsIgnoreCase(""))
                            ||(P1.JTFCorreo.getText().equalsIgnoreCase(""))||(P1.JTFDni.getText().equalsIgnoreCase(""))
                            ||(P1.JTFTelefono.getText().equalsIgnoreCase(""))||(P1.JTFDni.getText().length()!=8)
                            ||(P1.JTFNombre.getText().equalsIgnoreCase(P1.JTFNombre.texto))||(P1.JTFApellidos.getText().equalsIgnoreCase(P1.JTFApellidos.texto))
                            ||(P1.JTFCorreo.getText().equalsIgnoreCase(P1.JTFCorreo.texto))||(P1.JTFDni.getText().equalsIgnoreCase(P1.JTFDni.texto))
                            ||(P1.JTFTelefono.getText().equalsIgnoreCase(P1.JTFTelefono.texto))||(P1.JTFDni.getText().equalsIgnoreCase(P1.JTFDni.texto))
                            ||(P1.JTFTelefono.getText().length()<7)
                            )  {
                        JOptionPane.showMessageDialog(this, "Asegúrese de que:"
                                + "\n- El teléfono ingresado sea válido. "
                                + "\n- No hay campos vacíos."
                                + "\n- Ha ingresado datos."
                                + "\n- El DNI ingresado tiene 8 dígitos.", "Error ",JOptionPane.QUESTION_MESSAGE);
                    }else{
			cl.show(Pan, "P2");
                    }
                    
                    
		}else if(obj==P2.JBAtras){
                    
			cl.show(Pan, "P1");
                        
		}else if(obj==P2.JBAbrir){
                    JFileChooser j = new JFileChooser();
                    FileNameExtensionFilter fil = new FileNameExtensionFilter("JPG, PNG & GIF","jpg","png","gif");
                    j.setFileFilter(fil);
        
                    int s = j.showOpenDialog(this);
                    if(s == JFileChooser.APPROVE_OPTION){
                        String ruta = j.getSelectedFile().getAbsolutePath();
                        //String c=ruta.replace('\\', '/');
                        P2.JTFRuta.setText(ruta);
                        P2.JLBFoto.setIcon(new ImageIcon(ruta));
                    }
                    
                    
                }else if(obj==P2.JBGuardar){
                    String nombre= P1.JTFNombre.getText();
                    String apell=P1.JTFApellidos.getText();
                    String dni=P1.JTFDni.getText();
                    String correo=P1.JTFCorreo.getText()+(String)P1.JCBCorreo.getSelectedItem();
                    String tel=P1.JTFTelefono.getText();
                    String us = P2.JTFUsuario.getText();
                    String psw =String.valueOf(P2.JPFContra.getPassword());
                    
                    File ruta = new File(P2.JTFRuta.getText());
                    this.agregar(nombre, apell, dni, correo, tel, us, psw, ruta);            
                }*/
	}
        public void agregar(String nombre, String apell,String dni, String correo, String tel, String us, String p, File ruta){
            /*Usuario vo = new Usuario();
            ConexionUsuarios dao= new ConexionUsuarios();

            vo.setNombre(nombre);
            vo.setApellido(apell);
            vo.setDni(dni);
            vo.setCorreo(correo);
            vo.setTelefono(tel);
            vo.setSaldo(60);
            vo.setUsuario(us);
            vo.setPassword(p.toCharArray());
            try{
                byte[] icono = new byte[(int) ruta.length()];
                InputStream input = new FileInputStream(ruta);
                input.read(icono);
                vo.setFoto(icono);
            }catch(Exception ex){
                vo.setFoto(null);
            }
            dao.Agregar_Usuario(vo);*/
        }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame fram= new JFrame();
		
		fram.setTitle("Cato eres un nuv");
		fram.setVisible(true);
		fram.setResizable(true);
		fram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//fram.setLocation(0,150);
		fram.setResizable(true);
		
		fram.setContentPane(new PanelRegistrar());
		
		fram.setMinimumSize(new Dimension(600,600));
		
		//fram.setExtendedState(JFrame.MAXIMIZED_BOTH);
		//fram.pack();
	}

}
