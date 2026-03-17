package com.kernelpanic.campussostenible.domain;

import lombok.*;
import java.time.LocalDate;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MeteoData {

    private LocalDate date;
    private String province;

    private double temperatureMax;
    private double temperatureMin;
    private int humidity;
    private double windSpeed;
    private String windDirection;
    private WeatherCondition weatherCondition;
    private int uvIndex;
    private int rainProbability;
}
