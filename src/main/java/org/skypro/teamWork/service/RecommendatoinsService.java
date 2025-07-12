package org.skypro.teamWork.service;

import org.skypro.teamWork.repository.RecommendationsRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class RecommendatoinsService {
    private final RecommendationsRepository recommendationsRepository;

    public RecommendatoinsService(RecommendationsRepository recommendationsRepository) {
        this.recommendationsRepository = recommendationsRepository;
    }

    public int getRandomTransactionAmount(UUID id) {
        return recommendationsRepository.getRandomTransactionAmount(id);
    }
}
