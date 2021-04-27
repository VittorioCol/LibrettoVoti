package it.polito.tdp.librettovoti.model;

import java.time.LocalDate;

public class Voto {
	private String nome_corso;
	private int voto_ottenuto;
	private LocalDate dat_esame;
	
	
	public Voto(String nome_corso, int voto_ottenuto, LocalDate dat_esame) {
		super();
		this.nome_corso = nome_corso;
		this.voto_ottenuto = voto_ottenuto;
		this.dat_esame = dat_esame;
	}


	public String getNome_corso() {
		return nome_corso;
	}


	public void setNome_corso(String nome_corso) {
		this.nome_corso = nome_corso;
	}


	public int getVoto_ottenuto() {
		return voto_ottenuto;
	}


	public void setVoto_ottenuto(int voto_ottenuto) {
		this.voto_ottenuto = voto_ottenuto;
	}


	public LocalDate getDat_esame() {
		return dat_esame;
	}


	public void setDat_esame(LocalDate dat_esame) {
		this.dat_esame = dat_esame;
	}


	@Override
	public String toString() {
		return "Voto [nome_corso=" + nome_corso + ", voto_ottenuto=" + voto_ottenuto + ", dat_esame=" + dat_esame + "]";
	}
	
}
