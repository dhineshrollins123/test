package com.demo.repository;

import com.demo.entity.CesBiweekly;
import com.demo.entity.CesBiweeklyPkId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface CesBiweeklyRepo extends JpaRepository<CesBiweekly, CesBiweeklyPkId> {


}
