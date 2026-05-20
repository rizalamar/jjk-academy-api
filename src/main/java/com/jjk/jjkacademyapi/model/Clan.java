package com.jjk.jjkacademyapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "clans")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Clan {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    private Sorcerer sorcerer;

    private String description;
}
