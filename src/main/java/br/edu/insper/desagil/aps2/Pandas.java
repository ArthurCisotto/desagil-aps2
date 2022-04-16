package br.edu.insper.desagil.aps2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pandas {

	public List<Map<String, String>> separa(Map<String, List<String>> resumo) {
		List<Map<String, String>> series = new ArrayList<>();

		List<String> keys = new ArrayList<>(resumo.keySet());

		// Obtém o tamanho da lista de resumo
		int resumoLength = resumo.get(keys.get(0)).size();


		for (int i = 0; i < resumoLength; i++) {
			// Cria um mapa para cada série
			Map<String, String> serie = new HashMap<>();

			for (String key : keys) {
				// Adiciona no mapa a chave e o valor
				serie.put(key, resumo.get(key).get(i));
			}

			// Adiciona o mapa a lista
			series.add(serie);
		}

		return series;
	}

}
