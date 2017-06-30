package byAymen.RoboResume.repositories;

import org.springframework.data.repository.CrudRepository;
import byAymen.RoboResume.models.Work;

public interface WorkRepository extends CrudRepository<Work, Long>{
	
	Work findByWorkName(String workName);

}
