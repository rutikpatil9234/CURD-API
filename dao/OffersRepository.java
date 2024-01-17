package com.neosoft.digiadmin.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.neosoft.digiadmin.entity.OffersDetails;

@Repository
public interface OffersRepository extends JpaRepository<OffersDetails, Long>{

}
