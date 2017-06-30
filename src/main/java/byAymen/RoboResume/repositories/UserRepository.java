package byAymen.RoboResume.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import byAymen.RoboResume.models.User;

public interface UserRepository extends CrudRepository<User, Long>{
	
	User findByUsername(String username);
	
	@Query(value = "select id from aymen.user where username = :username", nativeQuery = true)
	public Iterable<Long> findById(@Param("username")String username);
}
