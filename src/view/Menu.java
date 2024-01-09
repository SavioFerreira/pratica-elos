package view;

import java.util.ArrayList;
import java.util.List;

import model.Elo;
import model.elos.Diamante;
import model.elos.Ferro;
import model.elos.Ouro;
import model.elos.Prata;
import model.ranking.Ordem;

public class Menu { 

	public static void main(String[] args) {

		Diamante diamante = new Diamante("Savio");
		diamante.rank(95);
		Ouro ouro = new Ouro("Luffy");
		Prata prata = new Prata("Garp");
		Ferro ferro = new Ferro("Zoro");

		List<Elo> jogadores = new ArrayList<>();
		
		jogadores.add(diamante);
		jogadores.add(ouro);
		jogadores.add(prata);
		jogadores.add(ferro);
		
		System.out.println("\n\tMenu de Elos em jogos.");
		
		
		
		Ordem ordemNoRank = new Ordem(ouro, 80);
		ordemNoRank.setJogadores(jogadores);
	}

}
