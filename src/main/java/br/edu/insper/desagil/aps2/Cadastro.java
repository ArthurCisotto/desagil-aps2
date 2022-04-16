package br.edu.insper.desagil.aps2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cadastro {

	public Map<String, List<Integer>> junta(List<Map<String, Integer>> fichas) {
		Map<String, List<Integer>> resumo = new HashMap<>();

		/* Escreva seu código aqui. */
		for (Map<String, Integer> ficha: fichas) {
			for (String informacao: ficha.keySet()) {
				Integer valor = ficha.get(informacao);
				if (!resumo.containsKey(informacao)) {
					List<Integer> listaValores = new ArrayList<>();
					listaValores.add(valor);					
					resumo.put(informacao, listaValores);
			    }else {
			    	List<Integer> listaValores = resumo.get(informacao);
			    	listaValores.add(valor);
			    	resumo.put(informacao, listaValores);
			    }
			}
		}

		return resumo;
	}

}