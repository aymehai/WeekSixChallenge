package byAymen.RoboResume.repositories;

import org.springframework.data.repository.CrudRepository;
import byAymen.RoboResume.models.User;

public interface UserRepository extends CrudRepository<User, Long>{
	
	User findByUsername(String username);

}
