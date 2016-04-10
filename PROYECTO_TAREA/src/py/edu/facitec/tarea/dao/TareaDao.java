package py.edu.facitec.tarea.dao;

import java.sql.SQLException;

import py.edu.facitec.tarea.entidad.Tarea;
import py.edu.facitec.tarea.util.ConexionManager;

public class TareaDao {
	
	public static void guardarTarea( Tarea tarea){
		String sql=" insert into tb_tarea(tar_nombre, tar_desripcion, tar_prioridad, tar_estado) values ( '" + tarea.getNombre()+"','" + tarea.getDescripcion
				()+"' , "+tarea.getPrioridad()+", "+tarea.getEstado()+")";
		
		System.out.println( " SQL : " + sql);
		ConexionManager.abrirConexion();
		try {
			ConexionManager.stm.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		ConexionManager.cerrarConexion();
	}
	


}
