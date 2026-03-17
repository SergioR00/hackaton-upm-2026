package com.kernelpanic.campusostenible.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WeatherData {
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
