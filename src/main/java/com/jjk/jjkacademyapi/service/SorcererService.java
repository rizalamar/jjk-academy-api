package com.jjk.jjkacademyapi.service;

import com.jjk.jjkacademyapi.dto.SorcererRequest;
import com.jjk.jjkacademyapi.model.Clan;
import com.jjk.jjkacademyapi.model.Sorcerer;
import com.jjk.jjkacademyapi.repository.ClanRepository;
import com.jjk.jjkacademyapi.repository.SorcererRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class SorcererService {
    private final SorcererRepository sorcererRepository;
    private final ClanRepository clanRepository;

    public Sorcerer createSorcerer(SorcererRequest request){
        Clan clan = null;
        if(request.getClanId() != null){
            clan = clanRepository.findById(request.getClanId())
                    .orElseThrow(() -> new RuntimeException("Clan not found"));
        }

        Sorcerer sorcerer = Sorcerer.builder()
                .name(request.getName())
                .age(request.getAge())
                .rank(request.getRank())
                .cursedTechnique(request.getCursedTechnique())
                .clan(clan)
                .build();

        return sorcererRepository.save(sorcerer);
    }

    public Page<Sorcerer> getAllSorcerers(int page, int size){
//        Membuat object Pageable (Halaman ke-berapa, berapa data perhalaman, dan urutkan berdasarkan apa)
        Pageable pageable = PageRequest.of(page, size, Sort.by("name").ascending());
        return sorcererRepository.findAll(pageable);
    }

    public Sorcerer getSorcererById(UUID id){
        return sorcererRepository.findById(id).orElseThrow(() -> new RuntimeException("Sorcerer not found with id: " + id));
    }

    public Sorcerer updateSorcerer (UUID id, SorcererRequest request) {
        Sorcerer existing = getSorcererById(id);

        if(request.getClanId() != null){
            Clan clan = clanRepository.findById(request.getClanId())
                    .orElseThrow(() -> new RuntimeException("Clan not found"));
            existing.setClan(clan);
        }

        if(request.getName() != null) existing.setName(request.getName());
        if(request.getAge() != null) existing.setAge(request.getAge());
        if(request.getRank() != null) existing.setRank(request.getRank());
        if(request.getCursedTechnique() != null) existing.setCursedTechnique(request.getCursedTechnique());

        return sorcererRepository.save(existing);
    }

    public void deleteSorcerer(UUID id){
        sorcererRepository.deleteById(id);
    }
}
