package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaOpcionesPersona extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaOpcionesPersona frame = new VistaOpcionesPersona();
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
	public VistaOpcionesPersona() {
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
		
		JButton btnPersonaJuridica = new JButton("PERSONA JURIDICA");
		btnPersonaJuridica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPersonaJuridica.setBounds(54, 102, 136, 23);
		panel.add(btnPersonaJuridica);
		
		JButton btnPersonaNatural = new JButton("PERSONA NATURAL");
		btnPersonaNatural.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPersonaNatural.setBounds(242, 102, 129, 23);
		panel.add(btnPersonaNatural);
		
		JLabel lblEscojaSuOpcion = new JLabel("ESCOJA SU OPCION");
		lblEscojaSuOpcion.setBounds(148, 28, 148, 14);
		panel.add(lblEscojaSuOpcion);
	}

}
