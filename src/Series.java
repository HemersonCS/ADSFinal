public class Series
    //ATRIBUTOS CLASSE Series
	private int duracaoEpisodio;
    private int numeroEpisodio;
	private int temporadaEpisódio;
	
	public Series(int duracaoEpidodio, int numeroEpisodio, int temporadaEpisodio) {
		this.duracaoEpisodio = duracaoEpisodio;
        this.numeroEpisodio = numeroEpisodio;
		this.temporadaEpisodio = temporadaEpisodio;
		
	
	}

	public int getDuracaoEpisodio() {
		return duracaoEpisodio;
	}

	public void setDuracaoEpisodio(int duracaoEpisodio) {
		this.duracaoEpisodio = duracaoEpisodio;
	}

    public int getNumeroEpisodio() {
        return numeroEpisodio
    }

    public void setNumeroEpisodio(int numeroEpisodio) {
        this.numeroEpisodio = numeroEpisodio;
    }

	public int getTemporadaEpisodio() {
		return temporadaEpisodio;
	}

	public void setTemporadaEpisodio(int temporadaEpisodio) {
		this.temporadaEpisodio = temporadaEpisodio;
	}

	
	public void Maratonar() {
		System.out.println ("Você está assistindo o episódio + "getNu");
		
	}

	
	public void previa() {
		System.out.println ("Exibindo prévia da série "+getNome());
		
	}

	
	
	
	
}
