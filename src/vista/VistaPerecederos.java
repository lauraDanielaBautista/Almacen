package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ControllerProducto;
import modelo.Envasados;
import modelo.Perecederos;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaPerecederos extends JFrame {

	private JPanel contentPane;
	private JTextField txtId;
	private JTextField txtFechaVencimiento;

	
ControllerProducto Ctlperecederos = new ControllerProducto();
	
	
	public void LimpiarCampos(){
		txtId.setText(null);
		txtFechaVencimiento.setText(null);
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaPerecederos frame = new VistaPerecederos();
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
	public VistaPerecederos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 387, 239);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(56, 36, 46, 14);
		panel.add(lblId);
		
		JLabel lblFechaDeVencimiento = new JLabel("FECHA DE VENCIMIENTO:");
		lblFechaDeVencimiento.setBounds(56, 85, 139, 14);
		panel.add(lblFechaDeVencimiento);
		
		txtId = new JTextField();
		txtId.setBounds(224, 33, 86, 20);
		panel.add(txtId);
		txtId.setColumns(10);
		
		txtFechaVencimiento = new JTextField();
		txtFechaVencimiento.setBounds(224, 82, 86, 20);
		panel.add(txtFechaVencimiento);
		txtFechaVencimiento.setColumns(10);
		
		JButton btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				int id = Integer.parseInt(txtId.getText());
				String fechaVencimiento = txtFechaVencimiento.getText();
				
				
				Perecederos perecederos = new Perecederos(id,fechaVencimiento);
				if (Ctlperecederos.agregarProductoPerecedero(perecederos)) {
					JOptionPane.showMessageDialog(null, "Se registro el producto");
					
					LimpiarCampos();
					
				} else {
					JOptionPane.showMessageDialog(null, "No fue registrado");
					
					LimpiarCampos();
				}
				
			}
		});
		btnRegistrar.setBounds(157, 177, 89, 23);
		panel.add(btnRegistrar);
	}

}
