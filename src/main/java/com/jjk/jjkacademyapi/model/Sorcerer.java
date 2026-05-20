package com.jjk.jjkacademyapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "sorceres")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Sorcerer {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private String name;
    private Integer age;
    private String rank;
    private String cursedTechnique;
}
