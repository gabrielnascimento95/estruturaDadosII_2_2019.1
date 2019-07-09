package controller;

import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ManipulacaoTxt {

	public ManipulacaoTxt() {
		// TODO Auto-generated constructor stub
	}

	public void lerEntradas(List<Integer> listEntradas) {
		String caminhoArq = "/home/gabriel/eclipse-workspace/trabalho2_ed2/arquivos/entradas.txt";
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

	public void gravar(int i, double tempo) {
		String caminhoArq = "/home/gabriel/eclipse-workspace/trabalho2_ed2/arquivos/saida.txt";
		try {
			PrintWriter printWriter = new PrintWriter(new FileWriter(caminhoArq, true));
			printWriter.println("Entrada: " + i + " - Tempo: " + tempo + "milessegundos");
			printWriter.println("-------------------------------------------------------------");
			printWriter.flush();
			printWriter.close();
		} catch (IOException e) {
			System.err.printf("Erro na gravação do arquivo: %s.\n", e.getMessage());
		}
	}
	
	public void gravarMetricasInsercao(int i, double tempo) {
		String caminhoArq = "/home/gabriel/eclipse-workspace/trabalho2_ed2/arquivos/saidaInsercao.txt";
		try {
			PrintWriter printWriter = new PrintWriter(new FileWriter(caminhoArq, true));
			printWriter.println("Entrada: " + i + " - Tempo: " + tempo + "milessegundos");
			printWriter.println("-------------------------------------------------------------");
			printWriter.flush();
			printWriter.close();
		} catch (IOException e) {
			System.err.printf("Erro na gravação do arquivo: %s.\n", e.getMessage());
		}
	}
	
	public void gravarTexto(String mensagem) {
		String caminhoArq = "/home/gabriel/eclipse-workspace/trabalho2_ed2/arquivos/saidaInsercao.txt";
		try {
			PrintWriter printWriter = new PrintWriter(new FileWriter(caminhoArq, true));
			printWriter.println(mensagem);
			printWriter.flush();
			printWriter.close();
		} catch (IOException e) {
			System.err.printf("Erro na gravação do arquivo: %s.\n", e.getMessage());
		}
	}

}
