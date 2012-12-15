package domain.managment;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import entities.User;

/**
 * Session Bean implementation class managementServices
 */
@Stateless
@LocalBean
public class managementServices implements managementServicesRemote,
		managementServicesLocal {

	@PersistenceContext
	EntityManager entityManager;

	public managementServices() {

	}

	@Override
	public void createUser(User user) {

		entityManager.persist(user);

	}

	@Override
	public void updateUser(User user) {

		entityManager.merge(user);

	}

	@Override
	public void deleteUser(User user) {

		entityManager.remove(user);

	}

	@Override
	public User getUserbyId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAllUserbyId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String checkin(String login, String password) {

		String result = "";
		String jpql = "select u from User u where u.login=:param1 and u.pwd=:param2";

		Query query = entityManager.createQuery(jpql);
		query.setParameter("param1", login);
		query.setParameter("param2", password);
		try {
			Object object = query.getSingleResult();
			result = "OK";
		} catch (Exception e) {
			result = "NO";
		}

		return result;

	}

}
