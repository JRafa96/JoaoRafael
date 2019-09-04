package Exercicio2;

import java.util.ArrayList;
import java.util.List;

import Exercicio.People;

public class Actor extends People {

	private List<Integer> oscarNominations = new ArrayList<Integer>();

	enum TipoActor {
		MAIN, SUPPORTING, STUNTMAN
	}

	public List<Integer> getOscarNominations() {
		return oscarNominations;
	}

	public void setOscarNominations(List<Integer> oscarNominations) {
		this.oscarNominations = oscarNominations;
	}

	public Actor(String name, String surname, int age, List<Integer> oscarNominations) {
		super(name, surname, age);
		this.oscarNominations = oscarNominations;
	}

}
