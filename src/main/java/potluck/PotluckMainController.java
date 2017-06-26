package potluck;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import potluck.Potluck;



@Controller    // This means that this class is a Controller
@RequestMapping(path="/potluck") // This means URL's start with /potluck (after Application path)

public class PotluckMainController {
	@Autowired // This means to get the bean called userRepository
	          // Which is auto-generated by Spring, we will use it to handle the data
	private potluckRepository potluckRepository;

	@GetMapping(path="/add") // Map ONLY GET Requests
	public @ResponseBody String addNewPotluck (@RequestParam String name
			, @RequestParam String food){
		// @ResponseBody means the returned String is the response, not a view name
			// @RequestParam means it is a parameter from the GET or POST request
			
			Potluck p = new Potluck();
			p.setName(name);
			p.setFood(food);
			potluckRepository.save(p);
			return "Welcome";
		}
	
	@GetMapping(path="/all")
	public @ResponseBody Iterable<Potluck> getAllPotluck() {
		// This returns a JSON or XML with the users
		return potluckRepository.findAll();
	
	}
	
}