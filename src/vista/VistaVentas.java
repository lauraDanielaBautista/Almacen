package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ControllerVentas;
import modelo.DetallesVenta;
import modelo.Perecederos;
import modelo.Persona;
import modelo.Productos;
import modelo.Ventas;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class VistaVentas extends JFrame {

	ControllerVentas CtlVentas = new ControllerVentas();
	ControllerVentas CtlDetalleVe = new ControllerVentas();

	private JPanel contentPane;
	private JTextField txtCodigo;
	private JTextField txtTotal;
	private JTextField txtIva;
	private JTextField txtFechaVenta;
	private JTextField txtCodigoDetalleventa;
	private JTextField txtSubtotal;
	private JTextField txtProductoVendido;
	private JTextField txtCodigoDetalle;
	private JTextField txtCantidadProducto;
	private JTextField txtIdentificacionPersonal;
	private JTextField txtCodigoProducto;

	public void limpiarCampos() {
		txtCodigo.setText(null);
		txtTotal.setText(null);
		txtIva.setText(null);
		txtCodigoDetalleventa.setText(null);
		txtFechaVenta.setText(null);

	}

	public void limpiarCamposDetallesVenta() {
		txtSubtotal.setText(null);
		txtCantidadProducto.setText(null);
		txtCodigoDetalle.setText(null);
		txtCodigoProducto.setText(null);
		txtIdentificacionPersonal.setText(getName());
	}

	public void desabilitarcampos() {
		txtCodigo.enable(false);
		txtTotal.enable(false);
		txtIva.enable(false);
		txtCodigoDetalleventa.enable(false);
		txtFechaVenta.enable(false);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaVentas frame = new VistaVentas();
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
	public VistaVentas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 797, 522);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 761, 461);
		contentPane.add(panel);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(403, 11, 348, 439);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel = new JLabel("VENTAS");
		lblNewLabel.setBounds(136, 22, 89, 14);
		panel_1.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("CODIGO:");
		lblNewLabel_1.setBounds(26, 84, 103, 14);
		panel_1.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("TOTAL:");
		lblNewLabel_2.setBounds(26, 110, 103, 14);
		panel_1.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("IVA:");
		lblNewLabel_3.setBounds(26, 135, 103, 14);
		panel_1.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("FECHA DE LA VENTA:");
		lblNewLabel_4.setBounds(26, 166, 133, 14);
		panel_1.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("CODIGO DEL DETALLE:");
		lblNewLabel_5.setBounds(26, 191, 144, 14);
		panel_1.add(lblNewLabel_5);

		txtCodigo = new JTextField();
		txtCodigo.setBounds(173, 81, 114, 20);
		panel_1.add(txtCodigo);
		txtCodigo.setColumns(10);

		txtTotal = new JTextField();
		txtTotal.setBounds(173, 107, 114, 20);
		panel_1.add(txtTotal);
		txtTotal.setColumns(10);

		txtIva = new JTextField();
		txtIva.setBounds(171, 132, 116, 20);
		panel_1.add(txtIva);
		txtIva.setColumns(10);

		txtFechaVenta = new JTextField();
		txtFechaVenta.setBounds(171, 163, 116, 20);
		panel_1.add(txtFechaVenta);
		txtFechaVenta.setColumns(10);

		txtCodigoDetalleventa = new JTextField();
		txtCodigoDetalleventa.setBounds(169, 188, 118, 20);
		panel_1.add(txtCodigoDetalleventa);
		txtCodigoDetalleventa.setColumns(10);

		JButton btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int codigo = Integer.parseInt(txtCodigo.getText());
				int total = Integer.parseInt(txtTotal.getText());
				float iva = Integer.parseInt(txtIva.getText());
				int codigoDetalle = Integer.parseInt(txtCodigoDetalleventa.getText());
				String fecha = txtFechaVenta.getText();

				Ventas ven = new Ventas(codigo, total, iva, fecha, codigoDetalle);

				if (CtlVentas.agregarVenta(ven)) {
					JOptionPane.showMessageDialog(null, "Se registro la venta" + codigo);
					txtCodigo.setText(txtCodigo.getText());
					txtTotal.setText(txtCodigo.getText());
					txtIva.setText(txtCodigo.getText());
					txtCodigoDetalle.setText(txtCodigo.getText());
					txtFechaVenta.setText(txtCodigo.getText());
					txtCodigo.enable(false);

					limpiarCampos();
					desabilitarcampos();

				} else {
					JOptionPane.showMessageDialog(null, "No se registro la venta");
					limpiarCampos();

				}

			}
		});
		btnRegistrar.setBounds(26, 288, 110, 23);
		panel_1.add(btnRegistrar);

		JButton btnBuscarVenta = new JButton("BUSCAR VENTAS");
		btnBuscarVenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String cadena = "";

				int codigo = Integer.parseInt(txtCodigo.getText());

				// List<Productos> per = CtlVentas.(codigo);

				/*
				 * for (Producto elemento : pro) { cadena = cadena + elemento; }
				 */

				JOptionPane.showMessageDialog(null, "Informacion: ");

			}
		});
		btnBuscarVenta.setBounds(173, 288, 154, 23);
		panel_1.add(btnBuscarVenta);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 11, 383, 439);
		panel.add(panel_2);
		panel_2.setLayout(null);

		JLabel lblNewLabel_6 = new JLabel("DETALLES DE LAS VENTAS");
		lblNewLabel_6.setBounds(137, 21, 206, 14);
		panel_2.add(lblNewLabel_6);

		txtSubtotal = new JTextField();
		txtSubtotal.setBounds(236, 67, 124, 20);
		panel_2.add(txtSubtotal);
		txtSubtotal.setColumns(10);

		JLabel lblNewLabel_7 = new JLabel("SUBTOTAL:");
		lblNewLabel_7.setBounds(40, 70, 105, 14);
		panel_2.add(lblNewLabel_7);

		JLabel lblNewLabel_8 = new JLabel("PRODUCTO VENDIDO:");
		lblNewLabel_8.setBounds(40, 109, 186, 14);
		panel_2.add(lblNewLabel_8);

		JLabel lblNewLabel_9 = new JLabel("CODIGO DEL DETALLE:");
		lblNewLabel_9.setBounds(40, 150, 186, 14);
		panel_2.add(lblNewLabel_9);

		JLabel lblNewLabel_10 = new JLabel("CANTIDAD DEL PRODUCTO:");
		lblNewLabel_10.setBounds(40, 186, 190, 14);
		panel_2.add(lblNewLabel_10);

		JLabel lblNewLabel_11 = new JLabel("IDENTIFICACION DE LA PERSONA:");
		lblNewLabel_11.setBounds(40, 223, 190, 14);
		panel_2.add(lblNewLabel_11);

		JLabel lblNewLabel_12 = new JLabel("CODIGO DEL PRODUCTO:");
		lblNewLabel_12.setBounds(40, 260, 156, 14);
		panel_2.add(lblNewLabel_12);

		txtProductoVendido = new JTextField();
		txtProductoVendido.setBounds(236, 106, 124, 20);
		panel_2.add(txtProductoVendido);
		txtProductoVendido.setColumns(10);

		txtCodigoDetalle = new JTextField();
		txtCodigoDetalle.setBounds(236, 147, 124, 20);
		panel_2.add(txtCodigoDetalle);
		txtCodigoDetalle.setColumns(10);

		txtCantidadProducto = new JTextField();
		txtCantidadProducto.setBounds(236, 183, 124, 20);
		panel_2.add(txtCantidadProducto);
		txtCantidadProducto.setColumns(10);

		txtIdentificacionPersonal = new JTextField();
		txtIdentificacionPersonal.setBounds(236, 220, 124, 20);
		panel_2.add(txtIdentificacionPersonal);
		txtIdentificacionPersonal.setColumns(10);

		txtCodigoProducto = new JTextField();
		txtCodigoProducto.setBounds(236, 257, 124, 20);
		panel_2.add(txtCodigoProducto);
		txtCodigoProducto.setColumns(10);

		JButton btnGuardar = new JButton("GUARDAR");
		btnGuardar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				int codigoDetalle = Integer.parseInt(txtCodigoDetalleventa.getText());
				int cantidadProducto = Integer.parseInt(txtCantidadProducto.getText());
				int subtotal = Integer.parseInt(txtSubtotal.getText());
				Productos codigoProducto = new Productos(Integer.parseInt(txtCodigoProducto.getText()));
				Persona identificacionP = new Persona(Integer.parseInt(txtIdentificacionPersonal.getText()));

				DetallesVenta deta = new DetallesVenta(codigoDetalle, cantidadProducto, subtotal, codigoProducto,
						identificacionP);
				if (CtlDetalleVe.agregarDetallesVenta(deta)) {
					JOptionPane.showMessageDialog(null, "Se guardar el detalle de la venta ");
					limpiarCamposDetallesVenta();
					setVisible(false);
					VistaPrincipal vista = new VistaPrincipal();
					vista.setVisible(true);

				} else {
					JOptionPane.showMessageDialog(null, "No se guardo el detalle de la venta ");
					limpiarCamposDetallesVenta();

				}

			}
		});
		btnGuardar.setBounds(174, 348, 139, 23);
		panel_2.add(btnGuardar);
	}
}
