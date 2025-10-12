package com.backend.service;

import com.backend.dto.Theater.TheaterRequest;
import com.backend.entity.Theater;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public interface ThreadService {
     List<Theater> getAllThreater();
     Optional<Theater> getTheater(UUID id);

    Theater create(TheaterRequest request);
}
