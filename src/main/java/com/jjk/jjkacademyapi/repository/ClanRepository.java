package com.jjk.jjkacademyapi.repository;

import com.jjk.jjkacademyapi.model.Clan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ClanRepository extends JpaRepository<Clan, UUID> {
}
