package com.example.scheduler.tasks;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Slf4j
@Component
public class Task {

    @Scheduled(fixedDelay = 5000)
    public void logCurrentDay() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        log.info("La hora actual es {}", dateFormat.format(new Date()));
    }
}
