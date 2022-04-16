package br.edu.insper.desagil.aps2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CadastroTest {
	private Cadastro c;
	private List<Map<String, Integer>> fichas;
	private Map<String, Integer> ficha;
	private Map<String, List<Integer>> resumo;
	private List<Integer> valores;

	@BeforeEach
	private void setUp() {
		c = new Cadastro();
		fichas = new ArrayList<>();
		resumo = new HashMap<>();
	}

	@Test
	void juntaExemploComGordura() {
		/* Escreva seu código aqui. */
		ficha = new HashMap<>();
		ficha.put("idade", 16);
		ficha.put("peso", 6504);
		ficha.put("altura", 161);
		ficha.put("gordura", 11);
		fichas.add(ficha);
		
		ficha = new HashMap<>();
		ficha.put("idade", 17);
		ficha.put("peso", 7055);
		ficha.put("altura", 172);
		ficha.put("gordura", 17);
		fichas.add(ficha);
		
		ficha = new HashMap<>();
		ficha.put("idade", 15);
		ficha.put("peso", 6666);
		ficha.put("altura", 183);
		ficha.put("gordura", 10);
		fichas.add(ficha);
		
		valores = new ArrayList<>();
		valores.add(16);
		valores.add(17);
		valores.add(15);
		resumo.put("idade", valores);
		
		valores = new ArrayList<>();
		valores.add(6504);
		valores.add(7055);
		valores.add(6666);
		resumo.put("peso", valores);
		
		valores = new ArrayList<>();
		valores.add(161);
		valores.add(172);
		valores.add(183);
		resumo.put("altura", valores);
		
		valores = new ArrayList<>();
		valores.add(11);
		valores.add(17);
		valores.add(10);
		resumo.put("gordura", valores);
		
		
		assertEquals(resumo, c.junta(fichas));
	}
}
