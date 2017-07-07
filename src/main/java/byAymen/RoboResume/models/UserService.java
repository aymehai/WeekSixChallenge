package byAymen.RoboResume.models;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import byAymen.RoboResume.repositories.RoleRepository;
import byAymen.RoboResume.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	@Autowired
	RoleRepository roleRepository;

	@Autowired
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public User findByEmail(String email) {
		return userRepository.findByEmail(email);
	}

	public Long countByEmail(String email) {
		return userRepository.countByEmail(email);
	}

	public User findByUsername(String username) {
		return userRepository.findByUsername(username);
	}

	public void saveSeeker(User user) {
		user.setRoles(Arrays.asList(roleRepository.findByRole("SEEKER")));
		userRepository.save(user);
	}
	
	public void saveRecruiter(User user) {
		user.setRoles(Arrays.asList(roleRepository.findByRole("RECRUITER")));
		userRepository.save(user);
	}

	public void saveAdmin(User user) {
		user.setRoles(Arrays.asList(roleRepository.findByRole("ADMIN")));
		userRepository.save(user);
	}
}
