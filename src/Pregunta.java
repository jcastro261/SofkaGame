import java.util.List;

public class Pregunta {

	private long idPregunta;
	private String pregunta;
	private long idNivel;
	List<Respuesta> respuesta;
	
	public Pregunta() {
		
	}

	public Pregunta(long idPregunta, String pregunta, long idNivel) {
		super();
		this.idPregunta = idPregunta;
		this.pregunta = pregunta;
		this.idNivel = idNivel;
	}

	public long getIdPregunta() {
		return idPregunta;
	}

	public void setIdPregunta(long idPregunta) {
		this.idPregunta = idPregunta;
	}

	public String getPregunta() {
		return pregunta;
	}

	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}

	public long getIdNivel() {
		return idNivel;
	}

	public void setIdNivel(long idNivel) {
		this.idNivel = idNivel;
	}

}
