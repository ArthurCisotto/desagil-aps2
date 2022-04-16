package br.edu.insper.desagil.aps2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PandasTest {
	private Pandas p;
	private Map<String, List<String>> resumo;
	private List<String> valores;
	private List<Map<String, String>> series;
	private Map<String, String> serie;

	@BeforeEach
	private void setUp() {
		/* Escreva seu código aqui. */
		p = new Pandas();
		List<Map<String, String>> series;
		Map<String, String> serie;
		Map<String, List<String>> resumo;
		List<String> valores;
	}

	@Test
	void separaExemploComDiretor() {
		/* Escreva seu código aqui. */

		// Nomes
		valores = new ArrayList<>();
		valores.add("Cobra Kai");
		valores.add("The Boys");
		valores.add("Euphoria");

		resumo = new HashMap<>();
		resumo.put("nome", valores);

		// Plataformas
		valores = new ArrayList<>();
		valores.add("Netflix");
		valores.add("Amazon Prime");
		valores.add("HBO Max");

		resumo.put("plataforma", valores);

		// Gêneros
		valores = new ArrayList<>();
		valores.add("aventura");
		valores.add("ação");
		valores.add("drama");

		resumo.put("gênero", valores);

		// Diretores
		valores = new ArrayList<>();
		valores.add("Josh Heald");
		valores.add("Phil Sgriccia");
		valores.add("Sam Levinson");
		resumo.put("diretor", valores);

		// Cria a saída
		series = new ArrayList<>();

		serie = new HashMap<>();
		serie.put("nome", "Cobra Kai");
		serie.put("plataforma", "Netflix");
		serie.put("gênero", "aventura");
		serie.put("diretor", "Josh Heald");
		series.add(serie);

		serie = new HashMap<>();
		serie.put("nome", "The Boys");
		serie.put("plataforma", "Amazon Prime");
		serie.put("gênero", "ação");
		serie.put("diretor", "Phil Sgriccia");
		series.add(serie);

		serie = new HashMap<>();
		serie.put("nome", "Euphoria");
		serie.put("plataforma", "HBO Max");
		serie.put("gênero", "drama");
		serie.put("diretor", "Sam Levinson");
		series.add(serie);

		// Checa se a entrada após aplicação da função é igual à saída criada
		assertEquals(series, p.separa(resumo));
	}
}
