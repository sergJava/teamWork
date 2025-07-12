package org.skypro.teamWork.controller;

import org.skypro.teamWork.service.RecommendatoinsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/recommendations")
public class RecomendationsController {
    private final RecommendatoinsService recommendatoinsService;

    public RecomendationsController(RecommendatoinsService recommendatoinsService) {
        this.recommendatoinsService = recommendatoinsService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Integer> getRandomTransactionAmount(@PathVariable UUID id){
        return ResponseEntity.ok(recommendatoinsService.getRandomTransactionAmount(id));
    }
}
