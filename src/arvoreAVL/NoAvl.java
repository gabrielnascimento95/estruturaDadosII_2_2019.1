package arvoreAVL;

public class NoAvl {
	private NoAvl esquerda;
	private NoAvl direita;
	private NoAvl pai;
	private int chave;
	private int balanceamento;

	public NoAvl(int k) {
		setEsquerda(setDireita(setPai(null)));
		setBalanceamento(0);
		setChave(k);
	}

	public String toString() {
		return Integer.toString(getChave());
	}

	public int getChave() {
		return chave;
	}

	public void setChave(int chave) {
		this.chave = chave;
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
