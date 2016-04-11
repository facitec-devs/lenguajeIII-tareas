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
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class FormProveedores extends JDialog {
	private JTextField tfCodigo;
	private JTextField tfNombre;
	private JTextField tfEmpresa;
	private JTextField tfNumero;
	private JTextField tfProducto;
	private JTextField tfDescripcion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			FormProveedores dialog = new FormProveedores();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public FormProveedores() {
		setModal(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		{
			JLabel lblFormularioProveedor = new JLabel("Formulario Proveedor");
			lblFormularioProveedor.setFont(new Font("Arial", Font.BOLD, 14));
			lblFormularioProveedor.setBounds(131, 11, 190, 14);
			getContentPane().add(lblFormularioProveedor);
		}
		{
			JLabel lblNombre = new JLabel("Nombre:");
			lblNombre.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNombre.setBounds(10, 81, 85, 14);
			getContentPane().add(lblNombre);
		}
		{
			JLabel lblEmpresa = new JLabel("Empresa:");
			lblEmpresa.setHorizontalAlignment(SwingConstants.RIGHT);
			lblEmpresa.setBounds(10, 106, 85, 14);
			getContentPane().add(lblEmpresa);
		}
		{
			JLabel lblNumero = new JLabel("Numero:");
			lblNumero.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNumero.setBounds(10, 131, 85, 14);
			getContentPane().add(lblNumero);
		}
		{
			JLabel lblProducto = new JLabel("Producto:");
			lblProducto.setHorizontalAlignment(SwingConstants.RIGHT);
			lblProducto.setBounds(10, 156, 85, 14);
			getContentPane().add(lblProducto);
		}
		{
			JLabel lblCodigo = new JLabel("Codigo:");
			lblCodigo.setHorizontalAlignment(SwingConstants.RIGHT);
			lblCodigo.setBounds(10, 56, 85, 14);
			getContentPane().add(lblCodigo);
		}
		{
			JLabel lblDescripcion = new JLabel("Descripcion:");
			lblDescripcion.setHorizontalAlignment(SwingConstants.RIGHT);
			lblDescripcion.setBounds(10, 181, 85, 14);
			getContentPane().add(lblDescripcion);
		}
		{
			tfCodigo = new JTextField();
			tfCodigo.setBounds(105, 53, 134, 20);
			getContentPane().add(tfCodigo);
			tfCodigo.setColumns(10);
		}
		{
			tfNombre = new JTextField();
			tfNombre.setBounds(105, 78, 134, 20);
			getContentPane().add(tfNombre);
			tfNombre.setColumns(10);
		}
		{
			tfEmpresa = new JTextField();
			tfEmpresa.setBounds(105, 103, 134, 20);
			getContentPane().add(tfEmpresa);
			tfEmpresa.setColumns(10);
		}
		{
			tfNumero = new JTextField();
			tfNumero.setBounds(105, 128, 134, 20);
			getContentPane().add(tfNumero);
			tfNumero.setColumns(10);
		}
		{
			tfProducto = new JTextField();
			tfProducto.setBounds(105, 153, 134, 20);
			getContentPane().add(tfProducto);
			tfProducto.setColumns(10);
		}
		{
			tfDescripcion = new JTextField();
			tfDescripcion.setBounds(105, 178, 134, 20);
			getContentPane().add(tfDescripcion);
			tfDescripcion.setColumns(10);
		}
		{
			JLabel lblEstado = new JLabel("Estado:");
			lblEstado.setHorizontalAlignment(SwingConstants.RIGHT);
			lblEstado.setBounds(10, 206, 85, 14);
			getContentPane().add(lblEstado);
		}
		
		JRadioButton rdbtnActivo = new JRadioButton("Activo");
		rdbtnActivo.setBounds(105, 202, 109, 23);
		getContentPane().add(rdbtnActivo);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(335, 227, 89, 23);
		getContentPane().add(btnGuardar);
	}
}
