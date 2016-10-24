package main.java.model;

import java.awt.Button;
import java.io.FileFilter;
import java.util.Collection;


import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.filechooser.FileNameExtensionFilter;

public class IHMImpl implements IHM {
	
	// Création de ma fenetre
	
		private JPanel FENp;
		private Border borderAffichage;
		private Border b;
		private JPanel ZoneDeTexte;
		private JPanel Menu;
		private JTextArea JTexte;
		private JScrollPane scrollBar;//bar de defillement 
		private Collection<Button> boutons;	   	   
		private JFileChooser fc = new JFileChooser();
	public IHMImpl() {
		
		JScrollPane scrollpane = new JScrollPane(JTexte, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		JFrame frame = new JFrame("Mon Editeur V1 : défaire / refaire");
		
		
		// let's add FILTER for txt FILES
		javax.swing.filechooser.FileFilter txtFileFilter = new FileNameExtensionFilter("Plain de texte", "txt");
		fc.setFileFilter(txtFileFilter);
		
		
		// Menu and Menu items
		JMenuBar menuBar = new JMenuBar();
		JMenu file = new JMenu("File");
		menuBar.add(file);
		
		// adding ACTION S TO FILE MENU ITEMS WE WILL ADD THEM LITTLE LOWER FROM CONSTRUCTOR
		file.add(open);
		file.add(Save);
		file.addSeparator();
		file.add(Exit);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Pack();
		setVisible(true);
		
		frame.setTitle("Mon Projet Editeur ");
		frame.setSize(900,600);
		
		
	}
	
	@Override
	public int getDebutIHM() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getFinIHM() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String recupTexteIHM() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void affecterTexteIHM(String texte) {
		// TODO Auto-generated method stub
		
	}

}
