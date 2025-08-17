package com.backend.dto.Theater;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TheaterRequest {
    private String theaterName;
    private int totalNumberOfSeats;

}
