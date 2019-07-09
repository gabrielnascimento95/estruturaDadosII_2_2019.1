package codHuffman;

public class No {
	
	int freq;
	char c;
	
	No dir;
	No esq;
	
	public No() {
		// TODO Auto-generated constructor stub
	}
	
	public char getC() {
		return c;
	}
	
	public No getDir() {
		return dir;
	}
	
	public No getEsq() {
		return esq;
	}
	
	public int getFreq() {
		return freq;
	}
	
	public void setC(char c) {
		this.c = c;
	}
	
	public void setDir(No dir) {
		this.dir = dir;
	}

	public void setFreq(int freq) {
		this.freq = freq;
	}

	public void setEsq(No esq) {
		this.esq = esq;
	}
	
	
}
