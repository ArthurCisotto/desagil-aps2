package br.edu.insper.desagil.aps2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BlackboardTest {
	private Blackboard b;
	private List<List<String>> planilha;
	private List<String> linha;
	private Map<String, Map<String, String>> alunos;
	private Map<String, String> aluno;

	@BeforeEach
	private void setUp() {
		b = new Blackboard();
		planilha = new ArrayList<>();
		alunos = new HashMap<>();
	}

	@Test
	void converteExemploDoEnunciado() {
		linha = new ArrayList<>();
		linha.add("joicem@al.insper.edu.br");
		linha.add("MIAGAVA");
		linha.add("JOICE");
		linha.add("A");
		planilha.add(linha);

		linha = new ArrayList<>();
		linha.add("angelicat@al.insper.edu.br");
		linha.add("TURAÇA");
		linha.add("ANGELICA");
		linha.add("B");
		planilha.add(linha);

		linha = new ArrayList<>();
		linha.add("renantd@al.insper.edu.br");
		linha.add("TREVISOLI DORIA");
		linha.add("RENAN");
		linha.add("C");
		planilha.add(linha);

		linha = new ArrayList<>();
		linha.add("antoniohps1@al.insper.edu.br");
		linha.add("HENRIQUE PINTO SELVATICI");
		linha.add("ANTONIO");
		linha.add("D");
		planilha.add(linha);

		linha = new ArrayList<>();
		linha.add("marceloh2@al.insper.edu.br");
		linha.add("HASHIMOTO");
		linha.add("MARCELO");
		linha.add("I");
		planilha.add(linha);

		aluno = new HashMap<>();
		aluno.put("nome", "JOICE MIAGAVA");
		aluno.put("conceito", "A");
		alunos.put("joicem", aluno);

		aluno = new HashMap<>();
		aluno.put("nome", "ANGELICA TURAÇA");
		aluno.put("conceito", "B");
		alunos.put("angelicat", aluno);

		aluno = new HashMap<>();
		aluno.put("nome", "RENAN TREVISOLI DORIA");
		aluno.put("conceito", "C");
		alunos.put("renantd", aluno);

		aluno = new HashMap<>();
		aluno.put("nome", "ANTONIO HENRIQUE PINTO SELVATICI");
		aluno.put("conceito", "D");
		alunos.put("antoniohps1", aluno);

		aluno = new HashMap<>();
		aluno.put("nome", "MARCELO HASHIMOTO");
		aluno.put("conceito", "I");
		alunos.put("marceloh2", aluno);

		assertEquals(alunos, b.converte(planilha));
	}

	@Test
	void converteMembrosDoGrupo() {
		linha = new ArrayList<>();
		linha.add("andreb10@al.insper.edu.br");
		linha.add("BRITO");
		linha.add("ANDRÉ");
		linha.add("B");
		planilha.add(linha);

		linha = new ArrayList<>();
		linha.add("arthurcsm@al.insper.edu.br");
		linha.add("CISOTTO");
		linha.add("ARTHUR");
		linha.add("A");
		planilha.add(linha);

		aluno = new HashMap<>();
		aluno.put("nome", "ANDRÉ BRITO");
		aluno.put("conceito", "B");
		alunos.put("andreb10", aluno);

		aluno = new HashMap<>();
		aluno.put("nome", "ARTHUR CISOTTO");
		aluno.put("conceito", "A");
		alunos.put("arthurcsm", aluno);

		assertEquals(alunos, b.converte(planilha));

	}
}
