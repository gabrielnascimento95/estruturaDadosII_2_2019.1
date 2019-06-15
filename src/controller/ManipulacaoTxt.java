package controller;

import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ManipulacaoTxt {

	public ManipulacaoTxt() {
		// TODO Auto-generated constructor stub
	}

	public void ler(List<Integer> listEntradas) {
		String caminhoArq = "/home/gabriel/workspace/estruturaDadosII_2019.1/dcc012/arqs/entradas.txt";
		try {
			FileReader arq = new FileReader(caminhoArq);
			BufferedReader lerArq = new BufferedReader(arq);
			String linha = lerArq.readLine();
			while (linha != null) {
				listEntradas.add(Integer.parseInt(linha));
				linha = lerArq.readLine();
			}
			arq.close();
		} catch (IOException e) {
			System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
		}
	}

	public void gravar(int i, Long tempo) {
		String caminhoArq = "/home/gabriel/saida.txt";
		try {
			BufferedWriter buffWrite = new BufferedWriter(new FileWriter(caminhoArq));
			buffWrite.append("Entrada: " + i + "Tempo: " + tempo + "milessegundos" + "\n");
			buffWrite.close();
		} catch (IOException e) {
			System.err.printf("Erro na gravação do arquivo: %s.\n", e.getMessage());
		}
	}

}
