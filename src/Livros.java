public class Livros {

	private String titulo;
	private int anoLancamento;
	private String escritor;
	private int quantidadePaginas;
	private Quadrinhos quadrinho;

	public void Livro() {
        quadrinho = new Quadrinhos(escritor, anoLancamento, escritor);
    }
    
public void imprimirTituloQuadrinho() {
        quadrinho.imprimirTitulo();
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

		
}