
public class Filme {

	public String Titulo_Filme;
	public boolean Assistiu;
	public int Nota;

	public Filme(String titulo_Filme, boolean assistiu, int nota) {
		Titulo_Filme = titulo_Filme;
		Assistiu = assistiu;
		Nota = nota;
	}

	public String getTítulo_Filme() {
		return Titulo_Filme;
	}

	public void setTítulo_Filme(String título_Filme) {
		Titulo_Filme = título_Filme;
	}

	public boolean isAssistiu() {
		return Assistiu;
	}

	public void setAssistiu(boolean assistiu) {
		Assistiu = assistiu;
	}

	public int getNota() {
		return Nota;
	}

	public void setNota(int nota) {
		Nota = nota;
	}

}