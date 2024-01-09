package model;

import java.util.ArrayList;
import java.util.List;

public abstract class Elo {

	private String name;

	public String rank(Integer value) {
		return ": " + converteElo(value);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String converteElo(Integer value) {

		boolean diamante = ((value >= 90) && (value <= 100));
		boolean ouro = ((value >= 80) && (value <= 89));
		boolean prata = ((value >= 60) && (value <= 79));
		boolean ferro = ((value >= 30) && (value <= 49));
		String result = "void";
		
		List<Boolean> elos = new ArrayList<>();
		elos.add(diamante); elos.add(ouro); elos.add(prata); elos.add(ferro);
		
		for (Boolean i : elos) {
			if (diamante)
				return result = elos.toString()+" Diamante\n";
			if (ouro)
				return result = elos.toString()+" Ouro\n";
			if (prata)
				return result = elos.toString()+" Prata\n";
			if (ferro)
				return result = elos.toString()+" Ferro\n";
		}
		
		return result;
	}

}
