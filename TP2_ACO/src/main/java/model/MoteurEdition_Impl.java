package main.java.model;

import java.util.Scanner;

/**
 * @(#) MoteurEdition_Impl.java
 */

public class MoteurEdition_Impl implements MoteurEdition
{
	
	
	public pressePapier rolePressePapier;
	
	public Buffer buffer;
	
	public Selection select;
	
	public String texte;
	
	public MoteurEdition_Impl() {
		super();
		
	}

	public void couper()
	{
			
		
	}

	public void copier( )
	{
		
	}
	
	public void coller( )
	{
		
	}
	
	public void insererTexte()
	{
		
		
	}
	
	public void selection( )
	{
		
	}
	
	public void saisir(String texte) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Veuillez entrer le texte : ");
		texte = sc.nextLine();
		buffer.addTexte(texte);
	//	buffer.setContenuB(texte);
	}
}
