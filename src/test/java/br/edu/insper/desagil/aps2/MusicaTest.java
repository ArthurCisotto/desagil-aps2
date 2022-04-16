	package br.edu.insper.desagil.aps2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MusicaTest {
	private Musica m;
	private Map<Integer, Map<String, String>> albuns;
	private Map<String, String> album;
	private List<List<String>> planilha;
	private List<String> linha;

	@BeforeEach
	private void setUp() {
		m = new Musica();
		albuns = new HashMap<>();
		planilha = new ArrayList<>();
	}

	@Test
	void converteExemploDoEnunciado() {
		album = new HashMap<>();
		/* Escreva seu código aqui. */
		album.put("titulo", "Master of the Rings");
		album.put("artista", "Helloween");
		albuns.put(1, album);
		
		album = new HashMap<>();
		/* Escreva seu código aqui. */
		album.put("titulo", "Dead Winter Dead");
		album.put("artista", "Savatage");
		albuns.put(3, album);
		
		album = new HashMap<>();
		/* Escreva seu código aqui. */
		album.put("titulo", "Paradise Lost");
		album.put("artista", "Symphony X");
		albuns.put(6, album);
		
		linha = new ArrayList<>();
		/* Escreva seu código aqui */
		linha.add("1");
		linha.add("HELLOWEEN");
		linha.add("Master of the Rings");
		planilha.add(linha);
		

		linha = new ArrayList<>();
		/* Escreva seu código aqui. */
		linha.add("3");
		linha.add("SAVATAGE");
		linha.add("Dead Winter Dead");
		planilha.add(linha);
		

		linha = new ArrayList<>();
		/* Escreva seu código aqui. */
		linha.add("6");
		linha.add("SYMPHONY X");
		linha.add("Paradise Lost");
		planilha.add(linha);
		

		assertEquals(planilha, m.converte(albuns));
	}
}
