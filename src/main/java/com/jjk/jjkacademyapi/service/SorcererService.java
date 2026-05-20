package com.jjk.jjkacademyapi.service;

import com.jjk.jjkacademyapi.model.Sorcerer;
import com.jjk.jjkacademyapi.repository.SorcererRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SorcererService {
    private final SorcererRepository sorcererRepository;

    public Sorcerer createSorcerer(Sorcerer sorcerer){
        return sorcererRepository.save(sorcerer);
    }

    public List<Sorcerer> getAllSorcerers(){return sorcererRepository.findAll();}
}
