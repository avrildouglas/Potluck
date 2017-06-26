package potluck;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import potluck.Potluck;


@Controller

public class PotluckReturnController {
	
	@GetMapping("/potluck")
	public String potluckForm(Model model){
		model.addAttribute("foods", new Potluck());
		return "potluckInput";
	}
	
	
	@PostMapping("/potluck")
	public String potluckSubmit(@ModelAttribute Potluck foods) {
        return "potluckOutput";
    }
	
}
