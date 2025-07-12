package org.skypro.teamWork.DTO;

import java.util.UUID;

public class RecommendationsDto {
    private final UUID id;
    private final String name;
    private final String description;

    public RecommendationsDto(UUID id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String toString(){
        return "name: " + name
                + ", id: " + id
                + ", text: " + description;
    }
}
