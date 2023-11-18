package br.edu.infnet.sellingApi.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.sellingApi.model.domain.SellingDetails;
import br.edu.infnet.sellingApi.model.repository.SellingDetailsRepository;

@Service
public class SellingDetailsService {

	@Autowired
	private SellingDetailsRepository detailsRepository;

	public List<SellingDetails> getDetails() {
		return (List<SellingDetails>) detailsRepository.findAll();
	}

	public SellingDetails saveDetails(SellingDetails details) {
		return detailsRepository.save(details);
	}
}
