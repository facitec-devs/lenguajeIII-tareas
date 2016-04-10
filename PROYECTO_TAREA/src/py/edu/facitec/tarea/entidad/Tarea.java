package py.edu.facitec.tarea.entidad;

public class Tarea {
	
	private String nombre;
	private String descripcion;
	private int prioridad;
	private boolean estado;
	
	public Tarea(){
		
		this.nombre= " ";
		this.descripcion= " ";
		this.prioridad=0;
		this.estado=true;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(int prioridad) {
		this.prioridad = prioridad;
	}

	public boolean getEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	

}
