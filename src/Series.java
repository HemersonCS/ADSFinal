Series.js
public class Series
    //ATRIBUTOS CLASSE Series
	private Int duracaoEpisodio;
    private Int numeroEpisodio;
	private int temporadaEpisódio;
	
	public Series(Int duracaoEpidodio, , int numeroEpisodio, int temporadaEpisodio) {
		this.duracaoEpisodio = duracaoEpisodio;
        this.numeroEpisodio - numeroEpisodio;
		this.temporadaEpisodio = temporadaEpisodio;
		
	
	}

	public Int getDuracaoEpisodio() {
		return duracaoEpisodio;
	}

	public void setDuracaoEpisodio(Int duracaoEpisodio) {
		this.duracaoEpisodio = duracaoEpisodio;
	}

    public Int getNumeroEpisodio() {
        return numeroEpisodio
    }

    public void setNumeroEpisodio(Int numeroEpisodio) {
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
