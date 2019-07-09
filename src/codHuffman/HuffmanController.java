package codHuffman;

public class HuffmanController {

	public void imprimeArvore(No raiz, String s) {
		if(raiz.getEsq() == null || raiz.getDir() == null || Character.isLetter(raiz.c)) {
			System.out.println(raiz.c + ":" + s); 
            return;
		}
		imprimeArvore(raiz.getEsq(), s + "0"); 
		imprimeArvore(raiz.getDir(), s + "1"); 
	}
	
	public HuffmanController() {
		// TODO Auto-generated constructor stub
	}
	
}
