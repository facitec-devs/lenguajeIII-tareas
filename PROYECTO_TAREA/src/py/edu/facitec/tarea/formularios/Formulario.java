package py.edu.facitec.tarea.formularios;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.DefaultComboBoxModel;

import py.edu.facitec.tarea.entidad.Tarea;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class Formulario extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField tf_nombre;
	private JTextField tf_descripcion;
	private JComboBox comboBox;
	private Component chckbxActivo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Formulario dialog = new Formulario();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Formulario() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 29, 46, 14);
		contentPanel.add(lblNombre);
		
		JLabel lblDescripcion = new JLabel("Descripcion:");
		lblDescripcion.setBounds(10, 70, 70, 14);
		contentPanel.add(lblDescripcion);
		
		JLabel lblPrioridad = new JLabel("Prioridad:");
		lblPrioridad.setBounds(10, 167, 46, 14);
		contentPanel.add(lblPrioridad);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setBounds(10, 212, 46, 14);
		contentPanel.add(lblEstado);
		
		tf_nombre = new JTextField();
		tf_nombre.setBounds(66, 26, 279, 30);
		contentPanel.add(tf_nombre);
		tf_nombre.setColumns(10);
		
		tf_descripcion = new JTextField();
		tf_descripcion.setBounds(76, 66, 291, 75);
		contentPanel.add(tf_descripcion);
		tf_descripcion.setColumns(10);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		comboBox.setBounds(66, 164, 173, 20);
		contentPanel.add(comboBox);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				guardarTarea();
			}
		});
		btnGuardar.setBounds(310, 218, 89, 23);
		contentPanel.add(btnGuardar);
		
		chckbxActivo = new JCheckBox("Activo");
		chckbxActivo.setBounds(86, 208, 97, 23);
		contentPanel.add(chckbxActivo);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
		}
	}
	private void guardarTarea(){
		Tarea tarea = new Tarea();
		tarea.setNombre(tf_nombre.getText());
		tarea.setDescripcion(tf_descripcion.getText());
		tarea.setPrioridad(Integer.parseInt((String) comboBox.getSelectedItem()));
		
		
		
		
			
		}
	}

