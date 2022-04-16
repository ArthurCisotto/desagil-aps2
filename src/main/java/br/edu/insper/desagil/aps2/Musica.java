package br.edu.insper.desagil.aps2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Musica {

	public List<List<String>> converte(Map<Integer, Map<String, String>> albuns) {
		List<List<String>> planilha = new ArrayList<>();

		/* Escreva seu código aqui */
		for(Integer album: albuns.keySet()) {
			Map<String, String> informacoes = albuns.get(album);
			
			// Cria nova lista para cada album, elemento da planilha. 
			List<String> infoAlbum = new ArrayList<>();
			
			//Obtem informações que serão adicionadas na lista do album
			String identificador = Integer.toString(album);
			String artista = informacoes.get("artista").toUpperCase();
			String titulo = informacoes.get("titulo");
			
			//Adiciona informações na lista do album
			infoAlbum.add(identificador);
			infoAlbum.add(artista);
			infoAlbum.add(titulo);
			
			//Adiciona album na planilha
			planilha.add(infoAlbum);
		}
		return planilha;
	}

}
