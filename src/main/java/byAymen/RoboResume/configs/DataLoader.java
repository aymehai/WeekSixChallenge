package byAymen.RoboResume.configs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import byAymen.RoboResume.models.Role;
import byAymen.RoboResume.models.User;
import byAymen.RoboResume.repositories.RoleRepository;
import byAymen.RoboResume.repositories.UserRepository;

import java.util.Arrays;

@Component
public class DataLoader implements CommandLineRunner {

	@Autowired
	UserRepository userRepository;

	@Autowired
	RoleRepository roleRepository;

	@Override
	public void run(String... strings) throws Exception {
		System.out.println("Loading data . . .");

		roleRepository.save(new Role("SEEKER"));
		roleRepository.save(new Role("RECRUITER"));
		roleRepository.save(new Role("ADMIN"));
		/*
		 * Role adminRole = roleRepository.findByRole("ADMIN"); Role
		 * userRecruiter = roleRepository.findByRole("RECRUITER"); Role
		 * userSeeker = roleRepository.findByRole("SEEKER");
		 * 
		 * 
		 * User user = new User("bob@bob.com", "bob", "Bob", "Bobberson",
		 * "bob"); user.setRoles(Arrays.asList(userRole));
		 * userRepository.save(user);
		 * 
		 * user = new User("jim@jim.com", "jim", "Jim", "Jimmerson", "jim");
		 * user.setRoles(Arrays.asList(userRole)); userRepository.save(user);
		 * 
		 * user = new User("admin@secure.com", "password", "Admin", "User",
		 * "admin"); user.setRoles(Arrays.asList(adminRole));
		 * userRepository.save(user);
		 * 
		 * user = new User("sam@every.com", "password", "Sam", "Everyman",
		 * "everyman"); user.setRoles(Arrays.asList(userRole, adminRole));
		 * userRepository.save(user);
		 */

	}
}
