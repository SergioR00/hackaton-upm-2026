package com.kernelpanic.campusostenible.repositories;

import com.kernelpanic.campusostenible.domain.MeteoData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MeteoDataRepository extends JpaRepository<MeteoData, String> {
    List<MeteoData> findByFecha(String fecha);
}