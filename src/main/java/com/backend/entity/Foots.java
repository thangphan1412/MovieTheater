package com.backend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "foots")
@ToString
public class Foots {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID foodId;
    private String name;
    private double price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tiket_id")
    private Ticket ticket;
}
