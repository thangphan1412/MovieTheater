package com.backend.service;

import com.backend.entity.Theater;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ThreadService {
     List<Theater> getAllThreater();
     Optional<Theater> getTheater(Long id);
}
