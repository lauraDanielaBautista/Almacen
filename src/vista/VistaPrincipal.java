package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaPrincipal frame = new VistaPrincipal();
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
	public VistaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 622, 436);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 586, 375);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblInicio = new JLabel("ESCOGA SU OPCION");
		lblInicio.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblInicio.setBounds(203, 45, 158, 14);
		panel.add(lblInicio);

		JLabel lblRegistrarPersona = new JLabel("REGISTRAR PERSONA:");
		lblRegistrarPersona.setBounds(110, 110, 158, 14);
		panel.add(lblRegistrarPersona);

		JButton btnIngresar = new JButton("INGRESAR");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				VistaPersona vista = new VistaPersona();
				vista.setVisible(true);
			}
		});
		btnIngresar.setBounds(322, 106, 132, 23);
		panel.add(btnIngresar);

		JLabel lblRegistrarProducto = new JLabel("REGISTRAR PRODUCTO:");
		lblRegistrarProducto.setBounds(110, 166, 158, 14);
		panel.add(lblRegistrarProducto);

		JButton btnIngresar_1 = new JButton("INGRESAR");
		btnIngresar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				VistaProductos vista = new VistaProductos();
				vista.setVisible(true);
			}

		});
		btnIngresar_1.setBounds(322, 162, 132, 23);
		panel.add(btnIngresar_1);

		JLabel lblRegistrarVenta = new JLabel("REGISTRAR VENTA:");
		lblRegistrarVenta.setBounds(110, 210, 158, 14);
		panel.add(lblRegistrarVenta);

		JButton btnIngresar_2 = new JButton("INGRESAR");
		btnIngresar_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				VistaVentas vista = new VistaVentas();
				vista.setVisible(true);
			}

		});
		btnIngresar_2.setBounds(322, 206, 132, 23);
		panel.add(btnIngresar_2);
	}
}
