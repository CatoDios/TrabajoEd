package GUIparaelnuv;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.text.NavigationFilter;
import javax.swing.text.Position;

import static GUIparaelnuv.TextoLogin.CORTO;
import static GUIparaelnuv.TextoLogin.LARGO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextoContra extends JPasswordField implements FocusListener,KeyListener,MouseListener {
	
        public static int CORTO =1;
	public static int LARGO =2;
    
	Color plomo=new Color(110,110,110);
	Color otro=new Color(0,120,215);
	Border BordePlomo, BordeCambio;
	
	
	public TextoContra(int modo){
		initComponents();
		if(modo==LARGO){
                this.setPreferredSize(new Dimension(440,40));
            }else if(modo==CORTO){
                this.setPreferredSize(new Dimension(216,40));
            }
		this.setFont(new Font("Ebrima",Font.PLAIN,21));
		this.addFocusListener(this);
		this.addKeyListener(this);
		this.setBorder(BordePlomo);

		this.setForeground(Color.black);
		this.addMouseListener(this);
		this.setCaretColor(otro);
		this.setSelectionColor(new Color(50,143,242));
	}
	private void initComponents() {
		
		BordePlomo=BorderFactory.createMatteBorder(2, 2, 2, 2,plomo);
		BordeCambio=BorderFactory.createMatteBorder(2, 2, 2, 2, otro);
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		this.setBorder(BordePlomo);
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		this.setBorder(BordeCambio);
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		char c=e.getKeyChar();
		if(  !((c>='0' && c<='9')||(c>='a' && c<='z')||(c==':')||(c>='A'&&c<='Z')||(c=='.')||(c==' ')||(c=='_')||(c=='-'))){
			e.consume();
		}
	}

	@Override
	public void focusGained(FocusEvent arg0) {
		// TODO Auto-generated method stub
		this.setBorder(BordeCambio);
		
		
	}

	@Override
	public void focusLost(FocusEvent arg0) {
		// TODO Auto-generated method stub
		this.setBorder(BordePlomo);
		
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame fram= new JFrame();
		fram.setVisible(true);
		fram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fram.setLocation(50,50);
		JPanel p=new JPanel();
		JButton M= new JButton("Mostrar");
                p.add(M);
                TextoContra gg= new TextoContra(TextoContra.LARGO);
		p.add(gg);
		M.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        char[]p =gg.getPassword();
                        System.out.print(p);
                    }
                });
                
                fram.setContentPane(p);
		
		fram.pack();
		
	}
}
