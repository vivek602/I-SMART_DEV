package com.ing.ismart.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.ing.ismart.domain.CustomerDetails;

@Transactional
public interface CutomerRepository  extends CrudRepository<CustomerDetails, Long> {


}
