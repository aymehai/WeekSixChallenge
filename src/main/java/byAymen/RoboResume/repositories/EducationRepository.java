package byAymen.RoboResume.repositories;

import org.springframework.data.repository.CrudRepository;
import byAymen.RoboResume.models.Education;

public interface EducationRepository extends CrudRepository<Education, Long>{

	Education findByEducationName(String educationName);
	Education findByEducationMajor(String educationMajor);
}
