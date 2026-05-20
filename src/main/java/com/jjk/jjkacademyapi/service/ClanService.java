package com.jjk.jjkacademyapi.service;

import com.jjk.jjkacademyapi.model.Clan;
import com.jjk.jjkacademyapi.repository.ClanRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ClanService {
    private final ClanRepository clanRepository;

    public Clan createClan (Clan clan) {
        return clanRepository.save(clan);
    }

    public List<Clan> getAllClans (){
        return  clanRepository.findAll();
    }

    public Clan getClanById(UUID id){
        return clanRepository.findById(id).orElseThrow(() -> new RuntimeException("Clan not found with id: " + id));
    }

    public void deleteClan(UUID id) {
        clanRepository.deleteById(id);
    }
}
