package domain.lifeCycle;

import javax.ejb.Local;

import entities.Recette;
import entities.User;

@Local
public interface LifeCycleServicesLocal {

	void createRecetteByUser(Recette recette, User user);

	void createRecette(Recette recette);

	void deleteRecetteById(String idRecette);

	void updateRecette(Recette recette);

}
