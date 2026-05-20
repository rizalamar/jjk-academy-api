package com.jjk.jjkacademyapi.controller;

import com.jjk.jjkacademyapi.model.Clan;
import com.jjk.jjkacademyapi.service.ClanService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/clans")
@RequiredArgsConstructor
public class ClanController {
    private final ClanService clanService;

    @PostMapping
    public ResponseEntity<Clan> create (@RequestBody Clan clan) {
        return ResponseEntity.ok(clanService.createClan(clan));
    }

    @GetMapping
    public ResponseEntity<List<Clan>> getAll(){
        return ResponseEntity.ok(clanService.getAllClans());
    }

    @GetMapping("/{id}")
    public  ResponseEntity<Clan> getById(@PathVariable UUID id) {
        return ResponseEntity.ok(clanService.getClanById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable UUID id) {
        clanService.deleteClan(id);
        return ResponseEntity.noContent().build();
    }
}
