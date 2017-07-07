package byAymen.RoboResume.repositories;

import org.springframework.data.repository.CrudRepository;
import byAymen.RoboResume.models.Role;

public interface RoleRepository extends CrudRepository<Role, Long>{
	Role findByRole(String role);
}
