package org.skypro.teamWork.recommendationRule;

import org.skypro.teamWork.DTO.RecommendationsDto;

import java.util.Optional;
import java.util.UUID;

public interface RecommendationRuleSet {
    Optional<RecommendationsDto> getRecommendation(UUID id);
}
