package br.edu.infnet.sellingApi.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.sellingApi.model.domain.SellingDetails;

@Repository
public interface SellingDetailsRepository extends CrudRepository<SellingDetails, Integer> {

}
