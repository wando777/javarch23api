package br.edu.infnet.sellingApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.sellingApi.model.domain.SellingDetails;
import br.edu.infnet.sellingApi.model.service.SellingDetailsService;

@RestController
@RequestMapping("/api/sellings")
public class AppController {

	@Autowired
	private SellingDetailsService detailsService;

	@GetMapping(value = "/details")
	public List<SellingDetails> getDetails() {
		return detailsService.getDetails();
	}

	@PostMapping(value = "/details")
	public SellingDetails saveDetails(@RequestBody SellingDetails details) {
		return detailsService.saveDetails(details);
	}

//	@GetMapping(value = "/details")
//	public List<String> getInfo() {
//
//		return new ArrayList<String>(Arrays.asList("Test: my test", "Test2: another test"));
//	}
}
