package entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Recette implements Serializable {

	private int idRecette;
	private String titre;
	private String ingredient;
	private String methode;
	private User user;

	@Id
	public int getIdRecette() {
		return idRecette;
	}

	public void setIdRecette(int idRecette) {
		this.idRecette = idRecette;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getIngredient() {
		return ingredient;
	}

	public void setIngredient(String ingredient) {
		this.ingredient = ingredient;
	}

	public String getMethode() {
		return methode;
	}

	public void setMethode(String methode) {
		this.methode = methode;
	}

	@ManyToOne(cascade=CascadeType.PERSIST)
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
