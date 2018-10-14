package com.model;

public class Evaluation {
	private int qn; // la note de Qualité de la nourriture
	private int qsa; // la note de Qualité de la salle
	private int qse; // la note de Qualité du service
	private double medium=0;
	
	public Evaluation(int qn, int qsa, int qse) {
		this.qn = qn;
		this.qsa = qsa;
		this.qse = qse;
		medium=(qn+qsa+qse)/3.0;
	}
	public int getQn() {
		return qn;
	}
	public void setQn(int qn) {
		this.qn = qn;
	}
	public int getQsa() {
		return qsa;
	}
	public void setQsa(int qsa) {
		this.qsa = qsa;
	}
	public int getQse() {
		return qse;
	}
	public void setQse(int qse) {
		this.qse = qse;
	}
	public double getMedium() {
		return medium;
	}
	public void setMedium(double medium) {
		this.medium = medium;
	}
	
	public static void main(String[] args) {
		Evaluation e=new Evaluation(10, 11, 13);
		System.out.println(e.getMedium());
	}
	
	
}
