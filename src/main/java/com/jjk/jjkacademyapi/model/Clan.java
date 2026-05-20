package com.jjk.jjkacademyapi.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
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

    @OneToMany(mappedBy = "clan")
    @JsonManagedReference
    @ToString.Exclude
    private List<Sorcerer> sorcerers;

    @Column(columnDefinition = "TEXT")
    private String description;
}
