package com.backend.reponsitory;

import com.backend.entity.Theater;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ThreatRespository extends JpaRepository<Theater, Long> {
}
