public class Series {

	private String nome;
	private double avaliacaoIMDb;
	private String criador;
	private int quantidadeEpisodios;
	
	public Series(String nome, double avaliacaoIMDb, String criador, int quantidadeEpisodios) {
		super();
		this.nome = nome;
		this.avaliacaoIMDb = avaliacaoIMDb;
		this.criador = criador;
		this.quantidadeEpisodios = quantidadeEpisodios;
		
	
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getAvaliacaoIMDb() {
		return avaliacaoIMDb;
	}

	public void setAvaliacaoIMDb(double avaliacaoIMDb) {
		this.avaliacaoIMDb = avaliacaoIMDb;
	}

	public String getCriador() {
		return criador;
	}

	public void setCriador(String criador) {
		this.criador = criador;
	}

	public int getQuantidadeEpisodios() {
		return quantidadeEpisodios;
	}

	public void setQuantidadeEpisodios(int quantidadeEpisodios) {
		this.quantidadeEpisodios = quantidadeEpisodios;
	}

	
}
