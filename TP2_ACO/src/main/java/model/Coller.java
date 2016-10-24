package main.java.model;

public class Coller implements Command {

	private MoteurEdition MoteurEdition;
	
	public void MoteurEdition (MoteurEdition mot){
		this.MoteurEdition= mot;
	}
	@Override
	public void execute() {
		this.MoteurEdition.coller();
		
	}

}
