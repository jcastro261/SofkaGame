import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;

public class Juego {

	private List<Pregunta> listaPregunta;
	private List<HistoricoJuego> historicoJuego;
	private Usuario usuario;

	public Juego() {
		this.listaPregunta = new ArrayList<Pregunta>();
		this.historicoJuego = new ArrayList<>();
	}

	public void crearPregunta() {

		String mensaje = "";
		boolean estado=false;
		boolean respuestaCorrectaEncontrada = false;
		String pregunta = JOptionPane.showInputDialog("Digite la pregunta");
		long nivelPregunta = Long.parseLong(JOptionPane.showInputDialog("digite el nivel de la pregunta(1-5)"));

		this.listaPregunta.add(new Pregunta(pregunta, nivelPregunta));

		for (int i = 0; i < 4; i++) {

			String respuesta = JOptionPane.showInputDialog("Digita respuesta");
			String esCorrecta = "";
			boolean correcta = false;

			if (estado == false) {
				esCorrecta = JOptionPane.showInputDialog("Es la respuesta correcta? [s/n]");
			}

			if (esCorrecta == "s" || esCorrecta == "S") {
				correcta = true;
				estado = true;
			}

			this.listaPregunta.get(this.listaPregunta.size() - 1).agregarRespuesta(new Respuesta(respuesta,correcta));

		}

	}

	public Respuesta crearRespuesta(boolean estado) {

		String respuesta = JOptionPane.showInputDialog("Digita respuesta");
		String esCorrecta = "";
		boolean correcta = false;

		if (estado == false) {
			esCorrecta = JOptionPane.showInputDialog("Es la respuesta correcta? [s/n]");
		}

		if (esCorrecta == "s" || esCorrecta == "S") {
			correcta = true;
			estado = true;
		}
		return new Respuesta(respuesta, correcta);
	}

	public void jugar() {

		int opcionJuego = Integer
				.parseInt(JOptionPane.showInputDialog("Que desea realizar: \n 1.Jugas \n 2.Crear pregunta "));
		switch (opcionJuego) {
		case 1:
			break;
		case 2:
			crearPregunta();
			break;

		}

	}

}
