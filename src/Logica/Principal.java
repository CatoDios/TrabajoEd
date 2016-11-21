package Logica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.BoxLayout;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.FlowLayout;

public class Principal extends JFrame {

	private JPanel contentPane;
	Coordinador almacen;
	private JTextField CampoUsuario;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 568, 492);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel Superior = new JPanel();
		contentPane.add(Superior, BorderLayout.NORTH);
		Superior.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel_2 = new JPanel();
		Superior.add(panel_2);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblUsuario = new JLabel("Usuario:");
		panel_2.add(lblUsuario);
		
		CampoUsuario = new JTextField();
		CampoUsuario.setColumns(10);
		panel_2.add(CampoUsuario);
		
		JLabel lblNewLabel = new JLabel("Contrase\u00F1a");
		panel_2.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		Superior.add(panel_1);
		
		JPanel panel = new JPanel();
		Superior.add(panel);
		
		JButton btnAgregarAlCarrito = new JButton("Agregar al carrito");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(12)
					.addComponent(btnAgregarAlCarrito))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(5)
					.addComponent(btnAgregarAlCarrito))
		);
		panel.setLayout(gl_panel);
		
		JPanel Central = new JPanel();
		contentPane.add(Central, BorderLayout.CENTER);
		Central.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel Panel1 = new JPanel();
		Panel1.setForeground(new Color(0, 0, 0));
		Central.add(Panel1);
		
		JPanel Panel2 = new JPanel();
		Central.add(Panel2);
		
		JPanel Panel3 = new JPanel();
		Central.add(Panel3);
		
		JPanel Panel4 = new JPanel();
		Central.add(Panel4);
		
		JPanel Panel5 = new JPanel();
		Central.add(Panel5);
		
		JPanel Panel6 = new JPanel();
		Central.add(Panel6);
		
		JPanel Inferior = new JPanel();
		contentPane.add(Inferior, BorderLayout.SOUTH);
		
		JButton Anterior = new JButton("Anterior");
		Anterior.setEnabled(false);
		Anterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		Inferior.add(Anterior);
		
		JButton Siguiente = new JButton("Siguiente");
		Siguiente.setEnabled(false);
		Inferior.add(Siguiente);
	}

}
