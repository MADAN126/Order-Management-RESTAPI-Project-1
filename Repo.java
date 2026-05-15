package com.restapi.main.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restapi.main.OrderDTO;
import com.restapi.main.OrderEntity;
@Repository
public interface Repo extends JpaRepository<OrderEntity, String>{
	

}
