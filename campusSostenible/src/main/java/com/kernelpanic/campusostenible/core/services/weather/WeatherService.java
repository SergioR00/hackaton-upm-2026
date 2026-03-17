package com.kernelpanic.campusostenible.core.services.weather;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import com.kernelpanic.campusostenible.core.domain.WeatherData;

public interface WeatherService {
    public Optional<WeatherData> getMeteoDataByProvinceAndDate(Long provinceId, LocalDate date);

    public List<WeatherData> getWeatherByProvice(Long provinceId);
}
