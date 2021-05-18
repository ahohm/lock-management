package com.akkurad.lockmanagement.dao;

import com.akkurad.lockmanagement.model.Lockz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LockDao extends JpaRepository<Lockz, Long> {
}
