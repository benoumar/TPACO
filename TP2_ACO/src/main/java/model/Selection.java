package main.java.model;

/**
 * @(#) selection.java
 */

public class Selection implements Command{

	private MoteurEdition MoteurEdition;
	private int debut;
	private int fin;
	
	public void Selection (MoteurEdition mot){
		this.MoteurEdition= mot;
	}
	public Selection(int debut, int fin) {
		super();
		this.debut = debut;
		this.fin = fin;
	}


	public Selection() {
		super();
		
	}
	public int getDebut() {
		return debut;
	}

	public void setDebut(int debut) {
		this.debut = debut;
	}

	public int getFin() {
		return fin;
	}

	public void setFin(int fin) {
		this.fin = fin;
	}

	@Override
	public void execute() {
		this.MoteurEdition.selection();
	}
}
