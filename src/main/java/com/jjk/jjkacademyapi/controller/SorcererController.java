package com.jjk.jjkacademyapi.controller;

import com.jjk.jjkacademyapi.model.Sorcerer;
import com.jjk.jjkacademyapi.service.SorcererService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/sorcerers")
@RequiredArgsConstructor
public class SorcererController {
    private final SorcererService sorcererService;

    @PostMapping
    public ResponseEntity<Sorcerer> create(@RequestBody Sorcerer sorcerer) {
        return ResponseEntity.ok(sorcererService.createSorcerer((sorcerer)));
    }

    @GetMapping
    public ResponseEntity<List<Sorcerer>> getAll() {
        return ResponseEntity.ok(sorcererService.getAllSorcerers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Sorcerer> getById(@PathVariable UUID id) {
        return ResponseEntity.ok(sorcererService.getSorcererById(id));
    }

    @DeleteMapping
    public ResponseEntity<Void> delete (@PathVariable UUID id) {
        sorcererService.deleteSorcerer(id);
        return ResponseEntity.noContent().build();
    }
}
