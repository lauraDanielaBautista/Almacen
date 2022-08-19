package vista;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class VistaOpcionesProductos extends JPanel {

	/**
	 * Create the panel.
	 */
	public VistaOpcionesProductos() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 394, 278);
		add(panel);
		panel.setLayout(null);
		
		JButton btnEnavasados = new JButton("ENAVASADOS");
		btnEnavasados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEnavasados.setBounds(34, 108, 116, 23);
		panel.add(btnEnavasados);
		
		JButton btnPerecederos = new JButton("PERECEDEROS");
		btnPerecederos.setBounds(154, 165, 105, 23);
		panel.add(btnPerecederos);
		
		JButton btnRefijerados = new JButton("REFIJERADOS");
		btnRefijerados.setBounds(256, 108, 110, 23);
		panel.add(btnRefijerados);
		
		JLabel lblEli = new JLabel("ELIJA EL PRODUCTO");
		lblEli.setBounds(154, 35, 128, 14);
		panel.add(lblEli);

	}
}
