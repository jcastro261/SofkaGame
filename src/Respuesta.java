
public class Respuesta {
	
	private long idRespuesta;
	private String respuesta;
	private boolean estado;
	
	public Respuesta() {
		
	}

	public Respuesta(String respuesta, boolean estado) {
		super();
		
		this.respuesta = respuesta;
		this.estado = estado;
	}

	public long getIdRespuesta() {
		return idRespuesta;
	}

	public void setIdRespuesta(long idRespuesta) {
		this.idRespuesta = idRespuesta;
	}

	public String getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	

}
