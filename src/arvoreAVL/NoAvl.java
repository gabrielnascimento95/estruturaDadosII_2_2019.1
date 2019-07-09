package arvoreAVL;

public class NoAvl {
	private NoAvl esquerda;
	private NoAvl direita;
	private NoAvl pai;
	private int userID;
	private int movieID;
	private int balanceamento;
	
	public int getMovieID() {
		return movieID;
	}
	
	public int getUserID() {
		return userID;
	}
	
	public void setMovieID(int movieID) {
		this.movieID = movieID;
	}

	public NoAvl(int userID, int movieID) {
		setEsquerda(setDireita(setPai(null)));
		setBalanceamento(0);
		setMovieID(movieID);
		setUserID(userID);
	}

	public String toString() {
		return Integer.toString(getChave());
	}

	public int getChave() {
		return userID;
	}

	public void setUserID(int chave) {
		this.userID = chave;
	}

	public int getBalanceamento() {
		return balanceamento;
	}

	public void setBalanceamento(int balanceamento) {
		this.balanceamento = balanceamento;
	}

	public NoAvl getPai() {
		return pai;
	}

	public NoAvl setPai(NoAvl pai) {
		this.pai = pai;
		return pai;
	}

	public NoAvl getDireita() {
		return direita;
	}

	public NoAvl setDireita(NoAvl direita) {
		this.direita = direita;
		return direita;
	}

	public NoAvl getEsquerda() {
		return esquerda;
	}

	public void setEsquerda(NoAvl esquerda) {
		this.esquerda = esquerda;
	}
}
