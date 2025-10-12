package com.backend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "voucher")
@ToString
public class Vocher {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID voucherId;
}
