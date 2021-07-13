package com.example.countdaysapi.model.day;

import lombok.Getter;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

@Getter
public class SetIdDay {

    private final LocalDate DAY_2020 = LocalDate.of(2020, Month.JANUARY, 1);
    private Long idDay;

    public SetIdDay(LocalDate date){
        this.idDay = ChronoUnit.DAYS.between(DAY_2020, date);
    }
}
