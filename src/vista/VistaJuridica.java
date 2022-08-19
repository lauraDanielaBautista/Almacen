package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controlador.ControllerPersona;
import modelo.Juridica;


import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaJuridica extends JPanel {
	private JTextField txtNit;
	private JTextField txtNumeroTributario;
	
	Juridica juridica = new Juridica();
	
	ControllerPersona  CtlJuri = new ControllerPersona();

	
	public void limpiarCampos() {

        txtNit.setText(null);
        txtNumeroTributario.setText(null);
        
    }
	/**
	 * Create the panel.
	 */
	public VistaJuridica() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 392, 278);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NIT :");
		lblNewLabel.setBounds(47, 78, 96, 21);
		panel.add(lblNewLabel);
		
		txtNit = new JTextField();
		txtNit.setBounds(172, 78, 159, 21);
		panel.add(txtNit);
		txtNit.setColumns(10);
		
		JLabel lblNumeroTributario = new JLabel("NUMERO TRIBUTARIO:");
		lblNumeroTributario.setBounds(47, 146, 149, 21);
		panel.add(lblNumeroTributario);
		
		txtNumeroTributario = new JTextField();
		txtNumeroTributario.setBounds(172, 146, 148, 21);
		panel.add(txtNumeroTributario);
		txtNumeroTributario.setColumns(10);
		
		JButton btnFinalizarRegistro = new JButton("FINALIZAR REGISTRO");
		btnFinalizarRegistro.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				int nit = Integer.parseInt(txtNit.getText());
				int numeroTributario =Integer.parseInt(txtNumeroTributario.getText());

				Juridica juri = new Juridica(nit,numeroTributario);
				if (CtlJuri.agregarPersonaJuridica(juri)) {
					JOptionPane.showMessageDialog(null, "Se registro la persona juridica");
					limpiarCampos();
					
				} else {
					JOptionPane.showMessageDialog(null, "No se registro la persona juridica");
					limpiarCampos();

				}
			}
		});
		btnFinalizarRegistro.setBounds(124, 217, 159, 23);
		panel.add(btnFinalizarRegistro);

	}

}
