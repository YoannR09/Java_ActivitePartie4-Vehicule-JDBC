package fr.ocr.sql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import voiture.moteur.Moteur;
import voiture.moteur.TypeMoteur;

public class TypeMoteurDAO extends DAO<TypeMoteur> {
	public TypeMoteurDAO(Connection conn) {
		super(conn);
	}

	public boolean create(TypeMoteur obj) {
		return false;
	}

	public boolean delete(TypeMoteur obj) {
		return false;
	}

	public boolean update(TypeMoteur obj) {
		return false;
	}

	public TypeMoteur find(int id) {
		TypeMoteur typeMoteur = new TypeMoteur();      

		try {
			ResultSet result = this.connect.createStatement(
					ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM moteur WHERE id = " + id);
			if(result.first())

				typeMoteur = new TypeMoteur(id,result.getString("nom"));

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return typeMoteur;
	}



	}