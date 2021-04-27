package it.polito.tdp.librettovoti.model;

import java.time.LocalDate;
import java.util.List;

public class TestLibretto {
	
	public static void main(String[] args) {
		
		Libretto libretto = new Libretto();
	
		Voto voto1 = new Voto("Analisi 1", 30 , LocalDate.of(2019, 2, 15));
	
		libretto.add(voto1);
		libretto.add(new Voto("Fisica 1", 20 , LocalDate.of(2019, 3, 15)));
		libretto.add(new Voto("Algebra 1", 19 , LocalDate.of(2019, 3, 17)));
		libretto.add(new Voto("Algebra 3", 25 , LocalDate.of(2019, 6, 17)));
		libretto.add(new Voto("Algebra 2", 25 , LocalDate.of(2019, 7, 17)));
		
		System.out.println(libretto);
		
		Libretto libtemp=libretto.votiUguali(25);
		List<Voto> listtemp= libtemp.getVoti();
		System.out.println(listtemp);
	}
}
