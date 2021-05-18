package com.akkurad.lockmanagement.dao;

import com.akkurad.lockmanagement.model.Organization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganisationDao extends JpaRepository<Organization, Long> {
}
