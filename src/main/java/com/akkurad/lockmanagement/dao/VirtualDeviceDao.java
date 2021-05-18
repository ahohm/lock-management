package com.akkurad.lockmanagement.dao;

import com.akkurad.lockmanagement.model.VirtualDevice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VirtualDeviceDao extends JpaRepository<VirtualDevice, Long> {
}
