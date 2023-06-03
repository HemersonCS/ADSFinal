
public class Filme {

	private String Titulo_Filme;
	private boolean Assistiu;
	private int Nota;

	public Filme(String titulo_Filme, boolean assistiu, int nota) {
		this.Titulo_Filme = titulo_Filme;
		this.Assistiu = assistiu;
		this.Nota = nota;
	}

	public void FoiAssitido() {
		if (Assistiu == true) {
			System.out.println("O Filme " + getTitulo_Filme() + " foi assistido.");
		} else {
			System.out.println("O Filme " + getTitulo_Filme() + " não foi assistido.");
		}
	}

	public void NotaFilme() {
		if (Assistiu = true) {
			System.out.println("A nota de avaliação do filme foi " + Nota);
		} else {
			System.out.println("Este filme ainda não foi avaliado");
		}
	}

	public String getTitulo_Filme() {
		return Titulo_Filme;
	}

	public void setTitulo_Filme(String titulo_Filme) {
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