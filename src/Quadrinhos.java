import java.util.ArrayList;

public class Quadrinhos {

	private String titulo;
    private int anoLancamento;
    private String ilustrador;
	
	public Quadrinhos(String titulo, int anoLancamento, String ilustrador) {
		this.titulo = titulo;
        this.anoLancamento = anoLancamento;
		this.ilustrador = ilustrador;
	}

	Livros livros = new Livros(titulo, anoLancamento, ilustrador, 0);

	ArrayList<Quadrinhos> quadrinhos = new ArrayList<Quadrinhos>();

	public String getTitulo() {
		return titulo;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public String getIlustrador() {
		return ilustrador;
	}

	public void cadastrar () {
		quadrinhos.add(null);
	}
	
	public void exibir () {
		System.out.println ("Nome: "+ getTitulo()+ ", foi lançado em "+getAnoLancamento()+", ilustrado por "+getIlustrador());
	}

	public void livroMostra (){
		livros.mostra();
	}

    public void imprimirTitulo() {
    }

	public void exibe() {
		quadrinho.exibir();
	}
	
}