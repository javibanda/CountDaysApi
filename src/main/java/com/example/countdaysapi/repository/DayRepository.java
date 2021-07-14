package com.example.countdaysapi.repository;

import com.example.countdaysapi.model.day.Day;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DayRepository extends JpaRepository<Day, Long> {
}
