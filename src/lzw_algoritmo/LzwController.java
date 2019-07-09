package lzw_algoritmo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LzwController {
	
	public LzwController() {
		// TODO Auto-generated constructor stub
	}
	
	public static List<Integer> compressao(String semCompressao) {
        // construção do dicionário
        int tam = 256;
        Map<String,Integer> dicionario = new HashMap<String,Integer>();
        for (int i = 0; i < 256; i++)
            dicionario.put("" + (char)i, i);
 
        String w = "";
        List<Integer> resultado = new ArrayList<Integer>();
        for (char c : semCompressao.toCharArray()) {
            String wc = w + c;
            if (dicionario.containsKey(wc))
                w = wc;
            else {
                resultado.add(dicionario.get(w));
                // adição da chave no dicionário
                dicionario.put(wc, tam++);
                w = "" + c;
            }
        }
        if (!w.equals(""))
            resultado.add(dicionario.get(w));
        return resultado;
    }
	
	public static String decompressao(List<Integer> comprimida) {
        // construção do dicionário
        int tam = 256;
        Map<Integer,String> dicionario = new HashMap<Integer,String>();
        for (int i = 0; i < 256; i++)
            dicionario.put(i, "" + (char)i);
 
        String w = "" + (char)(int)comprimida.remove(0);
        StringBuffer resultado = new StringBuffer(w);
        for (int k : comprimida) {
            String entrada;
            if (dicionario.containsKey(k))
                entrada = dicionario.get(k);
            else if (k == tam)
                entrada = w + w.charAt(0);
            else
                throw new IllegalArgumentException("Compressão inválida: " + k); 
            resultado.append(entrada);
            // Adiciona chave + entrada.
            dicionario.put(tam++, w + entrada.charAt(0));
            w = entrada;
        }
        return resultado.toString();
    }
}
