package domain.reporting;

import java.util.List;

import javax.ejb.Local;

import entities.Recette;

@Local
public interface RecetteReportingServicesLocal {

	List<Recette> findAllRecetteByUserId(int idUser);

	void displayRecetteByUserId(int idUser);

	Recette findRectteById(int idRecette);

	List<Recette> findAllRecette();

}
