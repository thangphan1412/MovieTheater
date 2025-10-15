package com.backend.reponsitory;

import com.backend.entity.Theater;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ThreatRespository extends JpaRepository<Theater, UUID> {
}
