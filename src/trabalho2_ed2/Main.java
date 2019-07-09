package trabalho2_ed2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import arvoreAVL.Avl;
import controller.LeituraCsv;
import controller.ManipulacaoTxt;
import model.Ratings;

public class Main {

	public static void main(String[] args) {
		ManipulacaoTxt arquivoTxt = new ManipulacaoTxt();
		List<Integer> listEntradas = new ArrayList<Integer>();
		LeituraCsv obj = new LeituraCsv();
		List<Ratings> listRatings = new ArrayList<Ratings>();
		List<Integer> listUserIdAux = new ArrayList<Integer>();
		List<Integer> listMovieIdAux = new ArrayList<Integer>();
		arquivoTxt.lerEntradas(listEntradas);
		
		System.out.println("---------------Objetos dentro da lista---------------\n");
		for(int i =0; i < listEntradas.size(); i++){
			System.out.println("Indice["+i+"] = " + listEntradas.get(i));
		}
		
		System.out.print("\nDigite o índice referente a entrada dos dados: ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.print("Saida selecionada: " + listEntradas.get(n)+ "\n\n");
		
		switch (n) {
		case 0:
			obj.lerRatings(listEntradas.get(0), listRatings);
			System.out.println("Análise dos Algoritmos Utilizando Memória Interna\nOs algoritmos serão "
					+ "listados e a execução dar-se-á" +
					" pelo índice referente à estrutura de dados.\n" +
					" 0 - Arvore AVL\n 1 - Arvore B (d=2)\n 2 - Arvore B (d=20)");
			for(int j = 0; j < listRatings.size(); j++){
				listUserIdAux.add(listRatings.get(j).getUserId());
				listMovieIdAux.add(listRatings.get(j).getMovieId());
			}
			System.out.print("\nDigite o índice referente à estrutura de dados: ");
			Scanner t = new Scanner(System.in);
			int aux = t.nextInt();
			switch(aux){
			case 0:
				Avl arvoreAVL = new Avl();
				long tempoInicioInsertion = System.currentTimeMillis();
				for(int i = 0; i < listRatings.size(); i++) {
					arvoreAVL.inserir(listUserIdAux.get(i), listMovieIdAux.get(i));
				}
				long tempoFinalInsertion = System.currentTimeMillis()-tempoInicioInsertion;
				arquivoTxt.gravarTextoInsercao("Arvore AVL");
				arquivoTxt.gravarMetricasInsercao(listEntradas.get(0), tempoFinalInsertion);
				System.out.println("Tempo de processamento para inserção: " + tempoFinalInsertion + " milissegundos.");
				long tempoInicioBusca = System.currentTimeMillis();
				long tempoFinalBusca = 0;
				arquivoTxt.gravarTextoBusca("Arvore AVL - Busca");
				if(arvoreAVL.busca()) {
					tempoFinalBusca = System.currentTimeMillis()-tempoInicioBusca;
				};
				System.out.println("Tempo de processamento para busca: " + tempoFinalBusca + " milissegundos.");	
				arquivoTxt.gravarMetricasBusca(listEntradas.get(0), tempoFinalBusca);
				break;
			case 1:
				long tempoInicioMerge = System.currentTimeMillis();
				long tempoFinalMerge = System.currentTimeMillis()-tempoInicioMerge;
				arquivoTxt.gravarMetricasInsercao(listEntradas.get(0), tempoFinalMerge);
				System.out.println("Tempo de processamento: " + tempoFinalMerge + " milissegundos.");
				break;
			case 2:
				long tempoInicioHeap = System.currentTimeMillis();
				long tempoFinalHeap = System.currentTimeMillis()-tempoInicioHeap;
				System.out.println("Tempo de processamento: " + tempoFinalHeap + " milissegundos.");
				arquivoTxt.gravar(listEntradas.get(0), tempoFinalHeap);	
				break;
			default:
				break;
			}
			break;
		case 1:
			obj.lerRatings(listEntradas.get(1), listRatings);
			System.out.println("Análise dos Algoritmos Utilizando Memória Interna\nOs algoritmos serão "
					+ "listados e a execução dar-se-á" +
					" pelo índice referente à estrutura de dados.\n" +
					" 0 - Arvore AVL\n 1 - Arvore B (d=2)\n 2 - Arvore B (d=20)");
			for(int j = 0; j < listRatings.size(); j++){
				listUserIdAux.add(listRatings.get(j).getUserId());
				listMovieIdAux.add(listRatings.get(j).getMovieId());
			}
			System.out.print("\nDigite o índice referente à estrutura de dados: ");
			Scanner k = new Scanner(System.in);
			int l = k.nextInt();
			switch(l){
			case 0:
				Avl arvoreAVL = new Avl();
				long tempoInicioInsertion = System.currentTimeMillis();
				for(int i = 0; i < listRatings.size(); i++) {
					arvoreAVL.inserir(listUserIdAux.get(i), listMovieIdAux.get(i));
				}
				long tempoFinalInsertion = System.currentTimeMillis()-tempoInicioInsertion;
				arquivoTxt.gravarTextoInsercao("Arvore AVL");
				arquivoTxt.gravarMetricasInsercao(listEntradas.get(0), tempoFinalInsertion);
				System.out.println("Tempo de processamento: " + tempoFinalInsertion + " milissegundos.");
				long tempoInicioBusca = System.currentTimeMillis();
				long tempoFinalBusca = 0;
				arquivoTxt.gravarTextoBusca("Arvore AVL - Busca");
				if(arvoreAVL.busca()) {
					tempoFinalBusca = System.currentTimeMillis()-tempoInicioBusca;
				};
				System.out.println("Tempo de processamento para busca: " + tempoFinalBusca + " milissegundos.");	
				arquivoTxt.gravarMetricasBusca(listEntradas.get(0), tempoFinalBusca);	
				break;
			case 1:
				long tempoInicioMerge = System.currentTimeMillis();
				long tempoFinalMerge = System.currentTimeMillis()-tempoInicioMerge;
				arquivoTxt.gravarMetricasInsercao(listEntradas.get(0), tempoFinalMerge);
				System.out.println("Tempo de processamento: " + tempoFinalMerge + " milissegundos.");
				break;
			case 2:
				long tempoInicioHeap = System.currentTimeMillis();
				long tempoFinalHeap = System.currentTimeMillis()-tempoInicioHeap;
				System.out.println("Tempo de processamento: " + tempoFinalHeap + " milissegundos.");
				arquivoTxt.gravar(listEntradas.get(0), tempoFinalHeap);	
				break;
			default:
				break;
			}
			break;
		case 2:
			obj.lerRatings(listEntradas.get(2), listRatings);
			System.out.println("Análise dos Algoritmos Utilizando Memória Interna\nOs algoritmos serão "
					+ "listados e a execução dar-se-á" +
					" pelo índice referente à estrutura de dados.\n" +
					" 0 - Arvore AVL\n 1 - Arvore B (d=2)\n 2 - Arvore B (d=20)");
			for(int j = 0; j < listRatings.size(); j++){
				listUserIdAux.add(listRatings.get(j).getUserId());
				listMovieIdAux.add(listRatings.get(j).getMovieId());
			}
			System.out.print("\nDigite o índice referente à estrutura de dados: ");
			Scanner k1 = new Scanner(System.in);
			int l1 = k1.nextInt();
			switch(l1){
			case 0:
				Avl arvoreAVL = new Avl();
				long tempoInicioInsertion = System.currentTimeMillis();
				for(int i = 0; i < listRatings.size(); i++) {
					arvoreAVL.inserir(listUserIdAux.get(i), listMovieIdAux.get(i));
				}
				long tempoFinalInsertion = System.currentTimeMillis()-tempoInicioInsertion;
				arquivoTxt.gravarTextoInsercao("Arvore AVL");
				arquivoTxt.gravarMetricasInsercao(listEntradas.get(2), tempoFinalInsertion);
				System.out.println("Tempo de processamento: " + tempoFinalInsertion + " milissegundos.");
				long tempoInicioBusca = System.currentTimeMillis();
				long tempoFinalBusca = 0;
				arquivoTxt.gravarTextoBusca("Arvore AVL - Busca");
				if(arvoreAVL.busca()) {
					tempoFinalBusca = System.currentTimeMillis()-tempoInicioBusca;
				};
				arquivoTxt.gravarMetricasBusca(listEntradas.get(2), tempoFinalBusca);
				System.out.println("Tempo de processamento para busca: " + tempoFinalBusca + " milissegundos.");	
				break;
			case 1:
				long tempoInicioMerge = System.currentTimeMillis();
				long tempoFinalMerge = System.currentTimeMillis()-tempoInicioMerge;
				arquivoTxt.gravarMetricasInsercao(listEntradas.get(0), tempoFinalMerge);
				System.out.println("Tempo de processamento: " + tempoFinalMerge + " milissegundos.");
				break;
			case 2:
				long tempoInicioHeap = System.currentTimeMillis();
				long tempoFinalHeap = System.currentTimeMillis()-tempoInicioHeap;
				System.out.println("Tempo de processamento: " + tempoFinalHeap + " milissegundos.");
				arquivoTxt.gravar(listEntradas.get(0), tempoFinalHeap);	
				break;
			default:
				break;
			}
			break;
		case 3:
			obj.lerRatings(listEntradas.get(3), listRatings);
			System.out.println("Análise dos Algoritmos Utilizando Memória Interna\nOs algoritmos serão "
					+ "listados e a execução dar-se-á" +
					" pelo índice referente à estrutura de dados.\n" +
					" 0 - Arvore AVL\n 1 - Arvore B (d=2)\n 2 - Arvore B (d=20)");
			for(int j = 0; j < listRatings.size(); j++){
				listUserIdAux.add(listRatings.get(j).getUserId());
				listMovieIdAux.add(listRatings.get(j).getMovieId());
			}
			System.out.print("\nDigite o índice referente à estrutura de dados: ");
			Scanner k4 = new Scanner(System.in);
			int l4 = k4.nextInt();
			switch(l4){
			case 0:
				Avl arvoreAVL = new Avl();
				long tempoInicioInsertion = System.currentTimeMillis();
				for(int i = 0; i < listRatings.size(); i++) {
					arvoreAVL.inserir(listUserIdAux.get(i), listMovieIdAux.get(i));
				}
				long tempoFinalInsertion = System.currentTimeMillis()-tempoInicioInsertion;
				arquivoTxt.gravarTextoInsercao("Arvore AVL");
				arquivoTxt.gravarMetricasInsercao(listEntradas.get(3), tempoFinalInsertion);
				System.out.println("Tempo de processamento: " + tempoFinalInsertion + " milissegundos.");
				long tempoInicioBusca = System.currentTimeMillis();
				long tempoFinalBusca = 0;
				arquivoTxt.gravarTextoBusca("Arvore AVL - Busca");
				if(arvoreAVL.busca()) {
					tempoFinalBusca = System.currentTimeMillis()-tempoInicioBusca;
				};
				arquivoTxt.gravarMetricasBusca(listEntradas.get(3), tempoFinalBusca);
				System.out.println("Tempo de processamento para busca: " + tempoFinalBusca + " milissegundos.");	
				break;
			case 1:
				long tempoInicioMerge = System.currentTimeMillis();
				long tempoFinalMerge = System.currentTimeMillis()-tempoInicioMerge;
				arquivoTxt.gravarMetricasInsercao(listEntradas.get(0), tempoFinalMerge);
				System.out.println("Tempo de processamento: " + tempoFinalMerge + " milissegundos.");
				break;
			case 2:
				long tempoInicioHeap = System.currentTimeMillis();
				long tempoFinalHeap = System.currentTimeMillis()-tempoInicioHeap;
				System.out.println("Tempo de processamento: " + tempoFinalHeap + " milissegundos.");
				arquivoTxt.gravar(listEntradas.get(0), tempoFinalHeap);	
				break;
			default:
				break;
			}
			break;
		case 4:
			obj.lerRatings(listEntradas.get(4), listRatings);
			System.out.println("Análise dos Algoritmos Utilizando Memória Interna\nOs algoritmos serão "
					+ "listados e a execução dar-se-á" +
					" pelo índice referente à estrutura de dados.\n" +
					" 0 - Arvore AVL\n 1 - Arvore B (d=2)\n 2 - Arvore B (d=20)");
			for(int j = 0; j < listRatings.size(); j++){
				listUserIdAux.add(listRatings.get(j).getUserId());
				listMovieIdAux.add(listRatings.get(j).getMovieId());
			}
			System.out.print("\nDigite o índice referente à estrutura de dados: ");
			Scanner k3 = new Scanner(System.in);
			int l3 = k3.nextInt();
			switch(l3){
			case 0:
				Avl arvoreAVL = new Avl();
				long tempoInicioInsertion = System.currentTimeMillis();
				for(int i = 0; i < listRatings.size(); i++) {
					arvoreAVL.inserir(listUserIdAux.get(i), listMovieIdAux.get(i));
				}
				long tempoFinalInsertion = System.currentTimeMillis()-tempoInicioInsertion;
				arquivoTxt.gravarTextoInsercao("Arvore AVL - Inserção");
				arquivoTxt.gravarMetricasInsercao(listEntradas.get(0), tempoFinalInsertion);
				System.out.println("Tempo de processamento: " + tempoFinalInsertion + " milissegundos.");
				long tempoInicioBusca = System.currentTimeMillis();
				long tempoFinalBusca = 0;
				arquivoTxt.gravarTextoBusca("Arvore AVL - Busca");
				if(arvoreAVL.busca()) {
					tempoFinalBusca = System.currentTimeMillis()-tempoInicioBusca;
				};
				arquivoTxt.gravarMetricasBusca(listEntradas.get(0), tempoFinalBusca);
				System.out.println("Tempo de processamento para busca: " + tempoFinalBusca + " milissegundos.");	
				break;
			case 1:
				long tempoInicioMerge = System.currentTimeMillis();
				long tempoFinalMerge = System.currentTimeMillis()-tempoInicioMerge;
				arquivoTxt.gravarMetricasInsercao(listEntradas.get(0), tempoFinalMerge);
				System.out.println("Tempo de processamento: " + tempoFinalMerge + " milissegundos.");
				break;
			case 2:
				long tempoInicioHeap = System.currentTimeMillis();
				long tempoFinalHeap = System.currentTimeMillis()-tempoInicioHeap;
				System.out.println("Tempo de processamento: " + tempoFinalHeap + " milissegundos.");
				arquivoTxt.gravar(listEntradas.get(0), tempoFinalHeap);	
				break;
			default:
				break;
			}
			break;
		case 5:
			System.out.println("Análise dos Algoritmos Utilizando Memória Interna\nOs algoritmos serão "
					+ "listados e a execução dar-se-á" +
					" pelo índice referente à estrutura de dados.\n" +
					" 0 - Arvore AVL\n 1 - Arvore B (d=2)\n 2 - Arvore B (d=20)");
			for(int j = 0; j < listRatings.size(); j++){
				listUserIdAux.add(listRatings.get(j).getUserId());
				listMovieIdAux.add(listRatings.get(j).getMovieId());
			}
			System.out.print("\nDigite o índice referente à estrutura de dados: ");
			Scanner k2 = new Scanner(System.in);
			int l2 = k2.nextInt();
			switch(l2){
			case 0:
				Avl arvoreAVL = new Avl();
				long tempoInicioInsertion = System.currentTimeMillis();
				for(int i = 0; i < listRatings.size(); i++) {
					arvoreAVL.inserir(listUserIdAux.get(i), listMovieIdAux.get(i));
				}
				long tempoFinalInsertion = System.currentTimeMillis()-tempoInicioInsertion;
				arquivoTxt.gravarTextoInsercao("Arvore AVL");
				arquivoTxt.gravarMetricasInsercao(listEntradas.get(5), tempoFinalInsertion);
				System.out.println("Tempo de processamento: " + tempoFinalInsertion + " milissegundos.");
				long tempoInicioBusca = System.currentTimeMillis();
				long tempoFinalBusca = 0;
				arquivoTxt.gravarTextoBusca("Arvore AVL - Busca");
				if(arvoreAVL.busca()) {
					tempoFinalBusca = System.currentTimeMillis()-tempoInicioBusca;
				};
				arquivoTxt.gravarMetricasBusca(listEntradas.get(5), tempoFinalBusca);
				System.out.println("Tempo de processamento para busca: " + tempoFinalBusca + " milissegundos.");	
				break;
			case 1:
				long tempoInicioMerge = System.currentTimeMillis();
				long tempoFinalMerge = System.currentTimeMillis()-tempoInicioMerge;
				arquivoTxt.gravarMetricasInsercao(listEntradas.get(0), tempoFinalMerge);
				System.out.println("Tempo de processamento: " + tempoFinalMerge + " milissegundos.");
				break;
			case 2:
				long tempoInicioHeap = System.currentTimeMillis();
				long tempoFinalHeap = System.currentTimeMillis()-tempoInicioHeap;
				System.out.println("Tempo de processamento: " + tempoFinalHeap + " milissegundos.");
				arquivoTxt.gravar(listEntradas.get(0), tempoFinalHeap);	
				break;
			default:
				break;
			}
			break;
		}
		System.out.println("---------------Fim da parte 1---------------\n");
		
		}
	}
