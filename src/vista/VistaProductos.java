package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;

import controlador.ControllerPersona;
import controlador.ControllerProducto;
import modelo.Envasados;
import modelo.Juridica;
import modelo.Natural;
import modelo.Perecederos;
import modelo.Persona;
import modelo.Productos;
import modelo.Refigerados;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.ComboBoxEditor;
import javax.swing.DefaultComboBoxModel;

public class VistaProductos extends JFrame {

	ControllerProducto CtlPro = new ControllerProducto();
	ControllerProducto CtlEnva = new ControllerProducto();
	ControllerProducto CtlRefi = new ControllerProducto();
	ControllerProducto CtlPere = new ControllerProducto();

	private JPanel contentPane;
	private JTextField txtCodigo;
	private JTextField txtValorUnitario;
	private JTextField txtCantidad;
	private JTextField txtIdPerecederos;
	private JTextField txtFechaVencimiento;
	private JTextField txtIdEnvasados;
	private JTextField txtPeso;
	private JTextField txtFechaEnvasados;
	private JTextField txtCodigoAprobacion;
	private JTextField txtTemperatura;
	private JComboBox comboOrigen;

	Envasados envasados = new Envasados();
	Refigerados refigerdos = new Refigerados();
	Perecederos perecederos = new Perecederos();

	// este metodo sirve para limpiar los campos de envasados
	public void limpiarCamposEnvasados() {

		txtIdEnvasados.setText(null);
		txtPeso.setAction(null);
		txtFechaEnvasados.setText(null);
		comboOrigen.setSelectedIndex(0);

	}

	// este metodo sirve para limpiar los campos de refigerados
	public void limpiarCamposRefigerados() {

		txtCodigoAprobacion.setText(null);
		txtTemperatura.setAction(null);

	}

	// este metodo sirve para limpiar los campos de perecederos
	public void limpiarCamposPerecederos() {

		txtIdPerecederos.setText(null);
		txtFechaVencimiento.setAction(null);

	}

	// este metodo sirve para limpiar los campos productod
	public void limpiarCampos() {

		txtCodigo.setText(null);
		txtValorUnitario.setText(null);
		txtCantidad.setText(null);

	}

	// este metodo sirve para desabilitar los campos
	public void desabilitarcampos() {

		txtCodigo.enable(false);
		txtValorUnitario.enable(false);
		txtCantidad.enable(false);
		txtIdEnvasados.enable(false);
		txtIdPerecederos.enable(false);
		txtCodigoAprobacion.enable(false);

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
		setBounds(100, 100, 852, 541);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 816, 457);
		contentPane.add(panel);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(48, 11, 357, 424);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel = new JLabel("PRODUCTOS");
		lblNewLabel.setBounds(129, 27, 181, 33);
		panel_1.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("CODIGO:");
		lblNewLabel_1.setBounds(10, 95, 79, 14);
		panel_1.add(lblNewLabel_1);

		txtCodigo = new JTextField();
		txtCodigo.setBounds(166, 92, 117, 20);
		panel_1.add(txtCodigo);
		txtCodigo.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("VALOR UNITARIO:");
		lblNewLabel_2.setBounds(10, 137, 123, 14);
		panel_1.add(lblNewLabel_2);

		txtValorUnitario = new JTextField();
		txtValorUnitario.setBounds(166, 134, 117, 20);
		panel_1.add(txtValorUnitario);
		txtValorUnitario.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("CANTIDAD:");
		lblNewLabel_3.setBounds(10, 179, 106, 14);
		panel_1.add(lblNewLabel_3);

		txtCantidad = new JTextField();
		txtCantidad.setBounds(166, 176, 117, 20);
		panel_1.add(txtCantidad);
		txtCantidad.setColumns(10);

		JButton btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int codigo = Integer.parseInt(txtCodigo.getText());
				int valorUnitario = Integer.parseInt(txtValorUnitario.getText());
				int cantidad = Integer.parseInt(txtCantidad.getText());

				Productos pro = new Productos(codigo, valorUnitario, cantidad);

