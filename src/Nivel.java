
public class Nivel {

	private long idNivel;
	private int nivel;
	private int premio;

	public Nivel() {

	}

	public Nivel(long idNivel, int nivel, int premio) {
		super();
		this.idNivel = idNivel;
		this.nivel = nivel;
		this.premio = premio;
	}

	public long getIdNivel() {
		return idNivel;
	}

	public void setIdNivel(long idNivel) {
		this.idNivel = idNivel;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public int getPremio() {
		return premio;
	}

	public void setPremio(int premio) {
		this.premio = premio;
	}

}
