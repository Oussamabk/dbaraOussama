package domain.managment;

import java.util.List;

import javax.ejb.Local;

import entities.User;

@Local
public interface managementServicesLocal {

	public void createUser(User user);

	public void updateUser(User user);

	public void deleteUser(User user);

	public User getUserbyId(int id);

	public List<User> getAllUserbyId();

	public String checkin(String login, String password);

}
