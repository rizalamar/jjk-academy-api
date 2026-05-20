package com.jjk.jjkacademyapi.repository;

import com.jjk.jjkacademyapi.model.Sorcerer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SorcererRepository extends JpaRepository<Sorcerer, UUID> {
}
