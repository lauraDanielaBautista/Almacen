package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ControllerProducto;
import modelo.Productos;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaProductos extends JFrame {

	ControllerProducto CtlPro = new ControllerProducto();

	private JPanel contentPane;
	private JTextField txtCodigo;
	private JLabel lblCodigo;
	private JLabel lblValorUnitario;
	private JLabel lblCantidad;
	private JTextField txtValorUnitario;
	private JTextField txtCantidad;
	private JButton btnRegistrar;
	
	
	//este metodo sirve para limpiar los campos
	public void limpiarCampos() {

        txtCodigo.setText(null);
        txtValorUnitario.setText(null);
        txtCantidad.setText(null);
        

    }

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaProductos frame = new VistaProductos();
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
	public VistaProductos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 581, 499);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 545, 438);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblProductos = new JLabel("PRODUCTOS");
		lblProductos.setBounds(210, 55, 102, 14);
		panel.add(lblProductos);

		txtCodigo = new JTextField();
		txtCodigo.setBounds(283, 117, 86, 20);
		panel.add(txtCodigo);
		txtCodigo.setColumns(10);

		lblCodigo = new JLabel("CODIGO:");
		lblCodigo.setBounds(147, 120, 46, 14);
		panel.add(lblCodigo);

		lblValorUnitario = new JLabel("VALOR UNITARIO");
		lblValorUnitario.setBounds(147, 181, 110, 14);
		panel.add(lblValorUnitario);

		lblCantidad = new JLabel("CANTIDAD:");
		lblCantidad.setBounds(147, 229, 72, 14);
		panel.add(lblCantidad);

		txtValorUnitario = new JTextField();
		txtValorUnitario.setBounds(283, 178, 86, 20);
		panel.add(txtValorUnitario);
		txtValorUnitario.setColumns(10);

		txtCantidad = new JTextField();
		txtCantidad.setBounds(283, 226, 86, 20);
		panel.add(txtCantidad);
		txtCantidad.setColumns(10);

		btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int codigo = Integer.parseInt(txtCodigo.getText());
				int valorUnitario = Integer.parseInt(txtValorUnitario.getText());
				int cantidad = Integer.parseInt(txtCantidad.getText());

				Productos pro = new Productos(codigo, valorUnitario, cantidad);

				if (CtlPro.agregarProducto(pro)) {
					JOptionPane.showMessageDialog(null, "Se registro la Producto");

					limpiarCampos();
				} else {
					JOptionPane.showMessageDialog(null, "No se registro la producto");
					limpiarCampos();

				}
			}
		});
		btnRegistrar.setBounds(242, 300, 89, 23);
		panel.add(btnRegistrar);
	}

}
