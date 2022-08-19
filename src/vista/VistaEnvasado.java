package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ControllerProducto;
import modelo.Envasados;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class VistaEnvasado extends JFrame {

	private JPanel contentPane;
	private JTextField txtId;
	private JTextField txtPeso;
	private JTextField txtFechaenvasado;
	
	ControllerProducto Ctlenvasado = new ControllerProducto();
	
	
	public void LimpiarCampos(){
		txtId.setText(null);
		txtPeso.setText(null);
		txtFechaenvasado.setText(null);
	}
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaEnvasado frame = new VistaEnvasado();
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
	public VistaEnvasado() {
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
		
		JLabel lblId = new JLabel("id");
		lblId.setBounds(52, 50, 46, 14);
		panel.add(lblId);
		
		JLabel lblPeso = new JLabel("peso");
		lblPeso.setBounds(52, 89, 46, 14);
		panel.add(lblPeso);
		
		JLabel lblFecha = new JLabel("fecha");
		lblFecha.setBounds(52, 126, 46, 14);
		panel.add(lblFecha);
		
		JLabel lblOrigen = new JLabel("origen");
		lblOrigen.setBounds(52, 165, 46, 14);
		panel.add(lblOrigen);
		
		txtId = new JTextField();
		txtId.setBounds(186, 47, 86, 20);
		panel.add(txtId);
		txtId.setColumns(10);
		
		txtPeso = new JTextField();
		txtPeso.setBounds(175, 86, 86, 20);
		panel.add(txtPeso);
		txtPeso.setColumns(10);
		
		txtFechaenvasado = new JTextField();
		txtFechaenvasado.setBounds(186, 123, 86, 20);
		panel.add(txtFechaenvasado);
		txtFechaenvasado.setColumns(10);
		
		JComboBox cmbOrigen = new JComboBox();
		cmbOrigen.setModel(new DefaultComboBoxModel(new String[] {"COLOMBIA", "ARGENTINA", "CHILE", "ECUADOR", "PER\u00DA"}));
		cmbOrigen.setBounds(186, 162, 86, 20);
		panel.add(cmbOrigen);
		
		JButton btnRegistrar = new JButton("registrar");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int id = Integer.parseInt(txtId.getText());
				int peso =Integer.parseInt(txtPeso.getText());
				String fechaEnvasado = txtFechaenvasado.getText();
				String origen = cmbOrigen.getSelectedItem().toString();
				
				Envasados envasados = new Envasados(id,peso,fechaEnvasado,origen);
				if (Ctlenvasado.agregarProductoEnvasado(envasados)) {
					JOptionPane.showMessageDialog(null, "Se registro el producto");
					
					LimpiarCampos();
					
				} else {
					JOptionPane.showMessageDialog(null, "No fue registrado");
					
					LimpiarCampos();
				}
				
				
				
				
			}
		});
		btnRegistrar.setBounds(105, 205, 89, 23);
		panel.add(btnRegistrar);
	}

}
