package com.example.countdaysapi.repository;

import com.example.countdaysapi.model.Church;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChurchRepository extends JpaRepository<Church, Long> {
}
