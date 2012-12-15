package domain.lifeCycle;

import javax.ejb.Remote;

import entities.Recette;
import entities.User;

@Remote
public interface LifeCycleServicesRemote {

	void createRecetteByUser(Recette recette, User user);

	void createRecette(Recette recette);

	void deleteRecetteById(String idRecette);

	void updateRecette(Recette recette);

}
