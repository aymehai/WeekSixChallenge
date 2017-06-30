package byAymen.RoboResume.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Education {


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@NotNull
	private String educationName;
	
	@NotNull
	private String educationMajor;
	
	@NotNull
	private int educationStart;
	
	private int educationEnd;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEducationName() {
		return educationName;
	}

	public void setEducationName(String educationName) {
		this.educationName = educationName;
	}

	public String getEducationMajor() {
		return educationMajor;
	}

	public void setEducationMajor(String educationMajor) {
		this.educationMajor = educationMajor;
	}

	public int getEducationStart() {
		return educationStart;
	}

	public void setEducationStart(int educationStart) {
		this.educationStart = educationStart;
	}

	public int getEducationEnd() {
		return educationEnd;
	}

	public void setEducationEnd(int educationEnd) {
		this.educationEnd = educationEnd;
	}
	
	

	
}
