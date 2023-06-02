public class Series {

	private String nome;
	private double avaliacaoIMDb;
	private String criador;
	private int quantidadeEpisodios;
	private double somaDasAvaliacoes;
	private int totalDeAvaliacoes;
	
	public Series(String nome, double avaliacaoIMDb, String criador, int quantidadeEpisodios, double somaDasAvaliacoes, int totalDeAvaliacoes) {
		super();
		this.nome = nome;
		this.avaliacaoIMDb = avaliacaoIMDb;
		this.criador = criador;
		this.quantidadeEpisodios = quantidadeEpisodios;
		this.somaDasAvaliacoes = somaDasAvaliacoes;
		this.totalDeAvaliacoes = totalDeAvaliacoes;
		
	
	}

	public String getNome() {
		return nome;
	}

	public double getAvaliacaoIMDb() {
		return avaliacaoIMDb;
	}

	public String getCriador() {
		return criador;
	}

	public int getQuantidadeEpisodios() {
		return quantidadeEpisodios;
	}

	public double getSomaDasAvaliacoes() {
		return somaDasAvaliacoes;
	}

	public int getTotalDeAvaliacoes() {
		return totalDeAvaliacoes;
	}
	public void exibeFichaTecnica(){
		System.out.println("Nome do filme: " + nome);
		System.out.println("Nome do criador: " + criador);
		System.out.println("Nome do criador: " + quantidadeEpisodios);
	}
	public double exibeMediaAvaliacao() {
		return somaDasAvaliacoes / totalDeAvaliacoes;
	}
}
