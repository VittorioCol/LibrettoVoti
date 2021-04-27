package it.polito.tdp.librettovoti.model;

import java.util.ArrayList;
import java.util.List;

public class Libretto {
	
	private List<Voto> voti ;
	
	public Libretto() {
		this.voti=new ArrayList<Voto>();
	}
	
	
	public List<Voto> getVoti() {
		return voti;
	}


	public void add(Voto voto) {
		voti.add(voto);
	}
	
	public Libretto votiUguali(int punteggio) {
		Libretto lib=new Libretto();
		for(Voto v:this.voti) {
			if(v.getVoto_ottenuto()==25) {
				lib.add(v);
			}
		}
		return lib;
	}

	@Override
	public String toString() {
		return  ""+voti;
	}
	
}
