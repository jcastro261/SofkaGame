import java.util.ArrayList;
import java.util.List;

public class Pregunta {

	private long idPregunta;
	private String pregunta;
	private long nivelPregunta;
	List<Respuesta> respuesta;

	public Pregunta() {
		
		this.respuesta= new ArrayList<>();

	}

	public Pregunta(String pregunta, long nivelPregunta) {
		super();

		this.pregunta = pregunta;
		this.nivelPregunta = nivelPregunta;
		this.respuesta= new ArrayList<>();
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

	public long getNivelPregunta() {
		return nivelPregunta;
	}

	public void setNivelPregunta(long nivelPregunta) {
		this.nivelPregunta = nivelPregunta;
	}

	@Override
	public String toString() {
		return "Pregunta [pregunta=" + pregunta + ", nivelPregunta=" + nivelPregunta + "]";
	}

	public void agregarRespuesta(Respuesta res) {
		
		this.respuesta.add(res);

	}

}
