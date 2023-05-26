package com.demo.repository;

import com.demo.entity.StatusGovernance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StatusGovernanceRepo extends JpaRepository<StatusGovernance, Integer>{

}
