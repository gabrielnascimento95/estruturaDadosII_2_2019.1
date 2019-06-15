package trabalho2_ed2;

import controller.ManipulacaoTxt;

public class Main {

	public static void main(String[] args) {
		System.out.println("hello world");
		ManipulacaoTxt manipulador = new ManipulacaoTxt();
		manipulador.gravar(0, 0.1236564647);
		manipulador.gravar(1, 0.1236644740);
	}

}
