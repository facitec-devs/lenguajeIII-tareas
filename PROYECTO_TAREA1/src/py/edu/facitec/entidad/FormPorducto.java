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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;

public class FormPorducto extends JDialog {
	private JTextField tfCodigo;
	private JTextField tfProducto;
	private JTextField tfDescripcion1;
	private JTextField tfDescripcion2;
	private JTextField tfCantidad;
	private JTextField tfPrecio;
	private JTextField tfProveedor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			FormPorducto dialog = new FormPorducto();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public FormPorducto() {
		setModal(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		{
			JLabel lblFormularioProducto = new JLabel("Formulario Producto");
			lblFormularioProducto.setFont(new Font("Arial", Font.BOLD, 14));
			lblFormularioProducto.setBounds(130, 11, 172, 14);
			getContentPane().add(lblFormularioProducto);
		}
		{
			JLabel lblCodigo = new JLabel("Codigo:");
			lblCodigo.setHorizontalAlignment(SwingConstants.RIGHT);
			lblCodigo.setBounds(10, 39, 88, 14);
			getContentPane().add(lblCodigo);
		}
		{
			JLabel lblProducto = new JLabel("Producto:");
			lblProducto.setHorizontalAlignment(SwingConstants.RIGHT);
			lblProducto.setBounds(10, 64, 88, 14);
			getContentPane().add(lblProducto);
		}
		{
			JLabel lblDescripcion = new JLabel("Descripcion:");
			lblDescripcion.setHorizontalAlignment(SwingConstants.RIGHT);
			lblDescripcion.setBounds(10, 89, 88, 14);
			getContentPane().add(lblDescripcion);
		}
		{
			JLabel lblCantidad = new JLabel("Cantidad:");
			lblCantidad.setHorizontalAlignment(SwingConstants.RIGHT);
			lblCantidad.setBounds(10, 139, 88, 14);
			getContentPane().add(lblCantidad);
		}
		{
			JLabel lblPrecio = new JLabel("Precio:");
			lblPrecio.setHorizontalAlignment(SwingConstants.RIGHT);
			lblPrecio.setBounds(10, 164, 88, 14);
			getContentPane().add(lblPrecio);
		}
		{
			JLabel lblProveedor = new JLabel("Proveedor:");
			lblProveedor.setHorizontalAlignment(SwingConstants.RIGHT);
			lblProveedor.setBounds(10, 189, 88, 14);
			getContentPane().add(lblProveedor);
		}
		{
			JLabel lblCategoria = new JLabel("Categoria:");
			lblCategoria.setHorizontalAlignment(SwingConstants.RIGHT);
			lblCategoria.setBounds(10, 214, 88, 14);
			getContentPane().add(lblCategoria);
		}
		
		tfCodigo = new JTextField();
		tfCodigo.setBounds(108, 36, 153, 20);
		getContentPane().add(tfCodigo);
		tfCodigo.setColumns(10);
		
		tfProducto = new JTextField();
		tfProducto.setBounds(108, 61, 153, 20);
		getContentPane().add(tfProducto);
		tfProducto.setColumns(10);
		
		tfDescripcion1 = new JTextField();
		tfDescripcion1.setBounds(108, 86, 153, 20);
		getContentPane().add(tfDescripcion1);
		tfDescripcion1.setColumns(10);
		
		tfDescripcion2 = new JTextField();
		tfDescripcion2.setBounds(108, 111, 153, 20);
		getContentPane().add(tfDescripcion2);
		tfDescripcion2.setColumns(10);
		
		tfCantidad = new JTextField();
		tfCantidad.setBounds(108, 136, 153, 20);
		getContentPane().add(tfCantidad);
		tfCantidad.setColumns(10);
		
		tfPrecio = new JTextField();
		tfPrecio.setBounds(108, 161, 153, 20);
		getContentPane().add(tfPrecio);
		tfPrecio.setColumns(10);
		
		tfProveedor = new JTextField();
		tfProveedor.setBounds(108, 186, 153, 20);
		getContentPane().add(tfProveedor);
		tfProveedor.setColumns(10);
		
		JComboBox cbCategoria = new JComboBox();
		cbCategoria.setModel(new DefaultComboBoxModel(new String[] {"Electronico", "Cosmetico", "Electrodomestico", "Deporte", "Alimenticio"}));
		cbCategoria.setBounds(108, 211, 153, 20);
		getContentPane().add(cbCategoria);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(335, 227, 89, 23);
		getContentPane().add(btnGuardar);
	}
}
