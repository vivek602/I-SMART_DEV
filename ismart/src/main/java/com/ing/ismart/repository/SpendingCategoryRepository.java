package com.ing.ismart.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.ing.ismart.domain.SpendCategory;

@Transactional
public interface SpendingCategoryRepository  extends CrudRepository<SpendCategory, Long> {


}
