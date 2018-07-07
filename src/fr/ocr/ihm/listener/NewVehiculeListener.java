package fr.ocr.ihm.listener;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import fr.ocr.observer.Observable;
import fr.ocr.observer.Observateur;
import fr.ocr.sql.DAO;
import fr.ocr.sql.HsqldbConnection;
import fr.ocr.sql.VehiculeDAO;
import voiture.Vehicule;
public class NewVehiculeListener implements ActionListener,Observable {

	private JFrame frame;
	private static final Logger logger = LogManager.getLogger();
	 private ArrayList<Observateur> listObservateur = new ArrayList<Observateur>();

	public NewVehiculeListener(JFrame f) {
		frame = f;
	}

	public void actionPerformed(ActionEvent e) {
		
			Vehicule vehicule = new Vehicule();
		ZAddVehicule zAdd = new ZAddVehicule(null,"Ajout d'un vehicule",true,vehicule);
		this.updateObservateur();
			 
	}

	public void addObservateur(Observateur obs) {
		this.listObservateur.add(obs);
	}

	public void updateObservateur() {
		 this.listObservateur = new ArrayList<Observateur>();
		
	}
	
	public void delObservateur() {
		for(Observateur obs : this.listObservateur )
		      obs.update();
		
	}	
}
