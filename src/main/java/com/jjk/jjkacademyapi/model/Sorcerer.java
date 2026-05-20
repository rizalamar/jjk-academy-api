package com.jjk.jjkacademyapi.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "sorcerers")
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

    @ManyToOne
    @JoinColumn(name = "clan_id")
    @JsonBackReference
    @ToString.Exclude
    private Clan clan;
}
