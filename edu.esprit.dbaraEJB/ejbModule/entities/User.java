package entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User implements Serializable {

	private int idUser;
	private String nom;
	private String login;
	private String pwd;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	private List<Recette> recette;

	@Id
	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@OneToMany(mappedBy = "user")
	public List<Recette> getRecette() {
		return recette;
	}

	public void setRecette(List<Recette> recette) {
		this.recette = recette;
	}

}
