package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ControllerProducto;
import modelo.Refijerados;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaRefrigerados extends JFrame {

	private JPanel contentPane;
	private JTextField txtCodigo;
	private JTextField txtTemperatura;
	
	ControllerProducto Ctlrefrigerados = new ControllerProducto();
	
	public void limpiarcampos(){
		txtCodigo.setText(null);
		txtTemperatura.setText(null);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaRefrigerados frame = new VistaRefrigerados();
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
	public VistaRefrigerados() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 414, 239);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Codigo de aprobacion");
		lblNewLabel.setBounds(63, 56, 46, 14);
		panel.add(lblNewLabel);
		
		JLabel lblTemperatura = new JLabel("temperatura");
		lblTemperatura.setBounds(63, 90, 46, 14);
		panel.add(lblTemperatura);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(215, 53, 86, 20);
		panel.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		txtTemperatura = new JTextField();
		txtTemperatura.setBounds(215, 87, 86, 20);
		panel.add(txtTemperatura);
		txtTemperatura.setColumns(10);
		
		JButton btnRegistrar = new JButton("registrar");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int codigo = Integer.parseInt(txtCodigo.getText());
				float temperatura = Float.parseFloat(txtTemperatura.getText());
				
				Refijerados refri = new Refijerados(codigo, temperatura);
				if (Ctlrefrigerados.agregarProductoRefijerado(refri)) {
					JOptionPane.showMessageDialog(null, "se guardo bien felicitaciones");
					limpiarcampos();
				} else {
					JOptionPane.showMessageDialog(null, "NO se guardo bien");
					limpiarcampos();
				}
				
			}
		});
		btnRegistrar.setBounds(143, 142, 89, 23);
		panel.add(btnRegistrar);
	}

}
