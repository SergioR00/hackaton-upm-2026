package com.kernelpanic.campusostenible.core.services.alert;

import com.kernelpanic.campusostenible.core.domain.SystemAlert;
import com.kernelpanic.campusostenible.core.services.alert.dal.SystemAlertRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SystemAlertServiceImpl implements SystemAlertService {

    private final SystemAlertRepository systemAlertRepository;

    @Override
    public void saveSystemAlert(SystemAlert alert) {
        systemAlertRepository.save(alert);
    }
}
