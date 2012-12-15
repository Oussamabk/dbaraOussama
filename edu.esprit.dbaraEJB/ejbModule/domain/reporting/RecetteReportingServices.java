package domain.reporting;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import entities.Recette;

/**
 * Session Bean implementation class RecetteReportingServices
 */
@Stateless
public class RecetteReportingServices implements
		RecetteReportingServicesRemote, RecetteReportingServicesLocal {

	@PersistenceContext
	private EntityManager entityManager;

	public RecetteReportingServices() {

	}

	@Override
	public List<Recette> findAllRecetteByUserId(int idUser) {

		Query query = entityManager
				.createQuery("select r from Recette r where r.user.idUser=:iduser");
		query.setParameter("iduser", idUser);

		return query.getResultList();
	}

	@Override
	public void displayRecetteByUserId(int idUser) {

		List<Recette> recette = findAllRecetteByUserId(idUser);

		for (Recette r : recette) {

			System.out.println(r.getTitre());

		}

	}

	@Override
	public Recette findRectteById(int idRecette) {

		return entityManager.find(Recette.class, idRecette);
	}

	@Override
	public List<Recette> findAllRecette() {

		return entityManager.createQuery("select r from Recette r")
				.getResultList();

	}

}
