package org.skypro.teamWork.recommendationRule;

import org.skypro.teamWork.DTO.RecommendationsDto;

import java.util.Optional;
import java.util.UUID;

public class RecommendationRule1 implements RecommendationRuleSet{
    @Override
    public Optional<RecommendationsDto> getRecommendation(UUID id) {
        return Optional.empty();
    }
}
