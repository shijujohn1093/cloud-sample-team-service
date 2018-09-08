package com.thengara.teamservice.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.thengara.teamservice.entity.Team;

public interface TeamRepository extends CrudRepository<Team, Long> {

	public List<Team> findAll();
	public Team findByName(String name);
}
