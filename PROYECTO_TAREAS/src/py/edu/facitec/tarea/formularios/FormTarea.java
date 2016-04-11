package py.edu.facitec.tarea.formularios;
/**
 * @author Alison Berchstoll de Oliveira
 */
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import py.edu.facitec.tarea.dao.TareaDao;
import py.edu.facitec.tarea.models.Tarea;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JEditorPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;

public class FormTarea extends JDialog {
	private JTextField tfNombre;
	private JTextPane tpDescripcion;
	private JRadioButton rdbtnActivo;
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			FormTarea dialog = new FormTarea();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public FormTarea() {
		setBounds(100, 100, 450, 300);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		{
			JLabel lblFormularioTarea = new JLabel("Formulario Tarea");
			lblFormularioTarea.setFont(new Font("Arial", Font.BOLD, 17));
			GridBagConstraints gbc_lblFormularioTarea = new GridBagConstraints();
			gbc_lblFormularioTarea.gridwidth = 8;
			gbc_lblFormularioTarea.gridheight = 2;
			gbc_lblFormularioTarea.insets = new Insets(0, 0, 5, 0);
			gbc_lblFormularioTarea.gridx = 0;
			gbc_lblFormularioTarea.gridy = 0;
			gbc_lblFormularioTarea.weightx=3;
			getContentPane().add(lblFormularioTarea, gbc_lblFormularioTarea);
		}
		{
			JLabel lblNombre = new JLabel("Nombre:");
			GridBagConstraints gbc_lblNombre = new GridBagConstraints();
			gbc_lblNombre.anchor = GridBagConstraints.EAST;
			gbc_lblNombre.gridwidth = 3;
			gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
			gbc_lblNombre.gridx = 1;
			gbc_lblNombre.gridy = 4;
			getContentPane().add(lblNombre, gbc_lblNombre);
		}
		{
			tfNombre = new JTextField();
			GridBagConstraints gbc_tfNombre = new GridBagConstraints();
			gbc_tfNombre.insets = new Insets(0, 0, 5, 5);
			gbc_tfNombre.fill = GridBagConstraints.HORIZONTAL;
			gbc_tfNombre.gridx = 4;
			gbc_tfNombre.gridy = 4;
			getContentPane().add(tfNombre, gbc_tfNombre);
			tfNombre.setColumns(10);
		}
		{
			JLabel lblDescripcion = new JLabel("Descripcion:");
			GridBagConstraints gbc_lblDescripcion = new GridBagConstraints();
			gbc_lblDescripcion.anchor = GridBagConstraints.EAST;
			gbc_lblDescripcion.gridwidth = 3;
			gbc_lblDescripcion.insets = new Insets(0, 0, 5, 5);
			gbc_lblDescripcion.gridx = 1;
			gbc_lblDescripcion.gridy = 5;
			getContentPane().add(lblDescripcion, gbc_lblDescripcion);
		}
		{
			tpDescripcion = new JTextPane();
			GridBagConstraints gbc_tpDescripcion = new GridBagConstraints();
			gbc_tpDescripcion.gridheight = 2;
			gbc_tpDescripcion.insets = new Insets(0, 0, 5, 5);
			gbc_tpDescripcion.fill = GridBagConstraints.BOTH;
			gbc_tpDescripcion.gridx = 4;
			gbc_tpDescripcion.gridy = 5;
			getContentPane().add(tpDescripcion, gbc_tpDescripcion);
		}
		{
			JLabel lblPrioridad = new JLabel("Prioridad:");
			GridBagConstraints gbc_lblPrioridad = new GridBagConstraints();
			gbc_lblPrioridad.anchor = GridBagConstraints.EAST;
			gbc_lblPrioridad.gridwidth = 3;
			gbc_lblPrioridad.insets = new Insets(0, 0, 5, 5);
			gbc_lblPrioridad.gridx = 1;
			gbc_lblPrioridad.gridy = 7;
			getContentPane().add(lblPrioridad, gbc_lblPrioridad);
		}
		{
			comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"5", "4", "3", "2", "1"}));
			GridBagConstraints gbc_comboBox = new GridBagConstraints();
			gbc_comboBox.insets = new Insets(0, 0, 5, 5);
			gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
			gbc_comboBox.gridx = 4;
			gbc_comboBox.gridy = 7;
			getContentPane().add(comboBox, gbc_comboBox);
		}
		{
			JLabel lblEstado = new JLabel("Estado:");
			GridBagConstraints gbc_lblEstado = new GridBagConstraints();
			gbc_lblEstado.anchor = GridBagConstraints.EAST;
			gbc_lblEstado.gridwidth = 3;
			gbc_lblEstado.insets = new Insets(0, 0, 5, 5);
			gbc_lblEstado.gridx = 1;
			gbc_lblEstado.gridy = 8;
			getContentPane().add(lblEstado, gbc_lblEstado);
		}
		{
			JButton btnGuardar = new JButton("Guardar");
			btnGuardar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					registrarTareas();
				}
			});
			{
			rdbtnActivo = new JRadioButton("Activo");
			GridBagConstraints gbc_rdbtnActivo = new GridBagConstraints();
			gbc_rdbtnActivo.insets = new Insets(0, 0, 5, 5);
			gbc_rdbtnActivo.gridx = 4;
			gbc_rdbtnActivo.gridy = 8;
			getContentPane().add(rdbtnActivo, gbc_rdbtnActivo);
			}
			GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
			gbc_btnGuardar.insets = new Insets(0, 0, 0, 5);
			gbc_btnGuardar.gridx = 4;
			gbc_btnGuardar.gridy = 9;
			getContentPane().add(btnGuardar, gbc_btnGuardar);
		}
	}
	private void registrarTareas() {
		Tarea tarea = new Tarea();
		tarea.setNombre(tfNombre.getText());
		tarea.setDescripcion(tpDescripcion.getText());
		tarea.setPrioridad(Integer.parseInt((String) comboBox.getSelectedItem()));
		tarea.setEstado(rdbtnActivo.isSelected());
		TareaDao.guardarTarea(tarea);
		

	}

}
