package com.akkurad.lockmanagement.dao;

import com.akkurad.lockmanagement.model.Application;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationDao extends JpaRepository<Application, Long> {
}
