package domain.reporting;

import java.util.List;

import javax.ejb.Remote;

import entities.Recette;

@Remote
public interface RecetteReportingServicesRemote {

	List<Recette> findAllRecetteByUserId(int idUser);

	void displayRecetteByUserId(int idUser);

	Recette findRectteById(int idRecette);

	List<Recette> findAllRecette();

}
