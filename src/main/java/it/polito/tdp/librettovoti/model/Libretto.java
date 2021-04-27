package it.polito.tdp.librettovoti.model;

import java.util.ArrayList;
import java.util.List;

public class Libretto {
	
	private List<Voto> voti ;
	
	public Libretto() {
		this.voti=new ArrayList<Voto>();
	}
	
	public void add(Voto voto) {
		voti.add(voto);
	}

	@Override
	public String toString() {
		return "Libretto [voti=" + voti + "]";
	}
	
}
