package byAymen.RoboResume.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import byAymen.RoboResume.models.Education;
import byAymen.RoboResume.repositories.EducationRepository;
import byAymen.RoboResume.repositories.SkillsRepository;
import byAymen.RoboResume.repositories.UserRepository;
import byAymen.RoboResume.models.Work;
import byAymen.RoboResume.repositories.WorkRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import byAymen.RoboResume.models.Skills;
import byAymen.RoboResume.models.User;


@Controller
public class ResumeController {
	
	@Autowired
	EducationRepository educationRepository;
	@Autowired
	WorkRepository workRepository;
	@Autowired
	SkillsRepository skillsRepository;
	@Autowired
	UserRepository userRepository;
	
	@RequestMapping("/")
	public String redirectPage() {
		return "index";
	}
	
	@RequestMapping("/index")
	public String indexPage() {
		return "index";
	}
	
    @RequestMapping("/login")
    public String login(){
        return "login";
    }
    
    //User Get and Post Mapping
    
    @GetMapping("/user")
	public String getUserPage(Model model){
		model.addAttribute(new User());
		return "user";
	}
	
	@PostMapping("/user")
	public String processUserPage(@Valid User user, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			return "user";
		}
		userRepository.save(user);
		
		return "redirect:/education";
	}
	
	// Education Get and Post Mapping
	
	@GetMapping("/education")
	public String getEducationPage(Model model){
		model.addAttribute(new Education());
		return "education";
	}
	
	@PostMapping("/education")
	public String processEducationPage(@Valid Education education, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			return "education";
		}
		educationRepository.save(education);
		model.addAttribute(new Education());

		return "education";
	}
	
	// Work Get and Post Mapping
	
	@GetMapping("/work")
	public String getWorkPage(Model model){
		model.addAttribute(new Work());
		return "work";
	}
	
	@PostMapping("/work")
	public String processWorkPage(@Valid Work work, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			return "work";
		}
		workRepository.save(work);
		model.addAttribute(new Work());

		return "work";
	}
	
	// Skills Get and Post Mapping
	
	@GetMapping("/skills")
	public String getSkillsPage(Model model){
		model.addAttribute(new Skills());
		return "skills";
	}
	
	@PostMapping("/skills")
	public String processSkillsPage(@Valid Skills skills, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			return "skills";
		}
		skillsRepository.save(skills);
		model.addAttribute(new Skills());

		return "skills";
	}
	
	// Results Request Mapping
	
	@RequestMapping("/results")
	public  String historyPage(Model model) {
		model.addAttribute("eduList", educationRepository.findAll());
		model.addAttribute("workList", workRepository.findAll());
		model.addAttribute("skillsList", skillsRepository.findAll());
		model.addAttribute("userList", userRepository.findAll());
		return "results";
	}
	
	
}
