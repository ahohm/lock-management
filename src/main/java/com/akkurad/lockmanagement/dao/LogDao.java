package com.akkurad.lockmanagement.dao;

import com.akkurad.lockmanagement.model.Log;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogDao extends JpaRepository<Log, Long> {
}
