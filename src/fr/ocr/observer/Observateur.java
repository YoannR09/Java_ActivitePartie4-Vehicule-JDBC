package fr.ocr.observer;

import javax.swing.JTable;

import fr.ocr.ihm.Garage;

public interface Observateur {

	public void update(Observable obs);

	void update(Observable obs, JTable table);
}