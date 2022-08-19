package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ControllerPersona;

import modelo.Natural;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaNatural extends JFrame {

	Natural natural = new Natural();

	ControllerPersona CtlNatu = new ControllerPersona();

	private JPanel contentPane;
	private JTextField txtEmail;
	private JTextField txtFechaNacimiento;
	
	public void limpiarCampos() {

        txtEmail.setText(null);
        txtFechaNacimiento.setText(null);
        

    }

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaNatural frame = new VistaNatural();
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
	public VistaNatural() {
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

		JLabel lblEmail = new JLabel("EMAIL:");
		lblEmail.setBounds(48, 52, 46, 14);
		panel.add(lblEmail);

		JLabel lblFechaDeNacimiento = new JLabel("FECHA DE NACIMIENTO:");
		lblFechaDeNacimiento.setBounds(48, 98, 120, 14);
		panel.add(lblFechaDeNacimiento);

		txtEmail = new JTextField();
		txtEmail.setBounds(215, 49, 135, 20);
		panel.add(txtEmail);
		txtEmail.setColumns(10);

		txtFechaNacimiento = new JTextField();
		txtFechaNacimiento.setBounds(216, 95, 134, 20);
		panel.add(txtFechaNacimiento);
		txtFechaNacimiento.setColumns(10);

		JButton btnFinalizarRegistro = new JButton("FINALIZAR REGISTRO");
		btnFinalizarRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String email = txtEmail.getText();
				String fechaNacimiento = txtFechaNacimiento.getText();

				Natural natu = new Natural(email, fechaNacimiento);
				if (CtlNatu.agregarPersonaNatural(natu)) {
					JOptionPane.showMessageDialog(null, "Se registro la persona natural");

					limpiarCampos();
				} else {
					JOptionPane.showMessageDialog(null, "No se registro la persona natural");
					limpiarCampos();

				}

			}
		});
		btnFinalizarRegistro.setBounds(142, 162, 150, 23);
		panel.add(btnFinalizarRegistro);
	}

}
