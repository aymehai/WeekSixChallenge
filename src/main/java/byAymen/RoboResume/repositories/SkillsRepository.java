package byAymen.RoboResume.repositories;

import org.springframework.data.repository.CrudRepository;
import byAymen.RoboResume.models.Skills;

public interface SkillsRepository extends CrudRepository<Skills, Long>{

	Skills findBySkillsName(String skillsName);	
}
