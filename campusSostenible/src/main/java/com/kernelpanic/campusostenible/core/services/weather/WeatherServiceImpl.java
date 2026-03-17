package com.kernelpanic.campusostenible.core.services.weather;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.kernelpanic.campusostenible.core.domain.WeatherData;
import com.kernelpanic.campusostenible.core.services.weather.dal.WeatherRepository;

@Service
public class WeatherServiceImpl implements WeatherService {

    private final WeatherRepository weatherRepository;

    public WeatherServiceImpl(WeatherRepository weatherRepository) {
        this.weatherRepository = weatherRepository;
    }

    @Override
    public Optional<WeatherData> getMeteoDataByProvinceAndDate(Long provinceId, LocalDate date) {
        return weatherRepository.findByProvinciaAndFecha(provinceId, date);
    }

    @Override
    public List<WeatherData> getWeatherByProvice(Long provinceId) {
        return weatherRepository.findByProvincia(provinceId);
    }

}
