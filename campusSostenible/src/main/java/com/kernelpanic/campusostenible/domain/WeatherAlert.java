package com.kernelpanic.campusostenible.domain;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "weather_alerts")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WeatherAlert {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private AlertLevel alertLevel;

    private String province;
    private String safetyRecommendation;
    private LocalDate startDate;
    private LocalDate endDate;
}
