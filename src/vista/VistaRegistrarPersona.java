package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ControllerPersona;
import modelo.Persona;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class VistaRegistrarPersona extends JFrame {
	
	ControllerPersona CtlPer = new ControllerPersona();

	private JPanel contentPane;
	private JTextField txtIdentifiacion;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtDireccion;
	private JTextField txtTelefono;
	
	
	//este metodo sirve para limpiar los campos
	public void limpiarCampos() {

        txtIdentifiacion.setText(null);
        txtNombre.setText(null);
        txtApellido.setText(null);
        txtDireccion.setText(null);
        txtTelefono.setText(null);

    }

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaRegistrarPersona frame = new VistaRegistrarPersona();
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
	public VistaRegistrarPersona() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 667, 516);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 631, 455);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblIdentificacion = new JLabel("IDENTIFICACION:");
		lblIdentificacion.setBounds(85, 62, 139, 14);
		panel.add(lblIdentificacion);
		
		JLabel lblNombre = new JLabel("NOMBRE :");
		lblNombre.setBounds(95, 116, 89, 14);
		panel.add(lblNombre);
		
		JLabel lblApellido = new JLabel("APELLIDO:");
		lblApellido.setBounds(95, 173, 77, 14);
		panel.add(lblApellido);
		
		txtIdentifiacion = new JTextField();
		txtIdentifiacion.setBounds(195, 59, 86, 20);
		panel.add(txtIdentifiacion);
		txtIdentifiacion.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(195, 113, 86, 20);
		panel.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(195, 170, 86, 20);
		panel.add(txtApellido);
		txtApellido.setColumns(10);
		
		JLabel lblTelefono = new JLabel("DIRECCION");
		lblTelefono.setBounds(95, 223, 77, 14);
		panel.add(lblTelefono);
		
		txtDireccion = new JTextField();
		txtDireccion.setBounds(195, 220, 86, 20);
		panel.add(txtDireccion);
		txtDireccion.setColumns(10);
		
		JLabel lblTelefono_1 = new JLabel("TELEFONO:");
		lblTelefono_1.setBounds(95, 276, 77, 14);
		panel.add(lblTelefono_1);
		
		txtTelefono = new JTextField();
		txtTelefono.setBounds(195, 273, 86, 20);
		panel.add(txtTelefono);
		txtTelefono.setColumns(10);
		
		JButton btnRegistrar = new JButton("REGRISTRAR");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int identificacion = Integer.parseInt(txtIdentifiacion.getText());
				String nombre = txtNombre.getText();
				String apellido= txtApellido.getText();
				String direccion = txtDireccion.getText();
				String telefono= txtTelefono.getText();
				
				Persona per = new Persona(identificacion,nombre,apellido,direccion,telefono);
				
				
				if (CtlPer.agregarPersona(per)) {
	                JOptionPane.showMessageDialog(null, "Se registro la PERSONA");
	                
	                limpiarCampos();
	            } else {
	                JOptionPane.showMessageDialog(null, "No se registro la PERSONA");
	                limpiarCampos();

	            }
			}
		});
		btnRegistrar.setBounds(192, 330, 106, 20);
		panel.add(btnRegistrar);
	}
}
