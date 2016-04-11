package py.edu.facitec.tarea.dao;
/**
 * @author Alison Berchstoll de Oliveira
 */
import java.sql.SQLException;

import py.edu.facitec.tarea.models.Tarea;
import py.edu.facitec.tarea.util.ConexionManager;

public class TareaDao {
	public static void guardarTarea(Tarea tarea){
		String sql= "insert into tb_tarea(tar_nombre, tar_descripcion, tar_prioridad, tar_estado)"
				+ "values ('"+tarea.getNombre()+"','"+tarea.getDescripcion()+"',"+tarea.getPrioridad()+","+tarea.getEstado()+")";
		System.out.println("SQL : "+sql);
		ConexionManager.abrirConexion();
		try {
			ConexionManager.stm.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ConexionManager.cerrarConexion();
	}
}
