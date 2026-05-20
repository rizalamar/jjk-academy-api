package com.jjk.jjkacademyapi.service;

import com.jjk.jjkacademyapi.model.Sorcerer;
import com.jjk.jjkacademyapi.repository.SorcererRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class SorcererService {
    private final SorcererRepository sorcererRepository;

    public Sorcerer createSorcerer(Sorcerer sorcerer){
        return sorcererRepository.save(sorcerer);
    }

    public List<Sorcerer> getAllSorcerers(){return sorcererRepository.findAll();}

    public Sorcerer getSorcererById(UUID id){
        return sorcererRepository.findById(id).orElseThrow(() -> new RuntimeException("Sorcerer not found with id: " + id));
    }

    public void deleteSorcerer(UUID id){
        sorcererRepository.deleteById(id);
    }
}
