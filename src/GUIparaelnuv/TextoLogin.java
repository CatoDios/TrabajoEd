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


public class TextoLogin extends JTextField implements FocusListener,KeyListener,MouseListener {
    
        public static int CORTO =1;
	public static int LARGO =2;
        
        public static int SOLO_LETRAS=3;
        public static int SOLO_NUMEROS=4;
        public static int TODOS=5;
        
        public int mode;
    
	public String texto = "Escriba aqu�...";
	Color plomo=new Color(110,110,110);
	Color otro=new Color(0,120,215);
	Border BordePlomo, BordeCambio;
	
	
	public TextoLogin(int modo, int mode,String Texto){
            if(modo==LARGO){
                this.setPreferredSize(new Dimension(440,40));
            }else if(modo==CORTO){
                this.setPreferredSize(new Dimension(216,40));
            }
            this.mode=mode;
           
            
            texto = Texto;
		initComponents();
		this.setText(texto);
		
		this.setForeground(plomo);
		this.setFont(new Font("Ebrima",Font.PLAIN,21));
		this.addFocusListener(this);
		this.addKeyListener(this);
		this.setBorder(BordePlomo);
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
		if(getText().equalsIgnoreCase(texto)) {
			this.setCaretPosition(0);
		}
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
		if(getText().equalsIgnoreCase(texto)) {
			this.setCaretPosition(0);
		}
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		this.setBorder(BordeCambio);
		if(getText().equalsIgnoreCase(texto)) {
			this.setCaretPosition(0);
		}
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
		int xd=e.getKeyCode();
		
		if(getText().equalsIgnoreCase(texto)) {
			this.setText("");
		}

		this.setForeground(Color.black);
		
                if(mode==TODOS){
                    if(  !((c>='0' && c<='9')||(c>='a' && c<='z')||(c=='ñ')
                            ||(c==':')||(c>='A'&&c<='Z')||(c=='.')||(c==' ')
                            ||(c=='_')||(c=='-')||(c=='\\')||(c=='/'))){
			e.consume();
                    }
                }else if(mode==SOLO_LETRAS){
                    if(  !((c>='a' && c<='z')||(c=='ñ')||(c>='A'&&c<='Z')||(c==' ')) ){
			e.consume();
                    }
                }else if(mode==SOLO_NUMEROS){
                    if(  !((c>='0' && c<='9'))){
			e.consume();
                    }
                    
                }
                
		if( c=='\b' ){
			if(getText().equalsIgnoreCase("")){
				this.setForeground(plomo);
				this.setText(texto);
				this.setCaretPosition(0);
			}
		}
	}

	@Override
	public void focusGained(FocusEvent arg0) {
		// TODO Auto-generated method stub
		if (this.getText().equalsIgnoreCase(texto)) {
			this.setCaretPosition(0);
		}
		this.setBorder(BordeCambio);
		
		
	}

	@Override
	public void focusLost(FocusEvent arg0) {
		// TODO Auto-generated method stub
		if (this.getText().equalsIgnoreCase("")) {
			this.setText(texto);
			this.setForeground(plomo);
		}
		this.setBorder(BordePlomo);
		
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame fram= new JFrame();
		fram.setVisible(true);
		fram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fram.setLocation(50,50);
		JPanel p=new JPanel();
                TextoLogin k=new TextoLogin(TextoLogin.CORTO,TextoLogin.TODOS,"Nombre de usuario");
		p.add(k);
                k.setEnabled(true);
		p.add(new JButton("Ggggg prro"));
		fram.setContentPane(p);
		
		fram.pack();
		
	}
}
