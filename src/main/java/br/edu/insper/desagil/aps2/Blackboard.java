package br.edu.insper.desagil.aps2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Blackboard {

	public Map<String, Map<String, String>> converte(List<List<String>> planilha) {
		Map<String, Map<String, String>> alunos = new HashMap<>();

		/* Escreva seu código aqui. */
		for (List<String> linha : planilha) {
			String sobrenome = linha.get(1);
			String nome = linha.get(2);
			String conceito = linha.get(3);
			String username = null;

			// Encontra o username
			String email = linha.get(0);
			for (int i = 0; i < email.length(); i++) {
				if (email.charAt(i) == '@') {
					username = email.substring(0, i);
				}
			}

			// Cria o mapa da pessoa
			alunos.put(username, new HashMap<String, String>());
			alunos.get(username).put("nome", nome + " " + sobrenome);
			alunos.get(username).put("conceito", conceito);

		}

		return alunos;
	}

}
