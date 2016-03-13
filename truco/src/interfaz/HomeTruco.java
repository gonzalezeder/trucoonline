package interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

public class HomeTruco extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton btnModificaEdicion;
	private JButton btnEliminarEdicion;
	private JButton btnAgregarEdicion;
	private JButton BtnRealizarColocacion;

	
	

	/**
	 * Auto-generated main method to display this JFrame
	 */
	
		public static void main(String[] args) {
			SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					HomeTruco inst = new HomeTruco();
					inst.setLocationRelativeTo(null);
					inst.setVisible(true);
				}
			});
		}
		
	public HomeTruco() {
		super();
		initGUI();
	}

	private void initGUI() {
		try {
			{
				setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
				getContentPane().setLayout(null);
				this.setPreferredSize(new java.awt.Dimension(400, 300));
				this.setTitle("Truco Online");
				this.setMinimumSize(new java.awt.Dimension(400, 300));
				this.setResizable(false);
				
				BtnRealizarColocacion = new JButton();

				getContentPane().add(BtnRealizarColocacion);
				BtnRealizarColocacion.setText("Realizar Colocaci�n");
				BtnRealizarColocacion.setBounds(75, 157, 239, 30);
				BtnRealizarColocacion.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						System.out
								.println("btnAgregarEdicion.actionPerformed, event="
										+ evt);
						//RealizarColocacion.getInstancia().setLocationRelativeTo(null);
						//RealizarColocacion.getInstancia().setVisible(true);
					}
				});
			}
			{
				btnAgregarEdicion = new JButton();
				getContentPane().add(btnAgregarEdicion);
				btnAgregarEdicion.setText("Agregar Edici�n");
				btnAgregarEdicion.setBounds(75, 42, 237, 30);
				btnAgregarEdicion.setSize(239, 30);
				btnAgregarEdicion.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						// TODO add your code for
						// btnAgregarEdicion.actionPerformed
						//AltaEdicion.getInstancia().setLocationRelativeTo(null);
						//AltaEdicion.getInstancia().setVisible(true);
					}
				});
			}
			{
				btnEliminarEdicion = new JButton();
				getContentPane().add(btnEliminarEdicion);
				btnEliminarEdicion.setText("Eliminar Edici�n");
				btnEliminarEdicion.setBounds(75, 81, 239, 30);
				btnEliminarEdicion.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						System.out
								.println("btnAgregarEdicion.actionPerformed, event="
										+ evt);
						//BajaEdicion.getInstancia().setLocationRelativeTo(null);
						//BajaEdicion.getInstancia().setVisible(true);
					}
				});
			}
			{
				btnModificaEdicion = new JButton();
				getContentPane().add(btnModificaEdicion);
				btnModificaEdicion.setText("Modificar Edici�n");
				btnModificaEdicion.setBounds(75, 120, 239, 26);
				btnModificaEdicion.setSize(239, 30);
				btnModificaEdicion.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						System.out
								.println("btnAgregarEdicion.actionPerformed, event="
										+ evt);
						//ModificarEdicion.getInstancia().setLocationRelativeTo(null);
						//ModificarEdicion.getInstancia().setVisible(true);
					}
				});
			}
			setSize(400, 300);
			pack();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
