package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ControllerPersona;
import modelo.Juridica;
import modelo.Natural;
import modelo.Persona;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JSlider;
import javax.swing.JToggleButton;
import javax.swing.JSeparator;
import javax.swing.JRadioButton;
import java.awt.SystemColor;
import java.awt.Color;

public class VistaPersona extends JFrame {

	ControllerPersona CtlPer = new ControllerPersona();
	ControllerPersona CtlJuri = new ControllerPersona();
	ControllerPersona CtlNatu = new ControllerPersona();

	private JPanel contentPane;
	private JTextField txtIdentificacion;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtDireccion;
	private JTextField txtTelefono;
	private JTextField txtEmail;
	private JTextField txtFechaNacimiento;
	private JTextField txtNit;
	private JTextField txtNumeroTributario;

	Juridica juridica = new Juridica();
	Natural natural = new Natural();

	public void limpiarCamposNatural() {

		txtEmail.setText(null);
		txtFechaNacimiento.setText(null);

	}

	public void limpiarCamposjurdico() {

		txtNit.setText(null);
		txtNumeroTributario.setText(null);

	}

	// este metodo sirve para limpiar los campos
	public void limpiarCampos() {

		txtIdentificacion.setText(null);
		txtNombre.setText(null);
		txtApellido.setText(null);
		txtDireccion.setText(null);
		txtTelefono.setText(null);

	}

