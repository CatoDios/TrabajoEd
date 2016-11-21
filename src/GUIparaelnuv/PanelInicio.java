package GUIparaelnuv;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class PanelInicio extends JPanel implements ActionListener{
	
	public JPanel Pan;
	public JPLogin1 P1;
	public JPLogin2 P2;
	public CardLayout cl;
        
	public PanelInicio(){
            
         
		FlowLayout fl=new FlowLayout(FlowLayout.CENTER);
		fl.setVgap(80);
		this.setLayout(fl);
		
		this.setBackground(Color.WHITE);
		initComponents();
		asignarEventos();
		
	}
	private void initComponents() {
		// TODO Auto-generated method stub
		P1=new JPLogin1();
		P2=new JPLogin2();
		
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
		
		
		P2.JBAtras.addActionListener(this);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj=e.getSource();
		if(obj==P2.JBAtras){
			cl.show(Pan, "P1");
		}
		
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
		
		fram.setContentPane(new PanelInicio());
		
		fram.setMinimumSize(new Dimension(600,600));
		
		//fram.setExtendedState(JFrame.MAXIMIZED_BOTH);
		//fram.pack();
	}

}
