package GUIparaelnuv;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JTextField;

public class JTextSombra extends JTextField implements FocusListener,KeyListener,MouseListener{
	String texto = "Escriba aqui...";
	Color plomo=new Color(171,171,171);
		
	public JTextSombra() {
		this.setText(texto);
		this.setForeground(plomo);
		this.setFont(new Font("Calibri",Font.PLAIN,20));
		this.addFocusListener(this);
		this.addKeyListener(this);
		this.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(1,85,106)));
		this.addMouseListener(this);
		
		
		
	}
	
	public JTextSombra(int lg){
		super(lg);
		this.setText(texto);
		this.setForeground(plomo);
		this.setFont(new Font("Calibri",Font.PLAIN,20));
		this.addFocusListener(this);
		this.addKeyListener(this);
		this.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(1,85,106)));
		this.addMouseListener(this);
		
	}

	public JTextSombra(String texto) {
		this.texto = texto;
		this.setText(texto);
		this.setForeground(plomo);
		this.setFont(new Font("Calibri",Font.PLAIN,20));
		this.addFocusListener(this);
		this.addKeyListener(this);
		this.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0,new Color(1,85,106)));
		this.addMouseListener(this);
		
	}
	
	public JTextSombra(String texto, int lg) {
		super(lg);
		this.texto = texto;
		this.setText(texto);
		this.setForeground(plomo);
		this.setFont(new Font("Calibri",Font.PLAIN,20));
		this.addFocusListener(this);
		this.addKeyListener(this);
		this.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(1,149,174)));
		this.addMouseListener(this);
		
	}
	
	public JTextSombra(String texto, int lg, int a) {
		super(lg);
		this.texto = texto;
		this.setText(texto);
		this.setForeground(plomo);
		this.setFont(new Font("Calibri Light",Font.PLAIN,a));
		this.addFocusListener(this);
		this.addKeyListener(this);
		this.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(1,85,106)));
		this.addMouseListener(this);
		
	}
	
	@Override
	public void focusGained(FocusEvent arg0) {
		if(JTextSombra.this.getText().equalsIgnoreCase(texto)) {
			//JTextSombra.this.setText("");
			this.setCaretPosition(0);
			//JTextSombra.this.setForeground(Color.black);
		}
	}

	@Override
	public void focusLost(FocusEvent arg0) {
		if (JTextSombra.this.getText().equalsIgnoreCase("")) {
			JTextSombra.this.setText(texto);
			JTextSombra.this.setForeground(Color.LIGHT_GRAY);
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
		if(  !((c>='0' && c<='9')||(c>='a' && c<='z')||(c>='A'&&c<='Z')||(c=='.')||(c==' ')||(c=='_')||(c=='-'))){
			e.consume();
		}else{
			if(getText().equalsIgnoreCase(texto)) {
				JTextSombra.this.setText("");
				JTextSombra.this.setForeground(Color.black);
			}
		}
		
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		/*if(getText().equalsIgnoreCase(texto)) {
			JTextSombra.this.setText("");
			JTextSombra.this.setForeground(Color.black);
		}*/
		
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
		if(getText().equalsIgnoreCase(texto)) {
			JTextSombra.this.setText("");
			JTextSombra.this.setForeground(Color.black);
		}
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
