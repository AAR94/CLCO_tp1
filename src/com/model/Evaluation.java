package com.model;

import java.io.Serializable;

public class Evaluation implements Serializable{
	private String name; //Le nom de restaurant
	private int qn; // la note de Qualité de la nourriture
	private int qsa; // la note de Qualité de la salle
	private int qse; // la note de Qualité du service
	private double medium=0;
	
	public Evaluation(String name,int qn, int qsa, int qse) {
		this.name=name;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

	
	
}
