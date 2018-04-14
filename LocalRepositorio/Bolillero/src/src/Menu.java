package src;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.BorderLayout;

import javax.swing.JTextPane;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;

import javax.swing.JSpinner;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import java.awt.Color;

@SuppressWarnings("unused")
public class Menu {

	private JFrame frmBolillero;
	private JTextField entrada;
	private JTextField resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
					window.frmBolillero.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBolillero = new JFrame();
		frmBolillero.setTitle("Bolillero");
		frmBolillero.getContentPane().setLayout(null);
		
		JLabel lblCantidadDeBolilleros = new JLabel("Cantidad de Bolillas:");
		lblCantidadDeBolilleros.setBounds(24, 13, 153, 16);
		frmBolillero.getContentPane().add(lblCantidadDeBolilleros);
		
		entrada = new JTextField();
		entrada.setBounds(146, 10, 116, 22);
		frmBolillero.getContentPane().add(entrada);
		entrada.setColumns(10);
		
		JButton btnSortear = new JButton("Sortear!");
		btnSortear.setForeground(Color.BLACK);
		btnSortear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Codigo de lo que hace el boton 
				Random random = new Random();     
				int numero = Integer.parseInt( entrada.getText());
				int intervalo_randomico = random.nextInt(numero)+1;      
				resultado.setText(String.valueOf(intervalo_randomico));
				
			}
		});
		btnSortear.setBounds(280, 9, 97, 25);
		frmBolillero.getContentPane().add(btnSortear);
		
		JLabel lblBolillaSoretada = new JLabel("Bolilla Sorteada:");
		lblBolillaSoretada.setBounds(24, 54, 140, 16);
		frmBolillero.getContentPane().add(lblBolillaSoretada);
		
		resultado = new JTextField();
		resultado.setBounds(146, 51, 162, 22);
		frmBolillero.getContentPane().add(resultado);
		resultado.setColumns(10);
	}
}