	public void desabilitarcampos() {
		txtIdentificacion.enable(false);
		txtNombre.enable(false);
		txtApellido.enable(false);
		txtDireccion.enable(false);
		txtTelefono.enable(false);

	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaPersona frame = new VistaPersona();
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
	public VistaPersona() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 738, 506);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 336, 445);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblRegistrarPersona = new JLabel("REGISTRAR PERSONA");
		lblRegistrarPersona.setBounds(134, 11, 202, 14);
		panel.add(lblRegistrarPersona);

		JLabel lblIdentificacion = new JLabel("IDENTIFICACION:");
		lblIdentificacion.setBounds(38, 45, 121, 14);
		panel.add(lblIdentificacion);

		txtIdentificacion = new JTextField();
		txtIdentificacion.setBounds(169, 42, 157, 20);
		panel.add(txtIdentificacion);
		txtIdentificacion.setColumns(10);

		JLabel lblNombre = new JLabel("NOMBRE:");
		lblNombre.setBounds(38, 70, 89, 14);
		panel.add(lblNombre);

		txtNombre = new JTextField();
		txtNombre.setBounds(169, 67, 157, 20);
		panel.add(txtNombre);
		txtNombre.setColumns(10);

		JLabel lblApellido = new JLabel("APELLIDO:");
		lblApellido.setBounds(38, 95, 121, 14);
		panel.add(lblApellido);

		txtApellido = new JTextField();
		txtApellido.setBounds(169, 92, 157, 20);
		panel.add(txtApellido);
		txtApellido.setColumns(10);

		JLabel lblDireccion = new JLabel("DIRECCION:");
		lblDireccion.setBounds(38, 120, 121, 14);
		panel.add(lblDireccion);

		txtDireccion = new JTextField();
		txtDireccion.setBounds(169, 117, 157, 20);
		panel.add(txtDireccion);
		txtDireccion.setColumns(10);

		JLabel lblTelefono = new JLabel("TELEFONO");
		lblTelefono.setBounds(38, 145, 121, 14);
		panel.add(lblTelefono);

		txtTelefono = new JTextField();
		txtTelefono.setBounds(167, 148, 159, 20);
		panel.add(txtTelefono);
		txtTelefono.setColumns(10);

		JButton btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				int identificacion = Integer.parseInt(txtIdentificacion.getText());
				String nombre = txtNombre.getText();
				String apellido = txtApellido.getText();
				String direccion = txtDireccion.getText();
				String telefono = txtTelefono.getText();

				Persona per = new Persona(identificacion, nombre, apellido, direccion, telefono);

				if (CtlPer.agregarPersona(per)) {
					JOptionPane.showMessageDialog(null, "Se registro la PERSONA" + identificacion);
					txtNit.setText(txtIdentificacion.getText());
					txtNit.enable(false);
					limpiarCampos();
					desabilitarcampos();

				} else {
					JOptionPane.showMessageDialog(null, "No se registro la PERSONA");
					limpiarCampos();

				}

			}
		});
		btnRegistrar.setBounds(25, 229, 111, 23);
		panel.add(btnRegistrar);

		JButton btnNewButton = new JButton("BUSCAR PERSONA");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String cadena = "";

				int identificacion = Integer.parseInt(txtIdentificacion.getText());

				List<Persona> per = CtlPer.buscarpersona(identificacion);

				/*
				 * for (Persona elemento : per) { cadena = cadena + elemento; }
				 */

				JOptionPane.showMessageDialog(null, "Informacion: ");

			}
		});
		btnNewButton.setBounds(169, 229, 157, 23);
		panel.add(btnNewButton);

		JPanel panel_1 = new JPanel();
		panel_1.setForeground(new Color(0, 0, 0));
		panel_1.setBounds(356, 11, 356, 228);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblJuridica = new JLabel("JURIDICA");
		lblJuridica.setBounds(154, 11, 135, 14);
		panel_1.add(lblJuridica);

		JButton btnGuardarJuridico = new JButton("GUARDAR");
		btnGuardarJuridico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int nit = Integer.parseInt(txtNit.getText());
				int numeroTributario = Integer.parseInt(txtNumeroTributario.getText());

				Juridica juri = new Juridica(nit, numeroTributario);
				if (CtlJuri.agregarPersonaJuridica(juri)) {
					JOptionPane.showMessageDialog(null, "Se registro la persona juridica");
					limpiarCamposjurdico();
					setVisible(false);
					VistaPrincipal vista = new VistaPrincipal();
					vista.setVisible(true);

				} else {
					JOptionPane.showMessageDialog(null, "No se registro la persona juridica");
					limpiarCampos();

				}
			}
		});
		btnGuardarJuridico.setBounds(127, 149, 126, 23);
		panel_1.add(btnGuardarJuridico);

		JLabel lblNit = new JLabel("NIT:");
		lblNit.setBounds(48, 44, 46, 14);
		panel_1.add(lblNit);

		JLabel lblNumeroTrubutario = new JLabel("NUMERO TRUBUTARIO:");
		lblNumeroTrubutario.setBounds(48, 69, 149, 14);
		panel_1.add(lblNumeroTrubutario);

		txtNit = new JTextField();
		txtNit.setBounds(197, 41, 149, 20);
		panel_1.add(txtNit);
		txtNit.setColumns(10);

		txtNumeroTributario = new JTextField();
		txtNumeroTributario.setBounds(197, 66, 149, 20);
		panel_1.add(txtNumeroTributario);
		txtNumeroTributario.setColumns(10);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(356, 250, 356, 206);
		contentPane.add(panel_2);
		panel_2.setLayout(null);

		JLabel lblNatural = new JLabel("NATURAL");
		lblNatural.setBounds(149, 11, 118, 14);
		panel_2.add(lblNatural);

		JLabel lblEmail = new JLabel("EMAIL:");
		lblEmail.setBounds(10, 41, 89, 14);
		panel_2.add(lblEmail);

		JLabel lblFechaDeNacimiento = new JLabel("FECHA DE NACIMIENTO:");
		lblFechaDeNacimiento.setBounds(10, 66, 178, 14);
		panel_2.add(lblFechaDeNacimiento);

		txtEmail = new JTextField();
		txtEmail.setBounds(198, 38, 148, 20);
		panel_2.add(txtEmail);
		txtEmail.setColumns(10);

		txtFechaNacimiento = new JTextField();
		txtFechaNacimiento.setBounds(198, 63, 148, 20);
		panel_2.add(txtFechaNacimiento);
		txtFechaNacimiento.setColumns(10);

		JButton btnGuardarNatural = new JButton("GUARDAR");
		btnGuardarNatural.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String email = txtEmail.getText();
				String fechaNacimiento = txtFechaNacimiento.getText();

				Natural natu = new Natural(email, fechaNacimiento);
				if (CtlNatu.agregarPersonaNatural(natu)) {
					JOptionPane.showMessageDialog(null, "Se registro la persona natural");
					setVisible(false);
					VistaPrincipal vista = new VistaPrincipal();
					vista.setVisible(true);

					limpiarCamposNatural();
				} else {
					JOptionPane.showMessageDialog(null, "No se registro la persona natural");
					limpiarCamposNatural();

				}
			}
		});
		btnGuardarNatural.setBounds(126, 128, 158, 23);
		panel_2.add(btnGuardarNatural);
	}
}
