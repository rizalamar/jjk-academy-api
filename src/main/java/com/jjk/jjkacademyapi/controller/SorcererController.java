package com.jjk.jjkacademyapi.controller;

import com.jjk.jjkacademyapi.dto.SorcererRequest;
import com.jjk.jjkacademyapi.model.Sorcerer;
import com.jjk.jjkacademyapi.service.SorcererService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/sorcerers")
@RequiredArgsConstructor
public class SorcererController {
    private final SorcererService sorcererService;

    @PostMapping
    public ResponseEntity<Sorcerer> create(@Valid @RequestBody SorcererRequest request) {
        return ResponseEntity.ok(sorcererService.createSorcerer((request)));
    }

    @GetMapping
    public ResponseEntity<Page<Sorcerer>> getAll(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size
    ) {
        return ResponseEntity.ok(sorcererService.getAllSorcerers(page, size));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Sorcerer> getById(@PathVariable UUID id) {
        return ResponseEntity.ok(sorcererService.getSorcererById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Sorcerer> update (@PathVariable UUID id, @Valid @RequestBody SorcererRequest request) {
        return ResponseEntity.ok(sorcererService.updateSorcerer(id, request));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete (@PathVariable UUID id) {
        sorcererService.deleteSorcerer(id);
        return ResponseEntity.noContent().build();
    }
}
