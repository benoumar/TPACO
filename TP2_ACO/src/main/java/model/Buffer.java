package main.java.model;

/**
 * @(#) Buffer.java
 */

public class Buffer
{
	private MoteurEdition_Impl roleMoteurEdition;
	
	public String texte;
	public pressePapier pressePapiers;
	public Selection select;
	
	private StringBuffer buffer;
			
	
	public Buffer(String texte, pressePapier pressePapiers, Selection select) {
		super();
		this.texte = texte;
		this.pressePapiers = pressePapiers;
		this.select = select;
		this.buffer = new StringBuffer();
	}
	

	public Buffer() {
		super();
		// TODO Auto-generated constructor stub
		this.texte ="";
		this.select = new Selection();
		this.buffer= new StringBuffer();
	}
	
	

	public String getBuffer() {
		return buffer.toString();
	}


	public void setBuffer(StringBuffer buffer) {
		this.buffer = buffer;
	}


	public String getTexte() {
		return texte;
	}
	
	
	public void addTexte(String texte) {
		 this.buffer.append(texte);
	}
	
	public void removeTexte(int debut, int fin) {
		 this.buffer.delete(debut, fin);
	}
	
	public void insererChaine(int debut, String chaine){
		 buffer.insert(debut+1, chaine);
	 }
	
	public void setTexte(String texte) {
		this.texte = texte;
	}

	public Selection getSelect() {
		return select;
	}


	public void setSelect(Selection select) {
		this.select = select;
	}
	
}
