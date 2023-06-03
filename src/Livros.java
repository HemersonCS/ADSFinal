import java.util.Scanner;

public class Livros {

	private String titulo;
	private int anoLancamento;
	private String escritor;
	private int quantidadePaginas;
	private Quadrinhos quadrinhos;

	public void remover () {
		quadrinhos.remove(null);
	}



	public Livros(String titulo, int anoLancamento, String escritor, int quantidadePaginas) {
		this.titulo = titulo;
		this.anoLancamento = anoLancamento;
		this.escritor = escritor;
		this.quantidadePaginas = quantidadePaginas;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public String getEscritor() {
		return escritor;
	}

	public void setEscritor(String escritor) {
		this.escritor = escritor;
	}

	public int getQuantidadePaginas() {
		return quantidadePaginas;
	}

	public void setQuantidadePaginas(int quantidadePaginas) {
		this.quantidadePaginas = quantidadePaginas;
	}

		
	public void mostra() {
		System.out.println("O título do livro é: " + getTitulo());
		
	}

	
	public void identifica() {
       System.out.println("O nome do autor deste livro é: " + getEscritor());		
	}

	public void imprimir() {
		Scanner s = new Scanner(System.in);
		System.out.println("informe a quantidade de páginas desejadas");
		int q = s.nextInt();
		if (q < (getQuantidadePaginas()*0.1)) {
		System.out.println("informe o número da primeira página");
		int p = s.nextInt();
		System.out.println("Documento enviado para a impressora da página "+p+" à "+(p+q-1));
		} else { 
			System.out.println("Reprodução de mais de 10% da obra não permitida!");
		}
		s.close();
	}

}