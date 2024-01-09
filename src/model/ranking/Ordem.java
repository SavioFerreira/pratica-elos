package model.ranking;

import java.util.ArrayList;
import java.util.List;

import model.Elo;

public class Ordem {

	List<Elo> jogadores = new ArrayList<>();
	
	public List<Elo> getJogadores() {
		return jogadores;
	}

	public void setJogadores(List<Elo> jogadores) {
		this.jogadores = jogadores;
	}

	public Ordem(Elo elo, Integer value) {
		
		jogadores.add(elo);
		
		System.out.println("\n\n \tOrdem hierarquica de elos com base na pontuacao do jogador.\n");
		System.out.println("\n\tA pontuacao vai de 0 a 100.\n");
		for(Elo i: jogadores)
		System.out.println("\tO jogador " + elo.getName() + " possui " + value + " pontos e está no elo " + elo.rank(value));
	}

}
