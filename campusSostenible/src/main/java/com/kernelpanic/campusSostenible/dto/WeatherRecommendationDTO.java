package com.kernelpanic.campusSostenible.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WeatherRecommendationDTO {
    private String htmlContent; // The full rendered markdown report
}
