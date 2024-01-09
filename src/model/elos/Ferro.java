package model.elos;

import model.Elo;

public class Ferro extends Elo {

	public Ferro(String name) {
		this.setName(name);
	}

	@Override
	public String rank(Integer value) {
		return super.rank(value);
	}
}
