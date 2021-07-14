package com.example.countdaysapi.repository;

import com.example.countdaysapi.model.Count;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountRepository extends JpaRepository<Count, Long> {
}