				if (CtlPro.agregarProducto(pro)) {
					JOptionPane.showMessageDialog(null, "Se registro la Producto" + codigo);
					txtIdPerecederos.setText(txtCodigo.getText());
					txtIdEnvasados.setText(txtCodigo.getText());
					txtCodigoAprobacion.setText(txtCodigo.getText());

					limpiarCampos();
					desabilitarcampos();

				} else {
					JOptionPane.showMessageDialog(null, "No se registro la Producto");
					limpiarCampos();

				}

			}
		});
		btnRegistrar.setBounds(10, 258, 161, 23);
		panel_1.add(btnRegistrar);

		JButton btnBuscarProducto = new JButton("BUSCAR PRODUCTO");
		btnBuscarProducto.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				String cadena = "";

				int codigo = Integer.parseInt(txtCodigo.getText());

				List<Productos> per = CtlPro.buscarProductos(codigo);

				/*
				 * for (Producto elemento : pro) { cadena = cadena + elemento; }
				 */

				JOptionPane.showMessageDialog(null, "Informacion: ");

			}
		});
		btnBuscarProducto.setBounds(181, 258, 166, 23);
		panel_1.add(btnBuscarProducto);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(425, 11, 381, 126);
		panel.add(panel_2);
		panel_2.setLayout(null);

		JLabel lblNewLabel_4 = new JLabel("PERECEDEROS");
		lblNewLabel_4.setBounds(129, 11, 142, 14);
		panel_2.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("ID:");
		lblNewLabel_5.setBounds(32, 35, 46, 14);
		panel_2.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("FECHA DE VENCIMIENTO:");
		lblNewLabel_6.setBounds(29, 63, 158, 14);
		panel_2.add(lblNewLabel_6);

		txtIdPerecederos = new JTextField();
		txtIdPerecederos.setBounds(197, 36, 100, 20);
		panel_2.add(txtIdPerecederos);
		txtIdPerecederos.setColumns(10);

		txtFechaVencimiento = new JTextField();
		txtFechaVencimiento.setBounds(197, 60, 100, 20);
		panel_2.add(txtFechaVencimiento);
		txtFechaVencimiento.setColumns(10);

		JButton btnGuardar = new JButton("GUARDAR");
		btnGuardar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				int id = Integer.parseInt(txtIdPerecederos.getText());
				String fechaVencimiento = txtFechaVencimiento.getText();

				Perecederos pere = new Perecederos(id, fechaVencimiento);
				if (CtlPere.agregarProductoPerecedero(pere)) {
					JOptionPane.showMessageDialog(null, "Se registro el producto ");
					limpiarCamposPerecederos();
					setVisible(false);
					VistaPrincipal vista = new VistaPrincipal();
					vista.setVisible(true);

				} else {
					JOptionPane.showMessageDialog(null, "No se registro el producto ");
					limpiarCampos();

				}

			}
		});
		btnGuardar.setBounds(129, 92, 127, 23);
		panel_2.add(btnGuardar);

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(425, 141, 381, 147);
		panel.add(panel_3);
		panel_3.setLayout(null);

		JLabel lblNewLabel_7 = new JLabel("ENVASADOS");
		lblNewLabel_7.setBounds(128, 0, 154, 14);
		panel_3.add(lblNewLabel_7);

		JLabel lblNewLabel_8 = new JLabel("ID:");
		lblNewLabel_8.setBounds(27, 14, 46, 14);
		panel_3.add(lblNewLabel_8);

		JLabel lblNewLabel_9 = new JLabel("PESO:");
		lblNewLabel_9.setBounds(27, 41, 46, 14);
		panel_3.add(lblNewLabel_9);

		JLabel lblNewLabel_10 = new JLabel("FECHA DE ENVASADO:");
		lblNewLabel_10.setBounds(27, 66, 154, 14);
		panel_3.add(lblNewLabel_10);

		txtIdEnvasados = new JTextField();
		txtIdEnvasados.setBounds(208, 11, 86, 20);
		panel_3.add(txtIdEnvasados);
		txtIdEnvasados.setColumns(10);

		JLabel lblNewLabel_11 = new JLabel("ORIGEN: ");
		lblNewLabel_11.setBounds(27, 91, 117, 14);
		panel_3.add(lblNewLabel_11);

		txtPeso = new JTextField();
		txtPeso.setBounds(208, 38, 86, 20);
		panel_3.add(txtPeso);
		txtPeso.setColumns(10);

		txtFechaEnvasados = new JTextField();
		txtFechaEnvasados.setBounds(208, 63, 86, 20);
		panel_3.add(txtFechaEnvasados);
		txtFechaEnvasados.setColumns(10);

		JButton btnGuardarE = new JButton("GUARDAR");
		btnGuardarE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int idE = Integer.parseInt(txtIdEnvasados.getText());
				int peso = Integer.parseInt(txtPeso.getText());
				String fechaEnvasados = txtFechaEnvasados.getText();
				String origen = String.valueOf(comboOrigen.getSelectedIndex());

				Envasados enva = new Envasados(idE, peso, fechaEnvasados, origen);
				if (CtlEnva.agregarProductoEnvasado(enva)) {
					JOptionPane.showMessageDialog(null, "Se registro el producto ");
					limpiarCamposEnvasados();
					setVisible(false);
					VistaPrincipal vista = new VistaPrincipal();
					vista.setVisible(true);

				} else {
					JOptionPane.showMessageDialog(null, "No se registro el producto ");
					limpiarCampos();

				}

			}
		});
		btnGuardarE.setBounds(109, 114, 134, 23);
		panel_3.add(btnGuardarE);

		JComboBox comboOrigen = new JComboBox();
		comboOrigen.setModel(
				new DefaultComboBoxModel(new String[] { "COLOMBIA", "ARGENTINA", "CHILE", "ECUADOS", "PERU" }));
		comboOrigen.setBounds(208, 87, 86, 22);
		panel_3.add(comboOrigen);

		JPanel panel_4 = new JPanel();
		panel_4.setBounds(425, 299, 381, 147);
		panel.add(panel_4);
		panel_4.setLayout(null);

		JLabel lblNewLabel_12 = new JLabel("REFIGERADOS");
		lblNewLabel_12.setBounds(163, 11, 138, 14);
		panel_4.add(lblNewLabel_12);

		JLabel lblNewLabel_13 = new JLabel("CODIGO DE APROBACION:");
		lblNewLabel_13.setBounds(26, 40, 184, 14);
		panel_4.add(lblNewLabel_13);

		txtCodigoAprobacion = new JTextField();
		txtCodigoAprobacion.setBounds(220, 36, 116, 20);
		panel_4.add(txtCodigoAprobacion);
		txtCodigoAprobacion.setColumns(10);

		JLabel lblNewLabel_14 = new JLabel("TEMPERATURA:");
		lblNewLabel_14.setBounds(26, 75, 184, 14);
		panel_4.add(lblNewLabel_14);

		txtTemperatura = new JTextField();
		txtTemperatura.setBounds(220, 72, 116, 20);
		panel_4.add(txtTemperatura);
		txtTemperatura.setColumns(10);

		JButton btnGuardarR = new JButton("GUARDAR");
		btnGuardarR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int codigoAprobacion = Integer.parseInt(txtCodigoAprobacion.getText());
				float temperatura = Integer.parseInt(txtTemperatura.getText());

				Refigerados refi = new Refigerados(codigoAprobacion, temperatura);
				if (CtlRefi.agregarProductoRefijerado(refi)) {
					JOptionPane.showMessageDialog(null, "Se registro el producto ");
					limpiarCamposRefigerados();
					setVisible(false);
					VistaPrincipal vista = new VistaPrincipal();
					vista.setVisible(true);

				} else {
					JOptionPane.showMessageDialog(null, "No se registro el producto ");
					limpiarCampos();

				}

			}

		});
		btnGuardarR.setBounds(137, 113, 147, 23);
		panel_4.add(btnGuardarR);
	}
}
