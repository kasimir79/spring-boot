package kasimir.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SalutController {
	
	@RequestMapping("/ceao")
	public String afiseaza() {
		return "Hi Kasimir";
	}

}
