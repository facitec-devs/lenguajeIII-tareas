package py.edu.facitec.entidad;
/**
 * @author Alison Berchstoll de Oliveira
 */
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormCliente extends JDialog {
	private JTextField tfNombre;
	private JTextField tfApellido;
	private JTextField tfNumerodeCi;
	private JTextField tfDireccion;
	private JTextField tfDireccion2;
	private JTextField tfTelefono;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			FormCliente dialog = new FormCliente();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public FormCliente() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblFormularioCiiente = new JLabel("Formulario CIiente");
		lblFormularioCiiente.setFont(new Font("Arial", Font.BOLD, 14));
		lblFormularioCiiente.setBounds(132, 11, 151, 14);
		getContentPane().add(lblFormularioCiiente);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNombre.setBounds(10, 35, 96, 14);
		getContentPane().add(lblNombre);
		
		tfNombre = new JTextField();
		tfNombre.setBounds(116, 36, 167, 20);
		getContentPane().add(tfNombre);
		tfNombre.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setHorizontalAlignment(SwingConstants.RIGHT);
		lblApellido.setBounds(10, 60, 96, 14);
		getContentPane().add(lblApellido);
		
		tfApellido = new JTextField();
		tfApellido.setBounds(116, 61, 167, 20);
		getContentPane().add(tfApellido);
		tfApellido.setColumns(10);
		
		JLabel lblNumeroDeCi = new JLabel("Numero de CI:");
		lblNumeroDeCi.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNumeroDeCi.setBounds(10, 85, 96, 14);
		getContentPane().add(lblNumeroDeCi);
		
		tfNumerodeCi = new JTextField();
		tfNumerodeCi.setBounds(116, 86, 167, 20);
		getContentPane().add(tfNumerodeCi);
		tfNumerodeCi.setColumns(10);
		
		JLabel lblDireccion = new JLabel("Direccion:");
		lblDireccion.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDireccion.setBounds(10, 110, 96, 14);
		getContentPane().add(lblDireccion);
		
		tfDireccion = new JTextField();
		tfDireccion.setBounds(116, 111, 167, 20);
		getContentPane().add(tfDireccion);
		tfDireccion.setColumns(10);
		
		tfDireccion2 = new JTextField();
		tfDireccion2.setBounds(116, 142, 167, 20);
		getContentPane().add(tfDireccion2);
		tfDireccion2.setColumns(10);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTelefono.setBounds(10, 171, 96, 14);
		getContentPane().add(lblTelefono);
		
		tfTelefono = new JTextField();
		tfTelefono.setBounds(116, 172, 167, 20);
		getContentPane().add(tfTelefono);
		tfTelefono.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(335, 206, 89, 23);
		getContentPane().add(btnGuardar);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFormularios = new JMenu("Formularios");
		menuBar.add(mnFormularios);
		
		JMenuItem mntmProveedores = new JMenuItem("Proveedores");
		mntmProveedores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				abrirFormProvedores();
			}
		});
		mnFormularios.add(mntmProveedores);
		
		JMenuItem mntmProductos = new JMenuItem("Productos");
		mntmProductos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirFormProductos();
			}
		});
		mnFormularios.add(mntmProductos);
	}
	private void abrirFormProvedores() {
		FormProveedores formProveedores = new FormProveedores();
		formProveedores.setVisible(true);

	}
	private void abrirFormProductos() {
		FormPorducto formPorducto = new FormPorducto();
		formPorducto.setVisible(true);

	}
}
