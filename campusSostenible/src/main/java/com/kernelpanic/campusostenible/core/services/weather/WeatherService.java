package com.kernelpanic.campusostenible.core.services.weather;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import com.kernelpanic.campusostenible.core.domain.WeatherData;
import com.kernelpanic.campusostenible.core.domain.Alert;
import com.kernelpanic.campusostenible.core.providers.MeteoData;

public interface WeatherService {
    public Optional<WeatherData> getMeteoDataByProvinceAndDate(Long provinceId, LocalDate date);

    public List<WeatherData> getWeatherByProvice(Long provinceId);

    WeatherData saveWeather(WeatherData weatherData);

    List<MeteoData> getAllMeteoData(LocalDate date);

    String getAlertAdvice(MeteoData data);

    void saveWeatherAlert(Alert alert);
}
