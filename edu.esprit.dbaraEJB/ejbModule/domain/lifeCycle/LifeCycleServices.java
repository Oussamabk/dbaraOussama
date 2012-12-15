package domain.lifeCycle;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entities.Recette;
import entities.User;

/**
 * Session Bean implementation class LifeCycleServices
 */
@Stateless
public class LifeCycleServices implements LifeCycleServicesRemote,
		LifeCycleServicesLocal {
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public LifeCycleServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createRecetteByUser(Recette recette, User user) {

		entityManager.persist(recette);

	}

	@Override
	public void createRecette(Recette recette) {
		entityManager.persist(recette);

	}

	@Override
	public void deleteRecetteById(String idRecette) {

		entityManager.remove(entityManager.find(Recette.class, idRecette));

	}

	@Override
	public void updateRecette(Recette recette) {
		entityManager.merge(recette);

	}

}
