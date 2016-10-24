package main.java.model;

public class Couper  implements Command {

	private MoteurEdition MoteurEdition;
	public void MoteurEdition (MoteurEdition mot){
		this.MoteurEdition= mot;
	}
	@Override
	public void execute() {
		this.MoteurEdition.couper();
		
	}
}
